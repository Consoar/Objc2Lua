package bos.consoar.objc2lua;

import bos.consoar.objc2lua.ClassDescription.ClassDeclaration;
import bos.consoar.objc2lua.parser.ObjCBaseListener;
import bos.consoar.objc2lua.parser.ObjCLexer;
import bos.consoar.objc2lua.parser.ObjCParser;
import bos.consoar.objc2lua.parser.ObjCParser.*;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Isaac Clark Listener Implemented Paring and Conversion of Objective C
 *         to Java
 */
public class ParserObjcListener extends ObjCBaseListener {
    private static Set<String> NoDecs;
    ParseTreeProperty<String> code = new ParseTreeProperty<String>();
    ParseTreeProperty<ArrayList<String>> list = new ParseTreeProperty<ArrayList<String>>();
    ParseTreeProperty<ClassDeclaration> declarations = new ParseTreeProperty<ClassDeclaration>();
    ParseTreeProperty<String> comments = new ParseTreeProperty<String>();
    Set<String> decSet = new HashSet<>();

    BufferedTokenStream tokens;

    private ClassDescription classDescription;
    private Map<String, ClassDescription.ClassDeclaration> classDeclarations;
    private String gClassName = "";
    private String gSuperClassName = "";
    private boolean skipMethods = false;
    private CodeFormatter codeFormat = new CodeFormatter();
    private ParseOptions options;
    private static final String CLASSNAME_MARKER = "__CLASS0x--x0NAME__";
    private static final String GLOBAL_DECLARATION_MARKER = "__-GLOBAL-__";
    private static final String CATEGORY_MARKER = "_CATEGORY";

    static {
        NoDecs = new HashSet<>();
        NoDecs.add("NO");
        NoDecs.add("YES");
        NoDecs.add("BOOL");
        NoDecs.add("__FILE__");
        NoDecs.add("__FUNCTION__");
        NoDecs.add("__LINE__");
    }

    String getCode(ParseTree ctx) {
        return code.get(ctx);
    }

    void setCode(ParseTree ctx, String s) {
        code.put(ctx, s);
    }

    String getComment(ParseTree ctx) {
        return comments.get(ctx);
    }

    void setComment(ParseTree ctx, String s) {
        comments.put(ctx, s);
    }

    void setList(ParseTree ctx, ArrayList<String> s) {
        list.put(ctx, s);
    }

    ArrayList<String> getList(ParseTree ctx) {
        return list.get(ctx);
    }

    void setDeclaration(ParseTree ctx, ClassDeclaration s) {
        declarations.put(ctx, s);
    }

    ClassDeclaration getDeclaration(ParseTree ctx) {
        return declarations.get(ctx);
    }

    @SuppressWarnings("unused")
    private boolean isSkipMethods() {
        return skipMethods;
    }

    @SuppressWarnings("unused")
    private void setSkipMethods(boolean skipMethods) {
        this.skipMethods = skipMethods;
    }

    public static String washResultString(String javaCode) {
        // replace ;; by ;
        javaCode = javaCode.replaceAll(";(\\s|\\n|\\r)*;+", ";");

        // Struct
        javaCode = javaCode.replaceAll("CGSizeMake", "CGSize");
        javaCode = javaCode.replaceAll("CGRectMake", "CGRect");
        javaCode = javaCode.replaceAll("CGPointMake", "CGPoint");
        javaCode = javaCode.replaceAll("NSRangeMake", "NSRange");
        javaCode = javaCode.replaceAll("UIEdgeInsetsMake", "UIEdgeInsets");
        // :alloc():
        javaCode = javaCode.replaceAll(":alloc\\(\\):", ":");
        // (
        javaCode = javaCode.replaceAll("\\( ", "(");
        // ",  "
        javaCode = javaCode.replaceAll(",  ", ", ");
        // then {
        javaCode = javaCode.replaceAll("then \\{", "then ");
        // }else
        javaCode = javaCode.replaceAll("}else", "else");
        // end else if
        javaCode = javaCode.replaceAll("end else if", "elseif");
        // else if
        javaCode = javaCode.replaceAll("else if", "elseif");
        // end else
        javaCode = javaCode.replaceAll("end else", "else");
        // !=
        javaCode = javaCode.replaceAll("!=", "~=");
        // static
        javaCode = javaCode.replaceAll("static ", "");
        // :autorelease()
        javaCode = javaCode.replaceAll(":autorelease\\(\\)", "");
        // ()()
        javaCode = javaCode.replaceAll("\\(\\)\\(\\)", "\\(\\)");
        // (
        javaCode = javaCode.replaceAll(" \\(", "\\(");
        // //
        javaCode = javaCode.replaceAll("\\/\\/", "--");
        // ||
        javaCode = javaCode.replaceAll("\\|\\|", "or");
        // &&
        javaCode = javaCode.replaceAll("&&", "and");
        // /*
        javaCode = javaCode.replaceAll("\\/\\*", "--[[");
        // */
        javaCode = javaCode.replaceAll("\\*\\/", "]]--");
        // )(
        javaCode = javaCode.replaceAll("\\)\\(", "(");
        // break;
        javaCode = javaCode.replaceAll("break;", "");
        // break;\n
        javaCode = javaCode.replaceAll("break;\\n(\\s|\\n|\\r)*else", "");
        // "  {"
        javaCode = javaCode.replaceAll("\\{", "");
        // "}"
        javaCode = javaCode.replaceAll("\\}", "end");
        // end\n elseif
        javaCode = javaCode.replaceAll("(end\\n(\\s|\\n|\\r)*elseif )", "elseif ");
        // end\n else
        javaCode = javaCode.replaceAll("(end\\n(\\s|\\n|\\r)*else )", "else ");
        // #dict_left#;
        javaCode = javaCode.replaceAll("#dict_left#", "{");
        // #dict_right#;
        javaCode = javaCode.replaceAll("#dict_right#", "}");
        //mutil line
        javaCode = javaCode.replaceAll("(\\r?\\n(\\s*\\r?\\n)+)", "\r\n\r\n");


        return javaCode;
    }

    @Override
    public void exitTranslation_unit(ObjCParser.Translation_unitContext ctx) {
        String program = "";

        //添加可能的宏
        for (String aDecSet : decSet) {
            program += "    -- " + aDecSet;
            program += System.lineSeparator();
        }

        ArrayList<String> codeList = null;
        for (External_declarationContext ext : ctx.external_declaration()) {
            ArrayList<String> cl = getList(ext);
            if (cl != null) {
                codeList = cl;

                String cName = gClassName;
                if (cName.length() == 0) {
                    cName = options.getClassName();
                }

                if (!options.isParsingheader()) {
                    if (codeList != null) {
                        program += codeList.get(1);
                    } else {
                        program += "";
                    }
                }

                String myCode = "";
                ClassDescription.ClassDeclaration globalClassDec = ClassDeclaration
                        .getClassDeclaration(classDeclarations, cName
                                + GLOBAL_DECLARATION_MARKER);
                for (String variable : globalClassDec.getVariables()) {
                    myCode += codeFormat.codeIndenter("\n" + variable.trim());
                }

                // enums
                myCode += "\n";
                if (!options.isParsingheader()) {
                    for (String enumuerate : globalClassDec.getEnums()) {
                        myCode += "\n\t" + enumuerate;
                    }
                }
                // functions
                if (!options.isParsingheader()) {
                    myCode += "\n";
                    for (String function : globalClassDec.getFunction_definitions()) {
                        myCode += function;
                    }
                }

                program += myCode;
                program = washResultString(program);

                if (!options.isParsingheader()) {
                    writeOutput(options.getOutputFileName(), program);
                }
            }
        }

    }

    @Override
    public void exitClass_implementation(
            ObjCParser.Class_implementationContext ctx) {
        String cName = getCode(ctx.class_name());
        gClassName = cName;
        String myClass = cName;
        ArrayList<String> codeParts = new ArrayList<String>();

        if (ctx.superclass_name() != null) {
            String sName = getCode(ctx.superclass_name());
            if (!sName.equals("Object")) {
                myClass = myClass + " extends " + sName;
            }
        }
        codeParts.add(myClass);
        myClass = "";
        ClassDescription.ClassDeclaration currentDec = null;
        if (ctx.implementation_definition_list() != null) {
            currentDec = getDeclaration(ctx.implementation_definition_list());
        }
        ClassDescription.ClassDeclaration globalClassDec = ClassDeclaration
                .getClassDeclaration(classDeclarations, cName
                        + GLOBAL_DECLARATION_MARKER);

//		// add a TAG
//		myClass += "\n\tprivate final String TAG = \"" + cName + "\";";

        // get methods
        if (currentDec != null) {
            for (String method : currentDec.getMethod_definitions()) {
                String code = method.replaceAll(CLASSNAME_MARKER, cName);
                code = codeFormat.codeIndenter("\n" + code);
                myClass = myClass + code;
            }
        }

        codeParts.add(myClass);
        setList(ctx, codeParts);
    }

    @Override
    public void exitProperty_implementation(
            ObjCParser.Property_implementationContext ctx) {
        String code = ctx.getText();
        String.format("%s", code);

        ClassDescription.ClassDeclaration cd = new ClassDescription.ClassDeclaration();
        ArrayList<String> holder = cd.getSynthesized();
        if (ctx.getChild(0).getText().equals("@dynamic")) {
            holder = cd.getDynamic();
        }
        ArrayList<String> properties = getList(ctx.property_synthesize_list());
        for (String item : properties) {
            holder.add(item);
        }
        setDeclaration(ctx, cd);
    }

    @Override
    public void exitProperty_synthesize_list(
            ObjCParser.Property_synthesize_listContext ctx) {
        ArrayList<String> list = new ArrayList<String>();
        for (Property_synthesize_itemContext item : ctx
                .property_synthesize_item()) {
            String itemText = getCode(item);
            list.add(itemText);
        }
        setList(ctx, list);
    }

    @Override
    public void exitProperty_synthesize_item(
            ObjCParser.Property_synthesize_itemContext ctx) {
        String item = "";
        if (ctx.IDENTIFIER().size() == 1) {
            item = ctx.IDENTIFIER(0).getText();
        } else {
            item = ctx.IDENTIFIER(0).getText() + "="
                    + ctx.IDENTIFIER(1).getText();
        }
        setCode(ctx, item);
    }

    @Override
    public void exitDeclaration(ObjCParser.DeclarationContext ctx) {
        String decl = getCode(ctx.declaration_minus_semi()) + ";\n";

        //获取注释
        Token prior = ctx.getStart();
        int indx = prior.getTokenIndex();
        List<Token> cmtChannel = tokens.getHiddenTokensToLeft(indx,
                ObjCLexer.COMMENT_CHANNEL);
        if (cmtChannel != null) {
            String txt = "";
            for (Token cmt : cmtChannel) {
                if (cmt != null) {
                    txt = txt + cmt.getText() + "\n";
                }
            }
            setComment(ctx, txt);
        }
        if (getComment(ctx) != null) {
            decl = getComment(ctx) + decl;
        }

        setCode(ctx, decl);
    }

    @Override
    public void exitDeclaration_minus_semi(
            ObjCParser.Declaration_minus_semiContext ctx) {
        String dms = getCode(ctx.declaration_specifiers());
        if (ctx.init_declarator_list() != null) {
            String dCode = makeDecsFromInitDecList(getList(ctx
                    .init_declarator_list()));
            //类型变为Local
            dms += "local " + dCode;
            if (dCode.contains("=")) {
                dms = codeFormat.reformatAssignmentStatements(dms);
            }
        }
        if (ctx.getText().indexOf(dms.trim()) >= 0) {
            setCode(ctx, ctx.getText());
        } else {
            setCode(ctx, dms);
        }
    }

    @Override
    public void exitProperty_declaration(
            ObjCParser.Property_declarationContext ctx) {
        ArrayList<String> list = getList(ctx.struct_declaration());
        setList(ctx, list);
    }

    @Override
    public void exitStruct_declaration(ObjCParser.Struct_declarationContext ctx) {
        String sDecl = getCode(ctx.specifier_qualifier_list()) + " ";
        ArrayList<String> list = getList(ctx.struct_declarator_list());
        ArrayList<String> code = new ArrayList<String>();
        for (String item : list) {
            String sd = (sDecl + item).trim();
            code.add(sd);
        }
        setList(ctx, code);
    }

    @Override
    public void exitStruct_declarator_list(
            ObjCParser.Struct_declarator_listContext ctx) {
        ArrayList<String> list = new ArrayList<String>();
        for (Struct_declaratorContext item : ctx.struct_declarator()) {
            list.add(getCode(item));
        }
        setList(ctx, list);
    }

    @Override
    public void exitStruct_declarator(ObjCParser.Struct_declaratorContext ctx) {
        String dec = "";
        if (ctx.constant() == null) {
            dec = getCode(ctx.declarator());
        } else {
            if (ctx.declarator() != null) {
                dec = getCode(ctx.declarator());
            }
            if (dec.length() == 0) {
                dec = ":" + getCode(ctx.constant());
            } else {
                dec += ":" + getCode(ctx.constant());
            }
        }
        setCode(ctx, dec);
    }

    @Override
    public void exitImplementation_definition(
            ObjCParser.Implementation_definitionContext ctx) {
        ClassDescription.ClassDeclaration cDec = new ClassDescription.ClassDeclaration();
        if (ctx.function_definition() != null) {
            String function = getCode(ctx.function_definition());
            cDec.addFunction_definition(function);
        }
        if (ctx.declaration() != null) {

        }
        if (ctx.class_method_definition() != null) {
            String method = getCode(ctx.class_method_definition());
            cDec.addMethod_definition(method);
        }
        if (ctx.instance_method_definition() != null) {
            String method = getCode(ctx.instance_method_definition());
            cDec.addMethod_definition(method);
        }
        if (ctx.property_implementation() != null) {
            ClassDescription.ClassDeclaration list = getDeclaration(ctx
                    .getChild(0));

            for (String item : list.getSynthesized()) {
                cDec.addSynthesized(item);
            }
            for (String item : list.getDynamic()) {
                cDec.addDynamic(item);
            }
        }
        setDeclaration(ctx, cDec);
        setCode(ctx, "");
    }

    @Override
    public void exitImplementation_definition_list(
            ObjCParser.Implementation_definition_listContext ctx) {
        ClassDescription.ClassDeclaration cd = chooseMapAndDeclaration(gClassName);
        for (Implementation_definitionContext imp : ctx
                .implementation_definition()) {
            ClassDescription.ClassDeclaration item = getDeclaration(imp);
            cd.addFunction_definitions(item.getFunction_definitions());
            cd.addMethod_definitions(item.getMethod_definitions());
            cd.addSynthesized(item.getSynthesized());
            cd.addDynamic(item.getDynamic());
        }
        setDeclaration(ctx, cd);
    }

    @Override
    public void exitExternal_declaration(
            ObjCParser.External_declarationContext ctx) {
        ClassDescription.ClassDeclaration cd = chooseMapAndDeclaration(gClassName);
        String cdx = ctx.getText();
        String.format("%s", cdx);
        if (ctx.declaration() != null) {
            String dec = "static " + getCode(ctx.declaration());
            cd.addVariable(dec);
            setCode(ctx, "");

        } else if (ctx.protocol_declaration() != null) {
            writeProtocols(options.getOutputFileName(),
                    getList(ctx.protocol_declaration()));
            // ClassDescription.ClassDeclaration cd2 = getDeclaration
        } else {
            ArrayList<String> code = getList(ctx.getChild(0));
            setList(ctx, code);
        }
    }

    @Override
    public void exitCategory_implementation(
            ObjCParser.Category_implementationContext ctx) {
        String cName = getCode(ctx.class_name());
        ArrayList<String> codeParts = new ArrayList<String>();

        gClassName = cName;
        String categoryName = "";
        String myClass = "public class " + cName + CATEGORY_MARKER;
        myClass = myClass + " {\n";
        if (ctx.category_name() != null) {
            categoryName += getCode(ctx.category_name());
        }
        if (categoryName.length() > 0) {
            // make warning stop
        }
        codeParts.add(myClass);
        myClass = "";
        ClassDescription.ClassDeclaration currentDec = null;
        if (ctx.implementation_definition_list() != null) {
            currentDec = getDeclaration(ctx.implementation_definition_list());
        }

        // get methods first
        if (currentDec != null) {
            for (String method : currentDec.getMethod_definitions()) {
                String code = method.replaceAll(CLASSNAME_MARKER, gClassName);
                code = codeFormat.codeIndenter("\n" + code);
                myClass = myClass + code;
            }
        }

        codeParts.add(myClass);
        setList(ctx, codeParts);
    }

    @Override
    public void exitCategory_interface(ObjCParser.Category_interfaceContext ctx) {
        String code = ctx.getText();
        String.format("%s", code);
        // String decs = "";
        String className = getCode(ctx.class_name());
        @SuppressWarnings("unused")
        String categoryName = "";
        gClassName = className;
        if (ctx.category_name() != null) {
            categoryName = getCode(ctx.category_name());
        }
    }

    @Override
    public void exitInstance_method_definition(
            ObjCParser.Instance_method_definitionContext ctx) {
        String code = ctx.getText();
        String.format("s", code);
        String call = getCode(ctx.method_definition());
        String mDef = call;

        //获取注释
        Token prior = ctx.getStart();
        int indx = prior.getTokenIndex();
        List<Token> cmtChannel = tokens.getHiddenTokensToLeft(indx,
                ObjCLexer.COMMENT_CHANNEL);
        if (cmtChannel != null) {
            String txt = "";
            for (Token cmt : cmtChannel) {
                if (cmt != null) {
                    txt = txt + cmt.getText() + "\n";
                }
            }
            setComment(ctx, txt);
        }
        if (getComment(ctx) != null) {
            mDef = getComment(ctx) + mDef;
        }

        setCode(ctx, mDef);
    }

    @Override
    public void exitClass_method_definition(
            ObjCParser.Class_method_definitionContext ctx) {
        String mDef = "function " + getCode(ctx.method_definition());
        setCode(ctx, mDef);
    }

    @Override
    public void exitClass_method_declaration(
            ObjCParser.Class_method_declarationContext ctx) {
        String code = getCode(ctx.getChild(1));
        setCode(ctx, "function " + code);
    }

    @Override
    public void enterSelector_name(ObjCParser.Selector_nameContext ctx) {
        String selector = getCode(ctx.getChild(1));
        if (selector == null) {
            selector = ctx.getText();
        }
        setCode(ctx, selector);
    }

    @Override
    public void exitInstance_method_declaration(
            ObjCParser.Instance_method_declarationContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String code = getCode(ctx.method_declaration());
        setCode(ctx, code);
    }

    @Override
    public void exitMethod_declaration(ObjCParser.Method_declarationContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String method = "";
        if (ctx.method_type() != null) {
            method = getCode(ctx.method_type());
        }
        if (method.length() == 0) {
            method = getCode(ctx.method_selector());
        } else {
            method += " " + getCode(ctx.method_selector());
        }
        setCode(ctx, method);
    }

    @Override
    public void exitEnum_specifier(ObjCParser.Enum_specifierContext ctx) {
        String code = ctx.getText();
        String.format("%s", code);

        String en = "enum " + ctx.identifier().getText() + " ";
        if (!ctx.getChild(1).getText().equals("{")) {
            // en += ctx.identifier().getText() + " ";
            if (ctx.enumerator_list() != null) {
                ArrayList<String> list = getList(ctx.enumerator_list());
                en += " {";
                for (int i = 0; i < list.size(); i++) {
                    if (i == 0) {
                        en += "{ ";
                    } else {
                        en += ", ";
                    }
                    en += list.get(i);
                }
                en += "}";
            }
        } else {
            if (ctx.enumerator_list() != null) {
                ArrayList<String> list = getList(ctx.enumerator_list());
                for (int i = 0; i < list.size(); i++) {
                    if (i == 0) {
                        en += "{ ";
                    } else {
                        en += ", ";
                    }
                    en += list.get(i);
                }
            }
            en += "}";
        }

        ClassDeclaration cd = chooseMapAndDeclaration(gClassName);
        cd.addEnum(en);
        setCode(ctx, "");
    }

    // used for definitions which can appear in either .h or .m files

    /**
     * @param className
     * @returns a class declaration holder for the given classname
     */
    private ClassDeclaration chooseMapAndDeclaration(String className) {
        return chooseMapAndDeclaration(classDescription, className,
                options.isParsingheader());
    }

    // used for definitions which can appear in either .h or .m files

    /**
     * @param classDesc
     * @param className
     * @param parsingHeader true if we are parsing a header file
     * @return a class declaration holder for the given class name
     */
    public static ClassDeclaration chooseMapAndDeclaration(
            ClassDescription classDesc, String className, boolean parsingHeader) {
        ClassDeclaration cd;
        String cName = className;
        if (cName.length() == 0) {
            cName = classDesc.getTempClassName() + GLOBAL_DECLARATION_MARKER;
            if (parsingHeader) {
                cName += "header";
            }
        }
        if (parsingHeader) {
            cd = ClassDeclaration.getClassDeclaration(classDesc.getHeaders(),
                    cName);
        } else {
            cd = ClassDeclaration.getClassDeclaration(classDesc.getmFiles(),
                    cName);
        }
        return cd;
    }

    @Override
    public void exitEnumerator_list(ObjCParser.Enumerator_listContext ctx) {
        ArrayList<String> list = new ArrayList<String>();
        for (EnumeratorContext en : ctx.enumerator()) {
            String enumerator = getCode(en);
            list.add(enumerator);
        }
        setList(ctx, list);
    }

    @Override
    public void exitEnumerator(ObjCParser.EnumeratorContext ctx) {
        String en = ctx.identifier().getText();
        if (ctx.constant_expression() != null) {
            en += " = " + getCode(ctx.constant_expression());
        }
        setCode(ctx, en);
    }

    @Override
    public void exitMethod_definition(ObjCParser.Method_definitionContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String methDef = "";

        //LUA没有返回类型
//		if (ctx.method_type() != null) {
//			methDef += getCode(ctx.method_type()) + " ";
//		}

        methDef += "function ";

        String selector = getCode(ctx.method_selector());
        //selector中的下划线处理
        if (selector.indexOf("#_#") == 0) {
            selector = selector.substring(3, selector.length());
        }
        selector = selector.replaceAll("#_#", "_");

        methDef += selector;
        String cName = (gClassName.length() == 0) ? CLASSNAME_MARKER
                : gClassName;
        methDef = codeFormat.generateConstructor(methDef, cName, options);
        boolean isInitConstructor = options.isConstructorMethod();
        if (ctx.init_declarator_list() != null) {
            String decList = makeDecsFromInitDecList(getList(ctx
                    .init_declarator_list()));
            methDef += decList;
        }
        if (!methDef.endsWith(")")) {
            methDef += "(self)";
        }
        methDef += getCode(ctx.compound_statement());
        if (isInitConstructor && options.useSmartConstructorGeneration()) {
            methDef = codeFormat.applyConstructorFixes(methDef);
        }
        setCode(ctx, methDef);
    }

    @Override
    public void exitMethod_selector(ObjCParser.Method_selectorContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String mSelect = "";
        String body = "";
        String params = "";
        params = params + "self, ";//LUA第一个参数为self
        if (ctx.selector() != null) {
            mSelect = getCode(ctx.selector());
        } else {
            if (ctx.keyword_declarator() != null) {
                for (int i = 0; i < ctx.keyword_declarator().size(); i++) {
                    String parts[] = getCode(ctx.keyword_declarator(i)).split(
                            ":");
                    body += parts[0];
                    if (i == 0) {
                        params += parts[1];
                    } else {
                        params += ", " + parts[1];
                    }
                }
                mSelect = body + "(" + params + ")";
            }
            if (ctx.parameter_list() != null) {
                if (mSelect.length() == 0) {
                    mSelect = getCode(ctx.parameter_list());
                } else {
                    mSelect += " " + getCode(ctx.parameter_list());
                }
            }
        }
        setCode(ctx, mSelect);
    }

    @Override
    public void exitKeyword_declarator(ObjCParser.Keyword_declaratorContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String key = "";
        String body = "";
        String param = "";
        String name = "";
        if (ctx.selector() != null) {
            body = getCode(ctx.selector());
        }
        for (Method_typeContext mt : ctx.method_type()) {
            param += getCode(mt);
        }
        name = getCode(ctx.identifier());
        key = "#_#" + body + ":" + name;

        setCode(ctx, key);
    }

    @Override
    public void exitMethod_type(ObjCParser.Method_typeContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        // String mType = "(" + getCode(ctx.type_name()) + ")";
        String mType = getCode(ctx.type_name());
        setCode(ctx, mType);
    }

    @Override
    public void exitInit_declarator_list(
            ObjCParser.Init_declarator_listContext ctx) {
        ArrayList<String> dList = new ArrayList<String>();
        for (Init_declaratorContext dec : ctx.init_declarator()) {
            String decCode = getCode(dec);
            dList.add(decCode);
        }
        setList(ctx, dList);
    }

    private String makeDecsFromInitDecList(ArrayList<String> dList) {
        String iDecs = "";
        for (String decCode : dList) {
            if (iDecs.length() == 0) {
                iDecs = decCode;
            } else {
                iDecs += ", " + decCode;
            }
        }
        return iDecs;
    }

    @Override
    public void exitInit_declarator(ObjCParser.Init_declaratorContext ctx) {
        String iDec = getCode(ctx.declarator());
        if (ctx.initializer() != null) {
            iDec += " = " + getCode(ctx.initializer());
        }
        setCode(ctx, iDec);
    }

    @Override
    public void exitInitializer(ObjCParser.InitializerContext ctx) {
        String init = "";
        if (ctx.assignment_expression() != null) {
            init = getCode(ctx.assignment_expression());
        } else {
            init = "{\n";
            for (int i = 0; i < ctx.initializer().size(); i++) {
                if (i == 0) {
                    init += getCode(ctx.initializer(i));
                } else {
                    init += ", " + getCode(ctx.initializer(i));
                }
            }
            init += "\n}\n";
        }
        setCode(ctx, init);
    }

    @Override
    public void exitType_name(ObjCParser.Type_nameContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String tName = getCode(ctx.specifier_qualifier_list());
        String tName2 = getCode(ctx.getChild(1));
        setCode(ctx, tName + tName2);
    }

    @Override
    public void exitSpecifier_qualifier_list(
            ObjCParser.Specifier_qualifier_listContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String quals = "";
        for (Specifier_qualifierContext q : ctx.specifier_qualifier()) {
            if (quals.length() == 0) {
                quals = getCode(q);
            } else {
                quals += " " + getCode(q);
            }
        }
        setCode(ctx, quals);
    }

    @Override
    public void exitSpecifier_qualifier(
            ObjCParser.Specifier_qualifierContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String qual = "";
        if (ctx.type_specifier() != null) {
            qual = getCode(ctx.type_specifier());
        } else {
            qual = getCode(ctx.type_qualifier());
        }
        setCode(ctx, qual);
    }

    @Override
    public void exitType_specifier(ObjCParser.Type_specifierContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String tSpec = getCode(ctx.getChild(0));
        setCode(ctx, tSpec);
    }

    @Override
    public void exitAdecRecurse(ObjCParser.AdecRecurseContext ctx) {
        String adec = "(" + getCode(ctx.getChild(1)) + ")";
        for (Abstract_declarator_suffixContext d : ctx
                .abstract_declarator_suffix()) {
            adec += getCode(d);
        }
        setCode(ctx, adec);
    }

    // this is where we drop that troublesome '*'
    @Override
    public void exitAdecType(ObjCParser.AdecTypeContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        int index = message.indexOf("*");
        if (index != -1) {
            message += "*";
        }
        String adec = "";
        for (Type_qualifierContext d : ctx.type_qualifier()) {
            adec += getCode(d);
        }
        adec += getCode(ctx.abstract_declarator());
        setCode(ctx, adec);
    }

//	@Override
//	public void exitAdecConst(ObjCParser.AdecConstContext ctx) {
//		String adec = "[";
//		if (ctx.constant_expression() != null) {
//			for (int i = 0; i < ctx.constant_expression().size(); i++) {
//				adec += getCode(ctx.constant_expression(i));
//			}
//		}
//		adec += "]";
//		setCode(ctx, adec);
//	}
//
//	@Override
//	public void exitAdecNone(ObjCParser.AdecNoneContext ctx) {
//		setCode(ctx, "");
//	}

    @Override
    public void exitAbstract_declarator_suffix(
            ObjCParser.Abstract_declarator_suffixContext ctx) {
        String suffix = "";
        if (ctx.getChild(0).getText().equals("[")) {
            suffix = "[";
            if (ctx.constant_expression() != null) {
                suffix += getCode(ctx.constant_expression());
            }
            suffix = "]";
        } else {
            suffix = "(";
            if (ctx.parameter_declaration_list() != null) {
                suffix += getCode(ctx.parameter_declaration_list());
            }
            suffix += ")";
        }
        setCode(ctx, suffix);
    }

    @Override
    public void exitParameter_declaration_list(
            ObjCParser.Parameter_declaration_listContext ctx) {
        String list = "";
        for (int i = 0; i < ctx.parameter_declaration().size(); i++) {
            Parameter_declarationContext dec = ctx.parameter_declaration(i);
            if (i == 0) {
                list = getCode(dec);
            } else {
                list += ", " + getCode(dec);
            }
        }
        setCode(ctx, list);
    }

    @Override
    public void exitParameter_declaration(
            ObjCParser.Parameter_declarationContext ctx) {
        String dec = getCode(ctx.declaration_specifiers());
        if (ctx.abstract_declarator() != null) {
            dec += " " + getCode(ctx.abstract_declarator());
        } else {
            if (ctx.declarator() != null) {
                dec += " " + getCode(ctx.declarator());
            }
        }
        setCode(ctx, dec);
    }

    @Override
    public void exitDeclaration_specifiers(
            ObjCParser.Declaration_specifiersContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String specs = "";
//LUA
//		for (Declaration_specifierContext spec : ctx.declaration_specifier()) {
//			if (specs.length() == 0) {
//				specs = getCode(spec);
//			} else {
//				specs += " " + getCode(spec);
//			}
//		}
        setCode(ctx, specs);
    }

    @Override
    public void exitDeclaration_specifier(
            ObjCParser.Declaration_specifierContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String code = getCode(ctx.getChild(0));
        setCode(ctx, code);
    }

    @Override
    public void exitDeclarator_suffix(ObjCParser.Declarator_suffixContext ctx) {
        String suffix = "";
        if (ctx.getChild(0).getText().equals("[")) {
            if (ctx.constant_expression() != null) {
                suffix = "[" + getCode(ctx.constant_expression()) + "]";
            } else {
                suffix = "[]";
            }
        } else {
            if (ctx.parameter_list() != null) {
                suffix = "(" + getCode(ctx.parameter_list()) + ")";
            } else {
                suffix = "()";
            }
        }
        setCode(ctx, suffix);
    }

    @Override
    public void exitDeclarator(ObjCParser.DeclaratorContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        int index = message.indexOf("*");
        if (index != -1) {
            message += "*";
        }
        String decl = "";
        if (ctx.direct_declarator() == null) {
            for (Type_qualifierContext t : ctx.type_qualifier()) {
                if (decl.length() == 0) {
                    decl = getCode(t);
                } else {
                    decl += " " + getCode(t);
                }
            }
            if (decl.length() == 0) {
                decl = getCode(ctx.declarator());
            } else {
                decl += " " + getCode(ctx.declarator());
            }
        } else {
            decl = getCode(ctx.direct_declarator());
        }
        setCode(ctx, decl);
    }

    @Override
    public void exitDirect_declarator(ObjCParser.Direct_declaratorContext ctx) {
        String direct = "";
        if (ctx.identifier() != null) {
            direct = getCode(ctx.identifier());
            for (Declarator_suffixContext s : ctx.declarator_suffix()) {
                direct += " " + getCode(s);
            }
        } else {
            direct = "(" + getCode(ctx.declarator()) + ")";
            for (Declarator_suffixContext s : ctx.declarator_suffix()) {
                direct += " " + getCode(s);
            }
        }

        setCode(ctx, direct);
    }

    @Override
    public void exitParameter_list(ObjCParser.Parameter_listContext ctx) {
        String code = getCode(ctx.parameter_declaration_list());
        if (ctx.getChild(1) != null) {
            code += ctx.getChild(1).getText() + ctx.getChild(2).getText();
        }
        setCode(ctx, code);
    }

    @Override
    public void exitStatement_list(ObjCParser.Statement_listContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String states = "";
        for (StatementContext stmt : ctx.statement()) {
            String code = codeFormat.applyRegexToStatement(getCode(stmt),
                    options);
            states += code;
        }
        setCode(ctx, states);
    }

    @Override
    public void exitCompound_statement(ObjCParser.Compound_statementContext ctx) {
        String code = ctx.getText();
        String.format("%s", code);
        String cStatements = "{\n";
        for (Compound_statement_partsContext stmt : ctx
                .compound_statement_parts()) {
            cStatements += getCode(stmt);
        }
        cStatements += "}\n";
        setCode(ctx, cStatements);
    }

    public void exitCompound_statement_parts(
            ObjCParser.Compound_statement_partsContext ctx) {

        String stmts = "";
        if (ctx.declaration() != null) {
            stmts += getCode(ctx.declaration());
        } else {
            stmts += getCode(ctx.statement_list());
        }
        setCode(ctx, stmts);
    }

    @Override
    public void exitStatement(ObjCParser.StatementContext ctx) {
        String code = ctx.getText();
        String.format("%s", code);
        setCode(ctx, getCode(ctx.getChild(0)));
    }

    @Override
    public void exitLabelid(ObjCParser.LabelidContext ctx) {
        String label = getCode(ctx.identifier()) + ": "
                + getCode(ctx.getChild(2));
        setCode(ctx, label);
    }

    @Override
    public void exitFor_complete(ObjCParser.For_completeContext ctx) {
        String code = ctx.getText();
        String.format("%s", code);
        String fc = "";
        if (ctx.declaration_minus_semi() != null) {
            fc = getCode(ctx.declaration_minus_semi())
                    + getCode(ctx.getChild(1));
        } else if (ctx.getChild(0).getText().equals(";")) {
            int i = 1;
            String[] parts = ctx.getText().split(";");
            fc += ";";
            if (parts[1].length() > 0) {
                fc += getCode(ctx.expression(i++));
            }
            fc += ";";
            if (parts[2].length() > 0) {
                fc += getCode(ctx.expression(i++));
            }
        } else {
            int i = 1;
            fc += getCode(ctx.expression(0));
            String[] parts = ctx.getText().split(";");
            fc += ";";
            if (parts[1].length() > 0) {
                fc += getCode(ctx.expression(i++));
            }
            fc += ";";
            if (parts[2].length() > 0) {
                fc += getCode(ctx.expression(i++));
            }
        }
        setCode(ctx, fc);
    }

    @Override
    public void exitForcomplete1(ObjCParser.Forcomplete1Context ctx) {
        String code = ctx.getText();
        String.format("%s", code);
        String f = "";
        if (ctx.getChild(0).getText().equals(";")) {
            String[] parts = ctx.getText().split(";");
            f += ";";
            int i = 0;
            if (parts[1].length() > 0) {
                f += getCode(ctx.expression(i++));
            }
            f += ";";
            if (parts[2].length() > 0) {
                f += getCode(ctx.expression(i++));
            }
        } else {
            f = " : " + getCode(ctx.expression(0));
        }
        setCode(ctx, f);
    }

    @Override
    public void exitForcomplete2(ObjCParser.Forcomplete2Context ctx) {
        String fComplete = " : " + getCode(ctx.expression());
        setCode(ctx, fComplete);
    }

    @Override
    public void exitCase(ObjCParser.CaseContext ctx) {
//		String caseStatement = "case " + getCode(ctx.constant_expression())
//				+ ":\n" + getCode(ctx.statement());
        String caseStatement = "elseif (" + "#switchObject# ==" + getCode(ctx.constant_expression()) + ") then" + "\n"
                + getCode(ctx.statement());
        setCode(ctx, caseStatement);
    }

    @Override
    public void exitDefault(ObjCParser.DefaultContext ctx) {
        //LUA没有switch的default语法
//		String defStatement = "default: \n" + getCode(ctx.getChild(2));
//		setCode(ctx, defStatement);
        setCode(ctx, "");

    }

    @Override
    public void exitGetter_call(ObjCParser.Getter_callContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String[] parts = getCode(ctx.dotidentifier()).split("\\.");
        String call = null;
        for (int i = 0; i < parts.length; i++) {
            if (i == 0) {
                call = parts[0];
            } else {
                call += ":" + parts[i] + "()";//LUA的getter转换为方法调用
            }
        }
        setCode(ctx, call);
    }

    @Override
    public void exitSetter_call(ObjCParser.Setter_callContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String[] parts = getCode(ctx.dotidentifier()).split("\\.");
        parts[1] = parts[1].substring(0, 1).toUpperCase()
                + parts[1].substring(1);
        String value = getCode(ctx.expression());
        String call = String.format("%s:set%s(%s)", parts[0], parts[1], value);
        setCode(ctx, call);
    }

    @Override
    public void exitDotidentifier(ObjCParser.DotidentifierContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String code = null;
        String[] parts = ctx.getText().split("\\.");
        for (String part : parts) {
            if (code == null) {
                code = codeFormat.identifierFormatter(part, options);
            } else {
                code += "." + part;
            }
        }
        setCode(ctx, code);
    }

    //LUA Message Method
    @Override
    public void exitMessage_expression(ObjCParser.Message_expressionContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String mExpression = "";
        if (ctx.receiver() != null) {
            String receiver = getCode(ctx.receiver());
            String cName = gClassName;
            if (cName.length() == 0) {
                cName = classDescription.getTempClassName();
            }
            if (receiver.equals(cName)) {
                // mExpression = "" + getCode(ctx.message_selector());
                // experiment with this
                mExpression = getCode(ctx.receiver()) + ":"
                        + getCode(ctx.message_selector());
            } else {
                mExpression = getCode(ctx.receiver()) + ":"
                        + getCode(ctx.message_selector());
            }
            mExpression = codeFormat.reformatMethodCall(mExpression, options);
        } else {
            // mExpression = getCode(ctx.getter_call());
        }
        setCode(ctx, mExpression);
    }

    @Override
    public void exitMessage_selector(ObjCParser.Message_selectorContext ctx) {
        String selector = "";
        if (ctx.selector() != null) {
            selector = getCode(ctx.selector()) + "()";
        } else { // keywords
            String params = "";
            String types = "";
            for (Keyword_argumentContext ka : ctx.keyword_argument()) {
                String parts[] = getCode(ka).split(":", 2);
                types += parts[0] + "_";//Lua方法中间用下划线
                if (params.length() > 0) {
                    params = params + ", " + parts[1];
                } else {
                    params = parts[1];
                }
            }
            selector = types.substring(0, types.length() - 1) + "(" + params + ")";
        }
        setCode(ctx, selector);
    }

    @Override
    public void exitKeyword_argument(ObjCParser.Keyword_argumentContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String key = "";
        if (ctx.selector() != null) {
            key = getCode(ctx.selector());
        }
        key += ":" + getCode(ctx.expression());
        setCode(ctx, key);
    }

    @Override
    public void exitSemi_statement(ObjCParser.Semi_statementContext ctx) {
        String semi = "";
        if (ctx.getChild(0).getText().equals(";")) {
            semi = ";\n";
        } else {
            semi = getCode(ctx.getChild(0)) + ";\n";
        }
        setCode(ctx, semi);
    }

    //LUA IF
    @Override
    public void exitIfstmt(ObjCParser.IfstmtContext ctx) {
        String ifSt;

        String thenifst = getCode(ctx.statement(0));
        if (thenifst.trim().charAt(thenifst.trim().length() - 1) != '}') {
            thenifst = "{\n" + thenifst + "}\n";
        }
        ifSt = "if  (" + getCode(ctx.expression()) + ") then " + thenifst;
        if (ctx.statement().size() > 1) {
            String elseifst = getCode(ctx.statement(1));
            if (elseifst.trim().charAt(elseifst.trim().length() - 1) != '}') {
                elseifst = "{\n" + elseifst + "}\n";
            }
            ifSt += "else " + elseifst;

        }
        setCode(ctx, ifSt);
    }

    //LUA While
    @Override
    public void exitWhile_statement(ObjCParser.While_statementContext ctx) {
        String code = ctx.getText();
        String.format("%s", code);
        String exp = getCode(ctx.expression());
        String st = getCode(ctx.statement());
        String wh = "while (" + exp + ") do ";
        wh += st;
        setCode(ctx, wh);
    }

    //LUA For
    @Override
    public void exitFor_statement(ObjCParser.For_statementContext ctx) {
        String code = ctx.getText();
        String.format("%s", code);
        String fr = "for " + getCode(ctx.for_complete()).replaceAll("local ", "") + " do ";
        fr += getCode(ctx.statement());
        setCode(ctx, fr);
    }

    //LUA Do-While -> Repeat-Until
    @Override
    public void exitDo_while_statement(ObjCParser.Do_while_statementContext ctx) {
        String doWhile = "repeat" + getCode(ctx.statement()) + "until("
                + getCode(ctx.expression()) + ");\n";
        setCode(ctx, doWhile);
    }

    @Override
    public void exitJump_statement(ObjCParser.Jump_statementContext ctx) {
        String type = ctx.getText();
        String jump = "";
        if (type.startsWith("goto")) {
            jump += "goto " + ctx.identifier().getText() + ";\n";
        } else if (type.startsWith("continue")) {
            jump += "continue;\n";
        } else if (type.startsWith("return")) {
            jump += (getCode(ctx.expression()) == null ? "return" : ("return " + getCode(ctx.expression()))) + ";\n";
        } else if (type.startsWith("break")) {
            jump += "break;\n";
        }
        setCode(ctx, jump);
    }

    //LUA Switch语法转换
    @Override
    public void exitSwitch(ObjCParser.SwitchContext ctx) {
        String swSt = getCode(ctx.statement());
        swSt = swSt.replaceFirst("elseif", "if");
        swSt = swSt.replaceAll("#switchObject#", getCode(ctx.expression()));
        swSt = swSt.replaceFirst("\\{\\n", "");
        swSt = swSt.substring(0, swSt.lastIndexOf("}\n"));
        swSt = swSt + "end\n";
        setCode(ctx, swSt);
    }

    @Override
    public void enterSuperclass_name(ObjCParser.Superclass_nameContext ctx) {
        String name = getCode(ctx.identifier());
        setCode(ctx, name);
    }

    @Override
    public void exitClass_name(ObjCParser.Class_nameContext ctx) {
        String name = getCode(ctx.identifier());
        setCode(ctx, name);
    }

    @Override
    public void exitSuperclass_name(ObjCParser.Superclass_nameContext ctx) {
        String name = getCode(ctx.identifier());
        setCode(ctx, name);
    }

    @Override
    public void exitIgnoreStoreClass(ObjCParser.IgnoreStoreClassContext ctx) {
        setCode(ctx, "");
    }

    @Override
    public void exitStaticStoreClass(ObjCParser.StaticStoreClassContext ctx) {
        setCode(ctx, "");
    }

    @Override
    public void exitSimple_type_specifier(
            ObjCParser.Simple_type_specifierContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String tSpec = getCode(ctx.getChild(0));
        setCode(ctx, tSpec);
    }

    @Override
    public void exitPrimitive_type_specifier(
            ObjCParser.Primitive_type_specifierContext ctx) {
        setCode(ctx, ctx.getText());
    }

    // not handled;
    @Override
    public void exitUnusual_type_specifier(
            ObjCParser.Unusual_type_specifierContext ctx) {
        String code = getCode(ctx.getChild(0));
        setCode(ctx, code);
    }

    @Override
    public void exitStruct_or_union_specifier(
            ObjCParser.Struct_or_union_specifierContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String code = "";

        if (ctx.IDENTIFIER() != null) {
            code += ctx.IDENTIFIER().getText();
        }
        if (ctx.struct_declaration() != null) {
            if (ctx.identifier(0) != null) {
                code += getCode(ctx.identifier(0));
            }
            for (Struct_declarationContext sd : ctx.struct_declaration()) {
                ArrayList<String> decParts = getList(sd);
                for (String part : decParts) {
                    code += part;
                }
                code += ";\n";
            }

            code += "}\n";

        }
        setCode(ctx, code);
    }

    // protocol reference list stuff not handled for now
    @Override
    public void exitIdTypeSpec(ObjCParser.IdTypeSpecContext ctx) {
        setCode(ctx, "Object");
    }

    // protocol reference list stuff not handled for now
    @Override
    public void enterClassTypeSpec(ObjCParser.ClassTypeSpecContext ctx) {
        String cName = getCode(ctx.class_name());
        setCode(ctx, cName);
    }

    @Override
    public void exitConstTypeQualifier(ObjCParser.ConstTypeQualifierContext ctx) {
        setCode(ctx, "");
    }

    // not handling 'volatile' or 'protocol qualifier'
    @Override
    public void exitIgnoreTypeQualifier(
            ObjCParser.IgnoreTypeQualifierContext ctx) {
        setCode(ctx, "");
    }

    @Override
    public void exitStructTypeSpec(ObjCParser.StructTypeSpecContext ctx) {
        String code = getCode(ctx.unusual_type_specifier());
        setCode(ctx, code);
    }

    @Override
    public void exitConstant(ObjCParser.ConstantContext ctx) {
        String stmt = ctx.getText();
        setCode(ctx, stmt);
    }

    @Override
    public void exitString_constant(ObjCParser.String_constantContext ctx) {
        String stmt = ctx.getText();
        if (stmt.charAt(0) != '"') {
            stmt = stmt.substring(1);
        }
        setCode(ctx, stmt);
    }

    @Override
    public void exitSimple_expression(ObjCParser.Simple_expressionContext ctx) {
        String simple = "";
        if (ctx.identifier() != null) {
            simple = getCode(ctx.identifier());
        } else {
            // int n = ctx.getChildCount();
            simple = getCode(ctx.getChild(0));
        }
        setCode(ctx, simple);
    }

    @Override
    public void exitParenthetical_expression(
            ObjCParser.Parenthetical_expressionContext ctx) {
        String stmt = "(" + getCode(ctx.expression()) + ")";
        setCode(ctx, stmt);
    }

    // encode, protocol, and selector statements
    @Override
    public void exitUnsupported_instruction(
            ObjCParser.Unsupported_instructionContext ctx) {
        setCode(ctx, "");
    }

    //Block不支持
    @Override
    public void exitBlock_expression(ObjCParser.Block_expressionContext ctx) {
        String block = ctx.getText();
        block = codeFormat.codeIndenter(block + "\n");
        setCode(ctx, "WAX Unsupported Block Please Delete");
    }

    @Override
    public void exitBlock_parameters(Block_parametersContext ctx) {
        String block = ctx.getText();
        setCode(ctx, block);
    }

    @Override
    public void exitBox_expression(ObjCParser.Box_expressionContext ctx) {
        String box = ctx.getText();
        setCode(ctx, box);
    }

    @Override
    public void exitArray_expression(ObjCParser.Array_expressionContext ctx) {
        String array = ctx.getText();
        setCode(ctx, array);
    }

    @Override
    public void exitDictionary_pair(Dictionary_pairContext ctx) {
        String key = getCode(ctx.postfix_expression().get(0));
        String value = getCode(ctx.postfix_expression().get(1));
        String pair = key + " = " + value;
        setCode(ctx, pair);
    }

    @Override
    public void exitDictionary_expression(ObjCParser.Dictionary_expressionContext ctx) {
//        String dict = ctx.getText();
        String dict = "";
        for (int i = 0; i < ctx.dictionary_pair().size(); i++) {
            if (i != 0) {
                dict += ", ";
            }
            dict += getCode(ctx.dictionary_pair(i));
        }
        dict = dict.replaceFirst("@", "");
        dict = "#dict_left#" + dict + "#dict_right#";
        setCode(ctx, dict);
    }

    @Override
    public void exitReceiver(ObjCParser.ReceiverContext ctx) {
        String rec = "";
        if (ctx.expression() != null) {
            rec = getCode(ctx.expression());
        } else if (ctx.class_name() != null) {
            rec = getCode(ctx.class_name());
        } else if (ctx.message_expression() != null) {
            rec = getCode(ctx.message_expression());
        } else { // super
            rec = "super";
        }
        setCode(ctx, rec);
    }

    @Override
    public void exitSelector(ObjCParser.SelectorContext ctx) {
        String selector = null;

        if (ctx.dotidentifier() != null || ctx.identifier() != null) {
            selector = getCode(ctx.getChild(0));
        } else {
            selector = ctx.getText();
        }
        setCode(ctx, selector);
    }

    @Override
    public void exitExpression(ObjCParser.ExpressionContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String exp = getCode(ctx.assignment_expression().get(0));

        for (int i = 1; i < ctx.assignment_expression().size(); i++) {
            exp += ", " + getCode(ctx.assignment_expression().get(i));
        }

        //获取注释
        Token prior = ctx.getStart();
        int indx = prior.getTokenIndex();
        List<Token> cmtChannel = tokens.getHiddenTokensToLeft(indx,
                ObjCLexer.COMMENT_CHANNEL);
        if (cmtChannel != null) {
            String txt = "";
            for (Token cmt : cmtChannel) {
                if (cmt != null) {
                    txt = txt + cmt.getText() + "\n";
                }
            }
            setComment(ctx, txt);
        }
        if (getComment(ctx) != null) {
            exp = getComment(ctx) + exp;
        }
        if (message == "[") {
            setCode(ctx, "[");
        } else if (message == "]") {
            setCode(ctx, "]");
        } else {
            setCode(ctx, exp);
        }
    }

    @Override
    public void exitAssignment_expression(
            ObjCParser.Assignment_expressionContext ctx) {
        String conditional = getCode(ctx.conditional_expression());
        String op = null;
        String assign = null;
        String expression = null;
        if (ctx.assignment_operator() != null) {
            // make attempt to remove pointer asterisk
            op = ctx.assignment_operator().getText();
            assign = getCode(ctx.assignment_expression());
            expression = ctx.unary_expression().getText();
        }
        String stmt = "";
        if (conditional != null) {
            stmt = codeFormat.assignment_expression(conditional, op, assign);
        } else {
            if (assign != null) {
                stmt = codeFormat.assignment_expression(expression, op, assign);
            }
        }
        setCode(ctx, stmt);
    }

    @Override
    public void exitLogical_or_expression(
            ObjCParser.Logical_or_expressionContext ctx) {
        String logic = getCode(ctx.logical_and_expression(0));
        for (int i = 1; i < ctx.logical_and_expression().size(); i++) {
            logic += " || " + getCode(ctx.logical_and_expression(i));
        }
        setCode(ctx, logic);
    }

    @Override
    public void exitAnd_expression(ObjCParser.And_expressionContext ctx) {
        String logic = getCode(ctx.equality_expression(0));
        for (int i = 1; i < ctx.equality_expression().size(); i++) {
            logic += " & " + getCode(ctx.equality_expression(i));
        }
        setCode(ctx, logic);
    }

    @Override
    public void exitSelector_expression(
            ObjCParser.Selector_expressionContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
//        String selector = getCode(ctx.getChild(0)) + "("
//                + getCode(ctx.selector_name()) + ")";
        String selector = "\"" + getCode(ctx.selector_name()) + "\"";
        setCode(ctx, selector);
    }

    @Override
    public void exitLogical_and_expression(
            ObjCParser.Logical_and_expressionContext ctx) {
        String logic = getCode(ctx.inclusive_or_expression(0));
        for (int i = 1; i < ctx.inclusive_or_expression().size(); i++) {
            logic += " && " + getCode(ctx.inclusive_or_expression(i));
        }
        setCode(ctx, logic);
    }

    @Override
    public void exitConditional_expression(
            ObjCParser.Conditional_expressionContext ctx) {
        // String message = ctx.getText();
        // message += "";
        String logic = getCode(ctx.logical_or_expression(0));
        if (ctx.logical_or_expression(1) != null) {
            if (ctx.logical_or_expression().size() == 2) {
                logic += " ?: " + getCode(ctx.logical_or_expression(1));
            } else {
                logic += " ? " + getCode(ctx.logical_or_expression(1));
            }
        }
        if (ctx.logical_or_expression(2) != null) {
            logic += " : " + getCode(ctx.logical_or_expression(2));
        }
//		for (int i = 1; i < ctx.logical_or_expression().size(); i++) {
//			logic += " ? " + getCode(ctx.logical_or_expression(i)) + " : "
//					+ getCode(ctx.logical_or_expression(2));
//		}
        setCode(ctx, logic);
    }

    @Override
    public void exitInclusive_or_expression(
            ObjCParser.Inclusive_or_expressionContext ctx) {
        String logic = getCode(ctx.exclusive_or_expression(0));
        for (int i = 1; i < ctx.exclusive_or_expression().size(); i++) {

            logic += " | " + getCode(ctx.exclusive_or_expression(i));
        }
        setCode(ctx, logic);
    }

    @Override
    public void exitExclusive_or_expression(
            ObjCParser.Exclusive_or_expressionContext ctx) {
        String logic = getCode(ctx.and_expression(0));
        for (int i = 1; i < ctx.and_expression().size(); i++) {
            logic += " ^ " + getCode(ctx.and_expression(i));
        }
        setCode(ctx, logic);
    }

    @Override
    public void exitEquality_expression(
            ObjCParser.Equality_expressionContext ctx) {
        String equal = getCode(ctx.relational_expression(0));
        for (int i = 1; i < ctx.relational_expression().size(); i++) {
            equal += " " + getCode(ctx.equality_op(i - 1)) + " "
                    + getCode(ctx.relational_expression(i));
        }
        setCode(ctx, equal);
    }

    @Override
    public void exitRelational_expression(
            ObjCParser.Relational_expressionContext ctx) {
        String relate = getCode(ctx.shift_expression(0));
        for (int i = 1; i < ctx.shift_expression().size(); i++) {
            relate += " " + getCode(ctx.relational_op(i - 1)) + " "
                    + getCode(ctx.shift_expression(i));
        }
        setCode(ctx, relate);
    }

    @Override
    public void exitShift_expression(ObjCParser.Shift_expressionContext ctx) {
        String shift = getCode(ctx.additive_expression(0));
        for (int i = 1; i < ctx.additive_expression().size(); i++) {
            shift += " " + getCode(ctx.shift_op(i - 1)) + " "
                    + getCode(ctx.additive_expression(i));
        }
        setCode(ctx, shift);
    }

    @Override
    public void exitAdditive_expression(
            ObjCParser.Additive_expressionContext ctx) {
        String shift = getCode(ctx.multiplicative_expression(0));
        for (int i = 1; i < ctx.multiplicative_expression().size(); i++) {
            shift += " " + getCode(ctx.add_op(i - 1)) + " "
                    + getCode(ctx.multiplicative_expression(i));
        }
        setCode(ctx, shift);
    }

    @Override
    public void exitMultiplicative_expression(
            ObjCParser.Multiplicative_expressionContext ctx) {
        String shift = getCode(ctx.cast_expression(0));
        for (int i = 1; i < ctx.cast_expression().size(); i++) {
            shift += " " + getCode(ctx.multiply_op(i - 1)) + " "
                    + getCode(ctx.cast_expression(i));
        }
        setCode(ctx, shift);
    }

    @Override
    public void exitUnary_expression(Unary_expressionContext ctx) {
        String message = ctx.getText();
        String unaryExpression = null;
        if (ctx.postfix_expression() != null) {
            unaryExpression = getCode(ctx.postfix_expression());
        } else {
            unaryExpression = getCode(ctx.getChild(0));
            if (unaryExpression == null) {
                unaryExpression = "";
            }
            if (ctx.cast_expression() != null) {
                unaryExpression += getCode(ctx.cast_expression());
            }
        }
        setCode(ctx, unaryExpression);
    }

    @Override
    public void exitCast_expression(ObjCParser.Cast_expressionContext ctx) {
        String cast = "";
        String message = ctx.getText();
        String.format("%s", message);
        if (ctx.cast_expression() != null) {
            cast = "(" + getCode(ctx.type_name()) + ")"
                    + getCode(ctx.cast_expression());
        } else {
            cast = getCode(ctx.getChild(0));
            if (cast == null) {
                cast = "";
            }
        }
        setCode(ctx, cast);
    }

    @Override
    public void exitAdd_op(ObjCParser.Add_opContext ctx) {
        setCode(ctx, ctx.getText());
    }

    @Override
    public void exitMultiply_op(ObjCParser.Multiply_opContext ctx) {
        setCode(ctx, ctx.getText());
    }

    @Override
    public void exitShift_op(ObjCParser.Shift_opContext ctx) {
        setCode(ctx, ctx.getText());
    }

    @Override
    public void exitEquality_op(ObjCParser.Equality_opContext ctx) {
        setCode(ctx, ctx.getText());
    }

    @Override
    public void exitRelational_op(ObjCParser.Relational_opContext ctx) {
        setCode(ctx, ctx.getText());
    }

    @Override
    public void exitConstant_expression(
            ObjCParser.Constant_expressionContext ctx) {
        String con = getCode(ctx.conditional_expression());
        setCode(ctx, con);
    }

    @Override
    public void exitUnary_operator(ObjCParser.Unary_operatorContext ctx) {
        String code = ctx.getText();
        if (code.equals("*")) {
            code = "";
        }
        setCode(ctx, code);
    }

    @Override
    public void exitPostfix_expression(ObjCParser.Postfix_expressionContext ctx) {
        String code = ctx.getText();
        String.format("%s", code);
        String pFix = getCode(ctx.primary_expression());
        if (ctx.postfix_expression_complete() != null) {
            for (Postfix_expression_completeContext fc : ctx
                    .postfix_expression_complete()) {
                pFix += getCode(fc);
                pFix = codeFormat.reformatMethodCall(pFix, options);
            }
        }
        setCode(ctx, pFix);
    }

    @Override
    public void exitPostfix_expression_complete(Postfix_expression_completeContext ctx) {
        String code = ctx.getText();
        setCode(ctx, code);
    }

    @Override
    public void enterComment(ObjCParser.CommentContext ctx) {
        String comment = ctx.getText();
        setCode(ctx, comment);
    }

    @Override
    public void exitComment(ObjCParser.CommentContext ctx) {
        String comment = ctx.getText();
        setCode(ctx, comment);
    }

    @Override
    public void exitArgument_expression_list(
            ObjCParser.Argument_expression_listContext ctx) {
        String arg = getCode(ctx.assignment_expression(0));
        for (int i = 1; i < ctx.assignment_expression().size(); i++) {
            arg += ", " + getCode(ctx.assignment_expression(i));
        }
        setCode(ctx, arg);
    }

    @Override
    public void exitPrimary_expression(ObjCParser.Primary_expressionContext ctx) {
        String primary = getCode(ctx.getChild(0));

        setCode(ctx, primary);
    }

    @Override
    public void exitSelf_expression(ObjCParser.Self_expressionContext ctx) {
        setCode(ctx, "self");
    }

    @Override
    public void exitSuper_expression(Super_expressionContext ctx) {
        setCode(ctx, "self.super");
    }

    @Override
    public void enterIdentifier(ObjCParser.IdentifierContext ctx) {
        String text = ctx.getText();
        text = codeFormat.identifierFormatter(text, options);
        setCode(ctx, text);
    }

    @Override
    public void exitIdentifier(ObjCParser.IdentifierContext ctx) {
        String text = ctx.getText();
        isMaybeDec(text);
        text = codeFormat.identifierFormatter(text, options);
        setCode(ctx, text);
    }

    @Override
    public void exitFunction_definition(
            ObjCParser.Function_definitionContext ctx) {
        ClassDescription.ClassDeclaration cDec = chooseMapAndDeclaration(gClassName);

        String fDef = "";
        if (ctx.declaration_specifiers() != null) {
            fDef = getCode(ctx.declaration_specifiers());
        }
        fDef += " " + getCode(ctx.declarator());
        fDef += getCode(ctx.compound_statement());
        cDec.addFunction_definition(fDef);

        setCode(ctx, "");
    }

    @Override
    public void exitClass_interface(ObjCParser.Class_interfaceContext ctx) {
        String name = getCode(ctx.class_name());
        gClassName = name;
        gSuperClassName = "";
        if (ctx.superclass_name() != null) {
            gSuperClassName = getCode(ctx.superclass_name());
        }
        ClassDeclaration cd = null;
        if (!options.isParsingheader()) {
            cd = ClassDescription.ClassDeclaration.getClassDeclaration(
                    classDeclarations, gClassName);
        }
        if (cd != null) {
            cd.setSuperClassName(gSuperClassName);
        }

        setCode(ctx, "");
    }

    @Override
    public void exitInterface_declaration_list(
            ObjCParser.Interface_declaration_listContext ctx) {
        ClassDescription.ClassDeclaration cDec = chooseMapAndDeclaration(gClassName);
        ClassDescription.ClassDeclaration cDec2 = new ClassDescription.ClassDeclaration();
        // if (cDec.getTag().contains("StorageService")) {
        // cDec.setTag(cDec.getTag());
        // }
        if (ctx.declaration() != null) {
            for (DeclarationContext decs : ctx.declaration()) {
                String code = getCode(decs);
                setCode(ctx, code);
            }
        }
        if (ctx.class_method_declaration() != null) {
            for (Class_method_declarationContext mDec : ctx
                    .class_method_declaration()) {
                cDec.addMethod_declaration(getCode(mDec));
                cDec2.addMethod_declaration(getCode(mDec));
            }
        }
        if (ctx.instance_method_declaration() != null) {
            for (Instance_method_declarationContext mDec : ctx
                    .instance_method_declaration()) {
                String cc = getCode(mDec);
                cDec.addMethod_declaration(cc);
                cDec2.addMethod_declaration(cc);
            }
        }
        if (ctx.property_declaration() != null) {
            for (Property_declarationContext pList : ctx.property_declaration()) {
                ArrayList<String> list = getList(pList);
                for (String prop : list) {
                    cDec.addProperty(prop);
                }
            }
        }
        setDeclaration(ctx, cDec2);
        setCode(ctx, "");
    }

    @Override
    public void exitProtocol_reference_list(
            ObjCParser.Protocol_reference_listContext ctx) {
        ArrayList<String> list = getList(ctx.getChild(1));
        setList(ctx, list);
    }

    @Override
    public void exitProtocol_list(ObjCParser.Protocol_listContext ctx) {
        ArrayList<String> pl = new ArrayList<String>();
        for (Protocol_nameContext ref : ctx.protocol_name()) {
            pl.add(ref.getText());
        }
        setList(ctx, pl);
    }

    @Override
    public void exitInstance_decl(ObjCParser.Instance_declContext ctx) {
        String cd = ctx.getText();
        String.format("%s", cd);
        String visibility = "public ";
        ArrayList<String> decs = new ArrayList<String>();
        for (Struct_declarationContext dec : ctx.struct_declaration()) {
            String code = visibility + getCode(dec);
            decs.add(code);
        }
        setList(ctx, decs);
    }

    @Override
    public void exitInstance_sidecl(ObjCParser.Instance_sideclContext ctx) {
        String code = ctx.getText();
        String.format("%s", code);
        String prefix = ctx.visibility_specification().getText().substring(1);
        ArrayList<String> instance = new ArrayList<String>();
        if (ctx.struct_declaration() != null) {
            for (Struct_declarationContext dp : ctx.struct_declaration()) {
                if (prefix.length() == 0) {
                    prefix = getCode(dp);
                } else {
                    prefix += " " + getCode(dp);
                }
            }
            ArrayList<String> decls = getList(ctx.instance_variables());
            String var = "";
            for (String decl : decls) {
                if (prefix.length() == 0) {
                    var = decl;
                } else {
                    var = " " + decl;
                }
                instance.add(var);
            }
        }
        setList(ctx, null);
    }

    @Override
    public void exitInstance_idecl(ObjCParser.Instance_ideclContext ctx) {
        String code = ctx.getText();
        String.format("%s", code);
        String prefix = "";
        ArrayList<String> instance = new ArrayList<String>();
        if (ctx.struct_declaration() != null) {
            for (Struct_declarationContext dp : ctx.struct_declaration()) {
                if (prefix.length() == 0) {
                    prefix = getCode(dp);
                } else {
                    prefix += " " + getCode(dp);
                }
            }
            ArrayList<String> decls = getList(ctx.instance_variables());
            String var = "";
            for (String decl : decls) {
                if (prefix.length() == 0) {
                    var = decl;
                } else {
                    var = " " + decl;
                }
                instance.add(var);
            }
        }
        setList(ctx, null);
    }

    @Override
    public void exitInstance_sdecl(ObjCParser.Instance_sdeclContext ctx) {
        String cd = ctx.getText();
        String.format("%s", cd);
        String visibility = ctx.visibility_specification().getText()
                .substring(1)
                + " ";
        ArrayList<String> decs = new ArrayList<String>();
        for (Struct_declarationContext dec : ctx.struct_declaration()) {
            String code = visibility + getCode(dec);
            decs.add(code);
        }
        setList(ctx, decs);
    }

    @Override
    public void exitClass_declaration_list(
            ObjCParser.Class_declaration_listContext ctx) {
        setCode(ctx, "");
    }

    @Override
    public void exitProtocol_declaration(
            ObjCParser.Protocol_declarationContext ctx) {
        String code = ctx.getText();
        String.format("%s", code);
        ArrayList<String> list = new ArrayList<String>();
        list.add(getCode(ctx.protocol_name()));
        if (ctx.interface_declaration_list() != null) {
            ClassDescription.ClassDeclaration cDec = getDeclaration(ctx
                    .interface_declaration_list());
            for (String dec : cDec.getMethod_declarations()) {
                list.add(dec);
            }
        }
        setList(ctx, list);
        setCode(ctx, "");
    }

    @Override
    public void exitProtocol_name(ObjCParser.Protocol_nameContext ctx) {
        String code = ctx.getText();
        String.format("%s", code);
        setCode(ctx, code);
    }

    @Override
    public void exitProtocol_declaration_list(
            ObjCParser.Protocol_declaration_listContext ctx) {
        setCode(ctx, "");
    }

    @Override
    public void exitEncode_expression(ObjCParser.Encode_expressionContext ctx) {
        String message = ctx.getText();
        String.format("%s", message);
        String code = getCode(ctx.type_name());
        code += ".getClass().getName()";
        setCode(ctx, code);
    }

    ParserObjcListener() {
        this.classDescription = new ClassDescription();
        this.classDeclarations = classDescription.getmFiles();
    }

    ParserObjcListener(ClassDescription classDescription,
                       BufferedTokenStream tokens, ParseOptions options) {
        super();
        this.classDescription = classDescription;
        this.options = options;
        this.tokens = tokens;
        this.classDeclarations = classDescription.getmFiles();
    }

    // FIXME do something about define statements

    @Override
    public void exitDefine_statement(ObjCParser.Define_statementContext ctx) {
        @SuppressWarnings("unused")
        String code = codeFormat.convertDefineToAssignment(ctx.identifier()
                .getText(), getCode(ctx.constant_expression()));
    }

    @Override
    public void exitCode_block(ObjCParser.Code_blockContext ctx) {
        String cd = ctx.getText();
        String.format("%s", cd);

        setCode(ctx, "");
    }

    @Override
    public void exitPreprocessor_declaration(
            ObjCParser.Preprocessor_declarationContext ctx) {
        String directive = ctx.getChild(0).getText();
        String expression = null;
        if (ctx.getChild(1) != null) {
            if (ctx.expression() != null) {
                expression = getCode(ctx.expression());
            } else {
                expression = ctx.getChild(1).getText();
            }
        }
        String code = codeFormat
                .preProcessorInstructions(directive, expression);
        setCode(ctx, code);
    }

    private void writeOutput(String fileName, String code) {
        try {
            File file = new File(fileName);
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write(code);
            output.close();
        } catch (IOException e) {
            System.exit(10);
        }
    }

    private void writeProtocols(String mainFileName, ArrayList<String> protocols) {
        String path = new File(mainFileName).getParent();
        File f = new File(path, protocols.get(0) + ".java");
        if (protocols.size() > 1) {
            String code = "public interface " + protocols.get(0) + " {";
            for (int i = 1; i < protocols.size(); i++) {
                code += "\n\t" + protocols.get(i) + ";";
            }
            code += "\n}";
            writeOutput(f.getAbsolutePath(), code);
        }
    }

    private boolean isMaybeDec(String str) {
        str = str.trim();
        if (NoDecs.contains(str)) {
            return false;
        }
        String regex1 = "^[A-Z(_)?]+$"; // 纯大写+下划线
        String regex2 = "^k{1}[A-Z]{1}"; // k打头,下一个字母是大写
        String regex3 = "^_?[A-Z]+$"; // 下划线打头?纯大写
        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher1 = pattern1.matcher(str);
        if (matcher1.find()) {
            decSet.add(str);
            return true;
        }
        Matcher matcher2 = pattern2.matcher(str);
        if (matcher2.find()) {
            decSet.add(str);
            return true;
        }
        Matcher matcher3 = pattern3.matcher(str);
        if (matcher3.find()) {
            decSet.add(str);
            return true;
        }
        return false;
    }

}

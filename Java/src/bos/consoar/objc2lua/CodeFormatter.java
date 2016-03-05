package bos.consoar.objc2lua;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Isaac Clark Reformats code as needed after parsing
 */
public class CodeFormatter {
    /**
     * Marker for identifying method needing reversed pair of arguments.
     */
    public static final String REVERSE_ARGS_MARKER = "ReverseArgs";
    private static final String SETTER = "\n%s %s get%s() {\nreturn this.%s; \n}\n";
    private static final String GETTER = "\n%s void set%s(%s %s) {\nthis.%s = %s;\n}\n";
    private ArrayList<String> constructorSignalsList;

    @SuppressWarnings("serial")
    static final Map<String, String> SIMPLESTRINGS = new HashMap<String, String>() {
        {
            put("NSError", "NSError");
            put("NSInteger", "");
            put("NSUInteger", "");
            put("YES", "true");
            put("TRUE", "true");
            put("NO", "false");
            put("FALSE", "false");
            put("NSObject", "");
            put("self", "self");
            put("nil", "nil");
            put("NULL", "nil");
            put("bool", "");
            put("IBAction", "");
            put("IBOutlet", "");
        }
    };

    @SuppressWarnings("serial")
    static final Map<String, String> SIMPLEFUNCTIONS = new HashMap<String, String>() {
        {
            put(".autorelease()", "");
            put(".retain()", "");
            put("NSNull.null()", "NSNull:null()");

        }
    };

    CodeFormatter() {
        constructorSignalsList = new ArrayList<String>();
        constructorSignalsList.add("init");
    }

    /**
     * @param id
     * @param options
     * @return id after reformatting to Java conventions
     */

    public String identifierFormatter(String id, ParseOptions options) {
        if (options.useExternalTranslations()) {
            id = makeSimpleIDSubtitutions(
                    Translations.getTranslation(Translations.GLOBALMAPKEY,
                            Translations.TranslationType.ID), id);
            id = makeSimpleIDSubtitutions(
                    Translations.getTranslation(options.getInputFileName(),
                            Translations.TranslationType.ID), id);
        } else {
            id = makeSimpleIDSubtitutions(SIMPLESTRINGS, id);
        }
        id = makeSimpleIDSubtitutions(options.getIdentityPairs(), id);
        return id;
    }

    /**
     * @param map mapping of identifier to target
     * @param ID  to be substituted for
     * @return re-mapped identifier
     */

    public static String makeSimpleIDSubtitutions(Map<String, String> map,
                                                  String ID) {
        String match = null;
        if (map != null) {
            match = map.get(ID);
            if (match != null) {
                ID = match;
            }
        }
        return ID;

    }

    /**
     * @param map  keys = signatures; values = replacements
     * @param code function call
     * @return rewritten as needed
     */
    public static String makeSimpleMethodSubtitutions(Map<String, String> map,
                                                      String code) {

        if (map == null) {
            return code;
        }

        for (String signature : map.keySet()) {
            if (code.contains(signature)) {
                String replaceCode = map.get(signature);
                if (replaceCode.startsWith("+")) {
                    replaceCode = replaceCode.substring(1);
                    if (replaceCode.length() == 0) {
                        code = "";
                    } else {
                        int index = code.indexOf(signature)
                                + signature.length();
                        ArrayList<String> args = getFunctionArguments(code
                                .substring(index - 1));
                        String nCode = "";
                        for (int i = 0; i < args.size(); i++) {
                            String arg = args.get(i);
                            if (arg.length() == 0) {
                                continue;
                            }
                            if (nCode.length() == 0) {
                                nCode = replaceCode + arg;
                            } else {
                                nCode += ", " + arg;
                            }
                        }
                        if (nCode.length() == 0) {
                            nCode = replaceCode
                                    + code.substring(0, code.indexOf(signature));
                        } else {
                            nCode += ", "
                                    + code.substring(0, code.indexOf(signature));
                        }
                        code = nCode + ")";
                    }
                } else {
                    code = code.replace(signature, replaceCode);
                }
                break;
            }
        }
        return code;
    }

    /**
     * @param cd        class description holder,
     * @param cDec      class description for getters
     * @param className
     * @return getters and setters for properties
     */
    public ArrayList<String> generateGetters(ClassDescription cd,
                                             ClassDescription.ClassDeclaration cDec, String className) {
        ArrayList<String> code = new ArrayList<String>();

        ArrayList<String> synths = cDec.getSynthesized();
        for (String syn : synths) {
            String type = getPropertyType(syn, className, cd, cDec);
            if (type.length() > 0) {
                String[] parts = type.split(":");
                String getSet = makeSetGet(syn, parts[0], parts[1]);
                code.add(getSet);
            }
            // code.add(fixDeclarations(c));
        }

        return code;
    }

    private String makeSetGet(String vName, String type, String visibility) {
        String code = "";
        if (visibility == null) {
            // this should never happen
            visibility = "";
        }
        String vCap = vName.substring(0, 1).toUpperCase() + vName.substring(1);
        code = String.format(SETTER, visibility, type, vCap, vName);
        code += String.format(GETTER, visibility, vCap, type, vName, vName, vName);
        return code;
    }

    private String getPropertyType(String vName, String className,
                                   ClassDescription cd, ClassDescription.ClassDeclaration cDecl) {
        String type = "";
        ClassDescription.ClassDeclaration cDec = null;
        String prefix = "";
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    cDec = ParserObjcListener.chooseMapAndDeclaration(cd,
                            className, false);
                    prefix = "private";
                    break;
                case 1:
                    cDec = ParserObjcListener.chooseMapAndDeclaration(cd,
                            className, true);
                    prefix = "public";
                    break;
                case 2:
                    cDec = ParserObjcListener
                            .chooseMapAndDeclaration(cd, "", false);
                    prefix = "private";
                    break;
                case 3:
                    cDec = ParserObjcListener.chooseMapAndDeclaration(cd, "", true);
                    prefix = "public";
                    break;
            }
            if (cDec != null) {
                ArrayList<String> properties = cDec.getProperties();
                for (String property : properties) {
                    String[] parts = property.split("[ ]+");
                    if (parts[parts.length - 1].equals(vName)) {
                        type = parts[0];
                        for (int j = 1; j < parts.length - 1; j++) {
                            type += " " + parts[j];
                        }
                        if (type.length() > 0) {
                            // append visibility to prefix
                            type = type + ":" + prefix;
                        }
                        return type;
                    }
                }
            }
        }
        return type;
    }

    /**
     * @param statement
     * @param options
     * @return statements after applying regular expression translations
     */
    public String applyRegexToStatement(String statement, ParseOptions options) {
        String fName = options.getInputFileName();
        statement = applyRegex(Translations.getTranslation(
                        Translations.GLOBALMAPKEY, Translations.TranslationType.REGEX),
                statement);
        statement = applyRegex(Translations.getTranslation(fName,
                Translations.TranslationType.REGEX), statement);
        return statement;
    }

    private String applyRegex(Map<String, String> transMap, String statement) {
        String code = String.format("%s", statement);
        if (transMap != null) {
            for (String regex : transMap.keySet()) {
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(code);
                if (matcher.matches()) {
                    code = replaceCodeWithPattern(matcher, code,
                            transMap.get(regex));
                    break;
                }
            }
        }
        return code;
    }

    private String replaceCodeWithPattern(Matcher matcher, String statement,
                                          String pattern) {
        String code = pattern;
        return code;
    }

    /**
     * Note that for constructor methods starting with init a flag is set to
     * true allowing some additional treatment if smartConstructor is turned on
     *
     * @param code      the construction declaration
     * @param className
     * @param options   parsing options
     * @return converts method definition into a constructor definition FIXME
     * does not use signatures yet
     */
    public String generateConstructor(String code, String className,
                                      ParseOptions options) {
        String proto = String.format("%s", code);
        options.setConstructorMethod(false);
        String[] parts = proto.split(" ");
        for (String signature : options.getConstructorSignatures()) {
            if (parts[1].startsWith(signature)) {
                String cName = parts[0];
                if (cName.equals("Object")) {
                    cName = className;
                }
                if (parts[1].equals("init")) {
                    proto = cName + "()";
                    options.setConstructorMethod(true);
                } else {
                    int index = signature.length();
                    if (signature.startsWith("init")) {
                        options.setConstructorMethod(true);
                    }
                    if (!proto.contains("(")) {
                        proto = cName + "()";
                    } else {
                        while (proto.charAt(index) != '(')
                            index++;
                        proto = cName + proto.substring(index);
                    }
                }
                break;
            }
        }
        return proto;
    }

    private String reformatConstructorCall(String call, ParseOptions options) {
        String proto = String.format("%s", call);
        ArrayList<String> signatures = new ArrayList<String>();
        signatures.addAll(options.getConstructorSignatures());
        if (signatures.contains("init")) {
            signatures.add(0, "alloc().init");
        }
        for (String signature : signatures) {
            if (proto.contains(signature)) {
                // We must be more sophisticated about init
                if (signature.equals("init")) {
                    int indx = proto.indexOf("init") + 4;
                    if (indx < proto.length()) {
                        char c = proto.charAt(indx);
                        if (c != '(' && Character.isLowerCase(c)) {
                            // !!not a constructor
                            continue;
                        }
                    }
                }
                int start = proto.indexOf(signature) - 1;
                int end = start + signature.length() - 1;
                while (proto.charAt(end) != '(')
                    end++;
                if (call.startsWith("super")) {
                    proto = proto.substring(0, start)
                            + proto.substring(end, call.length());
                } else {
                    proto = "new " + proto.substring(0, start)
                            + proto.substring(end, call.length());
                }
                break;
            }
        }
        return proto;
    }

    /**
     * @param call    the method call to convert
     * @param options for converting
     * @return reformatted method call
     */
    public String reformatMethodCall(String call, ParseOptions options) {
        // String proto = String.format("%s", call);
        String proto = reformatConstructorCall(call, options);
        if (!options.useExternalTranslations()) {
            proto = makeSimpleMethodSubtitutions(SIMPLEFUNCTIONS, proto);
        } else {
            proto = makeSimpleMethodSubtitutions(Translations.getTranslation(
                    Translations.GLOBALMAPKEY,
                    Translations.TranslationType.FUNCTION), proto);
            proto = makeSimpleMethodSubtitutions(Translations.getTranslation(
                    options.getInputFileName(),
                    Translations.TranslationType.FUNCTION), proto);
        }
        proto = fixReverseArgs(proto);

        if (proto.contains("isKindOf(")) {
            proto = isKindOf(proto);
        }
        return proto;
    }

    private String isKindOf(String proto) {
        return proto;
    }

    String fixReverseArgs(String fCall) {
        String call = String.format("%s", fCall);
        int start = call.indexOf(REVERSE_ARGS_MARKER);
        if (start != -1) {
            int startArgs = start + REVERSE_ARGS_MARKER.length();
            ArrayList<String> args = getFunctionArguments(fCall
                    .substring(startArgs));
            call = call.substring(0, startArgs + 1) + args.get(1) + ", "
                    + args.get(0) + ")";
            call = call.replace(REVERSE_ARGS_MARKER, "");
        }
        return call;
    }

    String tabsForLevel(int level) {
        String tabs = "";
        for (int i = 0; i < level; i++) {
            tabs += "\t";
        }
        return tabs;
    }

    String codeIndenter(String code) {
        int level = 0;
        boolean insideQuote = false;
        boolean insideSingleQuote = false;
        boolean escape = false;
        boolean addTabs = false;
        StringBuffer rewrite = new StringBuffer("");
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            addTabs = false;

            if (insideQuote || insideSingleQuote) {
                if (!escape && c == '\\') {
                    escape = true;
                } else if (escape) {
                    escape = false;
                }
                if (insideSingleQuote) {
                    if (c == '\'' && !escape) {
                        insideSingleQuote = false;
                    }
                }
                if (insideQuote) {
                    if (c == '\"' && !escape) {
                        insideQuote = false;
                    }
                }
            }
            if (!insideQuote && !insideSingleQuote) {
                if (c == '\n') {
                    addTabs = true;
                } else if (c == '}') {
                    // appendAgain = true;
                    level--;
                } else if (c == '{') {
                    level++;
                }
            }
            if (addTabs) {
                rewrite.append(c + tabsForLevel(level));
                addTabs = false;
            } else if (c == '}') {
                // remove 1 tab
                if (rewrite.charAt(rewrite.length() - 1) == '\t') {
                    rewrite.setCharAt(rewrite.length() - 1, c);
                } else {
                    rewrite.append(c);
                }
            } else {
                rewrite.append(c);
            }
        }
        // try removing some semicolon only lines
        String finalCode = rewrite.toString().replaceAll("\n[\t]+;\n", "\n");
        // replace tab to 4 space
        finalCode = finalCode.replaceAll("\t", "    ");
        return finalCode;
    }

    /**
     * @param call
     * @return array of args from function call
     */
    public static ArrayList<String> getFunctionArguments(String call) {
        return getEnclosedArguments(call, '(');
    }

    private static ArrayList<String> getEnclosedArguments(String call,
                                                          char openBrace) {
        char closeBrace = ')';
        if (openBrace == '{')
            closeBrace = '}';
        ArrayList<String> args = new ArrayList<String>();
        boolean insideQuote = false;
        boolean insideSingleQuote = false;
        int parenCount = 0;
        // move to starting paren
        int start = 0;
        String arg;
        while (call.charAt(start) != openBrace)
            start++;
        int end = start + 1;

        while (true) {
            char cPrior; // the previous character
            char c = call.charAt(end);
            cPrior = (end == 0) ? ' ' : call.charAt(end - 1);
            if (!insideQuote && !insideSingleQuote) {
                if (c == ',') {
                    if (parenCount == 0) {
                        arg = call.substring(start + 1, end);
                        args.add(arg.trim());
                        start = end;
                    }
                } else if (c == openBrace) {
                    parenCount++;
                } else if (c == '\'' && cPrior != '\\') {
                    insideSingleQuote = !insideSingleQuote;
                } else if (c == '\"' && cPrior != '\\') {
                    insideQuote = !insideQuote;
                } else if (c == closeBrace) {
                    parenCount--;
                    if (parenCount < 0) {
                        arg = call.substring(start + 1, end);
                        args.add(arg.trim());
                        break;
                    }
                }
                end++;
            } else if (insideQuote) {
                if (c == '\"' && cPrior != '\\') {
                    insideQuote = !insideQuote;
                }
                end++;
            } else if (insideSingleQuote) {
                if (c == '\'' && cPrior != '\\') {
                    insideSingleQuote = !insideSingleQuote;
                }
                end++;
            } else {
                end++;
            }
        }
        return args;
    }

    /**
     * methDef must be pre-screen to be from an init-based constructor. Removes
     * return values, and if(self) stuff that came from IOS
     *
     * @param methDef code to convert
     * @return code with IOS specific stuff removed
     */
    public String applyConstructorFixes(String methDef) {
        String code = String.format("%s", methDef);
        code = code.replace("this = super(", "super(");
        code = code.replace("return this;", "");
        code = code.replace("this = new this(", "this(");
        if (code.contains("if(this != null){")) {
            String anIf = "if(this != null){";
            int index = code.indexOf(anIf) + anIf.length() - 1;
            ArrayList<String> contents = getEnclosedArguments(
                    code.substring(index), '{');
            if (contents.size() == 1) {
                int start = index + contents.get(0).length();
                while (code.charAt(start) != '}') {
                    start++;
                }
                code = code.substring(0, code.indexOf(anIf))
                        + contents.get(0).trim() + code.substring(start + 1);
                code = code.replaceAll("\n[\n]+", "\n");
            }
        }
        return code;
    }

    /**
     * @param conditional      left side of assignment
     * @param opCode           operation
     * @param assignExpression rightSide of assignment
     * @return assigment statement
     */
    public String assignment_expression(String conditional, String opCode,
                                        String assignExpression) {
        String statement = conditional;
        boolean useEquals = false;
        if (opCode != null) {
            // make sure left side does not contain multiplication
            String[] parts = statement.split("\\*");
            // found multiplication left of equal sign?
            if (parts.length == 2 && opCode.endsWith("=")) {
                // get rid of "*" as it is likely pointer representation
//				statement = parts[0].trim() + " " + parts[1].trim() + " = "
//						+ assignExpression;
                //LUA不需要数据类型
                statement = parts[1].trim() + " = "
                        + assignExpression;
            }
            // check for a getter is present where a setter is required
            else if (opCode.equals("=") && statement.endsWith("()")) {
                useEquals = true;
                // double check for a getter
                String[] dotParts = statement.split("\\.");
                // double check for a getter
                if (dotParts.length > 1
                        && dotParts[dotParts.length - 1].startsWith("get")) {
                    // convert to setter!!
                    useEquals = false;
                    for (int i = 0; i < dotParts.length - 1; i++) {
                        if (i == 0) {
                            statement = dotParts[0].trim();
                        } else {
                            statement += "." + dotParts[i].trim();
                        }
                    }
                    String ending = dotParts[dotParts.length - 1];
                    // change statement to setter
                    statement += ".s"
                            + ending.substring(1, ending.length() - 2) + "("
                            + assignExpression + ")";
                } else { // not a getter use normal code probably wrong!!
                    useEquals = true;
                    statement += " " + opCode + " " + assignExpression;
                }
            } else { // normal assignment
                if (opCode.equals("=")) {
                    useEquals = true;
                }
                statement += " " + opCode + " " + assignExpression;
            }
        }
        if (useEquals) {
            statement = reformatAssignmentStatements(statement);
        }
        return statement;
    }

    /**
     * @param statement an assignment statement
     * @return reformatted assignment statement
     */
    public String reformatAssignmentStatements(String statement) {
        if (statement.contains("SharedPreferences")) {
            String[] parts = statement.split("=", 2);
            String[] sub1 = parts[0].trim().split(" ");
            String var = sub1[sub1.length - 1];
            statement += ";\nEditor edit = " + var + ".edit()";
        }

        // TODO Auto-generated method stub
        return statement;
    }

    @SuppressWarnings("javadoc")
    public String preProcessorInstructions(String directive, String expression) {
        return "";
    }

    /**
     * @param text
     * @param code
     * @return code for define statement
     */
    public String convertDefineToAssignment(String text, String code) {
        String stmt = text + " = " + code + ";";
        if (!code.isEmpty()) {
            if (code.charAt(0) == '\"') {
                stmt = "String " + stmt;
            } else {
                stmt = "Number " + stmt;
            }
        }
        return stmt;
    }
}

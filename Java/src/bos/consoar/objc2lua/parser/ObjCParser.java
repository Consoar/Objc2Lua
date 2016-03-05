package bos.consoar.objc2lua.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ObjCParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, DOTIDENTIFIER = 9,
            AUTORELEASEPOOL = 10, CATCH = 11, CLASS = 12, DYNAMIC = 13, ENCODE = 14, END = 15,
            FINALLY = 16, IMPLEMENTATION = 17, INTERFACE = 18, PACKAGE = 19, PROTOCOL = 20,
            OPTIONAL = 21, PRIVATE = 22, PROPERTY = 23, PROTECTED = 24, PUBLIC = 25, SELECTOR = 26,
            SYNCHRONIZED = 27, SYNTHESIZE = 28, THROW = 29, TRY = 30, SUPER = 31, SELF = 32, ABSTRACT = 33,
            AUTO = 34, BOOLEAN = 35, BREAK = 36, BYCOPY = 37, BYREF = 38, CASE = 39, CHAR = 40,
            CONST = 41, CONTINUE = 42, DEFAULT = 43, DO = 44, DOUBLE = 45, ELSE = 46, ENUM = 47,
            EXTERN = 48, FLOAT = 49, FOR = 50, ID = 51, IF = 52, IN = 53, INOUT = 54, GOTO = 55, INT = 56,
            LONG = 57, ONEWAY = 58, OUT = 59, REGISTER = 60, RETURN = 61, SHORT = 62, SIGNED = 63,
            SIZEOF = 64, STATIC = 65, STRUCT = 66, SWITCH = 67, TYPEDEF = 68, UNION = 69, UNSIGNED = 70,
            VOID = 71, VOLATILE = 72, WHILE = 73, NS_OPTIONS = 74, NS_ENUM = 75, WWEAK = 76, WUNSAFE_UNRETAINED = 77,
            TYPEOF = 78, LPAREN = 79, RPAREN = 80, LBRACE = 81, RBRACE = 82, LBRACK = 83, RBRACK = 84,
            SEMI = 85, COMMA = 86, DOT = 87, STRUCTACCESS = 88, AT = 89, ASSIGN = 90, GT = 91, LT = 92,
            BANG = 93, TILDE = 94, QUESTION = 95, COLON = 96, EQUAL = 97, LE = 98, GE = 99, NOTEQUAL = 100,
            AND = 101, OR = 102, INC = 103, DEC = 104, ADD = 105, SUB = 106, MUL = 107, DIV = 108,
            BITAND = 109, BITOR = 110, CARET = 111, MOD = 112, SHIFT_R = 113, SHIFT_L = 114, ADD_ASSIGN = 115,
            SUB_ASSIGN = 116, MUL_ASSIGN = 117, DIV_ASSIGN = 118, AND_ASSIGN = 119, OR_ASSIGN = 120,
            XOR_ASSIGN = 121, MOD_ASSIGN = 122, LSHIFT_ASSIGN = 123, RSHIFT_ASSIGN = 124,
            ELIPSIS = 125, ASSIGNPA = 126, GETTER = 127, NONATOMIC = 128, SETTER = 129, STRONG = 130,
            RETAIN = 131, READONLY = 132, READWRITE = 133, WEAK = 134, IDENTIFIER = 135, CHARACTER_LITERAL = 136,
            CSTRING_LITERAL = 137, STRING_LITERAL = 138, HEX_LITERAL = 139, DECIMAL_LITERAL = 140,
            OCTAL_LITERAL = 141, FLOATING_POINT_LITERAL = 142, IMPORT = 143, INCLUDE = 144,
            PRAGMA = 145, WS = 146, COMMENT = 147, LINE_COMMENT = 148;
    public static final int
            RULE_translation_unit = 0, RULE_external_declaration = 1, RULE_preprocessor_declaration = 2,
            RULE_define_statement = 3, RULE_macro_specification = 4, RULE_class_interface = 5,
            RULE_category_interface = 6, RULE_class_implementation = 7, RULE_category_implementation = 8,
            RULE_protocol_declaration = 9, RULE_protocol_declaration_list = 10, RULE_protocol_requirement = 11,
            RULE_class_declaration_list = 12, RULE_class_list = 13, RULE_protocol_reference_list = 14,
            RULE_protocol_list = 15, RULE_property_declaration = 16, RULE_property_attributes_declaration = 17,
            RULE_property_attributes_list = 18, RULE_property_attribute = 19, RULE_ib_outlet_specifier = 20,
            RULE_class_name = 21, RULE_superclass_name = 22, RULE_category_name = 23,
            RULE_protocol_name = 24, RULE_instance_variables = 25, RULE_visibility_specification = 26,
            RULE_interface_declaration_list = 27, RULE_class_method_declaration = 28,
            RULE_instance_method_declaration = 29, RULE_method_declaration = 30, RULE_implementation_definition_list = 31,
            RULE_implementation_definition = 32, RULE_class_method_definition = 33,
            RULE_instance_method_definition = 34, RULE_method_definition = 35, RULE_method_selector = 36,
            RULE_keyword_declarator = 37, RULE_selector = 38, RULE_method_type = 39,
            RULE_property_implementation = 40, RULE_property_synthesize_list = 41,
            RULE_property_synthesize_item = 42, RULE_block_type = 43, RULE_type_specifier = 44,
            RULE_other_type_specifier = 45, RULE_unusual_type_specifier = 46, RULE_simple_type_specifier = 47,
            RULE_primitive_type_specifier = 48, RULE_type_qualifier = 49, RULE_protocol_qualifier = 50,
            RULE_primary_expression = 51, RULE_simple_expression = 52, RULE_parenthetical_expression = 53,
            RULE_self_expression = 54, RULE_super_expression = 55, RULE_unsupported_instruction = 56,
            RULE_string_constant = 57, RULE_dictionary_pair = 58, RULE_dictionary_expression = 59,
            RULE_array_expression = 60, RULE_box_expression = 61, RULE_block_parameters = 62,
            RULE_block_expression = 63, RULE_message_expression = 64, RULE_receiver = 65,
            RULE_message_selector = 66, RULE_keyword_argument = 67, RULE_selector_expression = 68,
            RULE_selector_name = 69, RULE_protocol_expression = 70, RULE_encode_expression = 71,
            RULE_exception_declarator = 72, RULE_type_variable_declarator = 73, RULE_try_statement = 74,
            RULE_catch_statement = 75, RULE_finally_statement = 76, RULE_throw_statement = 77,
            RULE_try_block = 78, RULE_synchronized_statement = 79, RULE_autorelease_statement = 80,
            RULE_function_definition = 81, RULE_declaration_minus_semi = 82, RULE_declaration = 83,
            RULE_declaration_specifiers = 84, RULE_declaration_specifier = 85, RULE_arc_behaviour_specifier = 86,
            RULE_storage_class_specifier = 87, RULE_init_declarator_list = 88, RULE_init_declarator = 89,
            RULE_struct_or_union_specifier = 90, RULE_struct_declaration = 91, RULE_specifier_qualifier_list = 92,
            RULE_specifier_qualifier = 93, RULE_struct_declarator_list = 94, RULE_struct_declarator = 95,
            RULE_enum_specifier = 96, RULE_enumerator_list = 97, RULE_enumerator = 98,
            RULE_declarator = 99, RULE_direct_declarator = 100, RULE_declarator_suffix = 101,
            RULE_parameter_list = 102, RULE_parameter_declaration = 103, RULE_initializer = 104,
            RULE_type_name = 105, RULE_abstract_declarator = 106, RULE_abstract_declarator_suffix = 107,
            RULE_parameter_declaration_list = 108, RULE_statement_list = 109, RULE_statement = 110,
            RULE_semi_statement = 111, RULE_labeled_statement = 112, RULE_compound_statement = 113,
            RULE_compound_statement_parts = 114, RULE_selection_statement = 115, RULE_while_statement = 116,
            RULE_for_statement = 117, RULE_do_while_statement = 118, RULE_for_complete = 119,
            RULE_for_declaration_complete = 120, RULE_jump_statement = 121, RULE_setter_call = 122,
            RULE_getter_call = 123, RULE_dotidentifier = 124, RULE_expression = 125,
            RULE_assignment_expression = 126, RULE_assignment_operator = 127, RULE_conditional_expression = 128,
            RULE_constant_expression = 129, RULE_logical_or_expression = 130, RULE_logical_and_expression = 131,
            RULE_inclusive_or_expression = 132, RULE_exclusive_or_expression = 133,
            RULE_and_expression = 134, RULE_equality_expression = 135, RULE_equality_op = 136,
            RULE_relational_expression = 137, RULE_relational_op = 138, RULE_shift_expression = 139,
            RULE_shift_op = 140, RULE_additive_expression = 141, RULE_add_op = 142,
            RULE_multiplicative_expression = 143, RULE_multiply_op = 144, RULE_cast_expression = 145,
            RULE_unary_expression = 146, RULE_unary_operator = 147, RULE_postfix_expression = 148,
            RULE_postfix_expression_complete = 149, RULE_comment = 150, RULE_argument_expression_list = 151,
            RULE_identifier = 152, RULE_code_block = 153, RULE_constant = 154;
    public static final String[] ruleNames = {
            "translation_unit", "external_declaration", "preprocessor_declaration",
            "define_statement", "macro_specification", "class_interface", "category_interface",
            "class_implementation", "category_implementation", "protocol_declaration",
            "protocol_declaration_list", "protocol_requirement", "class_declaration_list",
            "class_list", "protocol_reference_list", "protocol_list", "property_declaration",
            "property_attributes_declaration", "property_attributes_list", "property_attribute",
            "ib_outlet_specifier", "class_name", "superclass_name", "category_name",
            "protocol_name", "instance_variables", "visibility_specification", "interface_declaration_list",
            "class_method_declaration", "instance_method_declaration", "method_declaration",
            "implementation_definition_list", "implementation_definition", "class_method_definition",
            "instance_method_definition", "method_definition", "method_selector",
            "keyword_declarator", "selector", "method_type", "property_implementation",
            "property_synthesize_list", "property_synthesize_item", "block_type",
            "type_specifier", "other_type_specifier", "unusual_type_specifier", "simple_type_specifier",
            "primitive_type_specifier", "type_qualifier", "protocol_qualifier", "primary_expression",
            "simple_expression", "parenthetical_expression", "self_expression", "super_expression",
            "unsupported_instruction", "string_constant", "dictionary_pair", "dictionary_expression",
            "array_expression", "box_expression", "block_parameters", "block_expression",
            "message_expression", "receiver", "message_selector", "keyword_argument",
            "selector_expression", "selector_name", "protocol_expression", "encode_expression",
            "exception_declarator", "type_variable_declarator", "try_statement", "catch_statement",
            "finally_statement", "throw_statement", "try_block", "synchronized_statement",
            "autorelease_statement", "function_definition", "declaration_minus_semi",
            "declaration", "declaration_specifiers", "declaration_specifier", "arc_behaviour_specifier",
            "storage_class_specifier", "init_declarator_list", "init_declarator",
            "struct_or_union_specifier", "struct_declaration", "specifier_qualifier_list",
            "specifier_qualifier", "struct_declarator_list", "struct_declarator",
            "enum_specifier", "enumerator_list", "enumerator", "declarator", "direct_declarator",
            "declarator_suffix", "parameter_list", "parameter_declaration", "initializer",
            "type_name", "abstract_declarator", "abstract_declarator_suffix", "parameter_declaration_list",
            "statement_list", "statement", "semi_statement", "labeled_statement",
            "compound_statement", "compound_statement_parts", "selection_statement",
            "while_statement", "for_statement", "do_while_statement", "for_complete",
            "for_declaration_complete", "jump_statement", "setter_call", "getter_call",
            "dotidentifier", "expression", "assignment_expression", "assignment_operator",
            "conditional_expression", "constant_expression", "logical_or_expression",
            "logical_and_expression", "inclusive_or_expression", "exclusive_or_expression",
            "and_expression", "equality_expression", "equality_op", "relational_expression",
            "relational_op", "shift_expression", "shift_op", "additive_expression",
            "add_op", "multiplicative_expression", "multiply_op", "cast_expression",
            "unary_expression", "unary_operator", "postfix_expression", "postfix_expression_complete",
            "comment", "argument_expression_list", "identifier", "code_block", "constant"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "'#ifdef'", "'#if'", "'#undef'", "'#ifndef'", "'#endif'", "'#define'",
            "'.+'", "'@required'", null, "'@autoreleasepool'", "'@catch'", "'@class'",
            "'@dynamic'", "'@encode'", "'@end'", "'@finally'", "'@implementation'",
            "'@interface'", "'@package'", "'@protocol'", "'@optional'", "'@private'",
            "'@property'", "'@protected'", "'@public'", "'@selector'", "'@synchronized'",
            "'@synthesize'", "'@throw'", "'@try'", "'super'", "'self'", "'abstract'",
            "'auto'", "'boolean'", "'break'", "'bycopy'", "'byref'", "'case'", "'char'",
            "'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'",
            "'extern'", "'float'", "'for'", "'id'", "'if'", "'in'", "'inout'", "'goto'",
            "'int'", "'long'", "'oneway'", "'out'", "'register'", "'return'", "'short'",
            "'signed'", "'sizeof'", "'static'", "'struct'", "'switch'", "'typedef'",
            "'union'", "'unsigned'", "'void'", "'volatile'", "'while'", "'NS_OPTIONS'",
            "'NS_ENUM'", "'__weak'", "'__unsafe_unretained'", "'__typeof'", "'('",
            "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", "'@'",
            "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='",
            "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'",
            "'|'", "'^'", "'%'", "'>>'", "'<<'", "'+='", "'-='", "'*='", "'/='", "'&='",
            "'|='", "'^='", "'%='", "'<<='", "'>>='", "'...'", "'assign'", "'getter'",
            "'nonatomic'", "'setter'", "'strong'", "'retain'", "'readonly'", "'readwrite'",
            "'weak'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, "DOTIDENTIFIER",
            "AUTORELEASEPOOL", "CATCH", "CLASS", "DYNAMIC", "ENCODE", "END", "FINALLY",
            "IMPLEMENTATION", "INTERFACE", "PACKAGE", "PROTOCOL", "OPTIONAL", "PRIVATE",
            "PROPERTY", "PROTECTED", "PUBLIC", "SELECTOR", "SYNCHRONIZED", "SYNTHESIZE",
            "THROW", "TRY", "SUPER", "SELF", "ABSTRACT", "AUTO", "BOOLEAN", "BREAK",
            "BYCOPY", "BYREF", "CASE", "CHAR", "CONST", "CONTINUE", "DEFAULT", "DO",
            "DOUBLE", "ELSE", "ENUM", "EXTERN", "FLOAT", "FOR", "ID", "IF", "IN",
            "INOUT", "GOTO", "INT", "LONG", "ONEWAY", "OUT", "REGISTER", "RETURN",
            "SHORT", "SIGNED", "SIZEOF", "STATIC", "STRUCT", "SWITCH", "TYPEDEF",
            "UNION", "UNSIGNED", "VOID", "VOLATILE", "WHILE", "NS_OPTIONS", "NS_ENUM",
            "WWEAK", "WUNSAFE_UNRETAINED", "TYPEOF", "LPAREN", "RPAREN", "LBRACE",
            "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "STRUCTACCESS",
            "AT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL",
            "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL",
            "DIV", "BITAND", "BITOR", "CARET", "MOD", "SHIFT_R", "SHIFT_L", "ADD_ASSIGN",
            "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN",
            "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "ELIPSIS", "ASSIGNPA",
            "GETTER", "NONATOMIC", "SETTER", "STRONG", "RETAIN", "READONLY", "READWRITE",
            "WEAK", "IDENTIFIER", "CHARACTER_LITERAL", "CSTRING_LITERAL", "STRING_LITERAL",
            "HEX_LITERAL", "DECIMAL_LITERAL", "OCTAL_LITERAL", "FLOATING_POINT_LITERAL",
            "IMPORT", "INCLUDE", "PRAGMA", "WS", "COMMENT", "LINE_COMMENT"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "ObjC.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public ObjCParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class Translation_unitContext extends ParserRuleContext {
        public TerminalNode EOF() {
            return getToken(ObjCParser.EOF, 0);
        }

        public List<External_declarationContext> external_declaration() {
            return getRuleContexts(External_declarationContext.class);
        }

        public External_declarationContext external_declaration(int i) {
            return getRuleContext(External_declarationContext.class, i);
        }

        public Translation_unitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_translation_unit;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterTranslation_unit(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitTranslation_unit(this);
        }
    }

    public final Translation_unitContext translation_unit() throws RecognitionException {
        Translation_unitContext _localctx = new Translation_unitContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_translation_unit);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(311);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(310);
                            external_declaration();
                        }
                    }
                    setState(313);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << CLASS) | (1L << IMPLEMENTATION) | (1L << INTERFACE) | (1L << PROTOCOL) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (STATIC - 65)) | (1L << (STRUCT - 65)) | (1L << (TYPEDEF - 65)) | (1L << (UNION - 65)) | (1L << (UNSIGNED - 65)) | (1L << (VOID - 65)) | (1L << (VOLATILE - 65)) | (1L << (NS_OPTIONS - 65)) | (1L << (NS_ENUM - 65)) | (1L << (WWEAK - 65)) | (1L << (WUNSAFE_UNRETAINED - 65)) | (1L << (LPAREN - 65)) | (1L << (MUL - 65)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (IDENTIFIER - 135)) | (1L << (IMPORT - 135)) | (1L << (INCLUDE - 135)) | (1L << (COMMENT - 135)) | (1L << (LINE_COMMENT - 135)))) != 0));
                setState(315);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class External_declarationContext extends ParserRuleContext {
        public Preprocessor_declarationContext preprocessor_declaration() {
            return getRuleContext(Preprocessor_declarationContext.class, 0);
        }

        public Function_definitionContext function_definition() {
            return getRuleContext(Function_definitionContext.class, 0);
        }

        public DeclarationContext declaration() {
            return getRuleContext(DeclarationContext.class, 0);
        }

        public Class_interfaceContext class_interface() {
            return getRuleContext(Class_interfaceContext.class, 0);
        }

        public Class_implementationContext class_implementation() {
            return getRuleContext(Class_implementationContext.class, 0);
        }

        public Category_interfaceContext category_interface() {
            return getRuleContext(Category_interfaceContext.class, 0);
        }

        public Category_implementationContext category_implementation() {
            return getRuleContext(Category_implementationContext.class, 0);
        }

        public Protocol_declarationContext protocol_declaration() {
            return getRuleContext(Protocol_declarationContext.class, 0);
        }

        public Protocol_declaration_listContext protocol_declaration_list() {
            return getRuleContext(Protocol_declaration_listContext.class, 0);
        }

        public Class_declaration_listContext class_declaration_list() {
            return getRuleContext(Class_declaration_listContext.class, 0);
        }

        public CommentContext comment() {
            return getRuleContext(CommentContext.class, 0);
        }

        public External_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_external_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterExternal_declaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitExternal_declaration(this);
        }
    }

    public final External_declarationContext external_declaration() throws RecognitionException {
        External_declarationContext _localctx = new External_declarationContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_external_declaration);
        try {
            setState(328);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(317);
                    preprocessor_declaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(318);
                    function_definition();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(319);
                    declaration();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(320);
                    class_interface();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(321);
                    class_implementation();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(322);
                    category_interface();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(323);
                    category_implementation();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(324);
                    protocol_declaration();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(325);
                    protocol_declaration_list();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(326);
                    class_declaration_list();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(327);
                    comment();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Preprocessor_declarationContext extends ParserRuleContext {
        public TerminalNode IMPORT() {
            return getToken(ObjCParser.IMPORT, 0);
        }

        public TerminalNode INCLUDE() {
            return getToken(ObjCParser.INCLUDE, 0);
        }

        public Define_statementContext define_statement() {
            return getRuleContext(Define_statementContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Preprocessor_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_preprocessor_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterPreprocessor_declaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitPreprocessor_declaration(this);
        }
    }

    public final Preprocessor_declarationContext preprocessor_declaration() throws RecognitionException {
        Preprocessor_declarationContext _localctx = new Preprocessor_declarationContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_preprocessor_declaration);
        try {
            setState(342);
            switch (_input.LA(1)) {
                case IMPORT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(330);
                    match(IMPORT);
                }
                break;
                case INCLUDE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(331);
                    match(INCLUDE);
                }
                break;
                case T__5:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(332);
                    define_statement();
                }
                break;
                case T__0:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(333);
                    match(T__0);
                    setState(334);
                    expression();
                }
                break;
                case T__1:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(335);
                    match(T__1);
                    setState(336);
                    expression();
                }
                break;
                case T__2:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(337);
                    match(T__2);
                    setState(338);
                    expression();
                }
                break;
                case T__3:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(339);
                    match(T__3);
                    setState(340);
                    expression();
                }
                break;
                case T__4:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(341);
                    match(T__4);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Define_statementContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public Constant_expressionContext constant_expression() {
            return getRuleContext(Constant_expressionContext.class, 0);
        }

        public Define_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_define_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterDefine_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitDefine_statement(this);
        }
    }

    public final Define_statementContext define_statement() throws RecognitionException {
        Define_statementContext _localctx = new Define_statementContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_define_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(344);
                match(T__5);
                setState(345);
                identifier();
                setState(346);
                constant_expression();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Macro_specificationContext extends ParserRuleContext {
        public Macro_specificationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_macro_specification;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterMacro_specification(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitMacro_specification(this);
        }
    }

    public final Macro_specificationContext macro_specification() throws RecognitionException {
        Macro_specificationContext _localctx = new Macro_specificationContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_macro_specification);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(348);
                match(T__6);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Class_interfaceContext extends ParserRuleContext {
        public Class_nameContext class_name() {
            return getRuleContext(Class_nameContext.class, 0);
        }

        public Superclass_nameContext superclass_name() {
            return getRuleContext(Superclass_nameContext.class, 0);
        }

        public Protocol_reference_listContext protocol_reference_list() {
            return getRuleContext(Protocol_reference_listContext.class, 0);
        }

        public Instance_variablesContext instance_variables() {
            return getRuleContext(Instance_variablesContext.class, 0);
        }

        public Interface_declaration_listContext interface_declaration_list() {
            return getRuleContext(Interface_declaration_listContext.class, 0);
        }

        public Class_interfaceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class_interface;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterClass_interface(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitClass_interface(this);
        }
    }

    public final Class_interfaceContext class_interface() throws RecognitionException {
        Class_interfaceContext _localctx = new Class_interfaceContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_class_interface);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(350);
                match(INTERFACE);
                setState(351);
                class_name();
                setState(354);
                _la = _input.LA(1);
                if (_la == COLON) {
                    {
                        setState(352);
                        match(COLON);
                        setState(353);
                        superclass_name();
                    }
                }

                setState(357);
                _la = _input.LA(1);
                if (_la == LT) {
                    {
                        setState(356);
                        protocol_reference_list();
                    }
                }

                setState(360);
                _la = _input.LA(1);
                if (_la == LBRACE) {
                    {
                        setState(359);
                        instance_variables();
                    }
                }

                setState(363);
                _la = _input.LA(1);
                if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (PROPERTY - 23)) | (1L << (AUTO - 23)) | (1L << (BYCOPY - 23)) | (1L << (BYREF - 23)) | (1L << (CHAR - 23)) | (1L << (CONST - 23)) | (1L << (DOUBLE - 23)) | (1L << (ENUM - 23)) | (1L << (EXTERN - 23)) | (1L << (FLOAT - 23)) | (1L << (ID - 23)) | (1L << (IN - 23)) | (1L << (INOUT - 23)) | (1L << (INT - 23)) | (1L << (LONG - 23)) | (1L << (ONEWAY - 23)) | (1L << (OUT - 23)) | (1L << (REGISTER - 23)) | (1L << (SHORT - 23)) | (1L << (SIGNED - 23)) | (1L << (STATIC - 23)) | (1L << (STRUCT - 23)) | (1L << (TYPEDEF - 23)) | (1L << (UNION - 23)) | (1L << (UNSIGNED - 23)) | (1L << (VOID - 23)) | (1L << (VOLATILE - 23)) | (1L << (NS_OPTIONS - 23)) | (1L << (NS_ENUM - 23)) | (1L << (WWEAK - 23)) | (1L << (WUNSAFE_UNRETAINED - 23)))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (ADD - 105)) | (1L << (SUB - 105)) | (1L << (IDENTIFIER - 105)))) != 0)) {
                    {
                        setState(362);
                        interface_declaration_list();
                    }
                }

                setState(365);
                match(END);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Category_interfaceContext extends ParserRuleContext {
        public Class_nameContext class_name() {
            return getRuleContext(Class_nameContext.class, 0);
        }

        public Category_nameContext category_name() {
            return getRuleContext(Category_nameContext.class, 0);
        }

        public Protocol_reference_listContext protocol_reference_list() {
            return getRuleContext(Protocol_reference_listContext.class, 0);
        }

        public Instance_variablesContext instance_variables() {
            return getRuleContext(Instance_variablesContext.class, 0);
        }

        public Interface_declaration_listContext interface_declaration_list() {
            return getRuleContext(Interface_declaration_listContext.class, 0);
        }

        public Category_interfaceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_category_interface;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterCategory_interface(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitCategory_interface(this);
        }
    }

    public final Category_interfaceContext category_interface() throws RecognitionException {
        Category_interfaceContext _localctx = new Category_interfaceContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_category_interface);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(367);
                match(INTERFACE);
                setState(368);
                class_name();
                setState(369);
                match(LPAREN);
                setState(371);
                _la = _input.LA(1);
                if (_la == IDENTIFIER) {
                    {
                        setState(370);
                        category_name();
                    }
                }

                setState(373);
                match(RPAREN);
                setState(375);
                _la = _input.LA(1);
                if (_la == LT) {
                    {
                        setState(374);
                        protocol_reference_list();
                    }
                }

                setState(378);
                _la = _input.LA(1);
                if (_la == LBRACE) {
                    {
                        setState(377);
                        instance_variables();
                    }
                }

                setState(381);
                _la = _input.LA(1);
                if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (PROPERTY - 23)) | (1L << (AUTO - 23)) | (1L << (BYCOPY - 23)) | (1L << (BYREF - 23)) | (1L << (CHAR - 23)) | (1L << (CONST - 23)) | (1L << (DOUBLE - 23)) | (1L << (ENUM - 23)) | (1L << (EXTERN - 23)) | (1L << (FLOAT - 23)) | (1L << (ID - 23)) | (1L << (IN - 23)) | (1L << (INOUT - 23)) | (1L << (INT - 23)) | (1L << (LONG - 23)) | (1L << (ONEWAY - 23)) | (1L << (OUT - 23)) | (1L << (REGISTER - 23)) | (1L << (SHORT - 23)) | (1L << (SIGNED - 23)) | (1L << (STATIC - 23)) | (1L << (STRUCT - 23)) | (1L << (TYPEDEF - 23)) | (1L << (UNION - 23)) | (1L << (UNSIGNED - 23)) | (1L << (VOID - 23)) | (1L << (VOLATILE - 23)) | (1L << (NS_OPTIONS - 23)) | (1L << (NS_ENUM - 23)) | (1L << (WWEAK - 23)) | (1L << (WUNSAFE_UNRETAINED - 23)))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (ADD - 105)) | (1L << (SUB - 105)) | (1L << (IDENTIFIER - 105)))) != 0)) {
                    {
                        setState(380);
                        interface_declaration_list();
                    }
                }

                setState(383);
                match(END);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Class_implementationContext extends ParserRuleContext {
        public Class_nameContext class_name() {
            return getRuleContext(Class_nameContext.class, 0);
        }

        public Superclass_nameContext superclass_name() {
            return getRuleContext(Superclass_nameContext.class, 0);
        }

        public Instance_variablesContext instance_variables() {
            return getRuleContext(Instance_variablesContext.class, 0);
        }

        public Implementation_definition_listContext implementation_definition_list() {
            return getRuleContext(Implementation_definition_listContext.class, 0);
        }

        public Class_implementationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class_implementation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterClass_implementation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitClass_implementation(this);
        }
    }

    public final Class_implementationContext class_implementation() throws RecognitionException {
        Class_implementationContext _localctx = new Class_implementationContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_class_implementation);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(385);
                match(IMPLEMENTATION);
                {
                    setState(386);
                    class_name();
                    setState(389);
                    _la = _input.LA(1);
                    if (_la == COLON) {
                        {
                            setState(387);
                            match(COLON);
                            setState(388);
                            superclass_name();
                        }
                    }

                    setState(392);
                    _la = _input.LA(1);
                    if (_la == LBRACE) {
                        {
                            setState(391);
                            instance_variables();
                        }
                    }

                    setState(395);
                    _la = _input.LA(1);
                    if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (DYNAMIC - 13)) | (1L << (SYNTHESIZE - 13)) | (1L << (AUTO - 13)) | (1L << (BYCOPY - 13)) | (1L << (BYREF - 13)) | (1L << (CHAR - 13)) | (1L << (CONST - 13)) | (1L << (DOUBLE - 13)) | (1L << (ENUM - 13)) | (1L << (EXTERN - 13)) | (1L << (FLOAT - 13)) | (1L << (ID - 13)) | (1L << (IN - 13)) | (1L << (INOUT - 13)) | (1L << (INT - 13)) | (1L << (LONG - 13)) | (1L << (ONEWAY - 13)) | (1L << (OUT - 13)) | (1L << (REGISTER - 13)) | (1L << (SHORT - 13)) | (1L << (SIGNED - 13)) | (1L << (STATIC - 13)) | (1L << (STRUCT - 13)) | (1L << (TYPEDEF - 13)) | (1L << (UNION - 13)) | (1L << (UNSIGNED - 13)) | (1L << (VOID - 13)) | (1L << (VOLATILE - 13)) | (1L << (NS_OPTIONS - 13)) | (1L << (NS_ENUM - 13)) | (1L << (WWEAK - 13)))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (WUNSAFE_UNRETAINED - 77)) | (1L << (LPAREN - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (MUL - 77)) | (1L << (IDENTIFIER - 77)))) != 0)) {
                        {
                            setState(394);
                            implementation_definition_list();
                        }
                    }

                }
                setState(397);
                match(END);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Category_implementationContext extends ParserRuleContext {
        public Class_nameContext class_name() {
            return getRuleContext(Class_nameContext.class, 0);
        }

        public Category_nameContext category_name() {
            return getRuleContext(Category_nameContext.class, 0);
        }

        public Implementation_definition_listContext implementation_definition_list() {
            return getRuleContext(Implementation_definition_listContext.class, 0);
        }

        public Category_implementationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_category_implementation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterCategory_implementation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitCategory_implementation(this);
        }
    }

    public final Category_implementationContext category_implementation() throws RecognitionException {
        Category_implementationContext _localctx = new Category_implementationContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_category_implementation);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(399);
                match(IMPLEMENTATION);
                {
                    setState(400);
                    class_name();
                    setState(401);
                    match(LPAREN);
                    setState(402);
                    category_name();
                    setState(403);
                    match(RPAREN);
                    setState(405);
                    _la = _input.LA(1);
                    if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (DYNAMIC - 13)) | (1L << (SYNTHESIZE - 13)) | (1L << (AUTO - 13)) | (1L << (BYCOPY - 13)) | (1L << (BYREF - 13)) | (1L << (CHAR - 13)) | (1L << (CONST - 13)) | (1L << (DOUBLE - 13)) | (1L << (ENUM - 13)) | (1L << (EXTERN - 13)) | (1L << (FLOAT - 13)) | (1L << (ID - 13)) | (1L << (IN - 13)) | (1L << (INOUT - 13)) | (1L << (INT - 13)) | (1L << (LONG - 13)) | (1L << (ONEWAY - 13)) | (1L << (OUT - 13)) | (1L << (REGISTER - 13)) | (1L << (SHORT - 13)) | (1L << (SIGNED - 13)) | (1L << (STATIC - 13)) | (1L << (STRUCT - 13)) | (1L << (TYPEDEF - 13)) | (1L << (UNION - 13)) | (1L << (UNSIGNED - 13)) | (1L << (VOID - 13)) | (1L << (VOLATILE - 13)) | (1L << (NS_OPTIONS - 13)) | (1L << (NS_ENUM - 13)) | (1L << (WWEAK - 13)))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (WUNSAFE_UNRETAINED - 77)) | (1L << (LPAREN - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (MUL - 77)) | (1L << (IDENTIFIER - 77)))) != 0)) {
                        {
                            setState(404);
                            implementation_definition_list();
                        }
                    }

                }
                setState(407);
                match(END);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Protocol_declarationContext extends ParserRuleContext {
        public Protocol_nameContext protocol_name() {
            return getRuleContext(Protocol_nameContext.class, 0);
        }

        public Protocol_reference_listContext protocol_reference_list() {
            return getRuleContext(Protocol_reference_listContext.class, 0);
        }

        public Protocol_requirementContext protocol_requirement() {
            return getRuleContext(Protocol_requirementContext.class, 0);
        }

        public Interface_declaration_listContext interface_declaration_list() {
            return getRuleContext(Interface_declaration_listContext.class, 0);
        }

        public Protocol_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_protocol_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterProtocol_declaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitProtocol_declaration(this);
        }
    }

    public final Protocol_declarationContext protocol_declaration() throws RecognitionException {
        Protocol_declarationContext _localctx = new Protocol_declarationContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_protocol_declaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(409);
                match(PROTOCOL);
                {
                    setState(410);
                    protocol_name();
                    setState(412);
                    _la = _input.LA(1);
                    if (_la == LT) {
                        {
                            setState(411);
                            protocol_reference_list();
                        }
                    }

                    setState(415);
                    _la = _input.LA(1);
                    if (_la == T__7 || _la == OPTIONAL) {
                        {
                            setState(414);
                            protocol_requirement();
                        }
                    }

                    setState(418);
                    _la = _input.LA(1);
                    if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (PROPERTY - 23)) | (1L << (AUTO - 23)) | (1L << (BYCOPY - 23)) | (1L << (BYREF - 23)) | (1L << (CHAR - 23)) | (1L << (CONST - 23)) | (1L << (DOUBLE - 23)) | (1L << (ENUM - 23)) | (1L << (EXTERN - 23)) | (1L << (FLOAT - 23)) | (1L << (ID - 23)) | (1L << (IN - 23)) | (1L << (INOUT - 23)) | (1L << (INT - 23)) | (1L << (LONG - 23)) | (1L << (ONEWAY - 23)) | (1L << (OUT - 23)) | (1L << (REGISTER - 23)) | (1L << (SHORT - 23)) | (1L << (SIGNED - 23)) | (1L << (STATIC - 23)) | (1L << (STRUCT - 23)) | (1L << (TYPEDEF - 23)) | (1L << (UNION - 23)) | (1L << (UNSIGNED - 23)) | (1L << (VOID - 23)) | (1L << (VOLATILE - 23)) | (1L << (NS_OPTIONS - 23)) | (1L << (NS_ENUM - 23)) | (1L << (WWEAK - 23)) | (1L << (WUNSAFE_UNRETAINED - 23)))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (ADD - 105)) | (1L << (SUB - 105)) | (1L << (IDENTIFIER - 105)))) != 0)) {
                        {
                            setState(417);
                            interface_declaration_list();
                        }
                    }

                }
                setState(420);
                match(END);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Protocol_declaration_listContext extends ParserRuleContext {
        public Protocol_listContext protocol_list() {
            return getRuleContext(Protocol_listContext.class, 0);
        }

        public Protocol_declaration_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_protocol_declaration_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterProtocol_declaration_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitProtocol_declaration_list(this);
        }
    }

    public final Protocol_declaration_listContext protocol_declaration_list() throws RecognitionException {
        Protocol_declaration_listContext _localctx = new Protocol_declaration_listContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_protocol_declaration_list);
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(422);
                    match(PROTOCOL);
                    setState(423);
                    protocol_list();
                    setState(424);
                    match(SEMI);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Protocol_requirementContext extends ParserRuleContext {
        public Protocol_requirementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_protocol_requirement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterProtocol_requirement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitProtocol_requirement(this);
        }
    }

    public final Protocol_requirementContext protocol_requirement() throws RecognitionException {
        Protocol_requirementContext _localctx = new Protocol_requirementContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_protocol_requirement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(426);
                _la = _input.LA(1);
                if (!(_la == T__7 || _la == OPTIONAL)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Class_declaration_listContext extends ParserRuleContext {
        public Class_listContext class_list() {
            return getRuleContext(Class_listContext.class, 0);
        }

        public Class_declaration_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class_declaration_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterClass_declaration_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitClass_declaration_list(this);
        }
    }

    public final Class_declaration_listContext class_declaration_list() throws RecognitionException {
        Class_declaration_listContext _localctx = new Class_declaration_listContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_class_declaration_list);
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(428);
                    match(CLASS);
                    setState(429);
                    class_list();
                    setState(430);
                    match(SEMI);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Class_listContext extends ParserRuleContext {
        public List<Class_nameContext> class_name() {
            return getRuleContexts(Class_nameContext.class);
        }

        public Class_nameContext class_name(int i) {
            return getRuleContext(Class_nameContext.class, i);
        }

        public Class_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterClass_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitClass_list(this);
        }
    }

    public final Class_listContext class_list() throws RecognitionException {
        Class_listContext _localctx = new Class_listContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_class_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(432);
                class_name();
                setState(437);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(433);
                            match(COMMA);
                            setState(434);
                            class_name();
                        }
                    }
                    setState(439);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Protocol_reference_listContext extends ParserRuleContext {
        public Protocol_listContext protocol_list() {
            return getRuleContext(Protocol_listContext.class, 0);
        }

        public Protocol_reference_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_protocol_reference_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterProtocol_reference_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitProtocol_reference_list(this);
        }
    }

    public final Protocol_reference_listContext protocol_reference_list() throws RecognitionException {
        Protocol_reference_listContext _localctx = new Protocol_reference_listContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_protocol_reference_list);
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(440);
                    match(LT);
                    setState(441);
                    protocol_list();
                    setState(442);
                    match(GT);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Protocol_listContext extends ParserRuleContext {
        public List<Protocol_nameContext> protocol_name() {
            return getRuleContexts(Protocol_nameContext.class);
        }

        public Protocol_nameContext protocol_name(int i) {
            return getRuleContext(Protocol_nameContext.class, i);
        }

        public Protocol_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_protocol_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterProtocol_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitProtocol_list(this);
        }
    }

    public final Protocol_listContext protocol_list() throws RecognitionException {
        Protocol_listContext _localctx = new Protocol_listContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_protocol_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(444);
                protocol_name();
                setState(449);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(445);
                            match(COMMA);
                            setState(446);
                            protocol_name();
                        }
                    }
                    setState(451);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Property_declarationContext extends ParserRuleContext {
        public Struct_declarationContext struct_declaration() {
            return getRuleContext(Struct_declarationContext.class, 0);
        }

        public Property_attributes_declarationContext property_attributes_declaration() {
            return getRuleContext(Property_attributes_declarationContext.class, 0);
        }

        public Ib_outlet_specifierContext ib_outlet_specifier() {
            return getRuleContext(Ib_outlet_specifierContext.class, 0);
        }

        public Property_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_property_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterProperty_declaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitProperty_declaration(this);
        }
    }

    public final Property_declarationContext property_declaration() throws RecognitionException {
        Property_declarationContext _localctx = new Property_declarationContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_property_declaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(452);
                match(PROPERTY);
                setState(454);
                _la = _input.LA(1);
                if (_la == LPAREN) {
                    {
                        setState(453);
                        property_attributes_declaration();
                    }
                }

                setState(457);
                switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
                    case 1: {
                        setState(456);
                        ib_outlet_specifier();
                    }
                    break;
                }
                setState(459);
                struct_declaration();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Property_attributes_declarationContext extends ParserRuleContext {
        public Property_attributes_listContext property_attributes_list() {
            return getRuleContext(Property_attributes_listContext.class, 0);
        }

        public Property_attributes_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_property_attributes_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterProperty_attributes_declaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitProperty_attributes_declaration(this);
        }
    }

    public final Property_attributes_declarationContext property_attributes_declaration() throws RecognitionException {
        Property_attributes_declarationContext _localctx = new Property_attributes_declarationContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_property_attributes_declaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(461);
                match(LPAREN);
                setState(462);
                property_attributes_list();
                setState(463);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Property_attributes_listContext extends ParserRuleContext {
        public List<Property_attributeContext> property_attribute() {
            return getRuleContexts(Property_attributeContext.class);
        }

        public Property_attributeContext property_attribute(int i) {
            return getRuleContext(Property_attributeContext.class, i);
        }

        public Property_attributes_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_property_attributes_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterProperty_attributes_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitProperty_attributes_list(this);
        }
    }

    public final Property_attributes_listContext property_attributes_list() throws RecognitionException {
        Property_attributes_listContext _localctx = new Property_attributes_listContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_property_attributes_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(465);
                property_attribute();
                setState(470);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(466);
                            match(COMMA);
                            setState(467);
                            property_attribute();
                        }
                    }
                    setState(472);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Property_attributeContext extends ParserRuleContext {
        public List<TerminalNode> IDENTIFIER() {
            return getTokens(ObjCParser.IDENTIFIER);
        }

        public TerminalNode IDENTIFIER(int i) {
            return getToken(ObjCParser.IDENTIFIER, i);
        }

        public Property_attributeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_property_attribute;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterProperty_attribute(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitProperty_attribute(this);
        }
    }

    public final Property_attributeContext property_attribute() throws RecognitionException {
        Property_attributeContext _localctx = new Property_attributeContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_property_attribute);
        try {
            setState(481);
            switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(473);
                    match(IDENTIFIER);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(474);
                    match(IDENTIFIER);
                    setState(475);
                    match(ASSIGN);
                    setState(476);
                    match(IDENTIFIER);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(477);
                    match(IDENTIFIER);
                    setState(478);
                    match(ASSIGN);
                    setState(479);
                    match(IDENTIFIER);
                    setState(480);
                    match(COLON);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Ib_outlet_specifierContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(ObjCParser.IDENTIFIER, 0);
        }

        public Class_nameContext class_name() {
            return getRuleContext(Class_nameContext.class, 0);
        }

        public Ib_outlet_specifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ib_outlet_specifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterIb_outlet_specifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitIb_outlet_specifier(this);
        }
    }

    public final Ib_outlet_specifierContext ib_outlet_specifier() throws RecognitionException {
        Ib_outlet_specifierContext _localctx = new Ib_outlet_specifierContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_ib_outlet_specifier);
        try {
            setState(489);
            switch (getInterpreter().adaptivePredict(_input, 24, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(483);
                    match(IDENTIFIER);
                    setState(484);
                    match(LPAREN);
                    setState(485);
                    class_name();
                    setState(486);
                    match(RPAREN);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(488);
                    match(IDENTIFIER);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Class_nameContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public Class_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterClass_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitClass_name(this);
        }
    }

    public final Class_nameContext class_name() throws RecognitionException {
        Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_class_name);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(491);
                identifier();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Superclass_nameContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public Superclass_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_superclass_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterSuperclass_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitSuperclass_name(this);
        }
    }

    public final Superclass_nameContext superclass_name() throws RecognitionException {
        Superclass_nameContext _localctx = new Superclass_nameContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_superclass_name);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(493);
                identifier();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Category_nameContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(ObjCParser.IDENTIFIER, 0);
        }

        public Category_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_category_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterCategory_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitCategory_name(this);
        }
    }

    public final Category_nameContext category_name() throws RecognitionException {
        Category_nameContext _localctx = new Category_nameContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_category_name);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(495);
                match(IDENTIFIER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Protocol_nameContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(ObjCParser.IDENTIFIER, 0);
        }

        public Protocol_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_protocol_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterProtocol_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitProtocol_name(this);
        }
    }

    public final Protocol_nameContext protocol_name() throws RecognitionException {
        Protocol_nameContext _localctx = new Protocol_nameContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_protocol_name);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(497);
                match(IDENTIFIER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Instance_variablesContext extends ParserRuleContext {
        public Instance_variablesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_instance_variables;
        }

        public Instance_variablesContext() {
        }

        public void copyFrom(Instance_variablesContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class Instance_ideclContext extends Instance_variablesContext {
        public Instance_variablesContext instance_variables() {
            return getRuleContext(Instance_variablesContext.class, 0);
        }

        public List<Struct_declarationContext> struct_declaration() {
            return getRuleContexts(Struct_declarationContext.class);
        }

        public Struct_declarationContext struct_declaration(int i) {
            return getRuleContext(Struct_declarationContext.class, i);
        }

        public Instance_ideclContext(Instance_variablesContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterInstance_idecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitInstance_idecl(this);
        }
    }

    public static class Instance_sdeclContext extends Instance_variablesContext {
        public Visibility_specificationContext visibility_specification() {
            return getRuleContext(Visibility_specificationContext.class, 0);
        }

        public List<Struct_declarationContext> struct_declaration() {
            return getRuleContexts(Struct_declarationContext.class);
        }

        public Struct_declarationContext struct_declaration(int i) {
            return getRuleContext(Struct_declarationContext.class, i);
        }

        public Instance_sdeclContext(Instance_variablesContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterInstance_sdecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitInstance_sdecl(this);
        }
    }

    public static class Instance_declContext extends Instance_variablesContext {
        public List<Struct_declarationContext> struct_declaration() {
            return getRuleContexts(Struct_declarationContext.class);
        }

        public Struct_declarationContext struct_declaration(int i) {
            return getRuleContext(Struct_declarationContext.class, i);
        }

        public Instance_declContext(Instance_variablesContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterInstance_decl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitInstance_decl(this);
        }
    }

    public static class Instance_sideclContext extends Instance_variablesContext {
        public Visibility_specificationContext visibility_specification() {
            return getRuleContext(Visibility_specificationContext.class, 0);
        }

        public Instance_variablesContext instance_variables() {
            return getRuleContext(Instance_variablesContext.class, 0);
        }

        public List<Struct_declarationContext> struct_declaration() {
            return getRuleContexts(Struct_declarationContext.class);
        }

        public Struct_declarationContext struct_declaration(int i) {
            return getRuleContext(Struct_declarationContext.class, i);
        }

        public Instance_sideclContext(Instance_variablesContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterInstance_sidecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitInstance_sidecl(this);
        }
    }

    public final Instance_variablesContext instance_variables() throws RecognitionException {
        Instance_variablesContext _localctx = new Instance_variablesContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_instance_variables);
        int _la;
        try {
            setState(535);
            switch (getInterpreter().adaptivePredict(_input, 29, _ctx)) {
                case 1:
                    _localctx = new Instance_declContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(499);
                    match(LBRACE);
                    setState(503);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (BYCOPY - 37)) | (1L << (BYREF - 37)) | (1L << (CHAR - 37)) | (1L << (CONST - 37)) | (1L << (DOUBLE - 37)) | (1L << (ENUM - 37)) | (1L << (FLOAT - 37)) | (1L << (ID - 37)) | (1L << (IN - 37)) | (1L << (INOUT - 37)) | (1L << (INT - 37)) | (1L << (LONG - 37)) | (1L << (ONEWAY - 37)) | (1L << (OUT - 37)) | (1L << (SHORT - 37)) | (1L << (SIGNED - 37)) | (1L << (STRUCT - 37)) | (1L << (UNION - 37)) | (1L << (UNSIGNED - 37)) | (1L << (VOID - 37)) | (1L << (VOLATILE - 37)) | (1L << (NS_OPTIONS - 37)) | (1L << (NS_ENUM - 37)) | (1L << (WWEAK - 37)) | (1L << (WUNSAFE_UNRETAINED - 37)))) != 0) || _la == IDENTIFIER) {
                        {
                            {
                                setState(500);
                                struct_declaration();
                            }
                        }
                        setState(505);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(506);
                    match(RBRACE);
                }
                break;
                case 2:
                    _localctx = new Instance_sdeclContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(507);
                    match(LBRACE);
                    setState(508);
                    visibility_specification();
                    setState(510);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(509);
                                struct_declaration();
                            }
                        }
                        setState(512);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (BYCOPY - 37)) | (1L << (BYREF - 37)) | (1L << (CHAR - 37)) | (1L << (CONST - 37)) | (1L << (DOUBLE - 37)) | (1L << (ENUM - 37)) | (1L << (FLOAT - 37)) | (1L << (ID - 37)) | (1L << (IN - 37)) | (1L << (INOUT - 37)) | (1L << (INT - 37)) | (1L << (LONG - 37)) | (1L << (ONEWAY - 37)) | (1L << (OUT - 37)) | (1L << (SHORT - 37)) | (1L << (SIGNED - 37)) | (1L << (STRUCT - 37)) | (1L << (UNION - 37)) | (1L << (UNSIGNED - 37)) | (1L << (VOID - 37)) | (1L << (VOLATILE - 37)) | (1L << (NS_OPTIONS - 37)) | (1L << (NS_ENUM - 37)) | (1L << (WWEAK - 37)) | (1L << (WUNSAFE_UNRETAINED - 37)))) != 0) || _la == IDENTIFIER);
                    setState(514);
                    match(RBRACE);
                }
                break;
                case 3:
                    _localctx = new Instance_ideclContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(516);
                    match(LBRACE);
                    setState(518);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(517);
                                struct_declaration();
                            }
                        }
                        setState(520);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (BYCOPY - 37)) | (1L << (BYREF - 37)) | (1L << (CHAR - 37)) | (1L << (CONST - 37)) | (1L << (DOUBLE - 37)) | (1L << (ENUM - 37)) | (1L << (FLOAT - 37)) | (1L << (ID - 37)) | (1L << (IN - 37)) | (1L << (INOUT - 37)) | (1L << (INT - 37)) | (1L << (LONG - 37)) | (1L << (ONEWAY - 37)) | (1L << (OUT - 37)) | (1L << (SHORT - 37)) | (1L << (SIGNED - 37)) | (1L << (STRUCT - 37)) | (1L << (UNION - 37)) | (1L << (UNSIGNED - 37)) | (1L << (VOID - 37)) | (1L << (VOLATILE - 37)) | (1L << (NS_OPTIONS - 37)) | (1L << (NS_ENUM - 37)) | (1L << (WWEAK - 37)) | (1L << (WUNSAFE_UNRETAINED - 37)))) != 0) || _la == IDENTIFIER);
                    setState(522);
                    instance_variables();
                    setState(523);
                    match(RBRACE);
                }
                break;
                case 4:
                    _localctx = new Instance_sideclContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(525);
                    match(LBRACE);
                    setState(526);
                    visibility_specification();
                    setState(528);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(527);
                                struct_declaration();
                            }
                        }
                        setState(530);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (BYCOPY - 37)) | (1L << (BYREF - 37)) | (1L << (CHAR - 37)) | (1L << (CONST - 37)) | (1L << (DOUBLE - 37)) | (1L << (ENUM - 37)) | (1L << (FLOAT - 37)) | (1L << (ID - 37)) | (1L << (IN - 37)) | (1L << (INOUT - 37)) | (1L << (INT - 37)) | (1L << (LONG - 37)) | (1L << (ONEWAY - 37)) | (1L << (OUT - 37)) | (1L << (SHORT - 37)) | (1L << (SIGNED - 37)) | (1L << (STRUCT - 37)) | (1L << (UNION - 37)) | (1L << (UNSIGNED - 37)) | (1L << (VOID - 37)) | (1L << (VOLATILE - 37)) | (1L << (NS_OPTIONS - 37)) | (1L << (NS_ENUM - 37)) | (1L << (WWEAK - 37)) | (1L << (WUNSAFE_UNRETAINED - 37)))) != 0) || _la == IDENTIFIER);
                    setState(532);
                    instance_variables();
                    setState(533);
                    match(RBRACE);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Visibility_specificationContext extends ParserRuleContext {
        public Visibility_specificationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_visibility_specification;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterVisibility_specification(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitVisibility_specification(this);
        }
    }

    public final Visibility_specificationContext visibility_specification() throws RecognitionException {
        Visibility_specificationContext _localctx = new Visibility_specificationContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_visibility_specification);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(537);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PACKAGE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Interface_declaration_listContext extends ParserRuleContext {
        public List<DeclarationContext> declaration() {
            return getRuleContexts(DeclarationContext.class);
        }

        public DeclarationContext declaration(int i) {
            return getRuleContext(DeclarationContext.class, i);
        }

        public List<Class_method_declarationContext> class_method_declaration() {
            return getRuleContexts(Class_method_declarationContext.class);
        }

        public Class_method_declarationContext class_method_declaration(int i) {
            return getRuleContext(Class_method_declarationContext.class, i);
        }

        public List<Instance_method_declarationContext> instance_method_declaration() {
            return getRuleContexts(Instance_method_declarationContext.class);
        }

        public Instance_method_declarationContext instance_method_declaration(int i) {
            return getRuleContext(Instance_method_declarationContext.class, i);
        }

        public List<Property_declarationContext> property_declaration() {
            return getRuleContexts(Property_declarationContext.class);
        }

        public Property_declarationContext property_declaration(int i) {
            return getRuleContext(Property_declarationContext.class, i);
        }

        public Interface_declaration_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_interface_declaration_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterInterface_declaration_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitInterface_declaration_list(this);
        }
    }

    public final Interface_declaration_listContext interface_declaration_list() throws RecognitionException {
        Interface_declaration_listContext _localctx = new Interface_declaration_listContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_interface_declaration_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(543);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        setState(543);
                        switch (_input.LA(1)) {
                            case AUTO:
                            case BYCOPY:
                            case BYREF:
                            case CHAR:
                            case CONST:
                            case DOUBLE:
                            case ENUM:
                            case EXTERN:
                            case FLOAT:
                            case ID:
                            case IN:
                            case INOUT:
                            case INT:
                            case LONG:
                            case ONEWAY:
                            case OUT:
                            case REGISTER:
                            case SHORT:
                            case SIGNED:
                            case STATIC:
                            case STRUCT:
                            case TYPEDEF:
                            case UNION:
                            case UNSIGNED:
                            case VOID:
                            case VOLATILE:
                            case NS_OPTIONS:
                            case NS_ENUM:
                            case WWEAK:
                            case WUNSAFE_UNRETAINED:
                            case IDENTIFIER: {
                                setState(539);
                                declaration();
                            }
                            break;
                            case ADD: {
                                setState(540);
                                class_method_declaration();
                            }
                            break;
                            case SUB: {
                                setState(541);
                                instance_method_declaration();
                            }
                            break;
                            case PROPERTY: {
                                setState(542);
                                property_declaration();
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(545);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (PROPERTY - 23)) | (1L << (AUTO - 23)) | (1L << (BYCOPY - 23)) | (1L << (BYREF - 23)) | (1L << (CHAR - 23)) | (1L << (CONST - 23)) | (1L << (DOUBLE - 23)) | (1L << (ENUM - 23)) | (1L << (EXTERN - 23)) | (1L << (FLOAT - 23)) | (1L << (ID - 23)) | (1L << (IN - 23)) | (1L << (INOUT - 23)) | (1L << (INT - 23)) | (1L << (LONG - 23)) | (1L << (ONEWAY - 23)) | (1L << (OUT - 23)) | (1L << (REGISTER - 23)) | (1L << (SHORT - 23)) | (1L << (SIGNED - 23)) | (1L << (STATIC - 23)) | (1L << (STRUCT - 23)) | (1L << (TYPEDEF - 23)) | (1L << (UNION - 23)) | (1L << (UNSIGNED - 23)) | (1L << (VOID - 23)) | (1L << (VOLATILE - 23)) | (1L << (NS_OPTIONS - 23)) | (1L << (NS_ENUM - 23)) | (1L << (WWEAK - 23)) | (1L << (WUNSAFE_UNRETAINED - 23)))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (ADD - 105)) | (1L << (SUB - 105)) | (1L << (IDENTIFIER - 105)))) != 0));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Class_method_declarationContext extends ParserRuleContext {
        public Method_declarationContext method_declaration() {
            return getRuleContext(Method_declarationContext.class, 0);
        }

        public Class_method_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class_method_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterClass_method_declaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitClass_method_declaration(this);
        }
    }

    public final Class_method_declarationContext class_method_declaration() throws RecognitionException {
        Class_method_declarationContext _localctx = new Class_method_declarationContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_class_method_declaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(547);
                    match(ADD);
                    setState(548);
                    method_declaration();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Instance_method_declarationContext extends ParserRuleContext {
        public Method_declarationContext method_declaration() {
            return getRuleContext(Method_declarationContext.class, 0);
        }

        public Instance_method_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_instance_method_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterInstance_method_declaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitInstance_method_declaration(this);
        }
    }

    public final Instance_method_declarationContext instance_method_declaration() throws RecognitionException {
        Instance_method_declarationContext _localctx = new Instance_method_declarationContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_instance_method_declaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(550);
                    match(SUB);
                    setState(551);
                    method_declaration();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Method_declarationContext extends ParserRuleContext {
        public Method_selectorContext method_selector() {
            return getRuleContext(Method_selectorContext.class, 0);
        }

        public Method_typeContext method_type() {
            return getRuleContext(Method_typeContext.class, 0);
        }

        public Method_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_method_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterMethod_declaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitMethod_declaration(this);
        }
    }

    public final Method_declarationContext method_declaration() throws RecognitionException {
        Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_method_declaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(554);
                _la = _input.LA(1);
                if (_la == LPAREN) {
                    {
                        setState(553);
                        method_type();
                    }
                }

                setState(556);
                method_selector();
                setState(557);
                match(SEMI);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Implementation_definition_listContext extends ParserRuleContext {
        public List<Implementation_definitionContext> implementation_definition() {
            return getRuleContexts(Implementation_definitionContext.class);
        }

        public Implementation_definitionContext implementation_definition(int i) {
            return getRuleContext(Implementation_definitionContext.class, i);
        }

        public Implementation_definition_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_implementation_definition_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterImplementation_definition_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitImplementation_definition_list(this);
        }
    }

    public final Implementation_definition_listContext implementation_definition_list() throws RecognitionException {
        Implementation_definition_listContext _localctx = new Implementation_definition_listContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_implementation_definition_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(560);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(559);
                            implementation_definition();
                        }
                    }
                    setState(562);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (DYNAMIC - 13)) | (1L << (SYNTHESIZE - 13)) | (1L << (AUTO - 13)) | (1L << (BYCOPY - 13)) | (1L << (BYREF - 13)) | (1L << (CHAR - 13)) | (1L << (CONST - 13)) | (1L << (DOUBLE - 13)) | (1L << (ENUM - 13)) | (1L << (EXTERN - 13)) | (1L << (FLOAT - 13)) | (1L << (ID - 13)) | (1L << (IN - 13)) | (1L << (INOUT - 13)) | (1L << (INT - 13)) | (1L << (LONG - 13)) | (1L << (ONEWAY - 13)) | (1L << (OUT - 13)) | (1L << (REGISTER - 13)) | (1L << (SHORT - 13)) | (1L << (SIGNED - 13)) | (1L << (STATIC - 13)) | (1L << (STRUCT - 13)) | (1L << (TYPEDEF - 13)) | (1L << (UNION - 13)) | (1L << (UNSIGNED - 13)) | (1L << (VOID - 13)) | (1L << (VOLATILE - 13)) | (1L << (NS_OPTIONS - 13)) | (1L << (NS_ENUM - 13)) | (1L << (WWEAK - 13)))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (WUNSAFE_UNRETAINED - 77)) | (1L << (LPAREN - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (MUL - 77)) | (1L << (IDENTIFIER - 77)))) != 0));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Implementation_definitionContext extends ParserRuleContext {
        public Function_definitionContext function_definition() {
            return getRuleContext(Function_definitionContext.class, 0);
        }

        public DeclarationContext declaration() {
            return getRuleContext(DeclarationContext.class, 0);
        }

        public Class_method_definitionContext class_method_definition() {
            return getRuleContext(Class_method_definitionContext.class, 0);
        }

        public Instance_method_definitionContext instance_method_definition() {
            return getRuleContext(Instance_method_definitionContext.class, 0);
        }

        public Property_implementationContext property_implementation() {
            return getRuleContext(Property_implementationContext.class, 0);
        }

        public Implementation_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_implementation_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterImplementation_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitImplementation_definition(this);
        }
    }

    public final Implementation_definitionContext implementation_definition() throws RecognitionException {
        Implementation_definitionContext _localctx = new Implementation_definitionContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_implementation_definition);
        try {
            setState(569);
            switch (getInterpreter().adaptivePredict(_input, 34, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(564);
                    function_definition();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(565);
                    declaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(566);
                    class_method_definition();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(567);
                    instance_method_definition();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(568);
                    property_implementation();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Class_method_definitionContext extends ParserRuleContext {
        public Method_definitionContext method_definition() {
            return getRuleContext(Method_definitionContext.class, 0);
        }

        public Class_method_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class_method_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterClass_method_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitClass_method_definition(this);
        }
    }

    public final Class_method_definitionContext class_method_definition() throws RecognitionException {
        Class_method_definitionContext _localctx = new Class_method_definitionContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_class_method_definition);
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(571);
                    match(ADD);
                    setState(572);
                    method_definition();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Instance_method_definitionContext extends ParserRuleContext {
        public Method_definitionContext method_definition() {
            return getRuleContext(Method_definitionContext.class, 0);
        }

        public Instance_method_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_instance_method_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterInstance_method_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitInstance_method_definition(this);
        }
    }

    public final Instance_method_definitionContext instance_method_definition() throws RecognitionException {
        Instance_method_definitionContext _localctx = new Instance_method_definitionContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_instance_method_definition);
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(574);
                    match(SUB);
                    setState(575);
                    method_definition();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Method_definitionContext extends ParserRuleContext {
        public Method_selectorContext method_selector() {
            return getRuleContext(Method_selectorContext.class, 0);
        }

        public Compound_statementContext compound_statement() {
            return getRuleContext(Compound_statementContext.class, 0);
        }

        public Method_typeContext method_type() {
            return getRuleContext(Method_typeContext.class, 0);
        }

        public Init_declarator_listContext init_declarator_list() {
            return getRuleContext(Init_declarator_listContext.class, 0);
        }

        public Method_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_method_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterMethod_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitMethod_definition(this);
        }
    }

    public final Method_definitionContext method_definition() throws RecognitionException {
        Method_definitionContext _localctx = new Method_definitionContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_method_definition);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(578);
                _la = _input.LA(1);
                if (_la == LPAREN) {
                    {
                        setState(577);
                        method_type();
                    }
                }

                setState(580);
                method_selector();
                setState(582);
                _la = _input.LA(1);
                if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LPAREN - 79)) | (1L << (MUL - 79)) | (1L << (IDENTIFIER - 79)))) != 0)) {
                    {
                        setState(581);
                        init_declarator_list();
                    }
                }

                setState(585);
                _la = _input.LA(1);
                if (_la == SEMI) {
                    {
                        setState(584);
                        match(SEMI);
                    }
                }

                setState(587);
                compound_statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Method_selectorContext extends ParserRuleContext {
        public SelectorContext selector() {
            return getRuleContext(SelectorContext.class, 0);
        }

        public List<Keyword_declaratorContext> keyword_declarator() {
            return getRuleContexts(Keyword_declaratorContext.class);
        }

        public Keyword_declaratorContext keyword_declarator(int i) {
            return getRuleContext(Keyword_declaratorContext.class, i);
        }

        public Parameter_listContext parameter_list() {
            return getRuleContext(Parameter_listContext.class, 0);
        }

        public Method_selectorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_method_selector;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterMethod_selector(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitMethod_selector(this);
        }
    }

    public final Method_selectorContext method_selector() throws RecognitionException {
        Method_selectorContext _localctx = new Method_selectorContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_method_selector);
        try {
            int _alt;
            setState(598);
            switch (getInterpreter().adaptivePredict(_input, 40, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(589);
                    selector();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    {
                        setState(591);
                        _errHandler.sync(this);
                        _alt = 1;
                        do {
                            switch (_alt) {
                                case 1: {
                                    {
                                        setState(590);
                                        keyword_declarator();
                                    }
                                }
                                break;
                                default:
                                    throw new NoViableAltException(this);
                            }
                            setState(593);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 38, _ctx);
                        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                        setState(596);
                        switch (getInterpreter().adaptivePredict(_input, 39, _ctx)) {
                            case 1: {
                                setState(595);
                                parameter_list();
                            }
                            break;
                        }
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Keyword_declaratorContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public SelectorContext selector() {
            return getRuleContext(SelectorContext.class, 0);
        }

        public List<Method_typeContext> method_type() {
            return getRuleContexts(Method_typeContext.class);
        }

        public Method_typeContext method_type(int i) {
            return getRuleContext(Method_typeContext.class, i);
        }

        public Keyword_declaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_keyword_declarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterKeyword_declarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitKeyword_declarator(this);
        }
    }

    public final Keyword_declaratorContext keyword_declarator() throws RecognitionException {
        Keyword_declaratorContext _localctx = new Keyword_declaratorContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_keyword_declarator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(601);
                _la = _input.LA(1);
                if (_la == DOTIDENTIFIER || _la == RETAIN || _la == IDENTIFIER) {
                    {
                        setState(600);
                        selector();
                    }
                }

                setState(603);
                match(COLON);
                setState(607);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LPAREN) {
                    {
                        {
                            setState(604);
                            method_type();
                        }
                    }
                    setState(609);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(610);
                identifier();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SelectorContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public DotidentifierContext dotidentifier() {
            return getRuleContext(DotidentifierContext.class, 0);
        }

        public SelectorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selector;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterSelector(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitSelector(this);
        }
    }

    public final SelectorContext selector() throws RecognitionException {
        SelectorContext _localctx = new SelectorContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_selector);
        try {
            setState(615);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(612);
                    identifier();
                }
                break;
                case DOTIDENTIFIER:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(613);
                    dotidentifier();
                }
                break;
                case RETAIN:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(614);
                    match(RETAIN);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Method_typeContext extends ParserRuleContext {
        public Type_nameContext type_name() {
            return getRuleContext(Type_nameContext.class, 0);
        }

        public Method_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_method_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterMethod_type(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitMethod_type(this);
        }
    }

    public final Method_typeContext method_type() throws RecognitionException {
        Method_typeContext _localctx = new Method_typeContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_method_type);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(617);
                match(LPAREN);
                setState(618);
                type_name();
                setState(619);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Property_implementationContext extends ParserRuleContext {
        public Property_synthesize_listContext property_synthesize_list() {
            return getRuleContext(Property_synthesize_listContext.class, 0);
        }

        public Property_implementationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_property_implementation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterProperty_implementation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitProperty_implementation(this);
        }
    }

    public final Property_implementationContext property_implementation() throws RecognitionException {
        Property_implementationContext _localctx = new Property_implementationContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_property_implementation);
        try {
            setState(629);
            switch (_input.LA(1)) {
                case SYNTHESIZE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(621);
                    match(SYNTHESIZE);
                    setState(622);
                    property_synthesize_list();
                    setState(623);
                    match(SEMI);
                }
                break;
                case DYNAMIC:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(625);
                    match(DYNAMIC);
                    setState(626);
                    property_synthesize_list();
                    setState(627);
                    match(SEMI);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Property_synthesize_listContext extends ParserRuleContext {
        public List<Property_synthesize_itemContext> property_synthesize_item() {
            return getRuleContexts(Property_synthesize_itemContext.class);
        }

        public Property_synthesize_itemContext property_synthesize_item(int i) {
            return getRuleContext(Property_synthesize_itemContext.class, i);
        }

        public Property_synthesize_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_property_synthesize_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterProperty_synthesize_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitProperty_synthesize_list(this);
        }
    }

    public final Property_synthesize_listContext property_synthesize_list() throws RecognitionException {
        Property_synthesize_listContext _localctx = new Property_synthesize_listContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_property_synthesize_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(631);
                property_synthesize_item();
                setState(636);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(632);
                            match(COMMA);
                            setState(633);
                            property_synthesize_item();
                        }
                    }
                    setState(638);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Property_synthesize_itemContext extends ParserRuleContext {
        public List<TerminalNode> IDENTIFIER() {
            return getTokens(ObjCParser.IDENTIFIER);
        }

        public TerminalNode IDENTIFIER(int i) {
            return getToken(ObjCParser.IDENTIFIER, i);
        }

        public Property_synthesize_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_property_synthesize_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterProperty_synthesize_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitProperty_synthesize_item(this);
        }
    }

    public final Property_synthesize_itemContext property_synthesize_item() throws RecognitionException {
        Property_synthesize_itemContext _localctx = new Property_synthesize_itemContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_property_synthesize_item);
        try {
            setState(643);
            switch (getInterpreter().adaptivePredict(_input, 46, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(639);
                    match(IDENTIFIER);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(640);
                    match(IDENTIFIER);
                    setState(641);
                    match(ASSIGN);
                    setState(642);
                    match(IDENTIFIER);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Block_typeContext extends ParserRuleContext {
        public List<Type_specifierContext> type_specifier() {
            return getRuleContexts(Type_specifierContext.class);
        }

        public Type_specifierContext type_specifier(int i) {
            return getRuleContext(Type_specifierContext.class, i);
        }

        public Block_parametersContext block_parameters() {
            return getRuleContext(Block_parametersContext.class, 0);
        }

        public Block_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterBlock_type(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitBlock_type(this);
        }
    }

    public final Block_typeContext block_type() throws RecognitionException {
        Block_typeContext _localctx = new Block_typeContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_block_type);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(645);
                type_specifier();
                setState(646);
                match(LPAREN);
                setState(647);
                match(CARET);
                setState(649);
                _la = _input.LA(1);
                if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (CHAR - 40)) | (1L << (DOUBLE - 40)) | (1L << (ENUM - 40)) | (1L << (FLOAT - 40)) | (1L << (ID - 40)) | (1L << (INT - 40)) | (1L << (LONG - 40)) | (1L << (SHORT - 40)) | (1L << (SIGNED - 40)) | (1L << (STRUCT - 40)) | (1L << (UNION - 40)) | (1L << (UNSIGNED - 40)) | (1L << (VOID - 40)) | (1L << (NS_OPTIONS - 40)) | (1L << (NS_ENUM - 40)))) != 0) || _la == IDENTIFIER) {
                    {
                        setState(648);
                        type_specifier();
                    }
                }

                setState(651);
                match(RPAREN);
                setState(653);
                _la = _input.LA(1);
                if (_la == LPAREN) {
                    {
                        setState(652);
                        block_parameters();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Type_specifierContext extends ParserRuleContext {
        public Simple_type_specifierContext simple_type_specifier() {
            return getRuleContext(Simple_type_specifierContext.class, 0);
        }

        public Other_type_specifierContext other_type_specifier() {
            return getRuleContext(Other_type_specifierContext.class, 0);
        }

        public Type_specifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type_specifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterType_specifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitType_specifier(this);
        }
    }

    public final Type_specifierContext type_specifier() throws RecognitionException {
        Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_type_specifier);
        try {
            setState(657);
            switch (getInterpreter().adaptivePredict(_input, 49, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(655);
                    simple_type_specifier();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(656);
                    other_type_specifier();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Other_type_specifierContext extends ParserRuleContext {
        public Other_type_specifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_other_type_specifier;
        }

        public Other_type_specifierContext() {
        }

        public void copyFrom(Other_type_specifierContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class IdTypeSpecContext extends Other_type_specifierContext {
        public Protocol_reference_listContext protocol_reference_list() {
            return getRuleContext(Protocol_reference_listContext.class, 0);
        }

        public IdTypeSpecContext(Other_type_specifierContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterIdTypeSpec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitIdTypeSpec(this);
        }
    }

    public static class ClassTypeSpecContext extends Other_type_specifierContext {
        public Class_nameContext class_name() {
            return getRuleContext(Class_nameContext.class, 0);
        }

        public Protocol_reference_listContext protocol_reference_list() {
            return getRuleContext(Protocol_reference_listContext.class, 0);
        }

        public ClassTypeSpecContext(Other_type_specifierContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterClassTypeSpec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitClassTypeSpec(this);
        }
    }

    public static class StructTypeSpecContext extends Other_type_specifierContext {
        public Unusual_type_specifierContext unusual_type_specifier() {
            return getRuleContext(Unusual_type_specifierContext.class, 0);
        }

        public StructTypeSpecContext(Other_type_specifierContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterStructTypeSpec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitStructTypeSpec(this);
        }
    }

    public final Other_type_specifierContext other_type_specifier() throws RecognitionException {
        Other_type_specifierContext _localctx = new Other_type_specifierContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_other_type_specifier);
        int _la;
        try {
            setState(668);
            switch (_input.LA(1)) {
                case ID:
                    _localctx = new IdTypeSpecContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    {
                        setState(659);
                        match(ID);
                        setState(661);
                        _la = _input.LA(1);
                        if (_la == LT) {
                            {
                                setState(660);
                                protocol_reference_list();
                            }
                        }

                    }
                }
                break;
                case IDENTIFIER:
                    _localctx = new ClassTypeSpecContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    {
                        setState(663);
                        class_name();
                        setState(665);
                        _la = _input.LA(1);
                        if (_la == LT) {
                            {
                                setState(664);
                                protocol_reference_list();
                            }
                        }

                    }
                }
                break;
                case STRUCT:
                case UNION:
                    _localctx = new StructTypeSpecContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(667);
                    unusual_type_specifier();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Unusual_type_specifierContext extends ParserRuleContext {
        public Struct_or_union_specifierContext struct_or_union_specifier() {
            return getRuleContext(Struct_or_union_specifierContext.class, 0);
        }

        public Unusual_type_specifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_unusual_type_specifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterUnusual_type_specifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitUnusual_type_specifier(this);
        }
    }

    public final Unusual_type_specifierContext unusual_type_specifier() throws RecognitionException {
        Unusual_type_specifierContext _localctx = new Unusual_type_specifierContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_unusual_type_specifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(670);
                struct_or_union_specifier();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Simple_type_specifierContext extends ParserRuleContext {
        public Primitive_type_specifierContext primitive_type_specifier() {
            return getRuleContext(Primitive_type_specifierContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public Enum_specifierContext enum_specifier() {
            return getRuleContext(Enum_specifierContext.class, 0);
        }

        public Simple_type_specifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_simple_type_specifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterSimple_type_specifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitSimple_type_specifier(this);
        }
    }

    public final Simple_type_specifierContext simple_type_specifier() throws RecognitionException {
        Simple_type_specifierContext _localctx = new Simple_type_specifierContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_simple_type_specifier);
        try {
            setState(675);
            switch (_input.LA(1)) {
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case SHORT:
                case SIGNED:
                case UNSIGNED:
                case VOID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(672);
                    primitive_type_specifier();
                }
                break;
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(673);
                    identifier();
                }
                break;
                case ENUM:
                case NS_OPTIONS:
                case NS_ENUM:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(674);
                    enum_specifier();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Primitive_type_specifierContext extends ParserRuleContext {
        public Primitive_type_specifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_primitive_type_specifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterPrimitive_type_specifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitPrimitive_type_specifier(this);
        }
    }

    public final Primitive_type_specifierContext primitive_type_specifier() throws RecognitionException {
        Primitive_type_specifierContext _localctx = new Primitive_type_specifierContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_primitive_type_specifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(677);
                _la = _input.LA(1);
                if (!(((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (CHAR - 40)) | (1L << (DOUBLE - 40)) | (1L << (FLOAT - 40)) | (1L << (INT - 40)) | (1L << (LONG - 40)) | (1L << (SHORT - 40)) | (1L << (SIGNED - 40)) | (1L << (UNSIGNED - 40)) | (1L << (VOID - 40)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Type_qualifierContext extends ParserRuleContext {
        public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type_qualifier;
        }

        public Type_qualifierContext() {
        }

        public void copyFrom(Type_qualifierContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ConstTypeQualifierContext extends Type_qualifierContext {
        public ConstTypeQualifierContext(Type_qualifierContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterConstTypeQualifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitConstTypeQualifier(this);
        }
    }

    public static class IgnoreTypeQualifierContext extends Type_qualifierContext {
        public Protocol_qualifierContext protocol_qualifier() {
            return getRuleContext(Protocol_qualifierContext.class, 0);
        }

        public IgnoreTypeQualifierContext(Type_qualifierContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterIgnoreTypeQualifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitIgnoreTypeQualifier(this);
        }
    }

    public final Type_qualifierContext type_qualifier() throws RecognitionException {
        Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
        enterRule(_localctx, 98, RULE_type_qualifier);
        try {
            setState(682);
            switch (_input.LA(1)) {
                case CONST:
                    _localctx = new ConstTypeQualifierContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(679);
                    match(CONST);
                }
                break;
                case VOLATILE:
                    _localctx = new IgnoreTypeQualifierContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(680);
                    match(VOLATILE);
                }
                break;
                case BYCOPY:
                case BYREF:
                case IN:
                case INOUT:
                case ONEWAY:
                case OUT:
                    _localctx = new IgnoreTypeQualifierContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(681);
                    protocol_qualifier();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Protocol_qualifierContext extends ParserRuleContext {
        public Protocol_qualifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_protocol_qualifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterProtocol_qualifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitProtocol_qualifier(this);
        }
    }

    public final Protocol_qualifierContext protocol_qualifier() throws RecognitionException {
        Protocol_qualifierContext _localctx = new Protocol_qualifierContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_protocol_qualifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(684);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << IN) | (1L << INOUT) | (1L << ONEWAY) | (1L << OUT))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Primary_expressionContext extends ParserRuleContext {
        public Simple_expressionContext simple_expression() {
            return getRuleContext(Simple_expressionContext.class, 0);
        }

        public Parenthetical_expressionContext parenthetical_expression() {
            return getRuleContext(Parenthetical_expressionContext.class, 0);
        }

        public Selector_expressionContext selector_expression() {
            return getRuleContext(Selector_expressionContext.class, 0);
        }

        public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_primary_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterPrimary_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitPrimary_expression(this);
        }
    }

    public final Primary_expressionContext primary_expression() throws RecognitionException {
        Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
        enterRule(_localctx, 102, RULE_primary_expression);
        try {
            setState(689);
            switch (getInterpreter().adaptivePredict(_input, 55, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(686);
                    simple_expression();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(687);
                    parenthetical_expression();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(688);
                    selector_expression();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Simple_expressionContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public ConstantContext constant() {
            return getRuleContext(ConstantContext.class, 0);
        }

        public String_constantContext string_constant() {
            return getRuleContext(String_constantContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Self_expressionContext self_expression() {
            return getRuleContext(Self_expressionContext.class, 0);
        }

        public Super_expressionContext super_expression() {
            return getRuleContext(Super_expressionContext.class, 0);
        }

        public Message_expressionContext message_expression() {
            return getRuleContext(Message_expressionContext.class, 0);
        }

        public Setter_callContext setter_call() {
            return getRuleContext(Setter_callContext.class, 0);
        }

        public Getter_callContext getter_call() {
            return getRuleContext(Getter_callContext.class, 0);
        }

        public Code_blockContext code_block() {
            return getRuleContext(Code_blockContext.class, 0);
        }

        public Selector_expressionContext selector_expression() {
            return getRuleContext(Selector_expressionContext.class, 0);
        }

        public Protocol_expressionContext protocol_expression() {
            return getRuleContext(Protocol_expressionContext.class, 0);
        }

        public Encode_expressionContext encode_expression() {
            return getRuleContext(Encode_expressionContext.class, 0);
        }

        public Dictionary_expressionContext dictionary_expression() {
            return getRuleContext(Dictionary_expressionContext.class, 0);
        }

        public Array_expressionContext array_expression() {
            return getRuleContext(Array_expressionContext.class, 0);
        }

        public Box_expressionContext box_expression() {
            return getRuleContext(Box_expressionContext.class, 0);
        }

        public Block_expressionContext block_expression() {
            return getRuleContext(Block_expressionContext.class, 0);
        }

        public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_simple_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterSimple_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitSimple_expression(this);
        }
    }

    public final Simple_expressionContext simple_expression() throws RecognitionException {
        Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
        enterRule(_localctx, 104, RULE_simple_expression);
        try {
            setState(711);
            switch (getInterpreter().adaptivePredict(_input, 56, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(691);
                    identifier();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(692);
                    constant();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(693);
                    string_constant();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    {
                        setState(694);
                        match(LPAREN);
                        setState(695);
                        expression();
                        setState(696);
                        match(RPAREN);
                    }
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(698);
                    self_expression();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(699);
                    super_expression();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(700);
                    message_expression();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(701);
                    setter_call();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(702);
                    getter_call();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(703);
                    code_block();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(704);
                    selector_expression();
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(705);
                    protocol_expression();
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(706);
                    encode_expression();
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(707);
                    dictionary_expression();
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(708);
                    array_expression();
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(709);
                    box_expression();
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(710);
                    block_expression();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Parenthetical_expressionContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Parenthetical_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parenthetical_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterParenthetical_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitParenthetical_expression(this);
        }
    }

    public final Parenthetical_expressionContext parenthetical_expression() throws RecognitionException {
        Parenthetical_expressionContext _localctx = new Parenthetical_expressionContext(_ctx, getState());
        enterRule(_localctx, 106, RULE_parenthetical_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(713);
                    match(LPAREN);
                    setState(714);
                    expression();
                    setState(715);
                    match(RPAREN);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Self_expressionContext extends ParserRuleContext {
        public Self_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_self_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterSelf_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitSelf_expression(this);
        }
    }

    public final Self_expressionContext self_expression() throws RecognitionException {
        Self_expressionContext _localctx = new Self_expressionContext(_ctx, getState());
        enterRule(_localctx, 108, RULE_self_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(717);
                match(SELF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Super_expressionContext extends ParserRuleContext {
        public Super_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_super_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterSuper_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitSuper_expression(this);
        }
    }

    public final Super_expressionContext super_expression() throws RecognitionException {
        Super_expressionContext _localctx = new Super_expressionContext(_ctx, getState());
        enterRule(_localctx, 110, RULE_super_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(719);
                match(SUPER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Unsupported_instructionContext extends ParserRuleContext {
        public Encode_expressionContext encode_expression() {
            return getRuleContext(Encode_expressionContext.class, 0);
        }

        public Protocol_expressionContext protocol_expression() {
            return getRuleContext(Protocol_expressionContext.class, 0);
        }

        public Unsupported_instructionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_unsupported_instruction;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterUnsupported_instruction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitUnsupported_instruction(this);
        }
    }

    public final Unsupported_instructionContext unsupported_instruction() throws RecognitionException {
        Unsupported_instructionContext _localctx = new Unsupported_instructionContext(_ctx, getState());
        enterRule(_localctx, 112, RULE_unsupported_instruction);
        try {
            setState(723);
            switch (_input.LA(1)) {
                case ENCODE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(721);
                    encode_expression();
                }
                break;
                case PROTOCOL:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(722);
                    protocol_expression();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class String_constantContext extends ParserRuleContext {
        public TerminalNode STRING_LITERAL() {
            return getToken(ObjCParser.STRING_LITERAL, 0);
        }

        public TerminalNode CSTRING_LITERAL() {
            return getToken(ObjCParser.CSTRING_LITERAL, 0);
        }

        public String_constantContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_string_constant;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterString_constant(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitString_constant(this);
        }
    }

    public final String_constantContext string_constant() throws RecognitionException {
        String_constantContext _localctx = new String_constantContext(_ctx, getState());
        enterRule(_localctx, 114, RULE_string_constant);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(725);
                _la = _input.LA(1);
                if (!(_la == CSTRING_LITERAL || _la == STRING_LITERAL)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Dictionary_pairContext extends ParserRuleContext {
        public List<Postfix_expressionContext> postfix_expression() {
            return getRuleContexts(Postfix_expressionContext.class);
        }

        public Postfix_expressionContext postfix_expression(int i) {
            return getRuleContext(Postfix_expressionContext.class, i);
        }

        public Dictionary_pairContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dictionary_pair;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterDictionary_pair(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitDictionary_pair(this);
        }
    }

    public final Dictionary_pairContext dictionary_pair() throws RecognitionException {
        Dictionary_pairContext _localctx = new Dictionary_pairContext(_ctx, getState());
        enterRule(_localctx, 116, RULE_dictionary_pair);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(727);
                postfix_expression();
                setState(728);
                match(COLON);
                setState(729);
                postfix_expression();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Dictionary_expressionContext extends ParserRuleContext {
        public List<Dictionary_pairContext> dictionary_pair() {
            return getRuleContexts(Dictionary_pairContext.class);
        }

        public Dictionary_pairContext dictionary_pair(int i) {
            return getRuleContext(Dictionary_pairContext.class, i);
        }

        public Dictionary_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dictionary_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterDictionary_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitDictionary_expression(this);
        }
    }

    public final Dictionary_expressionContext dictionary_expression() throws RecognitionException {
        Dictionary_expressionContext _localctx = new Dictionary_expressionContext(_ctx, getState());
        enterRule(_localctx, 118, RULE_dictionary_expression);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(731);
                match(AT);
                setState(732);
                match(LBRACE);
                setState(734);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOTIDENTIFIER) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LPAREN - 79)) | (1L << (LBRACK - 79)) | (1L << (AT - 79)) | (1L << (CARET - 79)) | (1L << (IDENTIFIER - 79)) | (1L << (CHARACTER_LITERAL - 79)) | (1L << (CSTRING_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (DECIMAL_LITERAL - 79)) | (1L << (OCTAL_LITERAL - 79)) | (1L << (FLOATING_POINT_LITERAL - 79)))) != 0)) {
                    {
                        setState(733);
                        dictionary_pair();
                    }
                }

                setState(740);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 59, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(736);
                                match(COMMA);
                                setState(737);
                                dictionary_pair();
                            }
                        }
                    }
                    setState(742);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 59, _ctx);
                }
                setState(744);
                _la = _input.LA(1);
                if (_la == COMMA) {
                    {
                        setState(743);
                        match(COMMA);
                    }
                }

                setState(746);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Array_expressionContext extends ParserRuleContext {
        public List<Postfix_expressionContext> postfix_expression() {
            return getRuleContexts(Postfix_expressionContext.class);
        }

        public Postfix_expressionContext postfix_expression(int i) {
            return getRuleContext(Postfix_expressionContext.class, i);
        }

        public Array_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_array_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterArray_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitArray_expression(this);
        }
    }

    public final Array_expressionContext array_expression() throws RecognitionException {
        Array_expressionContext _localctx = new Array_expressionContext(_ctx, getState());
        enterRule(_localctx, 120, RULE_array_expression);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(748);
                match(AT);
                setState(749);
                match(LBRACK);
                setState(751);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOTIDENTIFIER) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LPAREN - 79)) | (1L << (LBRACK - 79)) | (1L << (AT - 79)) | (1L << (CARET - 79)) | (1L << (IDENTIFIER - 79)) | (1L << (CHARACTER_LITERAL - 79)) | (1L << (CSTRING_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (DECIMAL_LITERAL - 79)) | (1L << (OCTAL_LITERAL - 79)) | (1L << (FLOATING_POINT_LITERAL - 79)))) != 0)) {
                    {
                        setState(750);
                        postfix_expression();
                    }
                }

                setState(757);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 62, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(753);
                                match(COMMA);
                                setState(754);
                                postfix_expression();
                            }
                        }
                    }
                    setState(759);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 62, _ctx);
                }
                setState(761);
                _la = _input.LA(1);
                if (_la == COMMA) {
                    {
                        setState(760);
                        match(COMMA);
                    }
                }

                setState(763);
                match(RBRACK);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Box_expressionContext extends ParserRuleContext {
        public Postfix_expressionContext postfix_expression() {
            return getRuleContext(Postfix_expressionContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ConstantContext constant() {
            return getRuleContext(ConstantContext.class, 0);
        }

        public Box_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_box_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterBox_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitBox_expression(this);
        }
    }

    public final Box_expressionContext box_expression() throws RecognitionException {
        Box_expressionContext _localctx = new Box_expressionContext(_ctx, getState());
        enterRule(_localctx, 122, RULE_box_expression);
        try {
            setState(775);
            switch (getInterpreter().adaptivePredict(_input, 65, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(765);
                    match(AT);
                    setState(766);
                    match(LPAREN);
                    setState(769);
                    switch (getInterpreter().adaptivePredict(_input, 64, _ctx)) {
                        case 1: {
                            setState(767);
                            postfix_expression();
                        }
                        break;
                        case 2: {
                            setState(768);
                            expression();
                        }
                        break;
                    }
                    setState(771);
                    match(RPAREN);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(773);
                    match(AT);
                    setState(774);
                    constant();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Block_parametersContext extends ParserRuleContext {
        public List<Type_variable_declaratorContext> type_variable_declarator() {
            return getRuleContexts(Type_variable_declaratorContext.class);
        }

        public Type_variable_declaratorContext type_variable_declarator(int i) {
            return getRuleContext(Type_variable_declaratorContext.class, i);
        }

        public List<Type_nameContext> type_name() {
            return getRuleContexts(Type_nameContext.class);
        }

        public Type_nameContext type_name(int i) {
            return getRuleContext(Type_nameContext.class, i);
        }

        public Block_parametersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block_parameters;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterBlock_parameters(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitBlock_parameters(this);
        }
    }

    public final Block_parametersContext block_parameters() throws RecognitionException {
        Block_parametersContext _localctx = new Block_parametersContext(_ctx, getState());
        enterRule(_localctx, 124, RULE_block_parameters);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(777);
                match(LPAREN);
                setState(781);
                switch (getInterpreter().adaptivePredict(_input, 66, _ctx)) {
                    case 1: {
                        setState(778);
                        type_variable_declarator();
                    }
                    break;
                    case 2: {
                        setState(779);
                        type_name();
                    }
                    break;
                    case 3: {
                        setState(780);
                        match(VOID);
                    }
                    break;
                }
                setState(790);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(783);
                            match(COMMA);
                            setState(786);
                            switch (getInterpreter().adaptivePredict(_input, 67, _ctx)) {
                                case 1: {
                                    setState(784);
                                    type_variable_declarator();
                                }
                                break;
                                case 2: {
                                    setState(785);
                                    type_name();
                                }
                                break;
                            }
                        }
                    }
                    setState(792);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(793);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Block_expressionContext extends ParserRuleContext {
        public Compound_statementContext compound_statement() {
            return getRuleContext(Compound_statementContext.class, 0);
        }

        public Type_specifierContext type_specifier() {
            return getRuleContext(Type_specifierContext.class, 0);
        }

        public Block_parametersContext block_parameters() {
            return getRuleContext(Block_parametersContext.class, 0);
        }

        public Block_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterBlock_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitBlock_expression(this);
        }
    }

    public final Block_expressionContext block_expression() throws RecognitionException {
        Block_expressionContext _localctx = new Block_expressionContext(_ctx, getState());
        enterRule(_localctx, 126, RULE_block_expression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(795);
                match(CARET);
                setState(797);
                _la = _input.LA(1);
                if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (CHAR - 40)) | (1L << (DOUBLE - 40)) | (1L << (ENUM - 40)) | (1L << (FLOAT - 40)) | (1L << (ID - 40)) | (1L << (INT - 40)) | (1L << (LONG - 40)) | (1L << (SHORT - 40)) | (1L << (SIGNED - 40)) | (1L << (STRUCT - 40)) | (1L << (UNION - 40)) | (1L << (UNSIGNED - 40)) | (1L << (VOID - 40)) | (1L << (NS_OPTIONS - 40)) | (1L << (NS_ENUM - 40)))) != 0) || _la == IDENTIFIER) {
                    {
                        setState(796);
                        type_specifier();
                    }
                }

                setState(800);
                _la = _input.LA(1);
                if (_la == LPAREN) {
                    {
                        setState(799);
                        block_parameters();
                    }
                }

                setState(802);
                compound_statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Message_expressionContext extends ParserRuleContext {
        public ReceiverContext receiver() {
            return getRuleContext(ReceiverContext.class, 0);
        }

        public Message_selectorContext message_selector() {
            return getRuleContext(Message_selectorContext.class, 0);
        }

        public DotidentifierContext dotidentifier() {
            return getRuleContext(DotidentifierContext.class, 0);
        }

        public Message_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_message_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterMessage_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitMessage_expression(this);
        }
    }

    public final Message_expressionContext message_expression() throws RecognitionException {
        Message_expressionContext _localctx = new Message_expressionContext(_ctx, getState());
        enterRule(_localctx, 128, RULE_message_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(804);
                match(LBRACK);
                setState(805);
                receiver();
                setState(806);
                message_selector();
                setState(807);
                match(RBRACK);
                setState(810);
                switch (getInterpreter().adaptivePredict(_input, 71, _ctx)) {
                    case 1: {
                        setState(808);
                        match(DOT);
                        setState(809);
                        dotidentifier();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ReceiverContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Class_nameContext class_name() {
            return getRuleContext(Class_nameContext.class, 0);
        }

        public Message_expressionContext message_expression() {
            return getRuleContext(Message_expressionContext.class, 0);
        }

        public ReceiverContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_receiver;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterReceiver(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitReceiver(this);
        }
    }

    public final ReceiverContext receiver() throws RecognitionException {
        ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
        enterRule(_localctx, 130, RULE_receiver);
        try {
            setState(815);
            switch (getInterpreter().adaptivePredict(_input, 72, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(812);
                    expression();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(813);
                    class_name();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(814);
                    message_expression();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Message_selectorContext extends ParserRuleContext {
        public SelectorContext selector() {
            return getRuleContext(SelectorContext.class, 0);
        }

        public List<Keyword_argumentContext> keyword_argument() {
            return getRuleContexts(Keyword_argumentContext.class);
        }

        public Keyword_argumentContext keyword_argument(int i) {
            return getRuleContext(Keyword_argumentContext.class, i);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public Message_selectorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_message_selector;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterMessage_selector(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitMessage_selector(this);
        }
    }

    public final Message_selectorContext message_selector() throws RecognitionException {
        Message_selectorContext _localctx = new Message_selectorContext(_ctx, getState());
        enterRule(_localctx, 132, RULE_message_selector);
        int _la;
        try {
            setState(824);
            switch (getInterpreter().adaptivePredict(_input, 74, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(817);
                    selector();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(819);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(818);
                                keyword_argument();
                            }
                        }
                        setState(821);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    while (_la == DOTIDENTIFIER || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (COLON - 96)) | (1L << (RETAIN - 96)) | (1L << (IDENTIFIER - 96)))) != 0));
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(823);
                    identifier();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Keyword_argumentContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public SelectorContext selector() {
            return getRuleContext(SelectorContext.class, 0);
        }

        public Keyword_argumentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_keyword_argument;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterKeyword_argument(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitKeyword_argument(this);
        }
    }

    public final Keyword_argumentContext keyword_argument() throws RecognitionException {
        Keyword_argumentContext _localctx = new Keyword_argumentContext(_ctx, getState());
        enterRule(_localctx, 134, RULE_keyword_argument);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(827);
                _la = _input.LA(1);
                if (_la == DOTIDENTIFIER || _la == RETAIN || _la == IDENTIFIER) {
                    {
                        setState(826);
                        selector();
                    }
                }

                setState(829);
                match(COLON);
                setState(830);
                expression();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Selector_expressionContext extends ParserRuleContext {
        public Selector_nameContext selector_name() {
            return getRuleContext(Selector_nameContext.class, 0);
        }

        public Selector_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selector_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterSelector_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitSelector_expression(this);
        }
    }

    public final Selector_expressionContext selector_expression() throws RecognitionException {
        Selector_expressionContext _localctx = new Selector_expressionContext(_ctx, getState());
        enterRule(_localctx, 136, RULE_selector_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(832);
                match(SELECTOR);
                setState(833);
                match(LPAREN);
                setState(834);
                selector_name();
                setState(835);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Selector_nameContext extends ParserRuleContext {
        public List<SelectorContext> selector() {
            return getRuleContexts(SelectorContext.class);
        }

        public SelectorContext selector(int i) {
            return getRuleContext(SelectorContext.class, i);
        }

        public Selector_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selector_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterSelector_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitSelector_name(this);
        }
    }

    public final Selector_nameContext selector_name() throws RecognitionException {
        Selector_nameContext _localctx = new Selector_nameContext(_ctx, getState());
        enterRule(_localctx, 138, RULE_selector_name);
        int _la;
        try {
            setState(846);
            switch (getInterpreter().adaptivePredict(_input, 78, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(837);
                    selector();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(842);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(839);
                                _la = _input.LA(1);
                                if (_la == DOTIDENTIFIER || _la == RETAIN || _la == IDENTIFIER) {
                                    {
                                        setState(838);
                                        selector();
                                    }
                                }

                                setState(841);
                                match(COLON);
                            }
                        }
                        setState(844);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    while (_la == DOTIDENTIFIER || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (COLON - 96)) | (1L << (RETAIN - 96)) | (1L << (IDENTIFIER - 96)))) != 0));
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Protocol_expressionContext extends ParserRuleContext {
        public Protocol_nameContext protocol_name() {
            return getRuleContext(Protocol_nameContext.class, 0);
        }

        public Protocol_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_protocol_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterProtocol_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitProtocol_expression(this);
        }
    }

    public final Protocol_expressionContext protocol_expression() throws RecognitionException {
        Protocol_expressionContext _localctx = new Protocol_expressionContext(_ctx, getState());
        enterRule(_localctx, 140, RULE_protocol_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(848);
                match(PROTOCOL);
                setState(849);
                match(LPAREN);
                setState(850);
                protocol_name();
                setState(851);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Encode_expressionContext extends ParserRuleContext {
        public Type_nameContext type_name() {
            return getRuleContext(Type_nameContext.class, 0);
        }

        public Encode_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_encode_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterEncode_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitEncode_expression(this);
        }
    }

    public final Encode_expressionContext encode_expression() throws RecognitionException {
        Encode_expressionContext _localctx = new Encode_expressionContext(_ctx, getState());
        enterRule(_localctx, 142, RULE_encode_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(853);
                match(ENCODE);
                setState(854);
                match(LPAREN);
                setState(855);
                type_name();
                setState(856);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Exception_declaratorContext extends ParserRuleContext {
        public DeclaratorContext declarator() {
            return getRuleContext(DeclaratorContext.class, 0);
        }

        public Exception_declaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exception_declarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterException_declarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitException_declarator(this);
        }
    }

    public final Exception_declaratorContext exception_declarator() throws RecognitionException {
        Exception_declaratorContext _localctx = new Exception_declaratorContext(_ctx, getState());
        enterRule(_localctx, 144, RULE_exception_declarator);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(858);
                declarator();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Type_variable_declaratorContext extends ParserRuleContext {
        public Declaration_specifiersContext declaration_specifiers() {
            return getRuleContext(Declaration_specifiersContext.class, 0);
        }

        public DeclaratorContext declarator() {
            return getRuleContext(DeclaratorContext.class, 0);
        }

        public Type_variable_declaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type_variable_declarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterType_variable_declarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitType_variable_declarator(this);
        }
    }

    public final Type_variable_declaratorContext type_variable_declarator() throws RecognitionException {
        Type_variable_declaratorContext _localctx = new Type_variable_declaratorContext(_ctx, getState());
        enterRule(_localctx, 146, RULE_type_variable_declarator);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(860);
                declaration_specifiers();
                setState(861);
                declarator();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Try_statementContext extends ParserRuleContext {
        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public Try_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_try_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterTry_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitTry_statement(this);
        }
    }

    public final Try_statementContext try_statement() throws RecognitionException {
        Try_statementContext _localctx = new Try_statementContext(_ctx, getState());
        enterRule(_localctx, 148, RULE_try_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(863);
                match(TRY);
                setState(864);
                statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Catch_statementContext extends ParserRuleContext {
        public Exception_declaratorContext exception_declarator() {
            return getRuleContext(Exception_declaratorContext.class, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public Catch_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_catch_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterCatch_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitCatch_statement(this);
        }
    }

    public final Catch_statementContext catch_statement() throws RecognitionException {
        Catch_statementContext _localctx = new Catch_statementContext(_ctx, getState());
        enterRule(_localctx, 150, RULE_catch_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(866);
                match(CATCH);
                setState(867);
                match(LPAREN);
                setState(868);
                exception_declarator();
                setState(869);
                match(RPAREN);
                setState(870);
                statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Finally_statementContext extends ParserRuleContext {
        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public Finally_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_finally_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterFinally_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitFinally_statement(this);
        }
    }

    public final Finally_statementContext finally_statement() throws RecognitionException {
        Finally_statementContext _localctx = new Finally_statementContext(_ctx, getState());
        enterRule(_localctx, 152, RULE_finally_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(872);
                match(FINALLY);
                setState(873);
                statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Throw_statementContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(ObjCParser.IDENTIFIER, 0);
        }

        public Throw_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_throw_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterThrow_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitThrow_statement(this);
        }
    }

    public final Throw_statementContext throw_statement() throws RecognitionException {
        Throw_statementContext _localctx = new Throw_statementContext(_ctx, getState());
        enterRule(_localctx, 154, RULE_throw_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(875);
                match(THROW);
                setState(876);
                match(LPAREN);
                setState(877);
                match(IDENTIFIER);
                setState(878);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Try_blockContext extends ParserRuleContext {
        public Try_statementContext try_statement() {
            return getRuleContext(Try_statementContext.class, 0);
        }

        public List<Catch_statementContext> catch_statement() {
            return getRuleContexts(Catch_statementContext.class);
        }

        public Catch_statementContext catch_statement(int i) {
            return getRuleContext(Catch_statementContext.class, i);
        }

        public Finally_statementContext finally_statement() {
            return getRuleContext(Finally_statementContext.class, 0);
        }

        public Try_blockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_try_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterTry_block(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitTry_block(this);
        }
    }

    public final Try_blockContext try_block() throws RecognitionException {
        Try_blockContext _localctx = new Try_blockContext(_ctx, getState());
        enterRule(_localctx, 156, RULE_try_block);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(880);
                try_statement();
                setState(884);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 79, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(881);
                                catch_statement();
                            }
                        }
                    }
                    setState(886);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 79, _ctx);
                }
                setState(888);
                switch (getInterpreter().adaptivePredict(_input, 80, _ctx)) {
                    case 1: {
                        setState(887);
                        finally_statement();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Synchronized_statementContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(ObjCParser.IDENTIFIER, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public Synchronized_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_synchronized_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterSynchronized_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitSynchronized_statement(this);
        }
    }

    public final Synchronized_statementContext synchronized_statement() throws RecognitionException {
        Synchronized_statementContext _localctx = new Synchronized_statementContext(_ctx, getState());
        enterRule(_localctx, 158, RULE_synchronized_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(890);
                match(SYNCHRONIZED);
                setState(891);
                match(LPAREN);
                setState(892);
                match(IDENTIFIER);
                setState(893);
                match(RPAREN);
                setState(894);
                statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Autorelease_statementContext extends ParserRuleContext {
        public Compound_statementContext compound_statement() {
            return getRuleContext(Compound_statementContext.class, 0);
        }

        public Autorelease_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_autorelease_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterAutorelease_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitAutorelease_statement(this);
        }
    }

    public final Autorelease_statementContext autorelease_statement() throws RecognitionException {
        Autorelease_statementContext _localctx = new Autorelease_statementContext(_ctx, getState());
        enterRule(_localctx, 160, RULE_autorelease_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(896);
                match(AUTORELEASEPOOL);
                setState(897);
                compound_statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Function_definitionContext extends ParserRuleContext {
        public DeclaratorContext declarator() {
            return getRuleContext(DeclaratorContext.class, 0);
        }

        public Compound_statementContext compound_statement() {
            return getRuleContext(Compound_statementContext.class, 0);
        }

        public Declaration_specifiersContext declaration_specifiers() {
            return getRuleContext(Declaration_specifiersContext.class, 0);
        }

        public Function_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterFunction_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitFunction_definition(this);
        }
    }

    public final Function_definitionContext function_definition() throws RecognitionException {
        Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
        enterRule(_localctx, 162, RULE_function_definition);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(900);
                switch (getInterpreter().adaptivePredict(_input, 81, _ctx)) {
                    case 1: {
                        setState(899);
                        declaration_specifiers();
                    }
                    break;
                }
                setState(902);
                declarator();
                setState(903);
                compound_statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Declaration_minus_semiContext extends ParserRuleContext {
        public Declaration_specifiersContext declaration_specifiers() {
            return getRuleContext(Declaration_specifiersContext.class, 0);
        }

        public Init_declarator_listContext init_declarator_list() {
            return getRuleContext(Init_declarator_listContext.class, 0);
        }

        public Declaration_minus_semiContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declaration_minus_semi;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterDeclaration_minus_semi(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitDeclaration_minus_semi(this);
        }
    }

    public final Declaration_minus_semiContext declaration_minus_semi() throws RecognitionException {
        Declaration_minus_semiContext _localctx = new Declaration_minus_semiContext(_ctx, getState());
        enterRule(_localctx, 164, RULE_declaration_minus_semi);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(905);
                declaration_specifiers();
                setState(907);
                _la = _input.LA(1);
                if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LPAREN - 79)) | (1L << (MUL - 79)) | (1L << (IDENTIFIER - 79)))) != 0)) {
                    {
                        setState(906);
                        init_declarator_list();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DeclarationContext extends ParserRuleContext {
        public Declaration_minus_semiContext declaration_minus_semi() {
            return getRuleContext(Declaration_minus_semiContext.class, 0);
        }

        public DeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitDeclaration(this);
        }
    }

    public final DeclarationContext declaration() throws RecognitionException {
        DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
        enterRule(_localctx, 166, RULE_declaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(909);
                declaration_minus_semi();
                setState(910);
                match(SEMI);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Declaration_specifiersContext extends ParserRuleContext {
        public List<Declaration_specifierContext> declaration_specifier() {
            return getRuleContexts(Declaration_specifierContext.class);
        }

        public Declaration_specifierContext declaration_specifier(int i) {
            return getRuleContext(Declaration_specifierContext.class, i);
        }

        public Declaration_specifiersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declaration_specifiers;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterDeclaration_specifiers(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitDeclaration_specifiers(this);
        }
    }

    public final Declaration_specifiersContext declaration_specifiers() throws RecognitionException {
        Declaration_specifiersContext _localctx = new Declaration_specifiersContext(_ctx, getState());
        enterRule(_localctx, 168, RULE_declaration_specifiers);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(913);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(912);
                                declaration_specifier();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(915);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 83, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Declaration_specifierContext extends ParserRuleContext {
        public Arc_behaviour_specifierContext arc_behaviour_specifier() {
            return getRuleContext(Arc_behaviour_specifierContext.class, 0);
        }

        public Storage_class_specifierContext storage_class_specifier() {
            return getRuleContext(Storage_class_specifierContext.class, 0);
        }

        public Type_specifierContext type_specifier() {
            return getRuleContext(Type_specifierContext.class, 0);
        }

        public Type_qualifierContext type_qualifier() {
            return getRuleContext(Type_qualifierContext.class, 0);
        }

        public Declaration_specifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declaration_specifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterDeclaration_specifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitDeclaration_specifier(this);
        }
    }

    public final Declaration_specifierContext declaration_specifier() throws RecognitionException {
        Declaration_specifierContext _localctx = new Declaration_specifierContext(_ctx, getState());
        enterRule(_localctx, 170, RULE_declaration_specifier);
        try {
            setState(921);
            switch (_input.LA(1)) {
                case WWEAK:
                case WUNSAFE_UNRETAINED:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(917);
                    arc_behaviour_specifier();
                }
                break;
                case AUTO:
                case EXTERN:
                case REGISTER:
                case STATIC:
                case TYPEDEF:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(918);
                    storage_class_specifier();
                }
                break;
                case CHAR:
                case DOUBLE:
                case ENUM:
                case FLOAT:
                case ID:
                case INT:
                case LONG:
                case SHORT:
                case SIGNED:
                case STRUCT:
                case UNION:
                case UNSIGNED:
                case VOID:
                case NS_OPTIONS:
                case NS_ENUM:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(919);
                    type_specifier();
                }
                break;
                case BYCOPY:
                case BYREF:
                case CONST:
                case IN:
                case INOUT:
                case ONEWAY:
                case OUT:
                case VOLATILE:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(920);
                    type_qualifier();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Arc_behaviour_specifierContext extends ParserRuleContext {
        public Arc_behaviour_specifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arc_behaviour_specifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterArc_behaviour_specifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitArc_behaviour_specifier(this);
        }
    }

    public final Arc_behaviour_specifierContext arc_behaviour_specifier() throws RecognitionException {
        Arc_behaviour_specifierContext _localctx = new Arc_behaviour_specifierContext(_ctx, getState());
        enterRule(_localctx, 172, RULE_arc_behaviour_specifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(923);
                _la = _input.LA(1);
                if (!(_la == WWEAK || _la == WUNSAFE_UNRETAINED)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Storage_class_specifierContext extends ParserRuleContext {
        public Storage_class_specifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_storage_class_specifier;
        }

        public Storage_class_specifierContext() {
        }

        public void copyFrom(Storage_class_specifierContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class StaticStoreClassContext extends Storage_class_specifierContext {
        public StaticStoreClassContext(Storage_class_specifierContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterStaticStoreClass(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitStaticStoreClass(this);
        }
    }

    public static class IgnoreStoreClassContext extends Storage_class_specifierContext {
        public IgnoreStoreClassContext(Storage_class_specifierContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterIgnoreStoreClass(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitIgnoreStoreClass(this);
        }
    }

    public final Storage_class_specifierContext storage_class_specifier() throws RecognitionException {
        Storage_class_specifierContext _localctx = new Storage_class_specifierContext(_ctx, getState());
        enterRule(_localctx, 174, RULE_storage_class_specifier);
        try {
            setState(930);
            switch (_input.LA(1)) {
                case AUTO:
                    _localctx = new IgnoreStoreClassContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(925);
                    match(AUTO);
                }
                break;
                case REGISTER:
                    _localctx = new IgnoreStoreClassContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(926);
                    match(REGISTER);
                }
                break;
                case STATIC:
                    _localctx = new StaticStoreClassContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(927);
                    match(STATIC);
                }
                break;
                case EXTERN:
                    _localctx = new IgnoreStoreClassContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(928);
                    match(EXTERN);
                }
                break;
                case TYPEDEF:
                    _localctx = new IgnoreStoreClassContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(929);
                    match(TYPEDEF);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Init_declarator_listContext extends ParserRuleContext {
        public List<Init_declaratorContext> init_declarator() {
            return getRuleContexts(Init_declaratorContext.class);
        }

        public Init_declaratorContext init_declarator(int i) {
            return getRuleContext(Init_declaratorContext.class, i);
        }

        public Init_declarator_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_init_declarator_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterInit_declarator_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitInit_declarator_list(this);
        }
    }

    public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
        Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
        enterRule(_localctx, 176, RULE_init_declarator_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(932);
                init_declarator();
                setState(937);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(933);
                            match(COMMA);
                            setState(934);
                            init_declarator();
                        }
                    }
                    setState(939);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Init_declaratorContext extends ParserRuleContext {
        public DeclaratorContext declarator() {
            return getRuleContext(DeclaratorContext.class, 0);
        }

        public InitializerContext initializer() {
            return getRuleContext(InitializerContext.class, 0);
        }

        public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_init_declarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterInit_declarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitInit_declarator(this);
        }
    }

    public final Init_declaratorContext init_declarator() throws RecognitionException {
        Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
        enterRule(_localctx, 178, RULE_init_declarator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(940);
                declarator();
                setState(943);
                _la = _input.LA(1);
                if (_la == ASSIGN) {
                    {
                        setState(941);
                        match(ASSIGN);
                        setState(942);
                        initializer();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Struct_or_union_specifierContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(ObjCParser.IDENTIFIER, 0);
        }

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public List<Struct_declarationContext> struct_declaration() {
            return getRuleContexts(Struct_declarationContext.class);
        }

        public Struct_declarationContext struct_declaration(int i) {
            return getRuleContext(Struct_declarationContext.class, i);
        }

        public Struct_or_union_specifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_struct_or_union_specifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterStruct_or_union_specifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitStruct_or_union_specifier(this);
        }
    }

    public final Struct_or_union_specifierContext struct_or_union_specifier() throws RecognitionException {
        Struct_or_union_specifierContext _localctx = new Struct_or_union_specifierContext(_ctx, getState());
        enterRule(_localctx, 180, RULE_struct_or_union_specifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(945);
                _la = _input.LA(1);
                if (!(_la == STRUCT || _la == UNION)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
                setState(960);
                switch (getInterpreter().adaptivePredict(_input, 91, _ctx)) {
                    case 1: {
                        setState(946);
                        match(IDENTIFIER);
                    }
                    break;
                    case 2: {
                        setState(948);
                        _la = _input.LA(1);
                        if (_la == IDENTIFIER) {
                            {
                                setState(947);
                                identifier();
                            }
                        }

                        setState(950);
                        match(LBRACE);
                        setState(952);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(951);
                                    struct_declaration();
                                }
                            }
                            setState(954);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (BYCOPY - 37)) | (1L << (BYREF - 37)) | (1L << (CHAR - 37)) | (1L << (CONST - 37)) | (1L << (DOUBLE - 37)) | (1L << (ENUM - 37)) | (1L << (FLOAT - 37)) | (1L << (ID - 37)) | (1L << (IN - 37)) | (1L << (INOUT - 37)) | (1L << (INT - 37)) | (1L << (LONG - 37)) | (1L << (ONEWAY - 37)) | (1L << (OUT - 37)) | (1L << (SHORT - 37)) | (1L << (SIGNED - 37)) | (1L << (STRUCT - 37)) | (1L << (UNION - 37)) | (1L << (UNSIGNED - 37)) | (1L << (VOID - 37)) | (1L << (VOLATILE - 37)) | (1L << (NS_OPTIONS - 37)) | (1L << (NS_ENUM - 37)) | (1L << (WWEAK - 37)) | (1L << (WUNSAFE_UNRETAINED - 37)))) != 0) || _la == IDENTIFIER);
                        setState(956);
                        match(RBRACE);
                        setState(958);
                        switch (getInterpreter().adaptivePredict(_input, 90, _ctx)) {
                            case 1: {
                                setState(957);
                                identifier();
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Struct_declarationContext extends ParserRuleContext {
        public Specifier_qualifier_listContext specifier_qualifier_list() {
            return getRuleContext(Specifier_qualifier_listContext.class, 0);
        }

        public Struct_declarator_listContext struct_declarator_list() {
            return getRuleContext(Struct_declarator_listContext.class, 0);
        }

        public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_struct_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterStruct_declaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitStruct_declaration(this);
        }
    }

    public final Struct_declarationContext struct_declaration() throws RecognitionException {
        Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
        enterRule(_localctx, 182, RULE_struct_declaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(962);
                specifier_qualifier_list();
                setState(963);
                struct_declarator_list();
                setState(964);
                match(SEMI);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Specifier_qualifier_listContext extends ParserRuleContext {
        public List<Specifier_qualifierContext> specifier_qualifier() {
            return getRuleContexts(Specifier_qualifierContext.class);
        }

        public Specifier_qualifierContext specifier_qualifier(int i) {
            return getRuleContext(Specifier_qualifierContext.class, i);
        }

        public Specifier_qualifier_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_specifier_qualifier_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterSpecifier_qualifier_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitSpecifier_qualifier_list(this);
        }
    }

    public final Specifier_qualifier_listContext specifier_qualifier_list() throws RecognitionException {
        Specifier_qualifier_listContext _localctx = new Specifier_qualifier_listContext(_ctx, getState());
        enterRule(_localctx, 184, RULE_specifier_qualifier_list);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(967);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(966);
                                specifier_qualifier();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(969);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 92, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Specifier_qualifierContext extends ParserRuleContext {
        public Arc_behaviour_specifierContext arc_behaviour_specifier() {
            return getRuleContext(Arc_behaviour_specifierContext.class, 0);
        }

        public Type_specifierContext type_specifier() {
            return getRuleContext(Type_specifierContext.class, 0);
        }

        public Type_qualifierContext type_qualifier() {
            return getRuleContext(Type_qualifierContext.class, 0);
        }

        public Specifier_qualifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_specifier_qualifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterSpecifier_qualifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitSpecifier_qualifier(this);
        }
    }

    public final Specifier_qualifierContext specifier_qualifier() throws RecognitionException {
        Specifier_qualifierContext _localctx = new Specifier_qualifierContext(_ctx, getState());
        enterRule(_localctx, 186, RULE_specifier_qualifier);
        try {
            setState(974);
            switch (_input.LA(1)) {
                case WWEAK:
                case WUNSAFE_UNRETAINED:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(971);
                    arc_behaviour_specifier();
                }
                break;
                case CHAR:
                case DOUBLE:
                case ENUM:
                case FLOAT:
                case ID:
                case INT:
                case LONG:
                case SHORT:
                case SIGNED:
                case STRUCT:
                case UNION:
                case UNSIGNED:
                case VOID:
                case NS_OPTIONS:
                case NS_ENUM:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(972);
                    type_specifier();
                }
                break;
                case BYCOPY:
                case BYREF:
                case CONST:
                case IN:
                case INOUT:
                case ONEWAY:
                case OUT:
                case VOLATILE:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(973);
                    type_qualifier();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Struct_declarator_listContext extends ParserRuleContext {
        public List<Struct_declaratorContext> struct_declarator() {
            return getRuleContexts(Struct_declaratorContext.class);
        }

        public Struct_declaratorContext struct_declarator(int i) {
            return getRuleContext(Struct_declaratorContext.class, i);
        }

        public Struct_declarator_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_struct_declarator_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterStruct_declarator_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitStruct_declarator_list(this);
        }
    }

    public final Struct_declarator_listContext struct_declarator_list() throws RecognitionException {
        Struct_declarator_listContext _localctx = new Struct_declarator_listContext(_ctx, getState());
        enterRule(_localctx, 188, RULE_struct_declarator_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(976);
                struct_declarator();
                setState(981);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(977);
                            match(COMMA);
                            setState(978);
                            struct_declarator();
                        }
                    }
                    setState(983);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Struct_declaratorContext extends ParserRuleContext {
        public DeclaratorContext declarator() {
            return getRuleContext(DeclaratorContext.class, 0);
        }

        public ConstantContext constant() {
            return getRuleContext(ConstantContext.class, 0);
        }

        public Struct_declaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_struct_declarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterStruct_declarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitStruct_declarator(this);
        }
    }

    public final Struct_declaratorContext struct_declarator() throws RecognitionException {
        Struct_declaratorContext _localctx = new Struct_declaratorContext(_ctx, getState());
        enterRule(_localctx, 190, RULE_struct_declarator);
        int _la;
        try {
            setState(990);
            switch (getInterpreter().adaptivePredict(_input, 96, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(984);
                    declarator();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(986);
                    _la = _input.LA(1);
                    if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LPAREN - 79)) | (1L << (MUL - 79)) | (1L << (IDENTIFIER - 79)))) != 0)) {
                        {
                            setState(985);
                            declarator();
                        }
                    }

                    setState(988);
                    match(COLON);
                    setState(989);
                    constant();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Enum_specifierContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public Enumerator_listContext enumerator_list() {
            return getRuleContext(Enumerator_listContext.class, 0);
        }

        public Type_nameContext type_name() {
            return getRuleContext(Type_nameContext.class, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(ObjCParser.IDENTIFIER, 0);
        }

        public Enum_specifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_enum_specifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterEnum_specifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitEnum_specifier(this);
        }
    }

    public final Enum_specifierContext enum_specifier() throws RecognitionException {
        Enum_specifierContext _localctx = new Enum_specifierContext(_ctx, getState());
        enterRule(_localctx, 192, RULE_enum_specifier);
        int _la;
        try {
            setState(1033);
            switch (_input.LA(1)) {
                case ENUM:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(992);
                    match(ENUM);
                    setState(998);
                    switch (getInterpreter().adaptivePredict(_input, 98, _ctx)) {
                        case 1: {
                            setState(994);
                            _la = _input.LA(1);
                            if (_la == IDENTIFIER) {
                                {
                                    setState(993);
                                    match(IDENTIFIER);
                                }
                            }

                            setState(996);
                            match(COLON);
                            setState(997);
                            type_name();
                        }
                        break;
                    }
                    setState(1011);
                    switch (_input.LA(1)) {
                        case IDENTIFIER: {
                            setState(1000);
                            identifier();
                            setState(1005);
                            switch (getInterpreter().adaptivePredict(_input, 99, _ctx)) {
                                case 1: {
                                    setState(1001);
                                    match(LBRACE);
                                    setState(1002);
                                    enumerator_list();
                                    setState(1003);
                                    match(RBRACE);
                                }
                                break;
                            }
                        }
                        break;
                        case LBRACE: {
                            setState(1007);
                            match(LBRACE);
                            setState(1008);
                            enumerator_list();
                            setState(1009);
                            match(RBRACE);
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                break;
                case NS_OPTIONS:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1013);
                    match(NS_OPTIONS);
                    setState(1014);
                    match(LPAREN);
                    setState(1015);
                    type_name();
                    setState(1016);
                    match(COMMA);
                    setState(1017);
                    identifier();
                    setState(1018);
                    match(RPAREN);
                    setState(1019);
                    match(LBRACE);
                    setState(1020);
                    enumerator_list();
                    setState(1021);
                    match(RBRACE);
                }
                break;
                case NS_ENUM:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1023);
                    match(NS_ENUM);
                    setState(1024);
                    match(LPAREN);
                    setState(1025);
                    type_name();
                    setState(1026);
                    match(COMMA);
                    setState(1027);
                    identifier();
                    setState(1028);
                    match(RPAREN);
                    setState(1029);
                    match(LBRACE);
                    setState(1030);
                    enumerator_list();
                    setState(1031);
                    match(RBRACE);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Enumerator_listContext extends ParserRuleContext {
        public List<EnumeratorContext> enumerator() {
            return getRuleContexts(EnumeratorContext.class);
        }

        public EnumeratorContext enumerator(int i) {
            return getRuleContext(EnumeratorContext.class, i);
        }

        public Enumerator_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_enumerator_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterEnumerator_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitEnumerator_list(this);
        }
    }

    public final Enumerator_listContext enumerator_list() throws RecognitionException {
        Enumerator_listContext _localctx = new Enumerator_listContext(_ctx, getState());
        enterRule(_localctx, 194, RULE_enumerator_list);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1035);
                enumerator();
                setState(1040);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 102, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1036);
                                match(COMMA);
                                setState(1037);
                                enumerator();
                            }
                        }
                    }
                    setState(1042);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 102, _ctx);
                }
                setState(1044);
                _la = _input.LA(1);
                if (_la == COMMA) {
                    {
                        setState(1043);
                        match(COMMA);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class EnumeratorContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public Constant_expressionContext constant_expression() {
            return getRuleContext(Constant_expressionContext.class, 0);
        }

        public EnumeratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_enumerator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterEnumerator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitEnumerator(this);
        }
    }

    public final EnumeratorContext enumerator() throws RecognitionException {
        EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
        enterRule(_localctx, 196, RULE_enumerator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1046);
                identifier();
                setState(1049);
                _la = _input.LA(1);
                if (_la == ASSIGN) {
                    {
                        setState(1047);
                        match(ASSIGN);
                        setState(1048);
                        constant_expression();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DeclaratorContext extends ParserRuleContext {
        public DeclaratorContext declarator() {
            return getRuleContext(DeclaratorContext.class, 0);
        }

        public List<Type_qualifierContext> type_qualifier() {
            return getRuleContexts(Type_qualifierContext.class);
        }

        public Type_qualifierContext type_qualifier(int i) {
            return getRuleContext(Type_qualifierContext.class, i);
        }

        public Direct_declaratorContext direct_declarator() {
            return getRuleContext(Direct_declaratorContext.class, 0);
        }

        public DeclaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterDeclarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitDeclarator(this);
        }
    }

    public final DeclaratorContext declarator() throws RecognitionException {
        DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
        enterRule(_localctx, 198, RULE_declarator);
        int _la;
        try {
            setState(1060);
            switch (_input.LA(1)) {
                case MUL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1051);
                    match(MUL);
                    setState(1055);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (BYCOPY - 37)) | (1L << (BYREF - 37)) | (1L << (CONST - 37)) | (1L << (IN - 37)) | (1L << (INOUT - 37)) | (1L << (ONEWAY - 37)) | (1L << (OUT - 37)) | (1L << (VOLATILE - 37)))) != 0)) {
                        {
                            {
                                setState(1052);
                                type_qualifier();
                            }
                        }
                        setState(1057);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1058);
                    declarator();
                }
                break;
                case LPAREN:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1059);
                    direct_declarator();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Direct_declaratorContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public List<Declarator_suffixContext> declarator_suffix() {
            return getRuleContexts(Declarator_suffixContext.class);
        }

        public Declarator_suffixContext declarator_suffix(int i) {
            return getRuleContext(Declarator_suffixContext.class, i);
        }

        public DeclaratorContext declarator() {
            return getRuleContext(DeclaratorContext.class, 0);
        }

        public Block_parametersContext block_parameters() {
            return getRuleContext(Block_parametersContext.class, 0);
        }

        public Direct_declaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_direct_declarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterDirect_declarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitDirect_declarator(this);
        }
    }

    public final Direct_declaratorContext direct_declarator() throws RecognitionException {
        Direct_declaratorContext _localctx = new Direct_declaratorContext(_ctx, getState());
        enterRule(_localctx, 200, RULE_direct_declarator);
        int _la;
        try {
            int _alt;
            setState(1085);
            switch (getInterpreter().adaptivePredict(_input, 110, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1062);
                    identifier();
                    setState(1066);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 107, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(1063);
                                    declarator_suffix();
                                }
                            }
                        }
                        setState(1068);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 107, _ctx);
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1069);
                    match(LPAREN);
                    setState(1070);
                    declarator();
                    setState(1071);
                    match(RPAREN);
                    setState(1075);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 108, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(1072);
                                    declarator_suffix();
                                }
                            }
                        }
                        setState(1077);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 108, _ctx);
                    }
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1078);
                    match(LPAREN);
                    setState(1079);
                    match(CARET);
                    setState(1081);
                    _la = _input.LA(1);
                    if (_la == IDENTIFIER) {
                        {
                            setState(1080);
                            identifier();
                        }
                    }

                    setState(1083);
                    match(RPAREN);
                    setState(1084);
                    block_parameters();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Declarator_suffixContext extends ParserRuleContext {
        public Constant_expressionContext constant_expression() {
            return getRuleContext(Constant_expressionContext.class, 0);
        }

        public Parameter_listContext parameter_list() {
            return getRuleContext(Parameter_listContext.class, 0);
        }

        public Declarator_suffixContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declarator_suffix;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterDeclarator_suffix(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitDeclarator_suffix(this);
        }
    }

    public final Declarator_suffixContext declarator_suffix() throws RecognitionException {
        Declarator_suffixContext _localctx = new Declarator_suffixContext(_ctx, getState());
        enterRule(_localctx, 202, RULE_declarator_suffix);
        int _la;
        try {
            setState(1097);
            switch (_input.LA(1)) {
                case LBRACK:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1087);
                    match(LBRACK);
                    setState(1089);
                    _la = _input.LA(1);
                    if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (DOTIDENTIFIER - 9)) | (1L << (ENCODE - 9)) | (1L << (PROTOCOL - 9)) | (1L << (SELECTOR - 9)) | (1L << (SUPER - 9)) | (1L << (SELF - 9)) | (1L << (SIZEOF - 9)))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LPAREN - 79)) | (1L << (LBRACK - 79)) | (1L << (AT - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (SUB - 79)) | (1L << (MUL - 79)) | (1L << (BITAND - 79)) | (1L << (CARET - 79)) | (1L << (IDENTIFIER - 79)) | (1L << (CHARACTER_LITERAL - 79)) | (1L << (CSTRING_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (DECIMAL_LITERAL - 79)) | (1L << (OCTAL_LITERAL - 79)) | (1L << (FLOATING_POINT_LITERAL - 79)))) != 0)) {
                        {
                            setState(1088);
                            constant_expression();
                        }
                    }

                    setState(1091);
                    match(RBRACK);
                }
                break;
                case LPAREN:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1092);
                    match(LPAREN);
                    setState(1094);
                    _la = _input.LA(1);
                    if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (AUTO - 34)) | (1L << (BYCOPY - 34)) | (1L << (BYREF - 34)) | (1L << (CHAR - 34)) | (1L << (CONST - 34)) | (1L << (DOUBLE - 34)) | (1L << (ENUM - 34)) | (1L << (EXTERN - 34)) | (1L << (FLOAT - 34)) | (1L << (ID - 34)) | (1L << (IN - 34)) | (1L << (INOUT - 34)) | (1L << (INT - 34)) | (1L << (LONG - 34)) | (1L << (ONEWAY - 34)) | (1L << (OUT - 34)) | (1L << (REGISTER - 34)) | (1L << (SHORT - 34)) | (1L << (SIGNED - 34)) | (1L << (STATIC - 34)) | (1L << (STRUCT - 34)) | (1L << (TYPEDEF - 34)) | (1L << (UNION - 34)) | (1L << (UNSIGNED - 34)) | (1L << (VOID - 34)) | (1L << (VOLATILE - 34)) | (1L << (NS_OPTIONS - 34)) | (1L << (NS_ENUM - 34)) | (1L << (WWEAK - 34)) | (1L << (WUNSAFE_UNRETAINED - 34)))) != 0) || _la == IDENTIFIER) {
                        {
                            setState(1093);
                            parameter_list();
                        }
                    }

                    setState(1096);
                    match(RPAREN);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Parameter_listContext extends ParserRuleContext {
        public Parameter_declaration_listContext parameter_declaration_list() {
            return getRuleContext(Parameter_declaration_listContext.class, 0);
        }

        public Parameter_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parameter_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterParameter_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitParameter_list(this);
        }
    }

    public final Parameter_listContext parameter_list() throws RecognitionException {
        Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
        enterRule(_localctx, 204, RULE_parameter_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1099);
                parameter_declaration_list();
                setState(1102);
                _la = _input.LA(1);
                if (_la == COMMA) {
                    {
                        setState(1100);
                        match(COMMA);
                        setState(1101);
                        match(ELIPSIS);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Parameter_declarationContext extends ParserRuleContext {
        public Declaration_specifiersContext declaration_specifiers() {
            return getRuleContext(Declaration_specifiersContext.class, 0);
        }

        public Abstract_declaratorContext abstract_declarator() {
            return getRuleContext(Abstract_declaratorContext.class, 0);
        }

        public DeclaratorContext declarator() {
            return getRuleContext(DeclaratorContext.class, 0);
        }

        public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parameter_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterParameter_declaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitParameter_declaration(this);
        }
    }

    public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
        Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
        enterRule(_localctx, 206, RULE_parameter_declaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1104);
                declaration_specifiers();
                setState(1109);
                switch (getInterpreter().adaptivePredict(_input, 116, _ctx)) {
                    case 1: {
                        setState(1106);
                        switch (getInterpreter().adaptivePredict(_input, 115, _ctx)) {
                            case 1: {
                                setState(1105);
                                declarator();
                            }
                            break;
                        }
                    }
                    break;
                    case 2: {
                        setState(1108);
                        abstract_declarator();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class InitializerContext extends ParserRuleContext {
        public Assignment_expressionContext assignment_expression() {
            return getRuleContext(Assignment_expressionContext.class, 0);
        }

        public List<InitializerContext> initializer() {
            return getRuleContexts(InitializerContext.class);
        }

        public InitializerContext initializer(int i) {
            return getRuleContext(InitializerContext.class, i);
        }

        public InitializerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_initializer;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterInitializer(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitInitializer(this);
        }
    }

    public final InitializerContext initializer() throws RecognitionException {
        InitializerContext _localctx = new InitializerContext(_ctx, getState());
        enterRule(_localctx, 208, RULE_initializer);
        int _la;
        try {
            int _alt;
            setState(1128);
            switch (_input.LA(1)) {
                case DOTIDENTIFIER:
                case ENCODE:
                case PROTOCOL:
                case SELECTOR:
                case SUPER:
                case SELF:
                case SIZEOF:
                case LPAREN:
                case LBRACK:
                case AT:
                case BANG:
                case TILDE:
                case INC:
                case DEC:
                case SUB:
                case MUL:
                case BITAND:
                case CARET:
                case IDENTIFIER:
                case CHARACTER_LITERAL:
                case CSTRING_LITERAL:
                case STRING_LITERAL:
                case HEX_LITERAL:
                case DECIMAL_LITERAL:
                case OCTAL_LITERAL:
                case FLOATING_POINT_LITERAL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1111);
                    assignment_expression();
                }
                break;
                case LBRACE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1112);
                    match(LBRACE);
                    setState(1113);
                    initializer();
                    setState(1118);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 117, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(1114);
                                    match(COMMA);
                                    setState(1115);
                                    initializer();
                                }
                            }
                        }
                        setState(1120);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 117, _ctx);
                    }
                    setState(1122);
                    _la = _input.LA(1);
                    if (_la == COMMA) {
                        {
                            setState(1121);
                            match(COMMA);
                        }
                    }

                    setState(1124);
                    match(RBRACE);
                    setState(1126);
                    switch (getInterpreter().adaptivePredict(_input, 119, _ctx)) {
                        case 1: {
                            setState(1125);
                            match(COMMA);
                        }
                        break;
                    }
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Type_nameContext extends ParserRuleContext {
        public Specifier_qualifier_listContext specifier_qualifier_list() {
            return getRuleContext(Specifier_qualifier_listContext.class, 0);
        }

        public Abstract_declaratorContext abstract_declarator() {
            return getRuleContext(Abstract_declaratorContext.class, 0);
        }

        public Block_typeContext block_type() {
            return getRuleContext(Block_typeContext.class, 0);
        }

        public Type_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterType_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitType_name(this);
        }
    }

    public final Type_nameContext type_name() throws RecognitionException {
        Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
        enterRule(_localctx, 210, RULE_type_name);
        try {
            setState(1134);
            switch (getInterpreter().adaptivePredict(_input, 121, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1130);
                    specifier_qualifier_list();
                    setState(1131);
                    abstract_declarator();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1133);
                    block_type();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Abstract_declaratorContext extends ParserRuleContext {
        public Abstract_declaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_abstract_declarator;
        }

        public Abstract_declaratorContext() {
        }

        public void copyFrom(Abstract_declaratorContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class AdecRecurseContext extends Abstract_declaratorContext {
        public Abstract_declaratorContext abstract_declarator() {
            return getRuleContext(Abstract_declaratorContext.class, 0);
        }

        public List<Abstract_declarator_suffixContext> abstract_declarator_suffix() {
            return getRuleContexts(Abstract_declarator_suffixContext.class);
        }

        public Abstract_declarator_suffixContext abstract_declarator_suffix(int i) {
            return getRuleContext(Abstract_declarator_suffixContext.class, i);
        }

        public AdecRecurseContext(Abstract_declaratorContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterAdecRecurse(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitAdecRecurse(this);
        }
    }

    public static class AdecNoneContext extends Abstract_declaratorContext {
        public AdecNoneContext(Abstract_declaratorContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterAdecNone(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitAdecNone(this);
        }
    }

    public static class AdecTypeContext extends Abstract_declaratorContext {
        public Abstract_declaratorContext abstract_declarator() {
            return getRuleContext(Abstract_declaratorContext.class, 0);
        }

        public List<Type_qualifierContext> type_qualifier() {
            return getRuleContexts(Type_qualifierContext.class);
        }

        public Type_qualifierContext type_qualifier(int i) {
            return getRuleContext(Type_qualifierContext.class, i);
        }

        public AdecTypeContext(Abstract_declaratorContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterAdecType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitAdecType(this);
        }
    }

    public static class AdecConstContext extends Abstract_declaratorContext {
        public List<Constant_expressionContext> constant_expression() {
            return getRuleContexts(Constant_expressionContext.class);
        }

        public Constant_expressionContext constant_expression(int i) {
            return getRuleContext(Constant_expressionContext.class, i);
        }

        public AdecConstContext(Abstract_declaratorContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterAdecConst(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitAdecConst(this);
        }
    }

    public final Abstract_declaratorContext abstract_declarator() throws RecognitionException {
        Abstract_declaratorContext _localctx = new Abstract_declaratorContext(_ctx, getState());
        enterRule(_localctx, 212, RULE_abstract_declarator);
        int _la;
        try {
            int _alt;
            setState(1162);
            switch (getInterpreter().adaptivePredict(_input, 126, _ctx)) {
                case 1:
                    _localctx = new AdecTypeContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1136);
                    match(MUL);
                    setState(1140);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (BYCOPY - 37)) | (1L << (BYREF - 37)) | (1L << (CONST - 37)) | (1L << (IN - 37)) | (1L << (INOUT - 37)) | (1L << (ONEWAY - 37)) | (1L << (OUT - 37)) | (1L << (VOLATILE - 37)))) != 0)) {
                        {
                            {
                                setState(1137);
                                type_qualifier();
                            }
                        }
                        setState(1142);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1143);
                    abstract_declarator();
                }
                break;
                case 2:
                    _localctx = new AdecRecurseContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1144);
                    match(LPAREN);
                    setState(1145);
                    abstract_declarator();
                    setState(1146);
                    match(RPAREN);
                    setState(1148);
                    _errHandler.sync(this);
                    _alt = 1;
                    do {
                        switch (_alt) {
                            case 1: {
                                {
                                    setState(1147);
                                    abstract_declarator_suffix();
                                }
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(1150);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 123, _ctx);
                    } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                }
                break;
                case 3:
                    _localctx = new AdecConstContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1157);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(1152);
                                match(LBRACK);
                                setState(1154);
                                _la = _input.LA(1);
                                if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (DOTIDENTIFIER - 9)) | (1L << (ENCODE - 9)) | (1L << (PROTOCOL - 9)) | (1L << (SELECTOR - 9)) | (1L << (SUPER - 9)) | (1L << (SELF - 9)) | (1L << (SIZEOF - 9)))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LPAREN - 79)) | (1L << (LBRACK - 79)) | (1L << (AT - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (SUB - 79)) | (1L << (MUL - 79)) | (1L << (BITAND - 79)) | (1L << (CARET - 79)) | (1L << (IDENTIFIER - 79)) | (1L << (CHARACTER_LITERAL - 79)) | (1L << (CSTRING_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (DECIMAL_LITERAL - 79)) | (1L << (OCTAL_LITERAL - 79)) | (1L << (FLOATING_POINT_LITERAL - 79)))) != 0)) {
                                    {
                                        setState(1153);
                                        constant_expression();
                                    }
                                }

                                setState(1156);
                                match(RBRACK);
                            }
                        }
                        setState(1159);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == LBRACK);
                }
                break;
                case 4:
                    _localctx = new AdecNoneContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Abstract_declarator_suffixContext extends ParserRuleContext {
        public Constant_expressionContext constant_expression() {
            return getRuleContext(Constant_expressionContext.class, 0);
        }

        public Parameter_declaration_listContext parameter_declaration_list() {
            return getRuleContext(Parameter_declaration_listContext.class, 0);
        }

        public Abstract_declarator_suffixContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_abstract_declarator_suffix;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterAbstract_declarator_suffix(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitAbstract_declarator_suffix(this);
        }
    }

    public final Abstract_declarator_suffixContext abstract_declarator_suffix() throws RecognitionException {
        Abstract_declarator_suffixContext _localctx = new Abstract_declarator_suffixContext(_ctx, getState());
        enterRule(_localctx, 214, RULE_abstract_declarator_suffix);
        int _la;
        try {
            setState(1174);
            switch (_input.LA(1)) {
                case LBRACK:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1164);
                    match(LBRACK);
                    setState(1166);
                    _la = _input.LA(1);
                    if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (DOTIDENTIFIER - 9)) | (1L << (ENCODE - 9)) | (1L << (PROTOCOL - 9)) | (1L << (SELECTOR - 9)) | (1L << (SUPER - 9)) | (1L << (SELF - 9)) | (1L << (SIZEOF - 9)))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LPAREN - 79)) | (1L << (LBRACK - 79)) | (1L << (AT - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (SUB - 79)) | (1L << (MUL - 79)) | (1L << (BITAND - 79)) | (1L << (CARET - 79)) | (1L << (IDENTIFIER - 79)) | (1L << (CHARACTER_LITERAL - 79)) | (1L << (CSTRING_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (DECIMAL_LITERAL - 79)) | (1L << (OCTAL_LITERAL - 79)) | (1L << (FLOATING_POINT_LITERAL - 79)))) != 0)) {
                        {
                            setState(1165);
                            constant_expression();
                        }
                    }

                    setState(1168);
                    match(RBRACK);
                }
                break;
                case LPAREN:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1169);
                    match(LPAREN);
                    setState(1171);
                    _la = _input.LA(1);
                    if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (AUTO - 34)) | (1L << (BYCOPY - 34)) | (1L << (BYREF - 34)) | (1L << (CHAR - 34)) | (1L << (CONST - 34)) | (1L << (DOUBLE - 34)) | (1L << (ENUM - 34)) | (1L << (EXTERN - 34)) | (1L << (FLOAT - 34)) | (1L << (ID - 34)) | (1L << (IN - 34)) | (1L << (INOUT - 34)) | (1L << (INT - 34)) | (1L << (LONG - 34)) | (1L << (ONEWAY - 34)) | (1L << (OUT - 34)) | (1L << (REGISTER - 34)) | (1L << (SHORT - 34)) | (1L << (SIGNED - 34)) | (1L << (STATIC - 34)) | (1L << (STRUCT - 34)) | (1L << (TYPEDEF - 34)) | (1L << (UNION - 34)) | (1L << (UNSIGNED - 34)) | (1L << (VOID - 34)) | (1L << (VOLATILE - 34)) | (1L << (NS_OPTIONS - 34)) | (1L << (NS_ENUM - 34)) | (1L << (WWEAK - 34)) | (1L << (WUNSAFE_UNRETAINED - 34)))) != 0) || _la == IDENTIFIER) {
                        {
                            setState(1170);
                            parameter_declaration_list();
                        }
                    }

                    setState(1173);
                    match(RPAREN);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Parameter_declaration_listContext extends ParserRuleContext {
        public List<Parameter_declarationContext> parameter_declaration() {
            return getRuleContexts(Parameter_declarationContext.class);
        }

        public Parameter_declarationContext parameter_declaration(int i) {
            return getRuleContext(Parameter_declarationContext.class, i);
        }

        public Parameter_declaration_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parameter_declaration_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterParameter_declaration_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitParameter_declaration_list(this);
        }
    }

    public final Parameter_declaration_listContext parameter_declaration_list() throws RecognitionException {
        Parameter_declaration_listContext _localctx = new Parameter_declaration_listContext(_ctx, getState());
        enterRule(_localctx, 216, RULE_parameter_declaration_list);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1176);
                parameter_declaration();
                setState(1181);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 130, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1177);
                                match(COMMA);
                                setState(1178);
                                parameter_declaration();
                            }
                        }
                    }
                    setState(1183);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 130, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Statement_listContext extends ParserRuleContext {
        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public Statement_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterStatement_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitStatement_list(this);
        }
    }

    public final Statement_listContext statement_list() throws RecognitionException {
        Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
        enterRule(_localctx, 218, RULE_statement_list);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1185);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(1184);
                                statement();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(1187);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 131, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StatementContext extends ParserRuleContext {
        public Labeled_statementContext labeled_statement() {
            return getRuleContext(Labeled_statementContext.class, 0);
        }

        public Semi_statementContext semi_statement() {
            return getRuleContext(Semi_statementContext.class, 0);
        }

        public Compound_statementContext compound_statement() {
            return getRuleContext(Compound_statementContext.class, 0);
        }

        public Selection_statementContext selection_statement() {
            return getRuleContext(Selection_statementContext.class, 0);
        }

        public Jump_statementContext jump_statement() {
            return getRuleContext(Jump_statementContext.class, 0);
        }

        public While_statementContext while_statement() {
            return getRuleContext(While_statementContext.class, 0);
        }

        public For_statementContext for_statement() {
            return getRuleContext(For_statementContext.class, 0);
        }

        public Do_while_statementContext do_while_statement() {
            return getRuleContext(Do_while_statementContext.class, 0);
        }

        public Synchronized_statementContext synchronized_statement() {
            return getRuleContext(Synchronized_statementContext.class, 0);
        }

        public Autorelease_statementContext autorelease_statement() {
            return getRuleContext(Autorelease_statementContext.class, 0);
        }

        public Try_blockContext try_block() {
            return getRuleContext(Try_blockContext.class, 0);
        }

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitStatement(this);
        }
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 220, RULE_statement);
        try {
            setState(1200);
            switch (getInterpreter().adaptivePredict(_input, 132, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1189);
                    labeled_statement();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1190);
                    semi_statement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1191);
                    compound_statement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1192);
                    selection_statement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1193);
                    jump_statement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(1194);
                    while_statement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(1195);
                    for_statement();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(1196);
                    do_while_statement();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(1197);
                    synchronized_statement();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(1198);
                    autorelease_statement();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(1199);
                    try_block();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Semi_statementContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Semi_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_semi_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterSemi_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitSemi_statement(this);
        }
    }

    public final Semi_statementContext semi_statement() throws RecognitionException {
        Semi_statementContext _localctx = new Semi_statementContext(_ctx, getState());
        enterRule(_localctx, 222, RULE_semi_statement);
        try {
            setState(1206);
            switch (_input.LA(1)) {
                case DOTIDENTIFIER:
                case ENCODE:
                case PROTOCOL:
                case SELECTOR:
                case SUPER:
                case SELF:
                case SIZEOF:
                case LPAREN:
                case LBRACK:
                case AT:
                case BANG:
                case TILDE:
                case INC:
                case DEC:
                case SUB:
                case MUL:
                case BITAND:
                case CARET:
                case IDENTIFIER:
                case CHARACTER_LITERAL:
                case CSTRING_LITERAL:
                case STRING_LITERAL:
                case HEX_LITERAL:
                case DECIMAL_LITERAL:
                case OCTAL_LITERAL:
                case FLOATING_POINT_LITERAL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1202);
                    expression();
                    setState(1203);
                    match(SEMI);
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1205);
                    match(SEMI);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Labeled_statementContext extends ParserRuleContext {
        public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_labeled_statement;
        }

        public Labeled_statementContext() {
        }

        public void copyFrom(Labeled_statementContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class DefaultContext extends Labeled_statementContext {
        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public DefaultContext(Labeled_statementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitDefault(this);
        }
    }

    public static class LabelidContext extends Labeled_statementContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public LabelidContext(Labeled_statementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterLabelid(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitLabelid(this);
        }
    }

    public static class CaseContext extends Labeled_statementContext {
        public Constant_expressionContext constant_expression() {
            return getRuleContext(Constant_expressionContext.class, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public CaseContext(Labeled_statementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterCase(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitCase(this);
        }
    }

    public final Labeled_statementContext labeled_statement() throws RecognitionException {
        Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
        enterRule(_localctx, 224, RULE_labeled_statement);
        try {
            setState(1220);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    _localctx = new LabelidContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1208);
                    identifier();
                    setState(1209);
                    match(COLON);
                    setState(1210);
                    statement();
                }
                break;
                case CASE:
                    _localctx = new CaseContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1212);
                    match(CASE);
                    setState(1213);
                    constant_expression();
                    setState(1214);
                    match(COLON);
                    setState(1215);
                    statement();
                }
                break;
                case DEFAULT:
                    _localctx = new DefaultContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1217);
                    match(DEFAULT);
                    setState(1218);
                    match(COLON);
                    setState(1219);
                    statement();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Compound_statementContext extends ParserRuleContext {
        public List<Compound_statement_partsContext> compound_statement_parts() {
            return getRuleContexts(Compound_statement_partsContext.class);
        }

        public Compound_statement_partsContext compound_statement_parts(int i) {
            return getRuleContext(Compound_statement_partsContext.class, i);
        }

        public Compound_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_compound_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterCompound_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitCompound_statement(this);
        }
    }

    public final Compound_statementContext compound_statement() throws RecognitionException {
        Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
        enterRule(_localctx, 226, RULE_compound_statement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1223);
                _la = _input.LA(1);
                if (_la == AUTORELEASEPOOL) {
                    {
                        setState(1222);
                        match(AUTORELEASEPOOL);
                    }
                }

                setState(1225);
                match(LBRACE);
                setState(1229);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOTIDENTIFIER) | (1L << AUTORELEASEPOOL) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SYNCHRONIZED) | (1L << TRY) | (1L << SUPER) | (1L << SELF) | (1L << AUTO) | (1L << BREAK) | (1L << BYCOPY) | (1L << BYREF) | (1L << CASE) | (1L << CHAR) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << FOR) | (1L << ID) | (1L << IF) | (1L << IN) | (1L << INOUT) | (1L << GOTO) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << RETURN) | (1L << SHORT) | (1L << SIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SIZEOF - 64)) | (1L << (STATIC - 64)) | (1L << (STRUCT - 64)) | (1L << (SWITCH - 64)) | (1L << (TYPEDEF - 64)) | (1L << (UNION - 64)) | (1L << (UNSIGNED - 64)) | (1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (BITAND - 64)) | (1L << (CARET - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (IDENTIFIER - 135)) | (1L << (CHARACTER_LITERAL - 135)) | (1L << (CSTRING_LITERAL - 135)) | (1L << (STRING_LITERAL - 135)) | (1L << (HEX_LITERAL - 135)) | (1L << (DECIMAL_LITERAL - 135)) | (1L << (OCTAL_LITERAL - 135)) | (1L << (FLOATING_POINT_LITERAL - 135)))) != 0)) {
                    {
                        {
                            setState(1226);
                            compound_statement_parts();
                        }
                    }
                    setState(1231);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1232);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Compound_statement_partsContext extends ParserRuleContext {
        public DeclarationContext declaration() {
            return getRuleContext(DeclarationContext.class, 0);
        }

        public Statement_listContext statement_list() {
            return getRuleContext(Statement_listContext.class, 0);
        }

        public Compound_statement_partsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_compound_statement_parts;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterCompound_statement_parts(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitCompound_statement_parts(this);
        }
    }

    public final Compound_statement_partsContext compound_statement_parts() throws RecognitionException {
        Compound_statement_partsContext _localctx = new Compound_statement_partsContext(_ctx, getState());
        enterRule(_localctx, 228, RULE_compound_statement_parts);
        try {
            setState(1236);
            switch (getInterpreter().adaptivePredict(_input, 137, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1234);
                    declaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1235);
                    statement_list();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Selection_statementContext extends ParserRuleContext {
        public Selection_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selection_statement;
        }

        public Selection_statementContext() {
        }

        public void copyFrom(Selection_statementContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class IfstmtContext extends Selection_statementContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public IfstmtContext(Selection_statementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterIfstmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitIfstmt(this);
        }
    }

    public static class SwitchContext extends Selection_statementContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public SwitchContext(Selection_statementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterSwitch(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitSwitch(this);
        }
    }

    public final Selection_statementContext selection_statement() throws RecognitionException {
        Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
        enterRule(_localctx, 230, RULE_selection_statement);
        try {
            setState(1253);
            switch (_input.LA(1)) {
                case IF:
                    _localctx = new IfstmtContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1238);
                    match(IF);
                    setState(1239);
                    match(LPAREN);
                    setState(1240);
                    expression();
                    setState(1241);
                    match(RPAREN);
                    setState(1242);
                    statement();
                    setState(1245);
                    switch (getInterpreter().adaptivePredict(_input, 138, _ctx)) {
                        case 1: {
                            setState(1243);
                            match(ELSE);
                            setState(1244);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case SWITCH:
                    _localctx = new SwitchContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1247);
                    match(SWITCH);
                    setState(1248);
                    match(LPAREN);
                    setState(1249);
                    expression();
                    setState(1250);
                    match(RPAREN);
                    setState(1251);
                    statement();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class While_statementContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public While_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_while_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterWhile_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitWhile_statement(this);
        }
    }

    public final While_statementContext while_statement() throws RecognitionException {
        While_statementContext _localctx = new While_statementContext(_ctx, getState());
        enterRule(_localctx, 232, RULE_while_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1255);
                match(WHILE);
                setState(1256);
                match(LPAREN);
                setState(1257);
                expression();
                setState(1258);
                match(RPAREN);
                setState(1259);
                statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class For_statementContext extends ParserRuleContext {
        public For_completeContext for_complete() {
            return getRuleContext(For_completeContext.class, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public For_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_for_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterFor_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitFor_statement(this);
        }
    }

    public final For_statementContext for_statement() throws RecognitionException {
        For_statementContext _localctx = new For_statementContext(_ctx, getState());
        enterRule(_localctx, 234, RULE_for_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1261);
                match(FOR);
                setState(1262);
                match(LPAREN);
                setState(1263);
                for_complete();
                setState(1264);
                statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Do_while_statementContext extends ParserRuleContext {
        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_do_while_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterDo_while_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitDo_while_statement(this);
        }
    }

    public final Do_while_statementContext do_while_statement() throws RecognitionException {
        Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
        enterRule(_localctx, 236, RULE_do_while_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1266);
                match(DO);
                setState(1267);
                statement();
                setState(1268);
                match(WHILE);
                setState(1269);
                match(LPAREN);
                setState(1270);
                expression();
                setState(1271);
                match(RPAREN);
                setState(1272);
                match(SEMI);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class For_completeContext extends ParserRuleContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public Declaration_minus_semiContext declaration_minus_semi() {
            return getRuleContext(Declaration_minus_semiContext.class, 0);
        }

        public For_declaration_completeContext for_declaration_complete() {
            return getRuleContext(For_declaration_completeContext.class, 0);
        }

        public For_completeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_for_complete;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterFor_complete(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitFor_complete(this);
        }
    }

    public final For_completeContext for_complete() throws RecognitionException {
        For_completeContext _localctx = new For_completeContext(_ctx, getState());
        enterRule(_localctx, 238, RULE_for_complete);
        int _la;
        try {
            setState(1297);
            switch (getInterpreter().adaptivePredict(_input, 144, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1274);
                    expression();
                    setState(1275);
                    match(SEMI);
                    setState(1277);
                    _la = _input.LA(1);
                    if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (DOTIDENTIFIER - 9)) | (1L << (ENCODE - 9)) | (1L << (PROTOCOL - 9)) | (1L << (SELECTOR - 9)) | (1L << (SUPER - 9)) | (1L << (SELF - 9)) | (1L << (SIZEOF - 9)))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LPAREN - 79)) | (1L << (LBRACK - 79)) | (1L << (AT - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (SUB - 79)) | (1L << (MUL - 79)) | (1L << (BITAND - 79)) | (1L << (CARET - 79)) | (1L << (IDENTIFIER - 79)) | (1L << (CHARACTER_LITERAL - 79)) | (1L << (CSTRING_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (DECIMAL_LITERAL - 79)) | (1L << (OCTAL_LITERAL - 79)) | (1L << (FLOATING_POINT_LITERAL - 79)))) != 0)) {
                        {
                            setState(1276);
                            expression();
                        }
                    }

                    setState(1279);
                    match(SEMI);
                    setState(1281);
                    _la = _input.LA(1);
                    if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (DOTIDENTIFIER - 9)) | (1L << (ENCODE - 9)) | (1L << (PROTOCOL - 9)) | (1L << (SELECTOR - 9)) | (1L << (SUPER - 9)) | (1L << (SELF - 9)) | (1L << (SIZEOF - 9)))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LPAREN - 79)) | (1L << (LBRACK - 79)) | (1L << (AT - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (SUB - 79)) | (1L << (MUL - 79)) | (1L << (BITAND - 79)) | (1L << (CARET - 79)) | (1L << (IDENTIFIER - 79)) | (1L << (CHARACTER_LITERAL - 79)) | (1L << (CSTRING_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (DECIMAL_LITERAL - 79)) | (1L << (OCTAL_LITERAL - 79)) | (1L << (FLOATING_POINT_LITERAL - 79)))) != 0)) {
                        {
                            setState(1280);
                            expression();
                        }
                    }

                    setState(1283);
                    match(RPAREN);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1285);
                    match(SEMI);
                    setState(1287);
                    _la = _input.LA(1);
                    if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (DOTIDENTIFIER - 9)) | (1L << (ENCODE - 9)) | (1L << (PROTOCOL - 9)) | (1L << (SELECTOR - 9)) | (1L << (SUPER - 9)) | (1L << (SELF - 9)) | (1L << (SIZEOF - 9)))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LPAREN - 79)) | (1L << (LBRACK - 79)) | (1L << (AT - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (SUB - 79)) | (1L << (MUL - 79)) | (1L << (BITAND - 79)) | (1L << (CARET - 79)) | (1L << (IDENTIFIER - 79)) | (1L << (CHARACTER_LITERAL - 79)) | (1L << (CSTRING_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (DECIMAL_LITERAL - 79)) | (1L << (OCTAL_LITERAL - 79)) | (1L << (FLOATING_POINT_LITERAL - 79)))) != 0)) {
                        {
                            setState(1286);
                            expression();
                        }
                    }

                    setState(1289);
                    match(SEMI);
                    setState(1291);
                    _la = _input.LA(1);
                    if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (DOTIDENTIFIER - 9)) | (1L << (ENCODE - 9)) | (1L << (PROTOCOL - 9)) | (1L << (SELECTOR - 9)) | (1L << (SUPER - 9)) | (1L << (SELF - 9)) | (1L << (SIZEOF - 9)))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LPAREN - 79)) | (1L << (LBRACK - 79)) | (1L << (AT - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (SUB - 79)) | (1L << (MUL - 79)) | (1L << (BITAND - 79)) | (1L << (CARET - 79)) | (1L << (IDENTIFIER - 79)) | (1L << (CHARACTER_LITERAL - 79)) | (1L << (CSTRING_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (DECIMAL_LITERAL - 79)) | (1L << (OCTAL_LITERAL - 79)) | (1L << (FLOATING_POINT_LITERAL - 79)))) != 0)) {
                        {
                            setState(1290);
                            expression();
                        }
                    }

                    setState(1293);
                    match(RPAREN);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1294);
                    declaration_minus_semi();
                    setState(1295);
                    for_declaration_complete();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class For_declaration_completeContext extends ParserRuleContext {
        public For_declaration_completeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_for_declaration_complete;
        }

        public For_declaration_completeContext() {
        }

        public void copyFrom(For_declaration_completeContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class Forcomplete2Context extends For_declaration_completeContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Forcomplete2Context(For_declaration_completeContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterForcomplete2(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitForcomplete2(this);
        }
    }

    public static class Forcomplete1Context extends For_declaration_completeContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public Forcomplete1Context(For_declaration_completeContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterForcomplete1(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitForcomplete1(this);
        }
    }

    public final For_declaration_completeContext for_declaration_complete() throws RecognitionException {
        For_declaration_completeContext _localctx = new For_declaration_completeContext(_ctx, getState());
        enterRule(_localctx, 240, RULE_for_declaration_complete);
        int _la;
        try {
            setState(1312);
            switch (_input.LA(1)) {
                case SEMI:
                    _localctx = new Forcomplete1Context(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1299);
                    match(SEMI);
                    setState(1301);
                    _la = _input.LA(1);
                    if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (DOTIDENTIFIER - 9)) | (1L << (ENCODE - 9)) | (1L << (PROTOCOL - 9)) | (1L << (SELECTOR - 9)) | (1L << (SUPER - 9)) | (1L << (SELF - 9)) | (1L << (SIZEOF - 9)))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LPAREN - 79)) | (1L << (LBRACK - 79)) | (1L << (AT - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (SUB - 79)) | (1L << (MUL - 79)) | (1L << (BITAND - 79)) | (1L << (CARET - 79)) | (1L << (IDENTIFIER - 79)) | (1L << (CHARACTER_LITERAL - 79)) | (1L << (CSTRING_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (DECIMAL_LITERAL - 79)) | (1L << (OCTAL_LITERAL - 79)) | (1L << (FLOATING_POINT_LITERAL - 79)))) != 0)) {
                        {
                            setState(1300);
                            expression();
                        }
                    }

                    setState(1303);
                    match(SEMI);
                    setState(1305);
                    _la = _input.LA(1);
                    if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (DOTIDENTIFIER - 9)) | (1L << (ENCODE - 9)) | (1L << (PROTOCOL - 9)) | (1L << (SELECTOR - 9)) | (1L << (SUPER - 9)) | (1L << (SELF - 9)) | (1L << (SIZEOF - 9)))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LPAREN - 79)) | (1L << (LBRACK - 79)) | (1L << (AT - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (SUB - 79)) | (1L << (MUL - 79)) | (1L << (BITAND - 79)) | (1L << (CARET - 79)) | (1L << (IDENTIFIER - 79)) | (1L << (CHARACTER_LITERAL - 79)) | (1L << (CSTRING_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (DECIMAL_LITERAL - 79)) | (1L << (OCTAL_LITERAL - 79)) | (1L << (FLOATING_POINT_LITERAL - 79)))) != 0)) {
                        {
                            setState(1304);
                            expression();
                        }
                    }

                    setState(1307);
                    match(RPAREN);
                }
                break;
                case IN:
                    _localctx = new Forcomplete2Context(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1308);
                    match(IN);
                    setState(1309);
                    expression();
                    setState(1310);
                    match(RPAREN);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Jump_statementContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Jump_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_jump_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterJump_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitJump_statement(this);
        }
    }

    public final Jump_statementContext jump_statement() throws RecognitionException {
        Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
        enterRule(_localctx, 242, RULE_jump_statement);
        int _la;
        try {
            setState(1327);
            switch (_input.LA(1)) {
                case GOTO:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1314);
                    match(GOTO);
                    setState(1315);
                    identifier();
                    setState(1316);
                    match(SEMI);
                }
                break;
                case CONTINUE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1318);
                    match(CONTINUE);
                    setState(1319);
                    match(SEMI);
                }
                break;
                case BREAK:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1320);
                    match(BREAK);
                    setState(1321);
                    match(SEMI);
                }
                break;
                case RETURN:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1322);
                    match(RETURN);
                    setState(1324);
                    _la = _input.LA(1);
                    if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (DOTIDENTIFIER - 9)) | (1L << (ENCODE - 9)) | (1L << (PROTOCOL - 9)) | (1L << (SELECTOR - 9)) | (1L << (SUPER - 9)) | (1L << (SELF - 9)) | (1L << (SIZEOF - 9)))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LPAREN - 79)) | (1L << (LBRACK - 79)) | (1L << (AT - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (SUB - 79)) | (1L << (MUL - 79)) | (1L << (BITAND - 79)) | (1L << (CARET - 79)) | (1L << (IDENTIFIER - 79)) | (1L << (CHARACTER_LITERAL - 79)) | (1L << (CSTRING_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (DECIMAL_LITERAL - 79)) | (1L << (OCTAL_LITERAL - 79)) | (1L << (FLOATING_POINT_LITERAL - 79)))) != 0)) {
                        {
                            setState(1323);
                            expression();
                        }
                    }

                    setState(1326);
                    match(SEMI);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Setter_callContext extends ParserRuleContext {
        public DotidentifierContext dotidentifier() {
            return getRuleContext(DotidentifierContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Setter_callContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_setter_call;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterSetter_call(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitSetter_call(this);
        }
    }

    public final Setter_callContext setter_call() throws RecognitionException {
        Setter_callContext _localctx = new Setter_callContext(_ctx, getState());
        enterRule(_localctx, 244, RULE_setter_call);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1329);
                dotidentifier();
                setState(1330);
                match(ASSIGN);
                setState(1331);
                expression();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Getter_callContext extends ParserRuleContext {
        public DotidentifierContext dotidentifier() {
            return getRuleContext(DotidentifierContext.class, 0);
        }

        public Getter_callContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_getter_call;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterGetter_call(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitGetter_call(this);
        }
    }

    public final Getter_callContext getter_call() throws RecognitionException {
        Getter_callContext _localctx = new Getter_callContext(_ctx, getState());
        enterRule(_localctx, 246, RULE_getter_call);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1333);
                dotidentifier();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DotidentifierContext extends ParserRuleContext {
        public TerminalNode DOTIDENTIFIER() {
            return getToken(ObjCParser.DOTIDENTIFIER, 0);
        }

        public DotidentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dotidentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterDotidentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitDotidentifier(this);
        }
    }

    public final DotidentifierContext dotidentifier() throws RecognitionException {
        DotidentifierContext _localctx = new DotidentifierContext(_ctx, getState());
        enterRule(_localctx, 248, RULE_dotidentifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1335);
                match(DOTIDENTIFIER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionContext extends ParserRuleContext {
        public List<Assignment_expressionContext> assignment_expression() {
            return getRuleContexts(Assignment_expressionContext.class);
        }

        public Assignment_expressionContext assignment_expression(int i) {
            return getRuleContext(Assignment_expressionContext.class, i);
        }

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitExpression(this);
        }
    }

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 250, RULE_expression);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1337);
                assignment_expression();
                setState(1342);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 150, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1338);
                                match(COMMA);
                                setState(1339);
                                assignment_expression();
                            }
                        }
                    }
                    setState(1344);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 150, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Assignment_expressionContext extends ParserRuleContext {
        public Conditional_expressionContext conditional_expression() {
            return getRuleContext(Conditional_expressionContext.class, 0);
        }

        public Unary_expressionContext unary_expression() {
            return getRuleContext(Unary_expressionContext.class, 0);
        }

        public Assignment_operatorContext assignment_operator() {
            return getRuleContext(Assignment_operatorContext.class, 0);
        }

        public Assignment_expressionContext assignment_expression() {
            return getRuleContext(Assignment_expressionContext.class, 0);
        }

        public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterAssignment_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitAssignment_expression(this);
        }
    }

    public final Assignment_expressionContext assignment_expression() throws RecognitionException {
        Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
        enterRule(_localctx, 252, RULE_assignment_expression);
        try {
            setState(1350);
            switch (getInterpreter().adaptivePredict(_input, 151, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1345);
                    conditional_expression();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1346);
                    unary_expression();
                    setState(1347);
                    assignment_operator();
                    setState(1348);
                    assignment_expression();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Assignment_operatorContext extends ParserRuleContext {
        public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment_operator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterAssignment_operator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitAssignment_operator(this);
        }
    }

    public final Assignment_operatorContext assignment_operator() throws RecognitionException {
        Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
        enterRule(_localctx, 254, RULE_assignment_operator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1352);
                _la = _input.LA(1);
                if (!(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (ASSIGN - 90)) | (1L << (ADD_ASSIGN - 90)) | (1L << (SUB_ASSIGN - 90)) | (1L << (MUL_ASSIGN - 90)) | (1L << (DIV_ASSIGN - 90)) | (1L << (AND_ASSIGN - 90)) | (1L << (OR_ASSIGN - 90)) | (1L << (XOR_ASSIGN - 90)) | (1L << (MOD_ASSIGN - 90)) | (1L << (LSHIFT_ASSIGN - 90)) | (1L << (RSHIFT_ASSIGN - 90)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Conditional_expressionContext extends ParserRuleContext {
        public List<Logical_or_expressionContext> logical_or_expression() {
            return getRuleContexts(Logical_or_expressionContext.class);
        }

        public Logical_or_expressionContext logical_or_expression(int i) {
            return getRuleContext(Logical_or_expressionContext.class, i);
        }

        public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_conditional_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterConditional_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitConditional_expression(this);
        }
    }

    public final Conditional_expressionContext conditional_expression() throws RecognitionException {
        Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
        enterRule(_localctx, 256, RULE_conditional_expression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1354);
                logical_or_expression();
                setState(1364);
                switch (getInterpreter().adaptivePredict(_input, 153, _ctx)) {
                    case 1: {
                        setState(1355);
                        match(QUESTION);
                        setState(1359);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (DOTIDENTIFIER - 9)) | (1L << (ENCODE - 9)) | (1L << (PROTOCOL - 9)) | (1L << (SELECTOR - 9)) | (1L << (SUPER - 9)) | (1L << (SELF - 9)) | (1L << (SIZEOF - 9)))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LPAREN - 79)) | (1L << (LBRACK - 79)) | (1L << (AT - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (SUB - 79)) | (1L << (MUL - 79)) | (1L << (BITAND - 79)) | (1L << (CARET - 79)) | (1L << (IDENTIFIER - 79)) | (1L << (CHARACTER_LITERAL - 79)) | (1L << (CSTRING_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (DECIMAL_LITERAL - 79)) | (1L << (OCTAL_LITERAL - 79)) | (1L << (FLOATING_POINT_LITERAL - 79)))) != 0)) {
                            {
                                {
                                    setState(1356);
                                    logical_or_expression();
                                }
                            }
                            setState(1361);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(1362);
                        match(COLON);
                        setState(1363);
                        logical_or_expression();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Constant_expressionContext extends ParserRuleContext {
        public Conditional_expressionContext conditional_expression() {
            return getRuleContext(Conditional_expressionContext.class, 0);
        }

        public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constant_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterConstant_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitConstant_expression(this);
        }
    }

    public final Constant_expressionContext constant_expression() throws RecognitionException {
        Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
        enterRule(_localctx, 258, RULE_constant_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1366);
                conditional_expression();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Logical_or_expressionContext extends ParserRuleContext {
        public List<Logical_and_expressionContext> logical_and_expression() {
            return getRuleContexts(Logical_and_expressionContext.class);
        }

        public Logical_and_expressionContext logical_and_expression(int i) {
            return getRuleContext(Logical_and_expressionContext.class, i);
        }

        public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_logical_or_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterLogical_or_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitLogical_or_expression(this);
        }
    }

    public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
        Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, getState());
        enterRule(_localctx, 260, RULE_logical_or_expression);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1368);
                logical_and_expression();
                setState(1373);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 154, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1369);
                                match(OR);
                                setState(1370);
                                logical_and_expression();
                            }
                        }
                    }
                    setState(1375);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 154, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Logical_and_expressionContext extends ParserRuleContext {
        public List<Inclusive_or_expressionContext> inclusive_or_expression() {
            return getRuleContexts(Inclusive_or_expressionContext.class);
        }

        public Inclusive_or_expressionContext inclusive_or_expression(int i) {
            return getRuleContext(Inclusive_or_expressionContext.class, i);
        }

        public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_logical_and_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterLogical_and_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitLogical_and_expression(this);
        }
    }

    public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
        Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, getState());
        enterRule(_localctx, 262, RULE_logical_and_expression);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1376);
                inclusive_or_expression();
                setState(1381);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 155, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1377);
                                match(AND);
                                setState(1378);
                                inclusive_or_expression();
                            }
                        }
                    }
                    setState(1383);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 155, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Inclusive_or_expressionContext extends ParserRuleContext {
        public List<Exclusive_or_expressionContext> exclusive_or_expression() {
            return getRuleContexts(Exclusive_or_expressionContext.class);
        }

        public Exclusive_or_expressionContext exclusive_or_expression(int i) {
            return getRuleContext(Exclusive_or_expressionContext.class, i);
        }

        public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_inclusive_or_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterInclusive_or_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitInclusive_or_expression(this);
        }
    }

    public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
        Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
        enterRule(_localctx, 264, RULE_inclusive_or_expression);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1384);
                exclusive_or_expression();
                setState(1389);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 156, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1385);
                                match(BITOR);
                                setState(1386);
                                exclusive_or_expression();
                            }
                        }
                    }
                    setState(1391);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 156, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Exclusive_or_expressionContext extends ParserRuleContext {
        public List<And_expressionContext> and_expression() {
            return getRuleContexts(And_expressionContext.class);
        }

        public And_expressionContext and_expression(int i) {
            return getRuleContext(And_expressionContext.class, i);
        }

        public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exclusive_or_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterExclusive_or_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitExclusive_or_expression(this);
        }
    }

    public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
        Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
        enterRule(_localctx, 266, RULE_exclusive_or_expression);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1392);
                and_expression();
                setState(1397);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 157, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1393);
                                match(CARET);
                                setState(1394);
                                and_expression();
                            }
                        }
                    }
                    setState(1399);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 157, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class And_expressionContext extends ParserRuleContext {
        public List<Equality_expressionContext> equality_expression() {
            return getRuleContexts(Equality_expressionContext.class);
        }

        public Equality_expressionContext equality_expression(int i) {
            return getRuleContext(Equality_expressionContext.class, i);
        }

        public And_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_and_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterAnd_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitAnd_expression(this);
        }
    }

    public final And_expressionContext and_expression() throws RecognitionException {
        And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
        enterRule(_localctx, 268, RULE_and_expression);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1400);
                equality_expression();
                setState(1405);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 158, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1401);
                                match(BITAND);
                                setState(1402);
                                equality_expression();
                            }
                        }
                    }
                    setState(1407);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 158, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Equality_expressionContext extends ParserRuleContext {
        public List<Relational_expressionContext> relational_expression() {
            return getRuleContexts(Relational_expressionContext.class);
        }

        public Relational_expressionContext relational_expression(int i) {
            return getRuleContext(Relational_expressionContext.class, i);
        }

        public List<Equality_opContext> equality_op() {
            return getRuleContexts(Equality_opContext.class);
        }

        public Equality_opContext equality_op(int i) {
            return getRuleContext(Equality_opContext.class, i);
        }

        public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_equality_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterEquality_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitEquality_expression(this);
        }
    }

    public final Equality_expressionContext equality_expression() throws RecognitionException {
        Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
        enterRule(_localctx, 270, RULE_equality_expression);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1408);
                relational_expression();
                setState(1414);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 159, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1409);
                                equality_op();
                                setState(1410);
                                relational_expression();
                            }
                        }
                    }
                    setState(1416);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 159, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Equality_opContext extends ParserRuleContext {
        public Equality_opContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_equality_op;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterEquality_op(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitEquality_op(this);
        }
    }

    public final Equality_opContext equality_op() throws RecognitionException {
        Equality_opContext _localctx = new Equality_opContext(_ctx, getState());
        enterRule(_localctx, 272, RULE_equality_op);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1417);
                _la = _input.LA(1);
                if (!(_la == EQUAL || _la == NOTEQUAL)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Relational_expressionContext extends ParserRuleContext {
        public List<Shift_expressionContext> shift_expression() {
            return getRuleContexts(Shift_expressionContext.class);
        }

        public Shift_expressionContext shift_expression(int i) {
            return getRuleContext(Shift_expressionContext.class, i);
        }

        public List<Relational_opContext> relational_op() {
            return getRuleContexts(Relational_opContext.class);
        }

        public Relational_opContext relational_op(int i) {
            return getRuleContext(Relational_opContext.class, i);
        }

        public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_relational_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterRelational_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitRelational_expression(this);
        }
    }

    public final Relational_expressionContext relational_expression() throws RecognitionException {
        Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
        enterRule(_localctx, 274, RULE_relational_expression);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1419);
                shift_expression();
                setState(1425);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 160, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1420);
                                relational_op();
                                setState(1421);
                                shift_expression();
                            }
                        }
                    }
                    setState(1427);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 160, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Relational_opContext extends ParserRuleContext {
        public Relational_opContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_relational_op;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterRelational_op(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitRelational_op(this);
        }
    }

    public final Relational_opContext relational_op() throws RecognitionException {
        Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
        enterRule(_localctx, 276, RULE_relational_op);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1428);
                _la = _input.LA(1);
                if (!(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (GT - 91)) | (1L << (LT - 91)) | (1L << (LE - 91)) | (1L << (GE - 91)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Shift_expressionContext extends ParserRuleContext {
        public List<Additive_expressionContext> additive_expression() {
            return getRuleContexts(Additive_expressionContext.class);
        }

        public Additive_expressionContext additive_expression(int i) {
            return getRuleContext(Additive_expressionContext.class, i);
        }

        public List<Shift_opContext> shift_op() {
            return getRuleContexts(Shift_opContext.class);
        }

        public Shift_opContext shift_op(int i) {
            return getRuleContext(Shift_opContext.class, i);
        }

        public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_shift_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterShift_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitShift_expression(this);
        }
    }

    public final Shift_expressionContext shift_expression() throws RecognitionException {
        Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
        enterRule(_localctx, 278, RULE_shift_expression);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1430);
                additive_expression();
                setState(1436);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 161, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1431);
                                shift_op();
                                setState(1432);
                                additive_expression();
                            }
                        }
                    }
                    setState(1438);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 161, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Shift_opContext extends ParserRuleContext {
        public Shift_opContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_shift_op;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterShift_op(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitShift_op(this);
        }
    }

    public final Shift_opContext shift_op() throws RecognitionException {
        Shift_opContext _localctx = new Shift_opContext(_ctx, getState());
        enterRule(_localctx, 280, RULE_shift_op);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1439);
                _la = _input.LA(1);
                if (!(_la == SHIFT_R || _la == SHIFT_L)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Additive_expressionContext extends ParserRuleContext {
        public List<Multiplicative_expressionContext> multiplicative_expression() {
            return getRuleContexts(Multiplicative_expressionContext.class);
        }

        public Multiplicative_expressionContext multiplicative_expression(int i) {
            return getRuleContext(Multiplicative_expressionContext.class, i);
        }

        public List<Add_opContext> add_op() {
            return getRuleContexts(Add_opContext.class);
        }

        public Add_opContext add_op(int i) {
            return getRuleContext(Add_opContext.class, i);
        }

        public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_additive_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterAdditive_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitAdditive_expression(this);
        }
    }

    public final Additive_expressionContext additive_expression() throws RecognitionException {
        Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
        enterRule(_localctx, 282, RULE_additive_expression);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1441);
                multiplicative_expression();
                setState(1447);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 162, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1442);
                                add_op();
                                setState(1443);
                                multiplicative_expression();
                            }
                        }
                    }
                    setState(1449);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 162, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Add_opContext extends ParserRuleContext {
        public Add_opContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_add_op;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterAdd_op(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitAdd_op(this);
        }
    }

    public final Add_opContext add_op() throws RecognitionException {
        Add_opContext _localctx = new Add_opContext(_ctx, getState());
        enterRule(_localctx, 284, RULE_add_op);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1450);
                _la = _input.LA(1);
                if (!(_la == ADD || _la == SUB)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Multiplicative_expressionContext extends ParserRuleContext {
        public List<Cast_expressionContext> cast_expression() {
            return getRuleContexts(Cast_expressionContext.class);
        }

        public Cast_expressionContext cast_expression(int i) {
            return getRuleContext(Cast_expressionContext.class, i);
        }

        public List<Multiply_opContext> multiply_op() {
            return getRuleContexts(Multiply_opContext.class);
        }

        public Multiply_opContext multiply_op(int i) {
            return getRuleContext(Multiply_opContext.class, i);
        }

        public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_multiplicative_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterMultiplicative_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitMultiplicative_expression(this);
        }
    }

    public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
        Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
        enterRule(_localctx, 286, RULE_multiplicative_expression);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1452);
                cast_expression();
                setState(1458);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 163, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1453);
                                multiply_op();
                                setState(1454);
                                cast_expression();
                            }
                        }
                    }
                    setState(1460);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 163, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Multiply_opContext extends ParserRuleContext {
        public Multiply_opContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_multiply_op;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterMultiply_op(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitMultiply_op(this);
        }
    }

    public final Multiply_opContext multiply_op() throws RecognitionException {
        Multiply_opContext _localctx = new Multiply_opContext(_ctx, getState());
        enterRule(_localctx, 288, RULE_multiply_op);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1461);
                _la = _input.LA(1);
                if (!(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (MUL - 107)) | (1L << (DIV - 107)) | (1L << (MOD - 107)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Cast_expressionContext extends ParserRuleContext {
        public Type_nameContext type_name() {
            return getRuleContext(Type_nameContext.class, 0);
        }

        public Cast_expressionContext cast_expression() {
            return getRuleContext(Cast_expressionContext.class, 0);
        }

        public Unary_expressionContext unary_expression() {
            return getRuleContext(Unary_expressionContext.class, 0);
        }

        public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cast_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterCast_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitCast_expression(this);
        }
    }

    public final Cast_expressionContext cast_expression() throws RecognitionException {
        Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
        enterRule(_localctx, 290, RULE_cast_expression);
        try {
            setState(1469);
            switch (getInterpreter().adaptivePredict(_input, 164, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1463);
                    match(LPAREN);
                    setState(1464);
                    type_name();
                    setState(1465);
                    match(RPAREN);
                    setState(1466);
                    cast_expression();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1468);
                    unary_expression();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Unary_expressionContext extends ParserRuleContext {
        public Postfix_expressionContext postfix_expression() {
            return getRuleContext(Postfix_expressionContext.class, 0);
        }

        public Unary_expressionContext unary_expression() {
            return getRuleContext(Unary_expressionContext.class, 0);
        }

        public Unary_operatorContext unary_operator() {
            return getRuleContext(Unary_operatorContext.class, 0);
        }

        public Cast_expressionContext cast_expression() {
            return getRuleContext(Cast_expressionContext.class, 0);
        }

        public Type_nameContext type_name() {
            return getRuleContext(Type_nameContext.class, 0);
        }

        public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_unary_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterUnary_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitUnary_expression(this);
        }
    }

    public final Unary_expressionContext unary_expression() throws RecognitionException {
        Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
        enterRule(_localctx, 292, RULE_unary_expression);
        try {
            setState(1487);
            switch (_input.LA(1)) {
                case DOTIDENTIFIER:
                case ENCODE:
                case PROTOCOL:
                case SELECTOR:
                case SUPER:
                case SELF:
                case LPAREN:
                case LBRACK:
                case AT:
                case CARET:
                case IDENTIFIER:
                case CHARACTER_LITERAL:
                case CSTRING_LITERAL:
                case STRING_LITERAL:
                case HEX_LITERAL:
                case DECIMAL_LITERAL:
                case OCTAL_LITERAL:
                case FLOATING_POINT_LITERAL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1471);
                    postfix_expression();
                }
                break;
                case INC:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1472);
                    match(INC);
                    setState(1473);
                    unary_expression();
                }
                break;
                case DEC:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1474);
                    match(DEC);
                    setState(1475);
                    unary_expression();
                }
                break;
                case BANG:
                case TILDE:
                case SUB:
                case MUL:
                case BITAND:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1476);
                    unary_operator();
                    setState(1477);
                    cast_expression();
                }
                break;
                case SIZEOF:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1479);
                    match(SIZEOF);
                    setState(1485);
                    switch (getInterpreter().adaptivePredict(_input, 165, _ctx)) {
                        case 1: {
                            setState(1480);
                            match(LPAREN);
                            setState(1481);
                            type_name();
                            setState(1482);
                            match(RPAREN);
                        }
                        break;
                        case 2: {
                            setState(1484);
                            unary_expression();
                        }
                        break;
                    }
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Unary_operatorContext extends ParserRuleContext {
        public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_unary_operator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterUnary_operator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitUnary_operator(this);
        }
    }

    public final Unary_operatorContext unary_operator() throws RecognitionException {
        Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
        enterRule(_localctx, 294, RULE_unary_operator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1489);
                _la = _input.LA(1);
                if (!(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (BANG - 93)) | (1L << (TILDE - 93)) | (1L << (SUB - 93)) | (1L << (MUL - 93)) | (1L << (BITAND - 93)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Postfix_expressionContext extends ParserRuleContext {
        public Primary_expressionContext primary_expression() {
            return getRuleContext(Primary_expressionContext.class, 0);
        }

        public List<Postfix_expression_completeContext> postfix_expression_complete() {
            return getRuleContexts(Postfix_expression_completeContext.class);
        }

        public Postfix_expression_completeContext postfix_expression_complete(int i) {
            return getRuleContext(Postfix_expression_completeContext.class, i);
        }

        public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_postfix_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterPostfix_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitPostfix_expression(this);
        }
    }

    public final Postfix_expressionContext postfix_expression() throws RecognitionException {
        Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, getState());
        enterRule(_localctx, 296, RULE_postfix_expression);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1491);
                primary_expression();
                setState(1495);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 167, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1492);
                                postfix_expression_complete();
                            }
                        }
                    }
                    setState(1497);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 167, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Postfix_expression_completeContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Argument_expression_listContext argument_expression_list() {
            return getRuleContext(Argument_expression_listContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public Postfix_expression_completeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_postfix_expression_complete;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterPostfix_expression_complete(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitPostfix_expression_complete(this);
        }
    }

    public final Postfix_expression_completeContext postfix_expression_complete() throws RecognitionException {
        Postfix_expression_completeContext _localctx = new Postfix_expression_completeContext(_ctx, getState());
        enterRule(_localctx, 298, RULE_postfix_expression_complete);
        int _la;
        try {
            setState(1513);
            switch (_input.LA(1)) {
                case LBRACK:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1498);
                    match(LBRACK);
                    setState(1499);
                    expression();
                    setState(1500);
                    match(RBRACK);
                }
                break;
                case LPAREN:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1502);
                    match(LPAREN);
                    setState(1504);
                    _la = _input.LA(1);
                    if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (DOTIDENTIFIER - 9)) | (1L << (ENCODE - 9)) | (1L << (PROTOCOL - 9)) | (1L << (SELECTOR - 9)) | (1L << (SUPER - 9)) | (1L << (SELF - 9)) | (1L << (SIZEOF - 9)))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LPAREN - 79)) | (1L << (LBRACK - 79)) | (1L << (AT - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (SUB - 79)) | (1L << (MUL - 79)) | (1L << (BITAND - 79)) | (1L << (CARET - 79)) | (1L << (IDENTIFIER - 79)) | (1L << (CHARACTER_LITERAL - 79)) | (1L << (CSTRING_LITERAL - 79)) | (1L << (STRING_LITERAL - 79)) | (1L << (HEX_LITERAL - 79)) | (1L << (DECIMAL_LITERAL - 79)) | (1L << (OCTAL_LITERAL - 79)) | (1L << (FLOATING_POINT_LITERAL - 79)))) != 0)) {
                        {
                            setState(1503);
                            argument_expression_list();
                        }
                    }

                    setState(1506);
                    match(RPAREN);
                }
                break;
                case DOT:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1507);
                    match(DOT);
                    setState(1508);
                    identifier();
                }
                break;
                case STRUCTACCESS:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1509);
                    match(STRUCTACCESS);
                    setState(1510);
                    identifier();
                }
                break;
                case INC:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1511);
                    match(INC);
                }
                break;
                case DEC:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(1512);
                    match(DEC);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CommentContext extends ParserRuleContext {
        public TerminalNode COMMENT() {
            return getToken(ObjCParser.COMMENT, 0);
        }

        public TerminalNode LINE_COMMENT() {
            return getToken(ObjCParser.LINE_COMMENT, 0);
        }

        public CommentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_comment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterComment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitComment(this);
        }
    }

    public final CommentContext comment() throws RecognitionException {
        CommentContext _localctx = new CommentContext(_ctx, getState());
        enterRule(_localctx, 300, RULE_comment);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1515);
                _la = _input.LA(1);
                if (!(_la == COMMENT || _la == LINE_COMMENT)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Argument_expression_listContext extends ParserRuleContext {
        public List<Assignment_expressionContext> assignment_expression() {
            return getRuleContexts(Assignment_expressionContext.class);
        }

        public Assignment_expressionContext assignment_expression(int i) {
            return getRuleContext(Assignment_expressionContext.class, i);
        }

        public Argument_expression_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_argument_expression_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterArgument_expression_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitArgument_expression_list(this);
        }
    }

    public final Argument_expression_listContext argument_expression_list() throws RecognitionException {
        Argument_expression_listContext _localctx = new Argument_expression_listContext(_ctx, getState());
        enterRule(_localctx, 302, RULE_argument_expression_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1517);
                assignment_expression();
                setState(1522);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(1518);
                            match(COMMA);
                            setState(1519);
                            assignment_expression();
                        }
                    }
                    setState(1524);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IdentifierContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(ObjCParser.IDENTIFIER, 0);
        }

        public IdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitIdentifier(this);
        }
    }

    public final IdentifierContext identifier() throws RecognitionException {
        IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
        enterRule(_localctx, 304, RULE_identifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1525);
                match(IDENTIFIER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Code_blockContext extends ParserRuleContext {
        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public Code_blockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_code_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterCode_block(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitCode_block(this);
        }
    }

    public final Code_blockContext code_block() throws RecognitionException {
        Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
        enterRule(_localctx, 306, RULE_code_block);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1527);
                match(CARET);
                setState(1528);
                statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ConstantContext extends ParserRuleContext {
        public TerminalNode DECIMAL_LITERAL() {
            return getToken(ObjCParser.DECIMAL_LITERAL, 0);
        }

        public TerminalNode HEX_LITERAL() {
            return getToken(ObjCParser.HEX_LITERAL, 0);
        }

        public TerminalNode OCTAL_LITERAL() {
            return getToken(ObjCParser.OCTAL_LITERAL, 0);
        }

        public TerminalNode CHARACTER_LITERAL() {
            return getToken(ObjCParser.CHARACTER_LITERAL, 0);
        }

        public TerminalNode FLOATING_POINT_LITERAL() {
            return getToken(ObjCParser.FLOATING_POINT_LITERAL, 0);
        }

        public ConstantContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constant;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).enterConstant(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ObjCListener) ((ObjCListener) listener).exitConstant(this);
        }
    }

    public final ConstantContext constant() throws RecognitionException {
        ConstantContext _localctx = new ConstantContext(_ctx, getState());
        enterRule(_localctx, 308, RULE_constant);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1530);
                _la = _input.LA(1);
                if (!(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (CHARACTER_LITERAL - 136)) | (1L << (HEX_LITERAL - 136)) | (1L << (DECIMAL_LITERAL - 136)) | (1L << (OCTAL_LITERAL - 136)) | (1L << (FLOATING_POINT_LITERAL - 136)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0096\u05ff\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT" +
                    "\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4" +
                    "`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t" +
                    "k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4" +
                    "w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080" +
                    "\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085" +
                    "\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089" +
                    "\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e" +
                    "\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092" +
                    "\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097" +
                    "\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b" +
                    "\4\u009c\t\u009c\3\2\6\2\u013a\n\2\r\2\16\2\u013b\3\2\3\2\3\3\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u014b\n\3\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0159\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7" +
                    "\3\7\3\7\5\7\u0165\n\7\3\7\5\7\u0168\n\7\3\7\5\7\u016b\n\7\3\7\5\7\u016e" +
                    "\n\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0176\n\b\3\b\3\b\5\b\u017a\n\b\3\b\5" +
                    "\b\u017d\n\b\3\b\5\b\u0180\n\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u0188\n\t\3" +
                    "\t\5\t\u018b\n\t\3\t\5\t\u018e\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n" +
                    "\u0198\n\n\3\n\3\n\3\13\3\13\3\13\5\13\u019f\n\13\3\13\5\13\u01a2\n\13" +
                    "\3\13\5\13\u01a5\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16" +
                    "\3\16\3\17\3\17\3\17\7\17\u01b6\n\17\f\17\16\17\u01b9\13\17\3\20\3\20" +
                    "\3\20\3\20\3\21\3\21\3\21\7\21\u01c2\n\21\f\21\16\21\u01c5\13\21\3\22" +
                    "\3\22\5\22\u01c9\n\22\3\22\5\22\u01cc\n\22\3\22\3\22\3\23\3\23\3\23\3" +
                    "\23\3\24\3\24\3\24\7\24\u01d7\n\24\f\24\16\24\u01da\13\24\3\25\3\25\3" +
                    "\25\3\25\3\25\3\25\3\25\3\25\5\25\u01e4\n\25\3\26\3\26\3\26\3\26\3\26" +
                    "\3\26\5\26\u01ec\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33" +
                    "\7\33\u01f8\n\33\f\33\16\33\u01fb\13\33\3\33\3\33\3\33\3\33\6\33\u0201" +
                    "\n\33\r\33\16\33\u0202\3\33\3\33\3\33\3\33\6\33\u0209\n\33\r\33\16\33" +
                    "\u020a\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u0213\n\33\r\33\16\33\u0214" +
                    "\3\33\3\33\3\33\5\33\u021a\n\33\3\34\3\34\3\35\3\35\3\35\3\35\6\35\u0222" +
                    "\n\35\r\35\16\35\u0223\3\36\3\36\3\36\3\37\3\37\3\37\3 \5 \u022d\n \3" +
                    " \3 \3 \3!\6!\u0233\n!\r!\16!\u0234\3\"\3\"\3\"\3\"\3\"\5\"\u023c\n\"" +
                    "\3#\3#\3#\3$\3$\3$\3%\5%\u0245\n%\3%\3%\5%\u0249\n%\3%\5%\u024c\n%\3%" +
                    "\3%\3&\3&\6&\u0252\n&\r&\16&\u0253\3&\5&\u0257\n&\5&\u0259\n&\3\'\5\'" +
                    "\u025c\n\'\3\'\3\'\7\'\u0260\n\'\f\'\16\'\u0263\13\'\3\'\3\'\3(\3(\3(" +
                    "\5(\u026a\n(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0278\n*\3+\3+\3+" +
                    "\7+\u027d\n+\f+\16+\u0280\13+\3,\3,\3,\3,\5,\u0286\n,\3-\3-\3-\3-\5-\u028c" +
                    "\n-\3-\3-\5-\u0290\n-\3.\3.\5.\u0294\n.\3/\3/\5/\u0298\n/\3/\3/\5/\u029c" +
                    "\n/\3/\5/\u029f\n/\3\60\3\60\3\61\3\61\3\61\5\61\u02a6\n\61\3\62\3\62" +
                    "\3\63\3\63\3\63\5\63\u02ad\n\63\3\64\3\64\3\65\3\65\3\65\5\65\u02b4\n" +
                    "\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3" +
                    "\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u02ca\n\66\3\67\3\67\3\67\3\67" +
                    "\38\38\39\39\3:\3:\5:\u02d6\n:\3;\3;\3<\3<\3<\3<\3=\3=\3=\5=\u02e1\n=" +
                    "\3=\3=\7=\u02e5\n=\f=\16=\u02e8\13=\3=\5=\u02eb\n=\3=\3=\3>\3>\3>\5>\u02f2" +
                    "\n>\3>\3>\7>\u02f6\n>\f>\16>\u02f9\13>\3>\5>\u02fc\n>\3>\3>\3?\3?\3?\3" +
                    "?\5?\u0304\n?\3?\3?\3?\3?\5?\u030a\n?\3@\3@\3@\3@\5@\u0310\n@\3@\3@\3" +
                    "@\5@\u0315\n@\7@\u0317\n@\f@\16@\u031a\13@\3@\3@\3A\3A\5A\u0320\nA\3A" +
                    "\5A\u0323\nA\3A\3A\3B\3B\3B\3B\3B\3B\5B\u032d\nB\3C\3C\3C\5C\u0332\nC" +
                    "\3D\3D\6D\u0336\nD\rD\16D\u0337\3D\5D\u033b\nD\3E\5E\u033e\nE\3E\3E\3" +
                    "E\3F\3F\3F\3F\3F\3G\3G\5G\u034a\nG\3G\6G\u034d\nG\rG\16G\u034e\5G\u0351" +
                    "\nG\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3M\3M" +
                    "\3M\3M\3N\3N\3N\3O\3O\3O\3O\3O\3P\3P\7P\u0375\nP\fP\16P\u0378\13P\3P\5" +
                    "P\u037b\nP\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3S\5S\u0387\nS\3S\3S\3S\3T\3T\5" +
                    "T\u038e\nT\3U\3U\3U\3V\6V\u0394\nV\rV\16V\u0395\3W\3W\3W\3W\5W\u039c\n" +
                    "W\3X\3X\3Y\3Y\3Y\3Y\3Y\5Y\u03a5\nY\3Z\3Z\3Z\7Z\u03aa\nZ\fZ\16Z\u03ad\13" +
                    "Z\3[\3[\3[\5[\u03b2\n[\3\\\3\\\3\\\5\\\u03b7\n\\\3\\\3\\\6\\\u03bb\n\\" +
                    "\r\\\16\\\u03bc\3\\\3\\\5\\\u03c1\n\\\5\\\u03c3\n\\\3]\3]\3]\3]\3^\6^" +
                    "\u03ca\n^\r^\16^\u03cb\3_\3_\3_\5_\u03d1\n_\3`\3`\3`\7`\u03d6\n`\f`\16" +
                    "`\u03d9\13`\3a\3a\5a\u03dd\na\3a\3a\5a\u03e1\na\3b\3b\5b\u03e5\nb\3b\3" +
                    "b\5b\u03e9\nb\3b\3b\3b\3b\3b\5b\u03f0\nb\3b\3b\3b\3b\5b\u03f6\nb\3b\3" +
                    "b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u040c\nb\3" +
                    "c\3c\3c\7c\u0411\nc\fc\16c\u0414\13c\3c\5c\u0417\nc\3d\3d\3d\5d\u041c" +
                    "\nd\3e\3e\7e\u0420\ne\fe\16e\u0423\13e\3e\3e\5e\u0427\ne\3f\3f\7f\u042b" +
                    "\nf\ff\16f\u042e\13f\3f\3f\3f\3f\7f\u0434\nf\ff\16f\u0437\13f\3f\3f\3" +
                    "f\5f\u043c\nf\3f\3f\5f\u0440\nf\3g\3g\5g\u0444\ng\3g\3g\3g\5g\u0449\n" +
                    "g\3g\5g\u044c\ng\3h\3h\3h\5h\u0451\nh\3i\3i\5i\u0455\ni\3i\5i\u0458\n" +
                    "i\3j\3j\3j\3j\3j\7j\u045f\nj\fj\16j\u0462\13j\3j\5j\u0465\nj\3j\3j\5j" +
                    "\u0469\nj\5j\u046b\nj\3k\3k\3k\3k\5k\u0471\nk\3l\3l\7l\u0475\nl\fl\16" +
                    "l\u0478\13l\3l\3l\3l\3l\3l\6l\u047f\nl\rl\16l\u0480\3l\3l\5l\u0485\nl" +
                    "\3l\6l\u0488\nl\rl\16l\u0489\3l\5l\u048d\nl\3m\3m\5m\u0491\nm\3m\3m\3" +
                    "m\5m\u0496\nm\3m\5m\u0499\nm\3n\3n\3n\7n\u049e\nn\fn\16n\u04a1\13n\3o" +
                    "\6o\u04a4\no\ro\16o\u04a5\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\5p\u04b3\n" +
                    "p\3q\3q\3q\3q\5q\u04b9\nq\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\5r\u04c7" +
                    "\nr\3s\5s\u04ca\ns\3s\3s\7s\u04ce\ns\fs\16s\u04d1\13s\3s\3s\3t\3t\5t\u04d7" +
                    "\nt\3u\3u\3u\3u\3u\3u\3u\5u\u04e0\nu\3u\3u\3u\3u\3u\3u\5u\u04e8\nu\3v" +
                    "\3v\3v\3v\3v\3v\3w\3w\3w\3w\3w\3x\3x\3x\3x\3x\3x\3x\3x\3y\3y\3y\5y\u0500" +
                    "\ny\3y\3y\5y\u0504\ny\3y\3y\3y\3y\5y\u050a\ny\3y\3y\5y\u050e\ny\3y\3y" +
                    "\3y\3y\5y\u0514\ny\3z\3z\5z\u0518\nz\3z\3z\5z\u051c\nz\3z\3z\3z\3z\3z" +
                    "\5z\u0523\nz\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\5{\u052f\n{\3{\5{\u0532\n{" +
                    "\3|\3|\3|\3|\3}\3}\3~\3~\3\177\3\177\3\177\7\177\u053f\n\177\f\177\16" +
                    "\177\u0542\13\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0549" +
                    "\n\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\7\u0082\u0550\n\u0082" +
                    "\f\u0082\16\u0082\u0553\13\u0082\3\u0082\3\u0082\5\u0082\u0557\n\u0082" +
                    "\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\7\u0084\u055e\n\u0084\f\u0084" +
                    "\16\u0084\u0561\13\u0084\3\u0085\3\u0085\3\u0085\7\u0085\u0566\n\u0085" +
                    "\f\u0085\16\u0085\u0569\13\u0085\3\u0086\3\u0086\3\u0086\7\u0086\u056e" +
                    "\n\u0086\f\u0086\16\u0086\u0571\13\u0086\3\u0087\3\u0087\3\u0087\7\u0087" +
                    "\u0576\n\u0087\f\u0087\16\u0087\u0579\13\u0087\3\u0088\3\u0088\3\u0088" +
                    "\7\u0088\u057e\n\u0088\f\u0088\16\u0088\u0581\13\u0088\3\u0089\3\u0089" +
                    "\3\u0089\3\u0089\7\u0089\u0587\n\u0089\f\u0089\16\u0089\u058a\13\u0089" +
                    "\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\7\u008b\u0592\n\u008b" +
                    "\f\u008b\16\u008b\u0595\13\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d" +
                    "\3\u008d\7\u008d\u059d\n\u008d\f\u008d\16\u008d\u05a0\13\u008d\3\u008e" +
                    "\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\7\u008f\u05a8\n\u008f\f\u008f" +
                    "\16\u008f\u05ab\13\u008f\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091" +
                    "\7\u0091\u05b3\n\u0091\f\u0091\16\u0091\u05b6\13\u0091\3\u0092\3\u0092" +
                    "\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u05c0\n\u0093" +
                    "\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094" +
                    "\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u05d0\n\u0094\5\u0094" +
                    "\u05d2\n\u0094\3\u0095\3\u0095\3\u0096\3\u0096\7\u0096\u05d8\n\u0096\f" +
                    "\u0096\16\u0096\u05db\13\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097" +
                    "\3\u0097\5\u0097\u05e3\n\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097" +
                    "\3\u0097\3\u0097\5\u0097\u05ec\n\u0097\3\u0098\3\u0098\3\u0099\3\u0099" +
                    "\3\u0099\7\u0099\u05f3\n\u0099\f\u0099\16\u0099\u05f6\13\u0099\3\u009a" +
                    "\3\u009a\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\2\2\u009d\2\4" +
                    "\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP" +
                    "RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e" +
                    "\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6" +
                    "\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be" +
                    "\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6" +
                    "\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee" +
                    "\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106" +
                    "\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e" +
                    "\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136" +
                    "\2\22\4\2\n\n\27\27\5\2\25\25\30\30\32\33\b\2**//\63\63:;@AHI\5\2\'(\67" +
                    "8<=\3\2\u008b\u008c\3\2NO\4\2DDGG\4\2\\\\u~\4\2ccff\4\2]^de\3\2st\3\2" +
                    "kl\4\2mnrr\5\2_`lmoo\3\2\u0095\u0096\4\2\u008a\u008a\u008d\u0090\u065b" +
                    "\2\u0139\3\2\2\2\4\u014a\3\2\2\2\6\u0158\3\2\2\2\b\u015a\3\2\2\2\n\u015e" +
                    "\3\2\2\2\f\u0160\3\2\2\2\16\u0171\3\2\2\2\20\u0183\3\2\2\2\22\u0191\3" +
                    "\2\2\2\24\u019b\3\2\2\2\26\u01a8\3\2\2\2\30\u01ac\3\2\2\2\32\u01ae\3\2" +
                    "\2\2\34\u01b2\3\2\2\2\36\u01ba\3\2\2\2 \u01be\3\2\2\2\"\u01c6\3\2\2\2" +
                    "$\u01cf\3\2\2\2&\u01d3\3\2\2\2(\u01e3\3\2\2\2*\u01eb\3\2\2\2,\u01ed\3" +
                    "\2\2\2.\u01ef\3\2\2\2\60\u01f1\3\2\2\2\62\u01f3\3\2\2\2\64\u0219\3\2\2" +
                    "\2\66\u021b\3\2\2\28\u0221\3\2\2\2:\u0225\3\2\2\2<\u0228\3\2\2\2>\u022c" +
                    "\3\2\2\2@\u0232\3\2\2\2B\u023b\3\2\2\2D\u023d\3\2\2\2F\u0240\3\2\2\2H" +
                    "\u0244\3\2\2\2J\u0258\3\2\2\2L\u025b\3\2\2\2N\u0269\3\2\2\2P\u026b\3\2" +
                    "\2\2R\u0277\3\2\2\2T\u0279\3\2\2\2V\u0285\3\2\2\2X\u0287\3\2\2\2Z\u0293" +
                    "\3\2\2\2\\\u029e\3\2\2\2^\u02a0\3\2\2\2`\u02a5\3\2\2\2b\u02a7\3\2\2\2" +
                    "d\u02ac\3\2\2\2f\u02ae\3\2\2\2h\u02b3\3\2\2\2j\u02c9\3\2\2\2l\u02cb\3" +
                    "\2\2\2n\u02cf\3\2\2\2p\u02d1\3\2\2\2r\u02d5\3\2\2\2t\u02d7\3\2\2\2v\u02d9" +
                    "\3\2\2\2x\u02dd\3\2\2\2z\u02ee\3\2\2\2|\u0309\3\2\2\2~\u030b\3\2\2\2\u0080" +
                    "\u031d\3\2\2\2\u0082\u0326\3\2\2\2\u0084\u0331\3\2\2\2\u0086\u033a\3\2" +
                    "\2\2\u0088\u033d\3\2\2\2\u008a\u0342\3\2\2\2\u008c\u0350\3\2\2\2\u008e" +
                    "\u0352\3\2\2\2\u0090\u0357\3\2\2\2\u0092\u035c\3\2\2\2\u0094\u035e\3\2" +
                    "\2\2\u0096\u0361\3\2\2\2\u0098\u0364\3\2\2\2\u009a\u036a\3\2\2\2\u009c" +
                    "\u036d\3\2\2\2\u009e\u0372\3\2\2\2\u00a0\u037c\3\2\2\2\u00a2\u0382\3\2" +
                    "\2\2\u00a4\u0386\3\2\2\2\u00a6\u038b\3\2\2\2\u00a8\u038f\3\2\2\2\u00aa" +
                    "\u0393\3\2\2\2\u00ac\u039b\3\2\2\2\u00ae\u039d\3\2\2\2\u00b0\u03a4\3\2" +
                    "\2\2\u00b2\u03a6\3\2\2\2\u00b4\u03ae\3\2\2\2\u00b6\u03b3\3\2\2\2\u00b8" +
                    "\u03c4\3\2\2\2\u00ba\u03c9\3\2\2\2\u00bc\u03d0\3\2\2\2\u00be\u03d2\3\2" +
                    "\2\2\u00c0\u03e0\3\2\2\2\u00c2\u040b\3\2\2\2\u00c4\u040d\3\2\2\2\u00c6" +
                    "\u0418\3\2\2\2\u00c8\u0426\3\2\2\2\u00ca\u043f\3\2\2\2\u00cc\u044b\3\2" +
                    "\2\2\u00ce\u044d\3\2\2\2\u00d0\u0452\3\2\2\2\u00d2\u046a\3\2\2\2\u00d4" +
                    "\u0470\3\2\2\2\u00d6\u048c\3\2\2\2\u00d8\u0498\3\2\2\2\u00da\u049a\3\2" +
                    "\2\2\u00dc\u04a3\3\2\2\2\u00de\u04b2\3\2\2\2\u00e0\u04b8\3\2\2\2\u00e2" +
                    "\u04c6\3\2\2\2\u00e4\u04c9\3\2\2\2\u00e6\u04d6\3\2\2\2\u00e8\u04e7\3\2" +
                    "\2\2\u00ea\u04e9\3\2\2\2\u00ec\u04ef\3\2\2\2\u00ee\u04f4\3\2\2\2\u00f0" +
                    "\u0513\3\2\2\2\u00f2\u0522\3\2\2\2\u00f4\u0531\3\2\2\2\u00f6\u0533\3\2" +
                    "\2\2\u00f8\u0537\3\2\2\2\u00fa\u0539\3\2\2\2\u00fc\u053b\3\2\2\2\u00fe" +
                    "\u0548\3\2\2\2\u0100\u054a\3\2\2\2\u0102\u054c\3\2\2\2\u0104\u0558\3\2" +
                    "\2\2\u0106\u055a\3\2\2\2\u0108\u0562\3\2\2\2\u010a\u056a\3\2\2\2\u010c" +
                    "\u0572\3\2\2\2\u010e\u057a\3\2\2\2\u0110\u0582\3\2\2\2\u0112\u058b\3\2" +
                    "\2\2\u0114\u058d\3\2\2\2\u0116\u0596\3\2\2\2\u0118\u0598\3\2\2\2\u011a" +
                    "\u05a1\3\2\2\2\u011c\u05a3\3\2\2\2\u011e\u05ac\3\2\2\2\u0120\u05ae\3\2" +
                    "\2\2\u0122\u05b7\3\2\2\2\u0124\u05bf\3\2\2\2\u0126\u05d1\3\2\2\2\u0128" +
                    "\u05d3\3\2\2\2\u012a\u05d5\3\2\2\2\u012c\u05eb\3\2\2\2\u012e\u05ed\3\2" +
                    "\2\2\u0130\u05ef\3\2\2\2\u0132\u05f7\3\2\2\2\u0134\u05f9\3\2\2\2\u0136" +
                    "\u05fc\3\2\2\2\u0138\u013a\5\4\3\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2" +
                    "\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d" +
                    "\u013e\7\2\2\3\u013e\3\3\2\2\2\u013f\u014b\5\6\4\2\u0140\u014b\5\u00a4" +
                    "S\2\u0141\u014b\5\u00a8U\2\u0142\u014b\5\f\7\2\u0143\u014b\5\20\t\2\u0144" +
                    "\u014b\5\16\b\2\u0145\u014b\5\22\n\2\u0146\u014b\5\24\13\2\u0147\u014b" +
                    "\5\26\f\2\u0148\u014b\5\32\16\2\u0149\u014b\5\u012e\u0098\2\u014a\u013f" +
                    "\3\2\2\2\u014a\u0140\3\2\2\2\u014a\u0141\3\2\2\2\u014a\u0142\3\2\2\2\u014a" +
                    "\u0143\3\2\2\2\u014a\u0144\3\2\2\2\u014a\u0145\3\2\2\2\u014a\u0146\3\2" +
                    "\2\2\u014a\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b" +
                    "\5\3\2\2\2\u014c\u0159\7\u0091\2\2\u014d\u0159\7\u0092\2\2\u014e\u0159" +
                    "\5\b\5\2\u014f\u0150\7\3\2\2\u0150\u0159\5\u00fc\177\2\u0151\u0152\7\4" +
                    "\2\2\u0152\u0159\5\u00fc\177\2\u0153\u0154\7\5\2\2\u0154\u0159\5\u00fc" +
                    "\177\2\u0155\u0156\7\6\2\2\u0156\u0159\5\u00fc\177\2\u0157\u0159\7\7\2" +
                    "\2\u0158\u014c\3\2\2\2\u0158\u014d\3\2\2\2\u0158\u014e\3\2\2\2\u0158\u014f" +
                    "\3\2\2\2\u0158\u0151\3\2\2\2\u0158\u0153\3\2\2\2\u0158\u0155\3\2\2\2\u0158" +
                    "\u0157\3\2\2\2\u0159\7\3\2\2\2\u015a\u015b\7\b\2\2\u015b\u015c\5\u0132" +
                    "\u009a\2\u015c\u015d\5\u0104\u0083\2\u015d\t\3\2\2\2\u015e\u015f\7\t\2" +
                    "\2\u015f\13\3\2\2\2\u0160\u0161\7\24\2\2\u0161\u0164\5,\27\2\u0162\u0163" +
                    "\7b\2\2\u0163\u0165\5.\30\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165" +
                    "\u0167\3\2\2\2\u0166\u0168\5\36\20\2\u0167\u0166\3\2\2\2\u0167\u0168\3" +
                    "\2\2\2\u0168\u016a\3\2\2\2\u0169\u016b\5\64\33\2\u016a\u0169\3\2\2\2\u016a" +
                    "\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016e\58\35\2\u016d\u016c\3\2" +
                    "\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7\21\2\2\u0170" +
                    "\r\3\2\2\2\u0171\u0172\7\24\2\2\u0172\u0173\5,\27\2\u0173\u0175\7Q\2\2" +
                    "\u0174\u0176\5\60\31\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177" +
                    "\3\2\2\2\u0177\u0179\7R\2\2\u0178\u017a\5\36\20\2\u0179\u0178\3\2\2\2" +
                    "\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u017d\5\64\33\2\u017c\u017b" +
                    "\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0180\58\35\2\u017f" +
                    "\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\7\21" +
                    "\2\2\u0182\17\3\2\2\2\u0183\u0184\7\23\2\2\u0184\u0187\5,\27\2\u0185\u0186" +
                    "\7b\2\2\u0186\u0188\5.\30\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188" +
                    "\u018a\3\2\2\2\u0189\u018b\5\64\33\2\u018a\u0189\3\2\2\2\u018a\u018b\3" +
                    "\2\2\2\u018b\u018d\3\2\2\2\u018c\u018e\5@!\2\u018d\u018c\3\2\2\2\u018d" +
                    "\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\7\21\2\2\u0190\21\3\2\2" +
                    "\2\u0191\u0192\7\23\2\2\u0192\u0193\5,\27\2\u0193\u0194\7Q\2\2\u0194\u0195" +
                    "\5\60\31\2\u0195\u0197\7R\2\2\u0196\u0198\5@!\2\u0197\u0196\3\2\2\2\u0197" +
                    "\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\7\21\2\2\u019a\23\3\2\2" +
                    "\2\u019b\u019c\7\26\2\2\u019c\u019e\5\62\32\2\u019d\u019f\5\36\20\2\u019e" +
                    "\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u01a2\5\30" +
                    "\r\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3" +
                    "\u01a5\58\35\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2" +
                    "\2\2\u01a6\u01a7\7\21\2\2\u01a7\25\3\2\2\2\u01a8\u01a9\7\26\2\2\u01a9" +
                    "\u01aa\5 \21\2\u01aa\u01ab\7W\2\2\u01ab\27\3\2\2\2\u01ac\u01ad\t\2\2\2" +
                    "\u01ad\31\3\2\2\2\u01ae\u01af\7\16\2\2\u01af\u01b0\5\34\17\2\u01b0\u01b1" +
                    "\7W\2\2\u01b1\33\3\2\2\2\u01b2\u01b7\5,\27\2\u01b3\u01b4\7X\2\2\u01b4" +
                    "\u01b6\5,\27\2\u01b5\u01b3\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2" +
                    "\2\2\u01b7\u01b8\3\2\2\2\u01b8\35\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb" +
                    "\7^\2\2\u01bb\u01bc\5 \21\2\u01bc\u01bd\7]\2\2\u01bd\37\3\2\2\2\u01be" +
                    "\u01c3\5\62\32\2\u01bf\u01c0\7X\2\2\u01c0\u01c2\5\62\32\2\u01c1\u01bf" +
                    "\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4" +
                    "!\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c8\7\31\2\2\u01c7\u01c9\5$\23\2" +
                    "\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01cc" +
                    "\5*\26\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd" +
                    "\u01ce\5\u00b8]\2\u01ce#\3\2\2\2\u01cf\u01d0\7Q\2\2\u01d0\u01d1\5&\24" +
                    "\2\u01d1\u01d2\7R\2\2\u01d2%\3\2\2\2\u01d3\u01d8\5(\25\2\u01d4\u01d5\7" +
                    "X\2\2\u01d5\u01d7\5(\25\2\u01d6\u01d4\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8" +
                    "\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\'\3\2\2\2\u01da\u01d8\3\2\2\2" +
                    "\u01db\u01e4\7\u0089\2\2\u01dc\u01dd\7\u0089\2\2\u01dd\u01de\7\\\2\2\u01de" +
                    "\u01e4\7\u0089\2\2\u01df\u01e0\7\u0089\2\2\u01e0\u01e1\7\\\2\2\u01e1\u01e2" +
                    "\7\u0089\2\2\u01e2\u01e4\7b\2\2\u01e3\u01db\3\2\2\2\u01e3\u01dc\3\2\2" +
                    "\2\u01e3\u01df\3\2\2\2\u01e4)\3\2\2\2\u01e5\u01e6\7\u0089\2\2\u01e6\u01e7" +
                    "\7Q\2\2\u01e7\u01e8\5,\27\2\u01e8\u01e9\7R\2\2\u01e9\u01ec\3\2\2\2\u01ea" +
                    "\u01ec\7\u0089\2\2\u01eb\u01e5\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec+\3\2" +
                    "\2\2\u01ed\u01ee\5\u0132\u009a\2\u01ee-\3\2\2\2\u01ef\u01f0\5\u0132\u009a" +
                    "\2\u01f0/\3\2\2\2\u01f1\u01f2\7\u0089\2\2\u01f2\61\3\2\2\2\u01f3\u01f4" +
                    "\7\u0089\2\2\u01f4\63\3\2\2\2\u01f5\u01f9\7S\2\2\u01f6\u01f8\5\u00b8]" +
                    "\2\u01f7\u01f6\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa" +
                    "\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u021a\7T\2\2\u01fd" +
                    "\u01fe\7S\2\2\u01fe\u0200\5\66\34\2\u01ff\u0201\5\u00b8]\2\u0200\u01ff" +
                    "\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203" +
                    "\u0204\3\2\2\2\u0204\u0205\7T\2\2\u0205\u021a\3\2\2\2\u0206\u0208\7S\2" +
                    "\2\u0207\u0209\5\u00b8]\2\u0208\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a" +
                    "\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\5\64" +
                    "\33\2\u020d\u020e\7T\2\2\u020e\u021a\3\2\2\2\u020f\u0210\7S\2\2\u0210" +
                    "\u0212\5\66\34\2\u0211\u0213\5\u00b8]\2\u0212\u0211\3\2\2\2\u0213\u0214" +
                    "\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216" +
                    "\u0217\5\64\33\2\u0217\u0218\7T\2\2\u0218\u021a\3\2\2\2\u0219\u01f5\3" +
                    "\2\2\2\u0219\u01fd\3\2\2\2\u0219\u0206\3\2\2\2\u0219\u020f\3\2\2\2\u021a" +
                    "\65\3\2\2\2\u021b\u021c\t\3\2\2\u021c\67\3\2\2\2\u021d\u0222\5\u00a8U" +
                    "\2\u021e\u0222\5:\36\2\u021f\u0222\5<\37\2\u0220\u0222\5\"\22\2\u0221" +
                    "\u021d\3\2\2\2\u0221\u021e\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0220\3\2" +
                    "\2\2\u0222\u0223\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224" +
                    "9\3\2\2\2\u0225\u0226\7k\2\2\u0226\u0227\5> \2\u0227;\3\2\2\2\u0228\u0229" +
                    "\7l\2\2\u0229\u022a\5> \2\u022a=\3\2\2\2\u022b\u022d\5P)\2\u022c\u022b" +
                    "\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\5J&\2\u022f" +
                    "\u0230\7W\2\2\u0230?\3\2\2\2\u0231\u0233\5B\"\2\u0232\u0231\3\2\2\2\u0233" +
                    "\u0234\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235A\3\2\2\2" +
                    "\u0236\u023c\5\u00a4S\2\u0237\u023c\5\u00a8U\2\u0238\u023c\5D#\2\u0239" +
                    "\u023c\5F$\2\u023a\u023c\5R*\2\u023b\u0236\3\2\2\2\u023b\u0237\3\2\2\2" +
                    "\u023b\u0238\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023a\3\2\2\2\u023cC\3" +
                    "\2\2\2\u023d\u023e\7k\2\2\u023e\u023f\5H%\2\u023fE\3\2\2\2\u0240\u0241" +
                    "\7l\2\2\u0241\u0242\5H%\2\u0242G\3\2\2\2\u0243\u0245\5P)\2\u0244\u0243" +
                    "\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\5J&\2\u0247" +
                    "\u0249\5\u00b2Z\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b" +
                    "\3\2\2\2\u024a\u024c\7W\2\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c" +
                    "\u024d\3\2\2\2\u024d\u024e\5\u00e4s\2\u024eI\3\2\2\2\u024f\u0259\5N(\2" +
                    "\u0250\u0252\5L\'\2\u0251\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0251" +
                    "\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255\u0257\5\u00ceh" +
                    "\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0259\3\2\2\2\u0258\u024f" +
                    "\3\2\2\2\u0258\u0251\3\2\2\2\u0259K\3\2\2\2\u025a\u025c\5N(\2\u025b\u025a" +
                    "\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u0261\7b\2\2\u025e" +
                    "\u0260\5P)\2\u025f\u025e\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2" +
                    "\2\u0261\u0262\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0265" +
                    "\5\u0132\u009a\2\u0265M\3\2\2\2\u0266\u026a\5\u0132\u009a\2\u0267\u026a" +
                    "\5\u00fa~\2\u0268\u026a\7\u0085\2\2\u0269\u0266\3\2\2\2\u0269\u0267\3" +
                    "\2\2\2\u0269\u0268\3\2\2\2\u026aO\3\2\2\2\u026b\u026c\7Q\2\2\u026c\u026d" +
                    "\5\u00d4k\2\u026d\u026e\7R\2\2\u026eQ\3\2\2\2\u026f\u0270\7\36\2\2\u0270" +
                    "\u0271\5T+\2\u0271\u0272\7W\2\2\u0272\u0278\3\2\2\2\u0273\u0274\7\17\2" +
                    "\2\u0274\u0275\5T+\2\u0275\u0276\7W\2\2\u0276\u0278\3\2\2\2\u0277\u026f" +
                    "\3\2\2\2\u0277\u0273\3\2\2\2\u0278S\3\2\2\2\u0279\u027e\5V,\2\u027a\u027b" +
                    "\7X\2\2\u027b\u027d\5V,\2\u027c\u027a\3\2\2\2\u027d\u0280\3\2\2\2\u027e" +
                    "\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027fU\3\2\2\2\u0280\u027e\3\2\2\2" +
                    "\u0281\u0286\7\u0089\2\2\u0282\u0283\7\u0089\2\2\u0283\u0284\7\\\2\2\u0284" +
                    "\u0286\7\u0089\2\2\u0285\u0281\3\2\2\2\u0285\u0282\3\2\2\2\u0286W\3\2" +
                    "\2\2\u0287\u0288\5Z.\2\u0288\u0289\7Q\2\2\u0289\u028b\7q\2\2\u028a\u028c" +
                    "\5Z.\2\u028b\u028a\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d" +
                    "\u028f\7R\2\2\u028e\u0290\5~@\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2" +
                    "\2\u0290Y\3\2\2\2\u0291\u0294\5`\61\2\u0292\u0294\5\\/\2\u0293\u0291\3" +
                    "\2\2\2\u0293\u0292\3\2\2\2\u0294[\3\2\2\2\u0295\u0297\7\65\2\2\u0296\u0298" +
                    "\5\36\20\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u029f\3\2\2\2" +
                    "\u0299\u029b\5,\27\2\u029a\u029c\5\36\20\2\u029b\u029a\3\2\2\2\u029b\u029c" +
                    "\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029f\5^\60\2\u029e\u0295\3\2\2\2\u029e" +
                    "\u0299\3\2\2\2\u029e\u029d\3\2\2\2\u029f]\3\2\2\2\u02a0\u02a1\5\u00b6" +
                    "\\\2\u02a1_\3\2\2\2\u02a2\u02a6\5b\62\2\u02a3\u02a6\5\u0132\u009a\2\u02a4" +
                    "\u02a6\5\u00c2b\2\u02a5\u02a2\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a4" +
                    "\3\2\2\2\u02a6a\3\2\2\2\u02a7\u02a8\t\4\2\2\u02a8c\3\2\2\2\u02a9\u02ad" +
                    "\7+\2\2\u02aa\u02ad\7J\2\2\u02ab\u02ad\5f\64\2\u02ac\u02a9\3\2\2\2\u02ac" +
                    "\u02aa\3\2\2\2\u02ac\u02ab\3\2\2\2\u02ade\3\2\2\2\u02ae\u02af\t\5\2\2" +
                    "\u02afg\3\2\2\2\u02b0\u02b4\5j\66\2\u02b1\u02b4\5l\67\2\u02b2\u02b4\5" +
                    "\u008aF\2\u02b3\u02b0\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b2\3\2\2\2" +
                    "\u02b4i\3\2\2\2\u02b5\u02ca\5\u0132\u009a\2\u02b6\u02ca\5\u0136\u009c" +
                    "\2\u02b7\u02ca\5t;\2\u02b8\u02b9\7Q\2\2\u02b9\u02ba\5\u00fc\177\2\u02ba" +
                    "\u02bb\7R\2\2\u02bb\u02ca\3\2\2\2\u02bc\u02ca\5n8\2\u02bd\u02ca\5p9\2" +
                    "\u02be\u02ca\5\u0082B\2\u02bf\u02ca\5\u00f6|\2\u02c0\u02ca\5\u00f8}\2" +
                    "\u02c1\u02ca\5\u0134\u009b\2\u02c2\u02ca\5\u008aF\2\u02c3\u02ca\5\u008e" +
                    "H\2\u02c4\u02ca\5\u0090I\2\u02c5\u02ca\5x=\2\u02c6\u02ca\5z>\2\u02c7\u02ca" +
                    "\5|?\2\u02c8\u02ca\5\u0080A\2\u02c9\u02b5\3\2\2\2\u02c9\u02b6\3\2\2\2" +
                    "\u02c9\u02b7\3\2\2\2\u02c9\u02b8\3\2\2\2\u02c9\u02bc\3\2\2\2\u02c9\u02bd" +
                    "\3\2\2\2\u02c9\u02be\3\2\2\2\u02c9\u02bf\3\2\2\2\u02c9\u02c0\3\2\2\2\u02c9" +
                    "\u02c1\3\2\2\2\u02c9\u02c2\3\2\2\2\u02c9\u02c3\3\2\2\2\u02c9\u02c4\3\2" +
                    "\2\2\u02c9\u02c5\3\2\2\2\u02c9\u02c6\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9" +
                    "\u02c8\3\2\2\2\u02cak\3\2\2\2\u02cb\u02cc\7Q\2\2\u02cc\u02cd\5\u00fc\177" +
                    "\2\u02cd\u02ce\7R\2\2\u02cem\3\2\2\2\u02cf\u02d0\7\"\2\2\u02d0o\3\2\2" +
                    "\2\u02d1\u02d2\7!\2\2\u02d2q\3\2\2\2\u02d3\u02d6\5\u0090I\2\u02d4\u02d6" +
                    "\5\u008eH\2\u02d5\u02d3\3\2\2\2\u02d5\u02d4\3\2\2\2\u02d6s\3\2\2\2\u02d7" +
                    "\u02d8\t\6\2\2\u02d8u\3\2\2\2\u02d9\u02da\5\u012a\u0096\2\u02da\u02db" +
                    "\7b\2\2\u02db\u02dc\5\u012a\u0096\2\u02dcw\3\2\2\2\u02dd\u02de\7[\2\2" +
                    "\u02de\u02e0\7S\2\2\u02df\u02e1\5v<\2\u02e0\u02df\3\2\2\2\u02e0\u02e1" +
                    "\3\2\2\2\u02e1\u02e6\3\2\2\2\u02e2\u02e3\7X\2\2\u02e3\u02e5\5v<\2\u02e4" +
                    "\u02e2\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2" +
                    "\2\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e9\u02eb\7X\2\2\u02ea" +
                    "\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\7T" +
                    "\2\2\u02edy\3\2\2\2\u02ee\u02ef\7[\2\2\u02ef\u02f1\7U\2\2\u02f0\u02f2" +
                    "\5\u012a\u0096\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f7\3" +
                    "\2\2\2\u02f3\u02f4\7X\2\2\u02f4\u02f6\5\u012a\u0096\2\u02f5\u02f3\3\2" +
                    "\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8" +
                    "\u02fb\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02fc\7X\2\2\u02fb\u02fa\3\2" +
                    "\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\7V\2\2\u02fe" +
                    "{\3\2\2\2\u02ff\u0300\7[\2\2\u0300\u0303\7Q\2\2\u0301\u0304\5\u012a\u0096" +
                    "\2\u0302\u0304\5\u00fc\177\2\u0303\u0301\3\2\2\2\u0303\u0302\3\2\2\2\u0304" +
                    "\u0305\3\2\2\2\u0305\u0306\7R\2\2\u0306\u030a\3\2\2\2\u0307\u0308\7[\2" +
                    "\2\u0308\u030a\5\u0136\u009c\2\u0309\u02ff\3\2\2\2\u0309\u0307\3\2\2\2" +
                    "\u030a}\3\2\2\2\u030b\u030f\7Q\2\2\u030c\u0310\5\u0094K\2\u030d\u0310" +
                    "\5\u00d4k\2\u030e\u0310\7I\2\2\u030f\u030c\3\2\2\2\u030f\u030d\3\2\2\2" +
                    "\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0318\3\2\2\2\u0311\u0314" +
                    "\7X\2\2\u0312\u0315\5\u0094K\2\u0313\u0315\5\u00d4k\2\u0314\u0312\3\2" +
                    "\2\2\u0314\u0313\3\2\2\2\u0315\u0317\3\2\2\2\u0316\u0311\3\2\2\2\u0317" +
                    "\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031b\3\2" +
                    "\2\2\u031a\u0318\3\2\2\2\u031b\u031c\7R\2\2\u031c\177\3\2\2\2\u031d\u031f" +
                    "\7q\2\2\u031e\u0320\5Z.\2\u031f\u031e\3\2\2\2\u031f\u0320\3\2\2\2\u0320" +
                    "\u0322\3\2\2\2\u0321\u0323\5~@\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2\2" +
                    "\2\u0323\u0324\3\2\2\2\u0324\u0325\5\u00e4s\2\u0325\u0081\3\2\2\2\u0326" +
                    "\u0327\7U\2\2\u0327\u0328\5\u0084C\2\u0328\u0329\5\u0086D\2\u0329\u032c" +
                    "\7V\2\2\u032a\u032b\7Y\2\2\u032b\u032d\5\u00fa~\2\u032c\u032a\3\2\2\2" +
                    "\u032c\u032d\3\2\2\2\u032d\u0083\3\2\2\2\u032e\u0332\5\u00fc\177\2\u032f" +
                    "\u0332\5,\27\2\u0330\u0332\5\u0082B\2\u0331\u032e\3\2\2\2\u0331\u032f" +
                    "\3\2\2\2\u0331\u0330\3\2\2\2\u0332\u0085\3\2\2\2\u0333\u033b\5N(\2\u0334" +
                    "\u0336\5\u0088E\2\u0335\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0335" +
                    "\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u033b\5\u0132\u009a" +
                    "\2\u033a\u0333\3\2\2\2\u033a\u0335\3\2\2\2\u033a\u0339\3\2\2\2\u033b\u0087" +
                    "\3\2\2\2\u033c\u033e\5N(\2\u033d\u033c\3\2\2\2\u033d\u033e\3\2\2\2\u033e" +
                    "\u033f\3\2\2\2\u033f\u0340\7b\2\2\u0340\u0341\5\u00fc\177\2\u0341\u0089" +
                    "\3\2\2\2\u0342\u0343\7\34\2\2\u0343\u0344\7Q\2\2\u0344\u0345\5\u008cG" +
                    "\2\u0345\u0346\7R\2\2\u0346\u008b\3\2\2\2\u0347\u0351\5N(\2\u0348\u034a" +
                    "\5N(\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b" +
                    "\u034d\7b\2\2\u034c\u0349\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034c\3\2" +
                    "\2\2\u034e\u034f\3\2\2\2\u034f\u0351\3\2\2\2\u0350\u0347\3\2\2\2\u0350" +
                    "\u034c\3\2\2\2\u0351\u008d\3\2\2\2\u0352\u0353\7\26\2\2\u0353\u0354\7" +
                    "Q\2\2\u0354\u0355\5\62\32\2\u0355\u0356\7R\2\2\u0356\u008f\3\2\2\2\u0357" +
                    "\u0358\7\20\2\2\u0358\u0359\7Q\2\2\u0359\u035a\5\u00d4k\2\u035a\u035b" +
                    "\7R\2\2\u035b\u0091\3\2\2\2\u035c\u035d\5\u00c8e\2\u035d\u0093\3\2\2\2" +
                    "\u035e\u035f\5\u00aaV\2\u035f\u0360\5\u00c8e\2\u0360\u0095\3\2\2\2\u0361" +
                    "\u0362\7 \2\2\u0362\u0363\5\u00dep\2\u0363\u0097\3\2\2\2\u0364\u0365\7" +
                    "\r\2\2\u0365\u0366\7Q\2\2\u0366\u0367\5\u0092J\2\u0367\u0368\7R\2\2\u0368" +
                    "\u0369\5\u00dep\2\u0369\u0099\3\2\2\2\u036a\u036b\7\22\2\2\u036b\u036c" +
                    "\5\u00dep\2\u036c\u009b\3\2\2\2\u036d\u036e\7\37\2\2\u036e\u036f\7Q\2" +
                    "\2\u036f\u0370\7\u0089\2\2\u0370\u0371\7R\2\2\u0371\u009d\3\2\2\2\u0372" +
                    "\u0376\5\u0096L\2\u0373\u0375\5\u0098M\2\u0374\u0373\3\2\2\2\u0375\u0378" +
                    "\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u037a\3\2\2\2\u0378" +
                    "\u0376\3\2\2\2\u0379\u037b\5\u009aN\2\u037a\u0379\3\2\2\2\u037a\u037b" +
                    "\3\2\2\2\u037b\u009f\3\2\2\2\u037c\u037d\7\35\2\2\u037d\u037e\7Q\2\2\u037e" +
                    "\u037f\7\u0089\2\2\u037f\u0380\7R\2\2\u0380\u0381\5\u00dep\2\u0381\u00a1" +
                    "\3\2\2\2\u0382\u0383\7\f\2\2\u0383\u0384\5\u00e4s\2\u0384\u00a3\3\2\2" +
                    "\2\u0385\u0387\5\u00aaV\2\u0386\u0385\3\2\2\2\u0386\u0387\3\2\2\2\u0387" +
                    "\u0388\3\2\2\2\u0388\u0389\5\u00c8e\2\u0389\u038a\5\u00e4s\2\u038a\u00a5" +
                    "\3\2\2\2\u038b\u038d\5\u00aaV\2\u038c\u038e\5\u00b2Z\2\u038d\u038c\3\2" +
                    "\2\2\u038d\u038e\3\2\2\2\u038e\u00a7\3\2\2\2\u038f\u0390\5\u00a6T\2\u0390" +
                    "\u0391\7W\2\2\u0391\u00a9\3\2\2\2\u0392\u0394\5\u00acW\2\u0393\u0392\3" +
                    "\2\2\2\u0394\u0395\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396" +
                    "\u00ab\3\2\2\2\u0397\u039c\5\u00aeX\2\u0398\u039c\5\u00b0Y\2\u0399\u039c" +
                    "\5Z.\2\u039a\u039c\5d\63\2\u039b\u0397\3\2\2\2\u039b\u0398\3\2\2\2\u039b" +
                    "\u0399\3\2\2\2\u039b\u039a\3\2\2\2\u039c\u00ad\3\2\2\2\u039d\u039e\t\7" +
                    "\2\2\u039e\u00af\3\2\2\2\u039f\u03a5\7$\2\2\u03a0\u03a5\7>\2\2\u03a1\u03a5" +
                    "\7C\2\2\u03a2\u03a5\7\62\2\2\u03a3\u03a5\7F\2\2\u03a4\u039f\3\2\2\2\u03a4" +
                    "\u03a0\3\2\2\2\u03a4\u03a1\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4\u03a3\3\2" +
                    "\2\2\u03a5\u00b1\3\2\2\2\u03a6\u03ab\5\u00b4[\2\u03a7\u03a8\7X\2\2\u03a8" +
                    "\u03aa\5\u00b4[\2\u03a9\u03a7\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03a9" +
                    "\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u00b3\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ae" +
                    "\u03b1\5\u00c8e\2\u03af\u03b0\7\\\2\2\u03b0\u03b2\5\u00d2j\2\u03b1\u03af" +
                    "\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u00b5\3\2\2\2\u03b3\u03c2\t\b\2\2\u03b4" +
                    "\u03c3\7\u0089\2\2\u03b5\u03b7\5\u0132\u009a\2\u03b6\u03b5\3\2\2\2\u03b6" +
                    "\u03b7\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03ba\7S\2\2\u03b9\u03bb\5\u00b8" +
                    "]\2\u03ba\u03b9\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc" +
                    "\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c0\7T\2\2\u03bf\u03c1\5\u0132" +
                    "\u009a\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c3\3\2\2\2\u03c2" +
                    "\u03b4\3\2\2\2\u03c2\u03b6\3\2\2\2\u03c3\u00b7\3\2\2\2\u03c4\u03c5\5\u00ba" +
                    "^\2\u03c5\u03c6\5\u00be`\2\u03c6\u03c7\7W\2\2\u03c7\u00b9\3\2\2\2\u03c8" +
                    "\u03ca\5\u00bc_\2\u03c9\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03c9" +
                    "\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u00bb\3\2\2\2\u03cd\u03d1\5\u00aeX" +
                    "\2\u03ce\u03d1\5Z.\2\u03cf\u03d1\5d\63\2\u03d0\u03cd\3\2\2\2\u03d0\u03ce" +
                    "\3\2\2\2\u03d0\u03cf\3\2\2\2\u03d1\u00bd\3\2\2\2\u03d2\u03d7\5\u00c0a" +
                    "\2\u03d3\u03d4\7X\2\2\u03d4\u03d6\5\u00c0a\2\u03d5\u03d3\3\2\2\2\u03d6" +
                    "\u03d9\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u00bf\3\2" +
                    "\2\2\u03d9\u03d7\3\2\2\2\u03da\u03e1\5\u00c8e\2\u03db\u03dd\5\u00c8e\2" +
                    "\u03dc\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df" +
                    "\7b\2\2\u03df\u03e1\5\u0136\u009c\2\u03e0\u03da\3\2\2\2\u03e0\u03dc\3" +
                    "\2\2\2\u03e1\u00c1\3\2\2\2\u03e2\u03e8\7\61\2\2\u03e3\u03e5\7\u0089\2" +
                    "\2\u03e4\u03e3\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7" +
                    "\7b\2\2\u03e7\u03e9\5\u00d4k\2\u03e8\u03e4\3\2\2\2\u03e8\u03e9\3\2\2\2" +
                    "\u03e9\u03f5\3\2\2\2\u03ea\u03ef\5\u0132\u009a\2\u03eb\u03ec\7S\2\2\u03ec" +
                    "\u03ed\5\u00c4c\2\u03ed\u03ee\7T\2\2\u03ee\u03f0\3\2\2\2\u03ef\u03eb\3" +
                    "\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f6\3\2\2\2\u03f1\u03f2\7S\2\2\u03f2" +
                    "\u03f3\5\u00c4c\2\u03f3\u03f4\7T\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03ea\3" +
                    "\2\2\2\u03f5\u03f1\3\2\2\2\u03f6\u040c\3\2\2\2\u03f7\u03f8\7L\2\2\u03f8" +
                    "\u03f9\7Q\2\2\u03f9\u03fa\5\u00d4k\2\u03fa\u03fb\7X\2\2\u03fb\u03fc\5" +
                    "\u0132\u009a\2\u03fc\u03fd\7R\2\2\u03fd\u03fe\7S\2\2\u03fe\u03ff\5\u00c4" +
                    "c\2\u03ff\u0400\7T\2\2\u0400\u040c\3\2\2\2\u0401\u0402\7M\2\2\u0402\u0403" +
                    "\7Q\2\2\u0403\u0404\5\u00d4k\2\u0404\u0405\7X\2\2\u0405\u0406\5\u0132" +
                    "\u009a\2\u0406\u0407\7R\2\2\u0407\u0408\7S\2\2\u0408\u0409\5\u00c4c\2" +
                    "\u0409\u040a\7T\2\2\u040a\u040c\3\2\2\2\u040b\u03e2\3\2\2\2\u040b\u03f7" +
                    "\3\2\2\2\u040b\u0401\3\2\2\2\u040c\u00c3\3\2\2\2\u040d\u0412\5\u00c6d" +
                    "\2\u040e\u040f\7X\2\2\u040f\u0411\5\u00c6d\2\u0410\u040e\3\2\2\2\u0411" +
                    "\u0414\3\2\2\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0416\3\2" +
                    "\2\2\u0414\u0412\3\2\2\2\u0415\u0417\7X\2\2\u0416\u0415\3\2\2\2\u0416" +
                    "\u0417\3\2\2\2\u0417\u00c5\3\2\2\2\u0418\u041b\5\u0132\u009a\2\u0419\u041a" +
                    "\7\\\2\2\u041a\u041c\5\u0104\u0083\2\u041b\u0419\3\2\2\2\u041b\u041c\3" +
                    "\2\2\2\u041c\u00c7\3\2\2\2\u041d\u0421\7m\2\2\u041e\u0420\5d\63\2\u041f" +
                    "\u041e\3\2\2\2\u0420\u0423\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0422\3\2" +
                    "\2\2\u0422\u0424\3\2\2\2\u0423\u0421\3\2\2\2\u0424\u0427\5\u00c8e\2\u0425" +
                    "\u0427\5\u00caf\2\u0426\u041d\3\2\2\2\u0426\u0425\3\2\2\2\u0427\u00c9" +
                    "\3\2\2\2\u0428\u042c\5\u0132\u009a\2\u0429\u042b\5\u00ccg\2\u042a\u0429" +
                    "\3\2\2\2\u042b\u042e\3\2\2\2\u042c\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d" +
                    "\u0440\3\2\2\2\u042e\u042c\3\2\2\2\u042f\u0430\7Q\2\2\u0430\u0431\5\u00c8" +
                    "e\2\u0431\u0435\7R\2\2\u0432\u0434\5\u00ccg\2\u0433\u0432\3\2\2\2\u0434" +
                    "\u0437\3\2\2\2\u0435\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0440\3\2" +
                    "\2\2\u0437\u0435\3\2\2\2\u0438\u0439\7Q\2\2\u0439\u043b\7q\2\2\u043a\u043c" +
                    "\5\u0132\u009a\2\u043b\u043a\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d\3" +
                    "\2\2\2\u043d\u043e\7R\2\2\u043e\u0440\5~@\2\u043f\u0428\3\2\2\2\u043f" +
                    "\u042f\3\2\2\2\u043f\u0438\3\2\2\2\u0440\u00cb\3\2\2\2\u0441\u0443\7U" +
                    "\2\2\u0442\u0444\5\u0104\u0083\2\u0443\u0442\3\2\2\2\u0443\u0444\3\2\2" +
                    "\2\u0444\u0445\3\2\2\2\u0445\u044c\7V\2\2\u0446\u0448\7Q\2\2\u0447\u0449" +
                    "\5\u00ceh\2\u0448\u0447\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044a\3\2\2" +
                    "\2\u044a\u044c\7R\2\2\u044b\u0441\3\2\2\2\u044b\u0446\3\2\2\2\u044c\u00cd" +
                    "\3\2\2\2\u044d\u0450\5\u00dan\2\u044e\u044f\7X\2\2\u044f\u0451\7\177\2" +
                    "\2\u0450\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u00cf\3\2\2\2\u0452\u0457" +
                    "\5\u00aaV\2\u0453\u0455\5\u00c8e\2\u0454\u0453\3\2\2\2\u0454\u0455\3\2" +
                    "\2\2\u0455\u0458\3\2\2\2\u0456\u0458\5\u00d6l\2\u0457\u0454\3\2\2\2\u0457" +
                    "\u0456\3\2\2\2\u0458\u00d1\3\2\2\2\u0459\u046b\5\u00fe\u0080\2\u045a\u045b" +
                    "\7S\2\2\u045b\u0460\5\u00d2j\2\u045c\u045d\7X\2\2\u045d\u045f\5\u00d2" +
                    "j\2\u045e\u045c\3\2\2\2\u045f\u0462\3\2\2\2\u0460\u045e\3\2\2\2\u0460" +
                    "\u0461\3\2\2\2\u0461\u0464\3\2\2\2\u0462\u0460\3\2\2\2\u0463\u0465\7X" +
                    "\2\2\u0464\u0463\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466\3\2\2\2\u0466" +
                    "\u0468\7T\2\2\u0467\u0469\7X\2\2\u0468\u0467\3\2\2\2\u0468\u0469\3\2\2" +
                    "\2\u0469\u046b\3\2\2\2\u046a\u0459\3\2\2\2\u046a\u045a\3\2\2\2\u046b\u00d3" +
                    "\3\2\2\2\u046c\u046d\5\u00ba^\2\u046d\u046e\5\u00d6l\2\u046e\u0471\3\2" +
                    "\2\2\u046f\u0471\5X-\2\u0470\u046c\3\2\2\2\u0470\u046f\3\2\2\2\u0471\u00d5" +
                    "\3\2\2\2\u0472\u0476\7m\2\2\u0473\u0475\5d\63\2\u0474\u0473\3\2\2\2\u0475" +
                    "\u0478\3\2\2\2\u0476\u0474\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0479\3\2" +
                    "\2\2\u0478\u0476\3\2\2\2\u0479\u048d\5\u00d6l\2\u047a\u047b\7Q\2\2\u047b" +
                    "\u047c\5\u00d6l\2\u047c\u047e\7R\2\2\u047d\u047f\5\u00d8m\2\u047e\u047d" +
                    "\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481" +
                    "\u048d\3\2\2\2\u0482\u0484\7U\2\2\u0483\u0485\5\u0104\u0083\2\u0484\u0483" +
                    "\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0488\7V\2\2\u0487" +
                    "\u0482\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u0487\3\2\2\2\u0489\u048a\3\2" +
                    "\2\2\u048a\u048d\3\2\2\2\u048b\u048d\3\2\2\2\u048c\u0472\3\2\2\2\u048c" +
                    "\u047a\3\2\2\2\u048c\u0487\3\2\2\2\u048c\u048b\3\2\2\2\u048d\u00d7\3\2" +
                    "\2\2\u048e\u0490\7U\2\2\u048f\u0491\5\u0104\u0083\2\u0490\u048f\3\2\2" +
                    "\2\u0490\u0491\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0499\7V\2\2\u0493\u0495" +
                    "\7Q\2\2\u0494\u0496\5\u00dan\2\u0495\u0494\3\2\2\2\u0495\u0496\3\2\2\2" +
                    "\u0496\u0497\3\2\2\2\u0497\u0499\7R\2\2\u0498\u048e\3\2\2\2\u0498\u0493" +
                    "\3\2\2\2\u0499\u00d9\3\2\2\2\u049a\u049f\5\u00d0i\2\u049b\u049c\7X\2\2" +
                    "\u049c\u049e\5\u00d0i\2\u049d\u049b\3\2\2\2\u049e\u04a1\3\2\2\2\u049f" +
                    "\u049d\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u00db\3\2\2\2\u04a1\u049f\3\2" +
                    "\2\2\u04a2\u04a4\5\u00dep\2\u04a3\u04a2\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5" +
                    "\u04a3\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u00dd\3\2\2\2\u04a7\u04b3\5\u00e2" +
                    "r\2\u04a8\u04b3\5\u00e0q\2\u04a9\u04b3\5\u00e4s\2\u04aa\u04b3\5\u00e8" +
                    "u\2\u04ab\u04b3\5\u00f4{\2\u04ac\u04b3\5\u00eav\2\u04ad\u04b3\5\u00ec" +
                    "w\2\u04ae\u04b3\5\u00eex\2\u04af\u04b3\5\u00a0Q\2\u04b0\u04b3\5\u00a2" +
                    "R\2\u04b1\u04b3\5\u009eP\2\u04b2\u04a7\3\2\2\2\u04b2\u04a8\3\2\2\2\u04b2" +
                    "\u04a9\3\2\2\2\u04b2\u04aa\3\2\2\2\u04b2\u04ab\3\2\2\2\u04b2\u04ac\3\2" +
                    "\2\2\u04b2\u04ad\3\2\2\2\u04b2\u04ae\3\2\2\2\u04b2\u04af\3\2\2\2\u04b2" +
                    "\u04b0\3\2\2\2\u04b2\u04b1\3\2\2\2\u04b3\u00df\3\2\2\2\u04b4\u04b5\5\u00fc" +
                    "\177\2\u04b5\u04b6\7W\2\2\u04b6\u04b9\3\2\2\2\u04b7\u04b9\7W\2\2\u04b8" +
                    "\u04b4\3\2\2\2\u04b8\u04b7\3\2\2\2\u04b9\u00e1\3\2\2\2\u04ba\u04bb\5\u0132" +
                    "\u009a\2\u04bb\u04bc\7b\2\2\u04bc\u04bd\5\u00dep\2\u04bd\u04c7\3\2\2\2" +
                    "\u04be\u04bf\7)\2\2\u04bf\u04c0\5\u0104\u0083\2\u04c0\u04c1\7b\2\2\u04c1" +
                    "\u04c2\5\u00dep\2\u04c2\u04c7\3\2\2\2\u04c3\u04c4\7-\2\2\u04c4\u04c5\7" +
                    "b\2\2\u04c5\u04c7\5\u00dep\2\u04c6\u04ba\3\2\2\2\u04c6\u04be\3\2\2\2\u04c6" +
                    "\u04c3\3\2\2\2\u04c7\u00e3\3\2\2\2\u04c8\u04ca\7\f\2\2\u04c9\u04c8\3\2" +
                    "\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cf\7S\2\2\u04cc" +
                    "\u04ce\5\u00e6t\2\u04cd\u04cc\3\2\2\2\u04ce\u04d1\3\2\2\2\u04cf\u04cd" +
                    "\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d2\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d2" +
                    "\u04d3\7T\2\2\u04d3\u00e5\3\2\2\2\u04d4\u04d7\5\u00a8U\2\u04d5\u04d7\5" +
                    "\u00dco\2\u04d6\u04d4\3\2\2\2\u04d6\u04d5\3\2\2\2\u04d7\u00e7\3\2\2\2" +
                    "\u04d8\u04d9\7\66\2\2\u04d9\u04da\7Q\2\2\u04da\u04db\5\u00fc\177\2\u04db" +
                    "\u04dc\7R\2\2\u04dc\u04df\5\u00dep\2\u04dd\u04de\7\60\2\2\u04de\u04e0" +
                    "\5\u00dep\2\u04df\u04dd\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e8\3\2\2" +
                    "\2\u04e1\u04e2\7E\2\2\u04e2\u04e3\7Q\2\2\u04e3\u04e4\5\u00fc\177\2\u04e4" +
                    "\u04e5\7R\2\2\u04e5\u04e6\5\u00dep\2\u04e6\u04e8\3\2\2\2\u04e7\u04d8\3" +
                    "\2\2\2\u04e7\u04e1\3\2\2\2\u04e8\u00e9\3\2\2\2\u04e9\u04ea\7K\2\2\u04ea" +
                    "\u04eb\7Q\2\2\u04eb\u04ec\5\u00fc\177\2\u04ec\u04ed\7R\2\2\u04ed\u04ee" +
                    "\5\u00dep\2\u04ee\u00eb\3\2\2\2\u04ef\u04f0\7\64\2\2\u04f0\u04f1\7Q\2" +
                    "\2\u04f1\u04f2\5\u00f0y\2\u04f2\u04f3\5\u00dep\2\u04f3\u00ed\3\2\2\2\u04f4" +
                    "\u04f5\7.\2\2\u04f5\u04f6\5\u00dep\2\u04f6\u04f7\7K\2\2\u04f7\u04f8\7" +
                    "Q\2\2\u04f8\u04f9\5\u00fc\177\2\u04f9\u04fa\7R\2\2\u04fa\u04fb\7W\2\2" +
                    "\u04fb\u00ef\3\2\2\2\u04fc\u04fd\5\u00fc\177\2\u04fd\u04ff\7W\2\2\u04fe" +
                    "\u0500\5\u00fc\177\2\u04ff\u04fe\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0501" +
                    "\3\2\2\2\u0501\u0503\7W\2\2\u0502\u0504\5\u00fc\177\2\u0503\u0502\3\2" +
                    "\2\2\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\7R\2\2\u0506" +
                    "\u0514\3\2\2\2\u0507\u0509\7W\2\2\u0508\u050a\5\u00fc\177\2\u0509\u0508" +
                    "\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050d\7W\2\2\u050c" +
                    "\u050e\5\u00fc\177\2\u050d\u050c\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u050f" +
                    "\3\2\2\2\u050f\u0514\7R\2\2\u0510\u0511\5\u00a6T\2\u0511\u0512\5\u00f2" +
                    "z\2\u0512\u0514\3\2\2\2\u0513\u04fc\3\2\2\2\u0513\u0507\3\2\2\2\u0513" +
                    "\u0510\3\2\2\2\u0514\u00f1\3\2\2\2\u0515\u0517\7W\2\2\u0516\u0518\5\u00fc" +
                    "\177\2\u0517\u0516\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0519\3\2\2\2\u0519" +
                    "\u051b\7W\2\2\u051a\u051c\5\u00fc\177\2\u051b\u051a\3\2\2\2\u051b\u051c" +
                    "\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u0523\7R\2\2\u051e\u051f\7\67\2\2\u051f" +
                    "\u0520\5\u00fc\177\2\u0520\u0521\7R\2\2\u0521\u0523\3\2\2\2\u0522\u0515" +
                    "\3\2\2\2\u0522\u051e\3\2\2\2\u0523\u00f3\3\2\2\2\u0524\u0525\79\2\2\u0525" +
                    "\u0526\5\u0132\u009a\2\u0526\u0527\7W\2\2\u0527\u0532\3\2\2\2\u0528\u0529" +
                    "\7,\2\2\u0529\u0532\7W\2\2\u052a\u052b\7&\2\2\u052b\u0532\7W\2\2\u052c" +
                    "\u052e\7?\2\2\u052d\u052f\5\u00fc\177\2\u052e\u052d\3\2\2\2\u052e\u052f" +
                    "\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0532\7W\2\2\u0531\u0524\3\2\2\2\u0531" +
                    "\u0528\3\2\2\2\u0531\u052a\3\2\2\2\u0531\u052c\3\2\2\2\u0532\u00f5\3\2" +
                    "\2\2\u0533\u0534\5\u00fa~\2\u0534\u0535\7\\\2\2\u0535\u0536\5\u00fc\177" +
                    "\2\u0536\u00f7\3\2\2\2\u0537\u0538\5\u00fa~\2\u0538\u00f9\3\2\2\2\u0539" +
                    "\u053a\7\13\2\2\u053a\u00fb\3\2\2\2\u053b\u0540\5\u00fe\u0080\2\u053c" +
                    "\u053d\7X\2\2\u053d\u053f\5\u00fe\u0080\2\u053e\u053c\3\2\2\2\u053f\u0542" +
                    "\3\2\2\2\u0540\u053e\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u00fd\3\2\2\2\u0542" +
                    "\u0540\3\2\2\2\u0543\u0549\5\u0102\u0082\2\u0544\u0545\5\u0126\u0094\2" +
                    "\u0545\u0546\5\u0100\u0081\2\u0546\u0547\5\u00fe\u0080\2\u0547\u0549\3" +
                    "\2\2\2\u0548\u0543\3\2\2\2\u0548\u0544\3\2\2\2\u0549\u00ff\3\2\2\2\u054a" +
                    "\u054b\t\t\2\2\u054b\u0101\3\2\2\2\u054c\u0556\5\u0106\u0084\2\u054d\u0551" +
                    "\7a\2\2\u054e\u0550\5\u0106\u0084\2\u054f\u054e\3\2\2\2\u0550\u0553\3" +
                    "\2\2\2\u0551\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0554\3\2\2\2\u0553" +
                    "\u0551\3\2\2\2\u0554\u0555\7b\2\2\u0555\u0557\5\u0106\u0084\2\u0556\u054d" +
                    "\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0103\3\2\2\2\u0558\u0559\5\u0102\u0082" +
                    "\2\u0559\u0105\3\2\2\2\u055a\u055f\5\u0108\u0085\2\u055b\u055c\7h\2\2" +
                    "\u055c\u055e\5\u0108\u0085\2\u055d\u055b\3\2\2\2\u055e\u0561\3\2\2\2\u055f" +
                    "\u055d\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0107\3\2\2\2\u0561\u055f\3\2" +
                    "\2\2\u0562\u0567\5\u010a\u0086\2\u0563\u0564\7g\2\2\u0564\u0566\5\u010a" +
                    "\u0086\2\u0565\u0563\3\2\2\2\u0566\u0569\3\2\2\2\u0567\u0565\3\2\2\2\u0567" +
                    "\u0568\3\2\2\2\u0568\u0109\3\2\2\2\u0569\u0567\3\2\2\2\u056a\u056f\5\u010c" +
                    "\u0087\2\u056b\u056c\7p\2\2\u056c\u056e\5\u010c\u0087\2\u056d\u056b\3" +
                    "\2\2\2\u056e\u0571\3\2\2\2\u056f\u056d\3\2\2\2\u056f\u0570\3\2\2\2\u0570" +
                    "\u010b\3\2\2\2\u0571\u056f\3\2\2\2\u0572\u0577\5\u010e\u0088\2\u0573\u0574" +
                    "\7q\2\2\u0574\u0576\5\u010e\u0088\2\u0575\u0573\3\2\2\2\u0576\u0579\3" +
                    "\2\2\2\u0577\u0575\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u010d\3\2\2\2\u0579" +
                    "\u0577\3\2\2\2\u057a\u057f\5\u0110\u0089\2\u057b\u057c\7o\2\2\u057c\u057e" +
                    "\5\u0110\u0089\2\u057d\u057b\3\2\2\2\u057e\u0581\3\2\2\2\u057f\u057d\3" +
                    "\2\2\2\u057f\u0580\3\2\2\2\u0580\u010f\3\2\2\2\u0581\u057f\3\2\2\2\u0582" +
                    "\u0588\5\u0114\u008b\2\u0583\u0584\5\u0112\u008a\2\u0584\u0585\5\u0114" +
                    "\u008b\2\u0585\u0587\3\2\2\2\u0586\u0583\3\2\2\2\u0587\u058a\3\2\2\2\u0588" +
                    "\u0586\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u0111\3\2\2\2\u058a\u0588\3\2" +
                    "\2\2\u058b\u058c\t\n\2\2\u058c\u0113\3\2\2\2\u058d\u0593\5\u0118\u008d" +
                    "\2\u058e\u058f\5\u0116\u008c\2\u058f\u0590\5\u0118\u008d\2\u0590\u0592" +
                    "\3\2\2\2\u0591\u058e\3\2\2\2\u0592\u0595\3\2\2\2\u0593\u0591\3\2\2\2\u0593" +
                    "\u0594\3\2\2\2\u0594\u0115\3\2\2\2\u0595\u0593\3\2\2\2\u0596\u0597\t\13" +
                    "\2\2\u0597\u0117\3\2\2\2\u0598\u059e\5\u011c\u008f\2\u0599\u059a\5\u011a" +
                    "\u008e\2\u059a\u059b\5\u011c\u008f\2\u059b\u059d\3\2\2\2\u059c\u0599\3" +
                    "\2\2\2\u059d\u05a0\3\2\2\2\u059e\u059c\3\2\2\2\u059e\u059f\3\2\2\2\u059f" +
                    "\u0119\3\2\2\2\u05a0\u059e\3\2\2\2\u05a1\u05a2\t\f\2\2\u05a2\u011b\3\2" +
                    "\2\2\u05a3\u05a9\5\u0120\u0091\2\u05a4\u05a5\5\u011e\u0090\2\u05a5\u05a6" +
                    "\5\u0120\u0091\2\u05a6\u05a8\3\2\2\2\u05a7\u05a4\3\2\2\2\u05a8\u05ab\3" +
                    "\2\2\2\u05a9\u05a7\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u011d\3\2\2\2\u05ab" +
                    "\u05a9\3\2\2\2\u05ac\u05ad\t\r\2\2\u05ad\u011f\3\2\2\2\u05ae\u05b4\5\u0124" +
                    "\u0093\2\u05af\u05b0\5\u0122\u0092\2\u05b0\u05b1\5\u0124\u0093\2\u05b1" +
                    "\u05b3\3\2\2\2\u05b2\u05af\3\2\2\2\u05b3\u05b6\3\2\2\2\u05b4\u05b2\3\2" +
                    "\2\2\u05b4\u05b5\3\2\2\2\u05b5\u0121\3\2\2\2\u05b6\u05b4\3\2\2\2\u05b7" +
                    "\u05b8\t\16\2\2\u05b8\u0123\3\2\2\2\u05b9\u05ba\7Q\2\2\u05ba\u05bb\5\u00d4" +
                    "k\2\u05bb\u05bc\7R\2\2\u05bc\u05bd\5\u0124\u0093\2\u05bd\u05c0\3\2\2\2" +
                    "\u05be\u05c0\5\u0126\u0094\2\u05bf\u05b9\3\2\2\2\u05bf\u05be\3\2\2\2\u05c0" +
                    "\u0125\3\2\2\2\u05c1\u05d2\5\u012a\u0096\2\u05c2\u05c3\7i\2\2\u05c3\u05d2" +
                    "\5\u0126\u0094\2\u05c4\u05c5\7j\2\2\u05c5\u05d2\5\u0126\u0094\2\u05c6" +
                    "\u05c7\5\u0128\u0095\2\u05c7\u05c8\5\u0124\u0093\2\u05c8\u05d2\3\2\2\2" +
                    "\u05c9\u05cf\7B\2\2\u05ca\u05cb\7Q\2\2\u05cb\u05cc\5\u00d4k\2\u05cc\u05cd" +
                    "\7R\2\2\u05cd\u05d0\3\2\2\2\u05ce\u05d0\5\u0126\u0094\2\u05cf\u05ca\3" +
                    "\2\2\2\u05cf\u05ce\3\2\2\2\u05d0\u05d2\3\2\2\2\u05d1\u05c1\3\2\2\2\u05d1" +
                    "\u05c2\3\2\2\2\u05d1\u05c4\3\2\2\2\u05d1\u05c6\3\2\2\2\u05d1\u05c9\3\2" +
                    "\2\2\u05d2\u0127\3\2\2\2\u05d3\u05d4\t\17\2\2\u05d4\u0129\3\2\2\2\u05d5" +
                    "\u05d9\5h\65\2\u05d6\u05d8\5\u012c\u0097\2\u05d7\u05d6\3\2\2\2\u05d8\u05db" +
                    "\3\2\2\2\u05d9\u05d7\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u012b\3\2\2\2\u05db" +
                    "\u05d9\3\2\2\2\u05dc\u05dd\7U\2\2\u05dd\u05de\5\u00fc\177\2\u05de\u05df" +
                    "\7V\2\2\u05df\u05ec\3\2\2\2\u05e0\u05e2\7Q\2\2\u05e1\u05e3\5\u0130\u0099" +
                    "\2\u05e2\u05e1\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05ec" +
                    "\7R\2\2\u05e5\u05e6\7Y\2\2\u05e6\u05ec\5\u0132\u009a\2\u05e7\u05e8\7Z" +
                    "\2\2\u05e8\u05ec\5\u0132\u009a\2\u05e9\u05ec\7i\2\2\u05ea\u05ec\7j\2\2" +
                    "\u05eb\u05dc\3\2\2\2\u05eb\u05e0\3\2\2\2\u05eb\u05e5\3\2\2\2\u05eb\u05e7" +
                    "\3\2\2\2\u05eb\u05e9\3\2\2\2\u05eb\u05ea\3\2\2\2\u05ec\u012d\3\2\2\2\u05ed" +
                    "\u05ee\t\20\2\2\u05ee\u012f\3\2\2\2\u05ef\u05f4\5\u00fe\u0080\2\u05f0" +
                    "\u05f1\7X\2\2\u05f1\u05f3\5\u00fe\u0080\2\u05f2\u05f0\3\2\2\2\u05f3\u05f6" +
                    "\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u0131\3\2\2\2\u05f6" +
                    "\u05f4\3\2\2\2\u05f7\u05f8\7\u0089\2\2\u05f8\u0133\3\2\2\2\u05f9\u05fa" +
                    "\7q\2\2\u05fa\u05fb\5\u00dep\2\u05fb\u0135\3\2\2\2\u05fc\u05fd\t\21\2" +
                    "\2\u05fd\u0137\3\2\2\2\u00ad\u013b\u014a\u0158\u0164\u0167\u016a\u016d" +
                    "\u0175\u0179\u017c\u017f\u0187\u018a\u018d\u0197\u019e\u01a1\u01a4\u01b7" +
                    "\u01c3\u01c8\u01cb\u01d8\u01e3\u01eb\u01f9\u0202\u020a\u0214\u0219\u0221" +
                    "\u0223\u022c\u0234\u023b\u0244\u0248\u024b\u0253\u0256\u0258\u025b\u0261" +
                    "\u0269\u0277\u027e\u0285\u028b\u028f\u0293\u0297\u029b\u029e\u02a5\u02ac" +
                    "\u02b3\u02c9\u02d5\u02e0\u02e6\u02ea\u02f1\u02f7\u02fb\u0303\u0309\u030f" +
                    "\u0314\u0318\u031f\u0322\u032c\u0331\u0337\u033a\u033d\u0349\u034e\u0350" +
                    "\u0376\u037a\u0386\u038d\u0395\u039b\u03a4\u03ab\u03b1\u03b6\u03bc\u03c0" +
                    "\u03c2\u03cb\u03d0\u03d7\u03dc\u03e0\u03e4\u03e8\u03ef\u03f5\u040b\u0412" +
                    "\u0416\u041b\u0421\u0426\u042c\u0435\u043b\u043f\u0443\u0448\u044b\u0450" +
                    "\u0454\u0457\u0460\u0464\u0468\u046a\u0470\u0476\u0480\u0484\u0489\u048c" +
                    "\u0490\u0495\u0498\u049f\u04a5\u04b2\u04b8\u04c6\u04c9\u04cf\u04d6\u04df" +
                    "\u04e7\u04ff\u0503\u0509\u050d\u0513\u0517\u051b\u0522\u052e\u0531\u0540" +
                    "\u0548\u0551\u0556\u055f\u0567\u056f\u0577\u057f\u0588\u0593\u059e\u05a9" +
                    "\u05b4\u05bf\u05cf\u05d1\u05d9\u05e2\u05eb\u05f4";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
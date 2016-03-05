// Converted to ANTLR 4 by Terence Parr; added @property and a few others.
// Seems to handle stuff like this except for blocks:
// https://google-api-objectivec-client.googlecode.com/svn/trunk/Examples/ShoppingSample/ShoppingSampleWindowController.m

/**
* ObjectiveC version 2
* based on an LL ansic grammars and
* and ObjectiveC grammar found in Learning Object C
*
* It's a Work in progress, most of the .h file can be parsed
* June 2008 Cedric Cuche
**/

grammar ObjC;

@lexer::members {
    public static final int PREPROCESSER_CHANNEL = 2;
    public static final int COMMENT_CHANNEL = 3;
}

translation_unit: external_declaration+ EOF;

external_declaration:
  preprocessor_declaration
| function_definition
| declaration
| class_interface
| class_implementation
| category_interface
| category_implementation
| protocol_declaration
| protocol_declaration_list
| class_declaration_list
| comment
;

preprocessor_declaration:
IMPORT
| INCLUDE
|  define_statement
| '#ifdef' expression
| '#if' expression
| '#undef' expression
| '#ifndef' expression
| '#endif';

define_statement :
 '#define' identifier constant_expression
;

macro_specification: '.+';

class_interface:
	'@interface'
	class_name (':' superclass_name)?
	protocol_reference_list?
	instance_variables?
	interface_declaration_list?
	'@end';

category_interface:
	'@interface'
	class_name '(' category_name? ')'
	protocol_reference_list?
	instance_variables?
	interface_declaration_list?
	'@end';

class_implementation:
	'@implementation'
	(
	class_name ( ':' superclass_name )?
	instance_variables?
	( implementation_definition_list )?
	)
	'@end';

category_implementation:
	'@implementation'(
	class_name '(' category_name ')'
	( implementation_definition_list )?
	)'@end';

protocol_declaration:
	'@protocol'(
	protocol_name ( protocol_reference_list )?
        (protocol_requirement)?
	( interface_declaration_list )?
	)'@end';

protocol_declaration_list:
	('@protocol' protocol_list';')
	;

protocol_requirement :
       '@optional'
       | '@required'
       ;

class_declaration_list:
	('@class' class_list';')
	;

class_list:
	class_name (',' class_name)*;

protocol_reference_list:
	('<' protocol_list '>');

protocol_list:
	protocol_name (',' protocol_name)*;

property_declaration
    : '@property' property_attributes_declaration? ib_outlet_specifier? struct_declaration
    ;

property_attributes_declaration
    : '(' property_attributes_list ')'
    ;

property_attributes_list
    : property_attribute (',' property_attribute)*
    ;

property_attribute
    : IDENTIFIER
    | IDENTIFIER '=' IDENTIFIER //  getter
    | IDENTIFIER '=' IDENTIFIER ':' // setter
    ;

ib_outlet_specifier
    : IDENTIFIER '(' class_name ')'
    | IDENTIFIER
    ;

class_name:
	identifier;

superclass_name:
	identifier;

category_name:
	IDENTIFIER;

protocol_name:
	IDENTIFIER;

instance_variables
    :   '{' struct_declaration* '}'  #instance_decl
    |   '{' visibility_specification struct_declaration+ '}' #instance_sdecl
    |   '{' struct_declaration+ instance_variables '}' #instance_idecl
    |   '{' visibility_specification struct_declaration+ instance_variables '}'
 #instance_sidecl   ;

visibility_specification:
	'@private'
	| '@protected'
	| '@package'
	| '@public'
;

interface_declaration_list:
	(declaration
        | class_method_declaration
        | instance_method_declaration
        | property_declaration)+
  ;
class_method_declaration:
	('+' method_declaration)
	;

instance_method_declaration:
	('-' method_declaration)
	;

method_declaration:
	( method_type )? method_selector ';';

implementation_definition_list
    : ( implementation_definition)+
    ;

implementation_definition :
      function_definition
      | declaration
      | class_method_definition
      | instance_method_definition
      | property_implementation
	;

class_method_definition:
	('+' method_definition)
	;

instance_method_definition:
	('-' method_definition)
	;

method_definition:
	(method_type)? method_selector (init_declarator_list)? ';'? compound_statement;

method_selector:
	selector |(keyword_declarator+ (parameter_list)? )
	;

keyword_declarator:
	selector? ':' method_type* identifier;

selector:
identifier | dotidentifier | 'retain';

method_type: '(' type_name ')';

property_implementation
    : '@synthesize' property_synthesize_list ';'
    | '@dynamic' property_synthesize_list ';'
    ;

property_synthesize_list
    : property_synthesize_item (',' property_synthesize_item)*
    ;

property_synthesize_item
    : IDENTIFIER | IDENTIFIER '=' IDENTIFIER
    ;

block_type:type_specifier '(''^' type_specifier? ')' block_parameters? ;

type_specifier:
       simple_type_specifier
	|	other_type_specifier
        ;

other_type_specifier :
		('id' ( protocol_reference_list )? )  #idTypeSpec
	|	(class_name ( protocol_reference_list )?) #classTypeSpec
	|	unusual_type_specifier #structTypeSpec
  ;
unusual_type_specifier :
	struct_or_union_specifier
        ;

simple_type_specifier:
        primitive_type_specifier
	|	identifier
	|	enum_specifier
        ;

primitive_type_specifier:
'void' | 'char' | 'short' | 'int' | 'long' | 'float' | 'double' | 'signed' | 'unsigned' ;

type_qualifier:
	'const'       #constTypeQualifier
        | 'volatile'  #ignoreTypeQualifier
        | protocol_qualifier #ignoreTypeQualifier
        ;

protocol_qualifier:
	'in' | 'out' | 'inout' | 'bycopy' | 'byref' | 'oneway';

primary_expression:
        simple_expression
	| parenthetical_expression
	| selector_expression
	;

simple_expression :
	identifier
	| constant
	| string_constant
	| ('(' expression ')')
	| self_expression
	| super_expression
	| message_expression
	| setter_call
	| getter_call
	| code_block
	| selector_expression
	| protocol_expression
	| encode_expression
	| dictionary_expression
    | array_expression
    | box_expression
    | block_expression
;


parenthetical_expression : ('(' expression ')')
        ;

self_expression : 'self' ;

super_expression : 'super' ;

unsupported_instruction :
	encode_expression
	| protocol_expression
        ;

string_constant:  STRING_LITERAL  | CSTRING_LITERAL;

dictionary_pair:
         postfix_expression':'postfix_expression;

dictionary_expression:
        '@''{' dictionary_pair? (',' dictionary_pair)* ','? '}';

array_expression:
        '@''[' postfix_expression? (',' postfix_expression)* ','? ']';

box_expression:
        '@' '(' (postfix_expression | expression) ')' |
        '@'constant;

block_parameters: '(' (type_variable_declarator | type_name | 'void')? (',' (type_variable_declarator | type_name))* ')';

block_expression:'^' type_specifier? block_parameters? compound_statement;

message_expression:
	'[' receiver message_selector ']' ('.' dotidentifier)?
	;

receiver:
	expression
	| class_name
	| message_expression;

message_selector:
	selector
	| keyword_argument+
	| identifier;

keyword_argument:
	selector? ':' expression;

selector_expression:
	'@selector' '(' selector_name ')';

selector_name:
	selector
	| (selector? ':')+;

protocol_expression:
	'@protocol' '(' protocol_name ')';

encode_expression:
	'@encode' '(' type_name ')';

exception_declarator:
	declarator;

type_variable_declarator:
	declaration_specifiers declarator;

try_statement:
	'@try' statement;

catch_statement:
	'@catch' '('exception_declarator')'statement;

finally_statement:
	'@finally' statement;

throw_statement:
	'@throw' '('IDENTIFIER')';

try_block:
        try_statement
        ( catch_statement)*
        ( finally_statement )?;

synchronized_statement:
	'@synchronized' '(' IDENTIFIER ')' statement;

autorelease_statement:
	'@autoreleasepool'  compound_statement;

function_definition : declaration_specifiers? declarator compound_statement ;

declaration_minus_semi : declaration_specifiers init_declarator_list? ;

declaration : declaration_minus_semi ';';

declaration_specifiers
  : (declaration_specifier)+ ;

declaration_specifier :
    arc_behaviour_specifier | storage_class_specifier | type_specifier | type_qualifier;
arc_behaviour_specifier: '__unsafe_unretained' | '__weak';
storage_class_specifier: 'auto' #ignoreStoreClass
          | 'register' #ignoreStoreClass
          | 'static'   #staticStoreClass
          | 'extern' #ignoreStoreClass
          | 'typedef' #ignoreStoreClass
          ;

init_declarator_list :	init_declarator (',' init_declarator)* ;
init_declarator : declarator ('=' initializer)? ;

struct_or_union_specifier: ('struct' | 'union')
  ( IDENTIFIER | identifier? '{' struct_declaration+ '}' identifier?) ;

struct_declaration : specifier_qualifier_list struct_declarator_list ';' ;

specifier_qualifier_list : (specifier_qualifier)+ ;

specifier_qualifier : arc_behaviour_specifier | type_specifier | type_qualifier ;

struct_declarator_list : struct_declarator (',' struct_declarator)*  ;

struct_declarator : declarator | declarator? ':' constant;

enum_specifier : 'enum' (IDENTIFIER? ':' type_name)?
  ( identifier ('{' enumerator_list '}')?
  | '{' enumerator_list '}')
  | 'NS_OPTIONS' '(' type_name ',' identifier ')' '{' enumerator_list '}'
  | 'NS_ENUM' '(' type_name ',' identifier ')' '{' enumerator_list '}' ;


enumerator_list : enumerator (',' enumerator)* ','? ;

enumerator : identifier ('=' constant_expression)?;

declarator :'*' type_qualifier* declarator | direct_declarator ;

direct_declarator : identifier declarator_suffix*
                  | '(' declarator ')' declarator_suffix*
		          | '(''^' identifier? ')' block_parameters;

declarator_suffix : '[' constant_expression? ']'
		  | '(' parameter_list? ')';

parameter_list : parameter_declaration_list ( ',' '...' )? ;

parameter_declaration
  : declaration_specifiers (declarator? | abstract_declarator) ;

initializer : assignment_expression
	    | '{' initializer (',' initializer)* (',')? '}' (',')? ;

type_name : specifier_qualifier_list abstract_declarator
          | block_type;

abstract_declarator : '*' type_qualifier* abstract_declarator #adecType
  | '(' abstract_declarator ')' abstract_declarator_suffix+ #adecRecurse
  | ('[' constant_expression? ']')+      #adecConst
  | #adecNone
  ;

abstract_declarator_suffix
  : '[' constant_expression? ']'
  | '('  parameter_declaration_list? ')' ;

parameter_declaration_list
  : parameter_declaration ( ',' parameter_declaration )* ;

statement_list : statement+ ;

statement
  : labeled_statement
  | semi_statement
  | compound_statement
  | selection_statement
  | jump_statement
  | while_statement
  | for_statement
  | do_while_statement
  | synchronized_statement
  | autorelease_statement
  | try_block
  ;

semi_statement
      : expression ';'
      | ';'
      ;

labeled_statement
  : identifier ':' statement    #labelid
  | 'case' constant_expression ':' statement #case
  | 'default' ':' statement #default ;

compound_statement :  ('@autoreleasepool')?'{' (compound_statement_parts)* '}' ;
compound_statement_parts : declaration|statement_list ;

selection_statement
  : 'if'     '(' expression ')' statement ('else' statement)? #ifstmt
  | 'switch' '(' expression ')' statement  #switch
  ;

while_statement :
   'while' '(' expression ')' statement ;

for_statement :
   'for' '(' for_complete statement ;

do_while_statement :
   'do' statement 'while' '(' expression ')' ';' ;

for_complete :
      expression ';' expression? ';' expression? ')'
      | ';' expression? ';' expression? ')'
      | declaration_minus_semi for_declaration_complete
      ;

for_declaration_complete:
             ';' expression? ';' expression? ')' # forcomplete1
             |  'in' expression ')'              # forcomplete2
             ;

jump_statement
  : 'goto' identifier ';'
  | 'continue' ';'
  | 'break' ';'
  | 'return' expression? ';'
  ;

setter_call :
    dotidentifier '=' expression
;

getter_call :
    dotidentifier
;

dotidentifier : DOTIDENTIFIER;

expression : assignment_expression (',' assignment_expression)* ;

assignment_expression
    :   conditional_expression
    |   unary_expression assignment_operator assignment_expression
    ;

assignment_operator:
  '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=';

conditional_expression : logical_or_expression
  ('?' logical_or_expression* ':' logical_or_expression)? ;


constant_expression : conditional_expression ;

logical_or_expression :	logical_and_expression
  ('||' logical_and_expression)* ;

logical_and_expression : inclusive_or_expression
  ('&&' inclusive_or_expression)* ;

inclusive_or_expression : exclusive_or_expression
  ('|' exclusive_or_expression)* ;

exclusive_or_expression : and_expression ('^' and_expression)* ;

and_expression : equality_expression ('&' equality_expression)* ;

equality_expression : relational_expression
  (equality_op relational_expression)* ;

equality_op :
     '!=' | '=='
     ;

relational_expression : shift_expression
 (relational_op shift_expression)* ;

relational_op :
     '<' | '>' | '<=' | '>='
     ;

shift_expression : additive_expression (shift_op additive_expression)* ;

shift_op :
'<<' | '>>'
   ;

additive_expression : multiplicative_expression
  (add_op multiplicative_expression)* ;

add_op :
'-' | '+'
   ;


multiplicative_expression : cast_expression
  (multiply_op  cast_expression)* ;

multiply_op :
  '*' | '/' | '%'
   ;

cast_expression : '(' type_name ')' cast_expression | unary_expression ;

unary_expression
  : postfix_expression
  | '++' unary_expression
  | '--' unary_expression
  | unary_operator cast_expression
  | 'sizeof' ('(' type_name ')' | unary_expression) ;

unary_operator : '&' | '*' | '-' | '~' | '!' ;

postfix_expression : primary_expression
  ( postfix_expression_complete)* ;

postfix_expression_complete :
  '[' expression ']'
  | '(' argument_expression_list? ')'
  | '.' identifier
  | '->' identifier
  | '++'
  | '--'
   ;

comment :
  COMMENT | LINE_COMMENT
  ;

argument_expression_list
  : assignment_expression (',' assignment_expression)* ;

identifier : IDENTIFIER;

code_block : '^' statement ;

constant : DECIMAL_LITERAL | HEX_LITERAL | OCTAL_LITERAL | CHARACTER_LITERAL | FLOATING_POINT_LITERAL;

DOTIDENTIFIER :
  IDENTIFIER '.' IDENTIFIER ('.' IDENTIFIER)*
;

// LEXER

// ��3.9 Keywords

AUTORELEASEPOOL : '@autoreleasepool';
CATCH           : '@catch';
CLASS           : '@class';
DYNAMIC         : '@dynamic';
ENCODE          : '@encode';
END             : '@end';
FINALLY         : '@finally';
IMPLEMENTATION  : '@implementation';
INTERFACE       : '@interface';
PACKAGE         : '@package';
PROTOCOL        : '@protocol';
OPTIONAL        : '@optional';
PRIVATE         : '@private';
PROPERTY        : '@property';
PROTECTED       : '@protected';
PUBLIC          : '@public';
SELECTOR        : '@selector';
SYNCHRONIZED    : '@synchronized';
SYNTHESIZE      : '@synthesize';
THROW           : '@throw';
TRY             : '@try';

SUPER           : 'super';
SELF            : 'self';


ABSTRACT      : 'abstract';
AUTO          : 'auto';
BOOLEAN       : 'boolean';
BREAK         : 'break';
BYCOPY        : 'bycopy';
BYREF         : 'byref';
CASE          : 'case';
CHAR          : 'char';
CONST         : 'const';
CONTINUE      : 'continue';
DEFAULT       : 'default';
DO            : 'do';
DOUBLE        : 'double';
ELSE          : 'else';
ENUM          : 'enum';
EXTERN        : 'extern';
FLOAT         : 'float';
FOR           : 'for';
ID            : 'id';
IF            : 'if';
IN            : 'in';
INOUT         : 'inout';
GOTO          : 'goto';
INT           : 'int';
LONG          : 'long';
ONEWAY        : 'oneway';
OUT           : 'out';
REGISTER      : 'register';
RETURN        : 'return';
SHORT         : 'short';
SIGNED        : 'signed';
SIZEOF        : 'sizeof';
STATIC        : 'static';
STRUCT        : 'struct';
SWITCH        : 'switch';
TYPEDEF       : 'typedef';
UNION         : 'union';
UNSIGNED      : 'unsigned';
VOID          : 'void';
VOLATILE      : 'volatile';
WHILE         : 'while';

NS_OPTIONS          : 'NS_OPTIONS';
NS_ENUM             : 'NS_ENUM';
WWEAK               : '__weak';
WUNSAFE_UNRETAINED  : '__unsafe_unretained';
TYPEOF              : '__typeof';


LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';
STRUCTACCESS    : '->';
AT              : '@';

// Operators

ASSIGN          : '=';
GT              : '>';
LT              : '<';
BANG            : '!';
TILDE           : '~';
QUESTION        : '?';
COLON           : ':';
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '!=';
AND             : '&&';
OR              : '||';
INC             : '++';
DEC             : '--';
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';
BITAND          : '&';
BITOR           : '|';
CARET           : '^';
MOD             : '%';
SHIFT_R         : '>>';
SHIFT_L         : '<<';

// Assignment

ADD_ASSIGN      : '+=';
SUB_ASSIGN      : '-=';
MUL_ASSIGN      : '*=';
DIV_ASSIGN      : '/=';
AND_ASSIGN      : '&=';
OR_ASSIGN       : '|=';
XOR_ASSIGN      : '^=';
MOD_ASSIGN      : '%=';
LSHIFT_ASSIGN   : '<<=';
RSHIFT_ASSIGN   : '>>=';
ELIPSIS         : '...';

// Property attributes
ASSIGNPA        : 'assign';
GETTER          : 'getter';
NONATOMIC       : 'nonatomic';
SETTER          : 'setter';
STRONG          : 'strong';
RETAIN          : 'retain';
READONLY        : 'readonly';
READWRITE       : 'readwrite';
WEAK            : 'weak';

IDENTIFIER
	:	LETTER (LETTER|'0'..'9')*
	;

fragment
LETTER
	:	'$'
	|	'A'..'Z'
	|	'a'..'z'
	|	'_'
	;

CHARACTER_LITERAL
    :   '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
    ;

/*
s_char = [[[any_char - '"'] - '\'] - nl] | escape_sequence;
string_literal = ('L' | '@') '"' s_char* '"';
*/

CSTRING_LITERAL
    :  STRING
    ;

STRING_LITERAL
    :  [L@] STRING
    ;

fragment
STRING : '"' ( EscapeSequence | ~('\\'|'"') )* '"' ;

HEX_LITERAL : '0' ('x'|'X') HexDigit+ IntegerTypeSuffix? ;

DECIMAL_LITERAL : ('0' | '1'..'9' '0'..'9'*) IntegerTypeSuffix? ;

OCTAL_LITERAL : '0' ('0'..'7')+ IntegerTypeSuffix? ;

fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
IntegerTypeSuffix
	:	('u'|'U'|'l'|'L' | 'UL' | 'ul')
	;

FLOATING_POINT_LITERAL
    :   ('0'..'9')+ ('.' ('0'..'9')*)? Exponent? FloatTypeSuffix?
	;

fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
FloatTypeSuffix : ('f'|'F'|'d'|'D') ;

fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   OctalEscape
    ;

fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

IMPORT : '#import' [ \t]* (STRING|ANGLE_STRING) WS -> channel(HIDDEN) ;
INCLUDE: '#include'[ \t]* (STRING|ANGLE_STRING) WS -> channel(HIDDEN) ;
PRAGMA : '#pragma' ~[\r\n]* -> channel(HIDDEN) ;

fragment
ANGLE_STRING
    :   '<' .*? '>'
    ;

WS  :  [ \r\n\t\u000C] -> channel(HIDDEN) ;

COMMENT
    :   '/*' .*? '*/'  -> channel(COMMENT_CHANNEL)
    ;

LINE_COMMENT
    : '//' ~[\r\n]*  -> channel(COMMENT_CHANNEL)
    ;

// ignore preprocessor defines for now

//HDEFINE : '#define' ~[\r\n]* -> channel(HIDDEN);
//HIF : '#if' ~[\r\n]* -> channel(HIDDEN);
//HELSE : '#else' ~[\r\n]* -> channel(HIDDEN);
//HUNDEF : '#undef' ~[\r\n]* -> channel(HIDDEN);
//HIFNDEF : '#ifndef' ~[\r\n]* -> channel(HIDDEN);
//HENDIF : '#endif' ~[\r\n]* -> channel(HIDDEN);

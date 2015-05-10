lexer grammar LiteralVars;



EQUALS      : '=';
BIGGER      : '>';
SMALLER     : '<';
BIGGEROREQ  : '>=';
SMALLEROREQ : '<=';
NOTEQUAL    : '!=';

NOT         : 'not';
AND         : 'and';
OR          : 'or';

SELECT      : 'select' ;
COMMA       : ',' ;
FROM        : 'from' ;
WHERE       : 'where' ;
AS          : 'as' ;
LPAREN      : '(' ;
RPAREN      : ')' ;
DOT         : '.' ;
LBRACK      : '[' ;
RBRACK      : ']' ;

TRUE        :'true';
FALSE       :'false';
NULL        :'null';

MUL         : '*' ;
DIV         : '/' ;
ADD         : '+' ;
SUB         : '-' ;


HexLiteral : '0' ('x'|'X') HexDigit+ IntegerTypeSuffix? ;

DecimalLiteral : ('0' | '1'..'9' '0'..'9'*) IntegerTypeSuffix? ;

OctalLiteral : '0' ('0'..'7')+ IntegerTypeSuffix? ;

fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
IntegerTypeSuffix : ('l'|'L') ;

FloatingPointLiteral
    :   ('0'..'9')+ '.' ('0'..'9')* Exponent? FloatTypeSuffix?
    |   '.' ('0'..'9')+ Exponent? FloatTypeSuffix?
    |   ('0'..'9')+ Exponent FloatTypeSuffix?
    |   ('0'..'9')+ FloatTypeSuffix
    |   ('0x' | '0X') (HexDigit )*
        ('.' (HexDigit)*)?
        ( 'p' | 'P' )
        ( '+' | '-' )?
        ( '0' .. '9' )+
        FloatTypeSuffix?
    ;

fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
FloatTypeSuffix : ('f'|'F'|'d'|'D') ;

CharacterLiteral
    :   '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
    ;

StringLiteral
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;


fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
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

ID          : [a-zA-Z] [a-zA-Z0-9]*;

WS          : [ \t\n\r]+ -> skip;


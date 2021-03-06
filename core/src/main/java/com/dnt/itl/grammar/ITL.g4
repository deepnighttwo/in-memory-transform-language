grammar ITL ;
import LiteralVars;

ql          : select from (where)?;
select      : SELECT propsSel (COMMA propsSel)*;
from        : FROM fromSource=ID (AS fromAlias=ID)?;
where       : WHERE boolExpr;


// prop part
propsSel    : propVar (AS ID)?;

propVar     : propFullName                                                          # DirectPropVar
            | LPAREN propVar RPAREN                                                 # Parens
            | propVar op=(MUL |DIV ) propVar                                        # MulDiv
            | propVar op=(ADD |SUB ) propVar                                        # AddSub
            | integerLiteral                                                        # IntVar
            | FloatingPointLiteral                                                  # FloatVar
            | CharacterLiteral                                                      # CharVar
            | StringLiteral                                                         # StringVar
            | booleanLiteral                                                        # BooleanVar
            | NULL                                                                  # NullVar
            | MAP ON propFullName USING ID collectionAgg                            # MapFuncVar
            | REDUCE ON propFullName USING ID collectionAgg                         # ReduceFuncVar
            | ID LPAREN propVar? (COMMA propVar)* RPAREN                            # FuncVar
            ;

collectionAgg: LPAREN propVar? (COMMA propVar)* RPAREN ;

propFullName: propName (DOT propName)*;

propName    : ID (LBRACK integerLiteral RBRACK)*
            ;

// bool part

boolExpr    : propVar compareOpr=(EQUALS | BIGGER | SMALLER | BIGGEROREQ | SMALLEROREQ | NOTEQUAL) propVar       # CompareBool
            | NOT boolExpr                                                                                       # NotBool
            | LPAREN boolExpr RPAREN                                                                             # ParenBool
            | boolExpr boolOprt=(AND|OR) boolExpr                                                                # ExprBool
            ;


integerLiteral
    :   HexLiteral
    |   OctalLiteral
    |   DecimalLiteral
    ;

booleanLiteral
    :   TRUE                                    # TrueBool
    |   FALSE                                   # FalseBool
    ;

//-----key words----

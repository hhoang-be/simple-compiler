lexer grammar C2PLexer;

options {language = Java;
}
// We want the generated lexer class to be in this package.
@header { package c2pproject.antlr; }  

//keywords
AUTO 	:	'auto';
BREAK	:	'break';
CASE	:	'case';
CHAR	:	'char';
CONST	:	'const'; 
CONTINUE:	'continue';
DEFAULT	:	'default';
DO		:	'do';
DOUBLE	:	'double';
ELSE	:	'else';
ENUM	:	'enum';
EXTERN	:	'extern';
FLOAT	:	'float';
FOR		:	'for';
GOTO	:	'goto';
IF		:	'if';
INT		:	'int';
LONG	:	'long';
REGISTER:	'register';
RETURN	:	'return';
SHORT	:	'short';
SIGNED	:	'signed';
SIZEOF	:	'sizeof';
STATIC	:	'static';
STRUCT	:	'struct';
SWITCH	:	'switch';
TYPEDEF	:	'typedef';
UNION	:	'union';
UNSIGNED:	'unsigned';
VOID	:	'void';
VOLATILE	:'volatile';
WHILE	:	'while';

IDENT  
  : LETTER (LETTER | DIGITS)*   
  ;  
    
//Literals
DIGITS  
  				:   '0'..'9'
  				;
 
fragment LLETTER
  				:   'a'..'z'
  				;

fragment UNDER_SCORES
  				: '_'
  				;

fragment ULETTER
  : 'A'..'Z'
  ;  

fragment LETTER 
  :   ULETTER | LLETTER | UNDER_SCORES
  ;
 
LIT_INT
  :   (DIGITS)+
  ;
 
LIT_FLOAT //refer to ANSI C Grammar for except case such as 10.89 E+3
  :   (DIGITS)+ '.' (DIGITS)+
  ; 
 
LIT_CHAR  //refer to ANSI C Grammar for exception cases - end section
  : '\''LETTER | DIGITS | UNDER_SCORES'\''
  ;

LIT_STRING  //refer to ANSI C Grammar for exception cases - end section
  : '"' (LETTER)* '"'
  ;
  
//White Space -- ignored. In case \r or \n, call newline() to increase the line_count in lexer
//Write code for newline() in C2PLexer later
WS  
  		:   (' '|'\t'|'\f') | (('\r'|'\n')) {$channel=HIDDEN;}
  		; 

/*
WS  
  		:   (' '|'\t'|'\f') | (('\r'|'\n'){newline();}) {$channel=HIDDEN;}
  		;
 */

//Inline comment
IL_COMMENT 
  : '//' (~('\n'|'\r'))* {$channel=HIDDEN;}
      ;

//Multi-line comment -- we dont calculate the comment into line_count
ML_COMMENT  options {greedy = false;} 
  : '/*' .* '*/' {$channel=HIDDEN;} 
  ;

  // Operators
DOT        : '.'   ;
BECOMES    : '=>'  ;
COLON      : ':'   ;
SEMI       : ';'   ;
COMMA      : ','   ;
EQUALS     : '='   ;
LBRACKET   : '['   ;
RBRACKET   : ']'   ;
DOTDOT     : '..'  ;
LPAREN     : '('   ;
RPAREN     : ')'   ;
NOT_EQUALS : '/='  ;
LT         : '<'   ;
LTE        : '<='  ;
GT         : '>'   ;
GTE        : '>='  ;
PLUS       : '+'   ;
MINUS      : '-'   ;
TIMES      : '*'   ;
DIV        : '/'   ;
L_C_BRACKET: '{'   ;
R_C_BRACKET: '}'   ;
grammar C2PParser;
options {k=2;}


@header { 
	package c2pproject.antlr;
	import java.util.Set; 
	import java.util.HashSet;}  
	  
@lexer::header{
	package c2pproject.antlr;     
} 

@members {  
	ASTNode tree_root = new compoundStatementNode();
	ASTTree ast_tree = new ASTTree();
	boolean isFuncCall = false;
} 
 
programFile  returns[ASTNode retval] 
//Open 01 scope here for the entire file
		:	(source = sourceCode {ast_tree.mergeSibling(tree_root, source);})* EOF
		  {tree_root.parent = tree_root; retval = tree_root;}  
		;


sourceCode	returns[ASTNode retval]	//(1)
options {k=1;} 
@init{
  ASTNode commonRoot = new ASTNode();
  commonRoot.nodeType = "subroot";
}
		: (typeName declarator '{')=> func = functionDefinition {ast_tree.adoptChild(commonRoot, func); retval = commonRoot;}
		  | glob = globalDecl {retval = glob;}
		;	


globalDecl returns[ASTNode retval]    		//(2) 
		: ('typedef' name=typeName varlist = identList SEMI)	
		|((modifier = CONST)? name = typeName initlist = initDeclarationList SEMI) 
		{retval = ((VarDeclNode)initlist).assignAttributes($modifier, name);}
		;
		

typeName  returns [TypeDescriptor retval] 		//(3B)
		: (name =VOID {retval = new VoidTypeDescriptor();}   
		| name =CHAR {retval = new CharTypeDescriptor();} 
		|name =INT {retval = new IntTypeDescriptor();} 
		|name =FLOAT {retval = new FloatTypeDescriptor();}) 
		| structname = structSpecifier  
		;



/*typeSpecifier		//(3C)
		: (variableType | typeName)+	
		;*/


structSpecifier	 returns [ASTNode retval] 	//(4) 
options {k=3;}
		: 'struct' IDENT '{' structDeclList '}' 
		| 'struct' IDENT
		; 


structDeclList	 returns [ASTNode retval] 	//(5)
		: (typeName identList SEMI)+ 
		;

initDeclarationList	 returns [ASTNode retval] //(6) 
@init{
	ASTNode commonRoot = new VarDeclNode();
	ASTTree tree_adapter = new ASTTree();
	commonRoot.nodeType = "VarDeclNode";
}
		: initDecl_1 = initDeclarator {tree_adapter.adoptChild(commonRoot, initDecl_1);} 
		(COMMA initDecl_2 = initDeclarator {tree_adapter.adoptChild(commonRoot, initDecl_2);})*
		{return commonRoot;} 	
		;
		
		
initDeclarator	 returns [ASTNode retval] 	//(7) 
		: declName = declarator (EQUALS exprValue = expression)? 
		{retval = (new VarDeclNode(declName, exprValue));}
		;


declarator		 returns [ASTNode retval] //(8)
		: declaratorName = IDENT (declref = declaratorReference)? 
		{ if(declref != null){
		      declref.nameASTNode = $declaratorName.getText();
		      retval = declref;
		  } else{
		      retval = new declaratorNode($declaratorName);
		  }
		} 
		;


declaratorReference	 returns [ASTNode retval] //(9) 
		: 		
		 LBRACKET (expr = expression) RBRACKET {retval = new declaratorNode(expr);}
			//Fixed size array
		| LPAREN (parameterlist = formalParameterList) RPAREN {retval = new funcDefNode(parameterlist);}
			//To declare function/procedure with formal parameters
		| DOT varName = IDENT 			
			//struct variable
		| LPAREN expr = expression (COMMA expr = expression)* RPAREN {retval = new callNode(null,expr);}
		| LPAREN RPAREN {if(isFuncCall){retval = new callNode();} else {retval = new funcDefNode();}}
		;
		//C does not allow to declare array without pre-defied size such as int a[];


expressionList  returns[ASTNode retval]
    : expr = expression (COMMA expr = expression)*
    ;

//Not used in initDeclarator
initializer		 returns [ASTNode retval] //(10)
		: EQUALS expression 
		;

declaratorList
		:
		declarator (COMMA declarator)*
		;

identList		 returns [ASTNode retval] //(11)
@init{
    exprsNode temp = null, head = null;
}
		: identName = IDENT {head = new exprsNode($identName); temp = head;} 
		 (COMMA identName_1 = IDENT {temp.more = new exprsNode($identName_1); temp = temp.more;})*
		 {return head;}	  
		;

actualParameterList	returns [ASTNode retval]
@init{
	exprsNode temp = null, head = null;
}
		: expr_1 = expression {head = new exprsNode(expr_1); temp = head;} 
		  (COMMA expr_2 = expression{temp.more = new exprsNode(expr_2); temp = temp.more;})*
		  {return head;}
		;

formalParameterList	 returns [typeItem retval] //(12)
@init{
    typeItem temp = null, head = null;
}
		: paraList = parameterDeclaration {head = paraList; temp = head;}  
		(COMMA paraList = parameterDeclaration {temp.next = paraList; temp = paraList;})*
		{return head;} 	
		;


parameterDeclaration	 returns [typeItem retval] //(13)
		: name = typeName (varName = IDENT)? {retval = (new typeItem(name, $varName));}
		;

 

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                      EXPRESSIONS
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

leftValue 			returns [ASTNode retval]
		: name = IDENT {retval = new declaratorNode($name);} 
		  | name = IDENT LBRACKET expr = expression RBRACKET {retval = new declaratorNode(expr); retval.nameASTNode = $name.getText();}
		; 


assignmentStat		 returns [ASTNode retval] //(16)
@init{
    isFuncCall = true;
}
		: decl = leftValue EQUALS (expr = expression SEMI {retval = (new AssignmentNode(decl, expr));})
		{isFuncCall = false;}
		; 



expression 		 returns [ASTNode retval] //(17)
  		: logic_1 = logicExpression ((operator = ('&&'|'||')) logic_2 = logicExpression)?
       {if(operator == null){
           retval = logic_1;
        } else{
           retval = new BinaryExprNode($operator, logic_1, logic_2);
        }
       }
  		; 


logicExpression	 returns [ASTNode retval] //(18)
		: equality_1 = equalityExpression ((operator = ('==' | '!=')) equality_2 = equalityExpression)?
       {if(operator == null){
           retval = equality_1;
        } else{
           retval = new BinaryExprNode($operator, equality_1, equality_2);
        }
       }
		;
		

equalityExpression	 returns [ASTNode retval] //(19)
  		: adding_1 = addingExpression((operator = (NOT_EQUALS|GT|GTE|LT|LTE)) adding_2 = addingExpression)?
       {if(operator == null){
           retval = adding_1;
        } else{
           retval = new BinaryExprNode($operator, adding_1, adding_2);
        }
       }
  		;


addingExpression 	 returns [ASTNode retval] //(20)
  		: multiply_1 = multiplyingExpression ((operator = (PLUS|MINUS)) multiply_2 = multiplyingExpression)?
  		 {if(operator == null){
           retval = multiply_1;
        } else{
           retval = new BinaryExprNode($operator, multiply_1, multiply_2);
        }
       }
  		;


multiplyingExpression	 returns [ASTNode retval] //(21)
		  : sign_1 = signExpression	((operator = (TIMES|DIV|MOD)) sign_2 = signExpression)?
		   {if(operator == null){
		       retval = sign_1;
		    } else{
		       retval = new BinaryExprNode($operator, sign_1, sign_2);
		    }
		   }
  		;


signExpression		 returns [ASTNode retval] //(22)
  		: (operator = (PLUS|MINUS))? bool = booleanNegationExpression
  		{if(operator != null){
  		    retval = (new UnaryExprNode($operator, bool));
  		  } else{
  		    retval = bool;
  		  }
  		  }
  		;
 

booleanNegationExpression  returns [ASTNode retval] //23
  		: ((operator = '!'))? primitive = primitiveElement 
  		  {if(operator != null){
  		      retval = (new UnaryExprNode($operator, primitive));
  		    } else {
  		      retval = primitive; 
  		    }
  		    }
  		;
	
	
primitiveElement	 returns [ASTNode retval] //(24)
  		: constexpr = constExpression {retval = constexpr;}
  		| decl = declarator {retval = decl;}
   		| LPAREN expr = expression RPAREN {retval = expr;}
  		;


expressionStatement 	 returns [ASTNode retval] //(25)
		: SEMI   
		| exprstat = expression SEMI {retval = exprstat;}
		;	


constExpression		 returns [ASTNode retval] //(23)
		: value = LIT_INT {retval = new IntLiteralNode($value);}
		|value = LIT_FLOAT {retval = new FloatLiteralNode($value);}
		|value = LIT_CHAR {retval = new CharLiteralNode($value);}
		;  
		

// ----------------------------------------------------------------------------------------------
//                                      FUNCTON DEFINITION
//-----------------------------------------------------------------------------------------------
functionDefinition	 returns [ASTNode retval] //(26)
		: name = typeName decl = declarator compound = compoundStatement 
		  {((funcDefNode)decl).setReturnType(name);
		   ((funcDefNode)decl).isFuncDefinition = true;
		   ast_tree.adoptChild(decl, compound);retval = decl;} 
		;


statement	 returns [ASTNode retval] //(27)
		: assignstat = assignmentStat {retval = assignstat;}
		| ifstat = ifStatement {retval = ifstat;}
		| loopstat = loopStatement {retval = loopstat;}
		| jumpstat = jumpStatement  {retval = jumpstat;} 
		| iostat = ioStatement {retval = iostat;}
		| compstat = compoundStatement {retval = compstat;}
		| funcName = IDENT LPAREN (paraList = actualParameterList)? RPAREN SEMI {retval = new callNode($funcName, paraList);}
		//| LPAREN ('char'|'float'|'int') RPAREN expression
		;


compoundStatement returns [ASTNode retval] //(28B)
@init{
    compoundStatementNode commonRoot = new compoundStatementNode(); 
}
		: '{' (decl = globalDecl {ast_tree.mergeSibling(commonRoot, decl);})* 
		      (statlist = statementList {ast_tree.mergeSibling(commonRoot, statlist);})? '}' 
		   {retval = commonRoot;}
		;


statementList	returns[ASTNode retval]
@init{
    ASTNode commonRoot = new ASTNode(); 
    commonRoot.nodeType = "statementList";
}
		: (stat = statement {ast_tree.adoptChild(commonRoot, stat);})+
		  {retval = commonRoot;}
		;
		
		
//Tam thoi chua cho truong hop khong can {}
ifStatement		 	returns [ASTNode retval] //(28)
		: IF LPAREN expr = expression RPAREN thenstat = statement 
		(((ELSE) => ELSE elsestat = statement)
		|())
		{retval = (new ifNode(expr, thenstat, elsestat));}
		; 


loopStatement		 returns [ASTNode retval] //(29)
		: WHILE LPAREN expr1 = expression RPAREN stat1 = statement
		{retval = (new whileNode(expr1, stat1));}
		| DO stat2 = statement WHILE LPAREN expr2 = expression RPAREN
		{retval = (new doWhileNode(expr2, stat2));}
		//| FOR LPAREN exprstat1 = expressionStatement exprstat2 = expressionStatement expr3 = expression RPAREN stat3 = statement
		//{retval = (new forNode(exprstat1, exprstat2, expr3, stat3));}
		| FOR LPAREN exprstat1 = assignmentStat exprstat2 = expression SEMI expr3 = assignmentStat RPAREN '{' stat3 = statement? '}'
    {retval = (new forNode(exprstat1, exprstat2, expr3, stat3));}  
		;	

 
jumpStatement	returns[ASTNode retval]	//(29B)
		: stat1 = 'goto' label = IDENT SEMI {retval = new labeledStmtNode($stat1, $label);}
		|  ((stat2 = 'continue') | (stat2 = 'break')) SEMI {retval = new labeledStmtNode($stat2, null);}
		| label = IDENT ':' {retval = new labeledStmtNode($label, null);}
		| 'return' (expr = expression)? SEMI {retval = new returnNode(expr);} 
		;  
 

ioStatement			 returns [ASTNode retval] //(30)
		: scanfstat = scanfStatement {retval = scanfstat;}
		| printstat = printfStatement {retval = printstat;}
		;	


scanfStatement		 returns [ASTNode retval] //(31)
		: SCANF LPAREN formatString = LIT_STRING (COMMA '&' decl = declarator) RPAREN SEMI
		{retval = new scanfStatementNode($formatString, decl);} 
		; 

printfStatement		 returns [ASTNode retval] //(32)
		: PRINTF LPAREN formatString = LIT_STRING (COMMA expr = expression )? RPAREN SEMI
		  {retval = new printfStatementNode($formatString, expr);}
		;


// ----------------------------------------------------------------------------------------------
//                                      KEY WORDS
//-----------------------------------------------------------------------------------------------

AUTO 	:	'auto'	;     
BREAK	:	'break'	;
CASE	:	'case'	;	
CHAR	:	'char'	;
CONST	:	'const'	;
CONTINUE:	'continue';
DEFAULT	:	'default';
DO		:	'do'	;
DOUBLE	:	'double';
ELSE	:	'else'	;
ENUM	:	'enum'	;
EXTERN	:	'extern';
FLOAT	:	'float'	;
FOR		:	'for'	;
GOTO	:	'goto'	;
IF		:	'if'	;
INT		:	'int'	;
LONG	:	'long'	;
REGISTER:	'register';
RETURN	:	'return';
SHORT	:	'short'	;
SIGNED	:	'signed';
SIZEOF	:	'sizeof';
STATIC	:	'static';
STRUCT	:	'struct';
SWITCH	:	'switch';
TYPEDEF	:	'typedef';
UNION	:	'union'	;
UNSIGNED:	'unsigned';
VOID	:	'void'	;
VOLATILE:	'volatile';
WHILE	  :	'while'	;
PRINTF	:	'printf';
SCANF	  :	'scanf'	;
MOD		: 	'mod'	;	


IDENT  
  : LETTER (LETTER | DIGITS)*   
  ;  
    
// ----------------------------------------------------------------------------------------------
//                                      LITERALS
//-----------------------------------------------------------------------------------------------
fragment DIGITS  
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
 
LIT_FLOAT 
  :   (DIGITS)+ '.' (DIGITS)+
  ; 
 
LIT_CHAR  
  : '\''(LETTER | DIGITS | UNDER_SCORES)'\''
  ;

LIT_STRING  
  			: '"' (~('\n'|'\r'|'"'))* '"'
  			;
  

WS  
  		:   (' '|'\t'|'\u000C'|'\r'|'\n') {$channel = HIDDEN;}
  		; 



IL_COMMENT 
  		: '//' ~('\n'|'\r')* '\r'? '\n' {$channel = HIDDEN;}
          	;


ML_COMMENT  
  		: '/*' ( options {greedy=false;}: . )* '*/' {$channel=HIDDEN;}
  		;

LINE_COMMAND 
    		: '#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    		;
// ----------------------------------------------------------------------------------------------
//                                      OPERANDS
//-----------------------------------------------------------------------------------------------
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
D_QUOTE	   : '"'   ;
PERCENTAGE : '%'   ; 
REF		   : '&'   ;
EXCLAM	   : '!'   ; 
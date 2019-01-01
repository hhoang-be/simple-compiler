package c2pproject.antlr;

/*
 * loopStatement		 returns [ASTNode retval] //(29)
		: WHILE LPAREN expr1 = expression RPAREN stat1 = statement
		| DO stat2 = statement WHILE LPAREN expr2 = expression RPAREN
		| FOR LPAREN exprstat1 = expressionStatement exprstat2 = expressionStatement expr3 = expression RPAREN stat3 = statement 
		;	
 */
public class loopStatement_class {
	ASTNode sub_root;
	ASTTree tree_adapter = new ASTTree();
	
	//do-while and while-do statement
	loopStatement_class(ASTNode expr, ASTNode stat, String loopname){
		sub_root = new ASTNode();
		sub_root.nameASTNode = loopname;
		sub_root.nodeAttributes.nodeName = sub_root.nameASTNode;
		

		if (expr == null){
			System.out.println("Error in loopStatement_class. expression == null");
		}
		tree_adapter.adoptChild(sub_root, expr);
		
		if(stat == null){
			System.out.println("Error in loopStatement_class. stat == null");
		}
		tree_adapter.adoptChild(sub_root, stat);
		
	}
	
	
	//for - loop statement
	loopStatement_class(ASTNode exprstat1, ASTNode exprstat2, ASTNode expr3, ASTNode stat){
		sub_root = new ASTNode();
		sub_root.nameASTNode = "for";
		sub_root.nodeAttributes.nodeName = sub_root.nameASTNode;
		
		if(exprstat1 == null){
			System.out.println("Error in loopStatement_class. exprstat1 == null");
		}
		tree_adapter.adoptChild(sub_root, exprstat1);
		
		
		if(exprstat2 == null){
			System.out.println("Error in loopStatement_class. exprstat2 == null");
		}
		tree_adapter.adoptChild(sub_root, exprstat2);
		
		
		if(expr3 == null){
			System.out.println("Error in loopStatement_class. expr3 == null");
		}
		tree_adapter.adoptChild(sub_root, expr3);
		
		
		if(stat == null){
			System.out.println("Error in loopStatement_class. stat == null");
		}
		tree_adapter.adoptChild(sub_root, stat);
		
	}
	
	public ASTNode getRoot(){
		return sub_root;
	}
	

}

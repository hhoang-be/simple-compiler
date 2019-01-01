package c2pproject.antlr;

/*
 * ifStatement		 	returns [ASTNode retval] //(28)
		: IF LPAREN expr = expression RPAREN thenstat = statement 
		(((ELSE) => ELSE elsestat = statement)
		|())
		; 
 */

public class ifStatement_class {
	ASTNode sub_root;
	ASTTree tree_adapter = new ASTTree();
	
	ifStatement_class(ASTNode conditionPart, ASTNode ifPart, ASTNode elsePart){
		sub_root = new ASTNode();
		sub_root.nameASTNode = "if";
		sub_root.nodeAttributes.nodeName = sub_root.nameASTNode;
		
		ASTNode temp = new ASTNode();
		temp.nameASTNode = "conditionPart";
		temp.nodeAttributes.nodeName = temp.nameASTNode;
		
		tree_adapter.adoptChild(sub_root, temp);		
		if(conditionPart != null){
			tree_adapter.adoptChild(temp, conditionPart);
		}
		
		temp = new ASTNode();
		temp.nameASTNode = "ifPart";
		temp.nodeAttributes.nodeName = temp.nameASTNode;
		
		tree_adapter.adoptChild(sub_root, temp);
		if(ifPart != null){
			tree_adapter.adoptChild(sub_root, ifPart);
		}
		
		temp = new ASTNode();
		temp.nameASTNode = "elsePart";
		temp.nodeAttributes.nodeName = temp.nameASTNode;
		
		if(elsePart != null){
			tree_adapter.adoptChild(sub_root, elsePart);
		}
	}
	
	public ASTNode getRoot(){
		return sub_root;
	}
	
}

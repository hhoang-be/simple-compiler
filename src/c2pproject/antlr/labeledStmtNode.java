package c2pproject.antlr;
import org.antlr.runtime.*;

public class labeledStmtNode extends ASTNode {
	String stmtLabel;
	ASTNode stmt;
	
	labeledStmtNode(Token inputStmt, Token inputLabel){
		this.nodeType = "labeledStmtNode";
		this.nameASTNode = inputStmt.getText();
		
		if(inputLabel != null){
			this.stmtLabel = inputLabel.getText();
		} else {
			this.stmtLabel = null;
		}
		
	}
	
	//get the type of outter statement of this jump
	protected String getKind(){
		ASTNode tempNode = this.parent;
		String returnType;
		while(tempNode != null){
			if((tempNode.nodeType.equals("whileNode")) || (tempNode.nodeType.equals("doWhileNode")) || (tempNode.nodeType.equals("forNode"))){
				returnType = "iterator";
				return returnType;
			} else if(tempNode.nodeType.equals("switchNode")){
				returnType = "switch";
				return returnType;
			} else if(tempNode.nodeType.equals("funcDefNode")){
				returnType = "other";
				return returnType;
			}
			tempNode = tempNode.parent;
		}
		
		returnType = "other";
		return returnType;
	}
	
	public void Semantics(SymbolTableSet tableSet){

		if (this.nameASTNode.equals("continue")){
			if(!this.getKind().equals("iterator")){
				new GenerateError("Error. Continue statement must be enclosed in iterative statement.<labeledStmtNode.Semantics>");
			}
		} else if(this.nameASTNode.equals("break")){
			if((this.getKind().equals("iterator") == false) && (this.getKind().equals("switch") == false)){
				new GenerateError("Error. Break statement must be enclosed in iterative or switch statement.<labeledStmtNode.Semantics>");
			}
		} else if(this.nameASTNode.equals("goto")){
			if(this.stmtLabel != null ){
				labelListNode temp = tableSet.isLabelValid(this.stmtLabel);
				if(temp == null){
					new GenerateError("Error. Label " + this.stmtLabel + " does not exits.<labeledStmtNode.Semantics>");
				}
			} else {
				new GenerateError("Error. Goto statement must have label.<labeledStmtNode.Semantics>");
			}
			
		} else {
			tableSet.EnterLabel(this);
		}
	}
}

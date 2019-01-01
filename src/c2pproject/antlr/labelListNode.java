package c2pproject.antlr;

public class labelListNode {
	String label;
	ASTNode stmt;
	labelListNode next;
	
	labelListNode(String inputName){
		this.label = inputName;
		next = null;
		
	}

}

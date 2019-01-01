package c2pproject.antlr;
import org.antlr.runtime.*;

public class identNode extends ASTNode {
	
	identNode(String inputName){
		this.nodeType = "identNode";
		this.nameASTNode = inputName;
	}
	
	identNode(Token inputToken){
		if(inputToken!= null){
			this.nameASTNode = inputToken.getText();
		} else{
			System.out.println("Error in identNode. inputToken = null");
		}
	}

}

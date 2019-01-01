package c2pproject.antlr;

public class CommonFunction {
	boolean visitStatus = false;
	int variableAddress;
	CommonFunction(){
		
	}
	
	public void AssignAddress(ASTNode functionDef){
		
		

	}
	
	
	public void AssignLocalVariableAddress(ASTNode functionDef){

		functionDef.isVisisted = !visitStatus;
		ASTNode nextNode = functionDef.left_most_child;
		
		while(nextNode != null){
			if(nextNode.isVisisted == visitStatus){
				if(nextNode.nodeType.equals("VarDeclNode")){
					
					
				}
				
			}
		}
	}
}

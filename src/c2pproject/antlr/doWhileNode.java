package c2pproject.antlr;

import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class doWhileNode extends ASTNode {
	ASTNode condition;
	ASTNode loopBody;
	
	doWhileNode(ASTNode inputCondition, ASTNode inputLoopBody){
		this.nodeType = "doWhileNode";
		if(inputCondition != null){
			condition = inputCondition;
			loopBody = inputLoopBody;
			
			inputCondition.parent = this;
			inputLoopBody.parent = this;
		} else{
			System.out.println("Error in doWhileNode. condition == null");
		}
	}
	
	public void Semantics(SymbolTableSet tableSet){
		
		condition.Semantics(tableSet);
		
		TypeDescriptor conditionType = condition.ExprSemantics(tableSet);
		if(conditionType.typeName.equals("error")){
			new GenerateError("Error. Illegal conditional expression.<doWhileNode.Semantics>");
		}
		
		if(loopBody != null){
			loopBody.Semantics(tableSet);
		}
	}
	
	private String CreateUniqueLabel(){
		String uniqueLabel = "L_";
		UUID uniqueID = UUID.randomUUID();
		uniqueLabel = uniqueLabel + uniqueID;
		uniqueLabel = uniqueLabel.substring(0, 6);
		
		return uniqueLabel;
	}
	
	public void CodeGen(FileWriter fileWriter, SymbolTableSet tableSet){

		String doLabel = this.CreateUniqueLabel();
		String generatedCode = "";
		
		generatedCode = doLabel + ":" + this.lineCarret;
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
		
		if (this.loopBody != null){
			this.loopBody.CodeGen(fileWriter, tableSet);
		}
		
		if(this.condition != null){
			this.condition.CodeGen(fileWriter, tableSet);
		}
		
		generatedCode = "not" + this.lineCarret;
		generatedCode = generatedCode + "fjp " + doLabel + this.lineCarret;
		
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
		
	}
}

package c2pproject.antlr;

import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class whileNode extends ASTNode {
	ASTNode condition;
	ASTNode loopBody;
	
	whileNode(ASTNode inputCondition, ASTNode inputLoopBody){
		this.nodeType = "whileNode";
		if(inputCondition != null){
			condition = inputCondition;
			loopBody = inputLoopBody;
			
			inputCondition.parent = this;
			inputLoopBody.parent = this;
		} else{
			System.out.println("Error in whileNode. condition == null");
		}
	}
	
	public void Semantics(SymbolTableSet tableSet){
		
		condition.Semantics(tableSet);
		
		TypeDescriptor conditionType = condition.ExprSemantics(tableSet);
		if(conditionType.typeName.equals("error")){
			new GenerateError("Error. Illegal conditional expression.<whileNode.Semantics>");
			return;
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
		String conditionLabel = this.CreateUniqueLabel();
		String doLabel = this.CreateUniqueLabel();
		String generatedCode = "";
		
		generatedCode = "ujp " + conditionLabel + this.lineCarret;
		
		generatedCode = generatedCode + doLabel + ":" + this.lineCarret;
		
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
		
		if (this.loopBody != null){
			this.loopBody.CodeGen(fileWriter, tableSet);
		}
		
		generatedCode = conditionLabel + ":" + this.lineCarret;
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
		
		this.condition.CodeGen(fileWriter, tableSet);
		
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

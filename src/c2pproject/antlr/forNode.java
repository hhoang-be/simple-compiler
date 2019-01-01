package c2pproject.antlr;

import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class forNode extends ASTNode {
	ASTNode initializer;
	ASTNode condition;
	ASTNode increment;
	ASTNode loopBody;
	
	forNode(ASTNode inputInitializer, ASTNode inputCondition, ASTNode inputIncrement, ASTNode inputLoopBody ){
		this.nodeType = "forNode";
		if(inputInitializer != null){
			initializer = inputInitializer;
			inputInitializer.parent = this;
		} else{
			new GenerateError("Error in for loop. Initializer = null");
		}
		
		if(inputCondition != null){
			condition = inputCondition;
			inputCondition.parent = this;
		} else{
			new GenerateError("Error in for loop. Conditional expression = null");
		}
		
		if(inputIncrement != null){
			increment = inputIncrement;
			inputIncrement.parent = this;
		} else{
			new GenerateError("Error in for loop. Increment expression = null");
		}
		
		if(inputLoopBody != null){
			loopBody = inputLoopBody;
			inputLoopBody.parent = this;
		} else{
			System.out.println("Warning. No statement in for loop body.");
		}
	}
	
	
	public void Semantics(SymbolTableSet tableSet){
		
		condition.Semantics(tableSet);
		
		TypeDescriptor conditionType = condition.ExprSemantics(tableSet);
		if(conditionType.typeName.equals("error")){
			new GenerateError("Error. Illegal conditional expression.<forNode.Semantics>");
		}
		
		if(initializer != null){
			initializer.Semantics(tableSet);
		}
		
		if(increment != null){
			increment.Semantics(tableSet);
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
		String conditionLabel = this.CreateUniqueLabel();
		String generatedCode = "";
		
		if(this.initializer != null){
			this.initializer.CodeGen(fileWriter, tableSet);
		}
		
		generatedCode = "ujp " + conditionLabel + this.lineCarret;
		
		generatedCode = generatedCode + doLabel + ":" + this.lineCarret;
		
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
		
		if(this.loopBody != null){
			this.loopBody.CodeGen(fileWriter, tableSet);
		}
		
		if(this.increment != null){
			this.increment.CodeGen(fileWriter, tableSet);
		}
		
		generatedCode = conditionLabel + ":" + this.lineCarret;
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
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

package c2pproject.antlr;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class ifNode extends ASTNode{
	ASTNode condition;
	ASTNode thenPart;
	ASTNode elsePart;
	
	ifNode(ASTNode inputCondition, ASTNode inputThenPart, ASTNode inputElsePart){
		this.nodeType = "ifNode";
		if(inputCondition != null){
			condition = inputCondition;
			inputCondition.parent = this;
			thenPart = inputThenPart;
			elsePart = inputElsePart;
			
			if(thenPart != null){
				inputThenPart.parent = this;
			}
			
			if (elsePart != null){
				inputElsePart.parent = this;
			}
		} else{
			System.out.println("Error in ifNode. condition == null.<ifNode.Constructor>");
		}
	}
	
	public void Semantics(SymbolTableSet tableSet){
		condition.Semantics(tableSet);
		
		TypeDescriptor conditionType = condition.ExprSemantics(tableSet);
		
		if(conditionType.typeName.equals("error")){
			new GenerateError("Error. Illegal conditional expression.<ifNode.Semantics>");
		}
		
		if(thenPart != null){
			thenPart.Semantics(tableSet);	
		}
		
		if(elsePart != null){
			elsePart.Semantics(tableSet);
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
		String gooutLabel = this.CreateUniqueLabel();
		String falseLabel = this.CreateUniqueLabel();
		String generatedCode = "";
		
		if(this.condition != null){
			this.condition.CodeGen(fileWriter, tableSet);
		} else{
			System.out.println("Error. Condition == null.<ifNode.CodeGen>");
		}
		
		generatedCode = "fjp " + falseLabel + this.lineCarret;
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
		
		if(this.thenPart != null){
			this.thenPart.CodeGen(fileWriter, tableSet);
		}
		
		generatedCode = "ujp " + gooutLabel + this.lineCarret;
		
		generatedCode = generatedCode + falseLabel + ":" + this.lineCarret;
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
		
		if(this.elsePart != null){
			this.elsePart.CodeGen(fileWriter, tableSet);
		}
		
		generatedCode = gooutLabel + ":" + this.lineCarret;
		
		try{
			fileWriter.write(generatedCode);
			fileWriter.flush();
		} catch(IOException e1){
			e1.printStackTrace();
		}
		
	}
	
	
}

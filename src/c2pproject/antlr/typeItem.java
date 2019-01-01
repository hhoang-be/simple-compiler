package c2pproject.antlr;
import org.antlr.runtime.*;

public class typeItem{
	public String inputVarName = null;
	public TypeDescriptor type;
	public typeItem next;
	
	typeItem(TypeDescriptor inputType, Token inputName){
		if(inputType != null){
			type = inputType;
			next = null;
		} else{
			System.out.println("Error in typeItem. inputType == null <typeItem.Constructor>");
		}
		
		if(inputName != null){
			inputVarName =  inputName.getText();
		}
		
	}

}

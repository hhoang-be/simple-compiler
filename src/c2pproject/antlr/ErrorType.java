package c2pproject.antlr;

public class ErrorType extends TypeDescriptor {
	public String errMessage;
	
	ErrorType(){
		typeName = "error";
	}
	
	ErrorType(String err){
		errMessage = err;
	}

}

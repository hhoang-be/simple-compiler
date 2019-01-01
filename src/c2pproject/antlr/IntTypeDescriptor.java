package c2pproject.antlr;

public class IntTypeDescriptor extends TypeDescriptor {
	int variableaddress;
	
	IntTypeDescriptor(){
		typeSize = 1;
		typeName = "int";
		abbreviateTypeName = "i";
	}

}

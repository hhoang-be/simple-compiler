package c2pproject.antlr;

public class CharTypeDescriptor extends TypeDescriptor {
	int variableAddress;
	
	CharTypeDescriptor(){
		typeSize = 1;
		typeName = "char";
		abbreviateTypeName = "c";
	}

}

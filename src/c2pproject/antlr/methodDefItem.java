package c2pproject.antlr;

public class methodDefItem extends TypeDescriptor {
	public TypeDescriptor returnType;
	public typeItem argTypes;
	
	methodDefItem(typeItem inputTypeItem){
		this.typeName = "methodDefItem";
		argTypes = inputTypeItem;
	}
	
	methodDefItem(){
		this.typeName = "methodDefItem";
		argTypes = null;
	}

}

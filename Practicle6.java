public class Practicle6{
	public static void main(String[] args){
		ConstructorClass obj1 = new ConstructorClass();
		ConstructorClass obj2 = new ConstructorClass("parameterised");

		obj1.method();
		obj2.method();
	}
}

class ConstructorClass{

	String constructorType = "Null";

	ConstructorClass(){
	constructorType = "Default";
	}

	ConstructorClass(String calledConstructorType){
	constructorType = calledConstructorType;
	}

	void method(){
		System.out.println("I am "+constructorType+" constructor");
	}
}
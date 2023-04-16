public class Practicle5{
	public static void main(String[] args){

	IAmTheClass iAmTheObjectReferencVariable = new IAmTheClass();

	iAmTheObjectReferencVariable.method();

	iAmTheObjectReferencVariable.times++;

	iAmTheObjectReferencVariable.method();
	
	}
}

class IAmTheClass{
	int times = 1;
	void method(){
		System.out.println("class method called " + times +" times ");
	}
}
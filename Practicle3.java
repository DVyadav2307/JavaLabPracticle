public class Practicle3{
	public static void main(String args[]){
		int i = 1;
		System.out.println("\nPrinting in while loop\n======================");
		while(i<=5){
			System.out.println("I am loop no."+i);
			i++;
		}

		System.out.println("\nPrinting in do-while loop\n=========================");
		do{
		  System.out.println("I am loop no."+i);
		  i++;	
		}while(i<=5);
		
	}
}
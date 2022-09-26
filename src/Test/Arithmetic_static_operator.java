package Test;

public class Arithmetic_static_operator {
	
	public static void addition (int p,int r) {
		System.out.println("Addition = " +(p+r));
	}
	
	public static void subtraction (int p,int r) {
		System.out.println("subtraction = " +(p-r));
	}
	

	public static void multiplication (int p,int r) {
		System.out.println("multiplication = " +(p*r));
	}
	

	public static void division (int p,int r) {         //it gives quotient
		System.out.println("division = " +(p/r));
	}
	

	public static void remainder (int p,int r) {
		System.out.println(" remainder = " +(p%r));
	}
	
	public static void main(String[] args) {
		
	 int p = 20;
	 int r = 40;
	 System.out.println("priyanka pawar");
	 
	 //call static member directly OR by class type 
	 
	   addition(p,r);      // OR - Arithmetic_static_operator.addition (p,r);
	   subtraction(p,r);
	   multiplication(p,r);
	   division(p,r);
	    remainder(p,r);
	
	 
	 
	 
		

	}

}

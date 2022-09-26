package Test;

public class Arithmetic_nonstatic_operator {
	
	public void add (int a,int b) {
		System.out.println("Addition = "+(a+b));
	}
	
	public void sub (int a,int b) {
		System.out.println("subtraction = "+(a-b));
	}
	
	public void mul (int a,int b) {
		System.out.println("multiplication = "+(a*b));
	}
	
	public void div (int a,int b) {
		System.out.println("division = "+(b/a));
	}
	
	public void remainder (int a,int b) {
		System.out.println("remainder = "+(b%a));
	}
	
	public static void main(String[] args) {
		
		int a = 40;
		int b = 80;
		System.out.println("priyanka pawar");
		
		Arithmetic_nonstatic_operator rani = new Arithmetic_nonstatic_operator();  //non static member call by creating object
		
		rani.add(a, b);
		rani.sub(a, b);
		rani.mul(a, b);
		rani.div(a, b);
		rani.remainder(a, b);
		
		
		
		
		
		
	}

}

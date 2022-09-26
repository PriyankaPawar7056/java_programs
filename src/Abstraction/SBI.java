package Abstraction;

public class SBI extends RBI {

	@Override
	public void Loan() {
		System.out.println("Loan SBI - 8%");
		
	}

	@Override
	public void rateOfIneterest() {
		System.out.println("rateOfIneterest - 9%");
		
	}

	//ABSTRACT METHODS ko body CHILD CLASSES Provide karte hai
	
	//This is child class (SBI) Implementation
	
	public void m2() {
	
	System.out.println("I am m2");
	
	}

	
	
	
	
	
	
}

package Abstraction;

  public abstract class RBI {
	
	//ABSTRACT CLASS : Combination of Concrete methods and Abstract methods
	
	//If we make any method abstract inside a class , then that particular class (main class) will have to be made abstract
	
	//Abstract method : Method does not have body
	
	public abstract void Loan();         
	
	public abstract void rateOfIneterest();
	
	
	
	//Concrete method : Method have body
	
	public void m1() {
	
	System.out.println("I am RBI Protocol");
	
	
	}
	
	
		
	
}

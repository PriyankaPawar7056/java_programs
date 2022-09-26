package Abstraction;

public interface Abstraction_By_Interface {

	
	 public abstract void show();
	
	// void show();   *** If we write like this then it does not show error because compile automatically add public abstract in front of void show();
	
	default void display() {
	
	    //In Interface we can create default and static and private concrete methods
	}
	
	static void run() {
	
	
	
	}
	
	public static final int a=10;     //In Interface all variables are public static final 
	
	// int a=10; **** If we simply write int a=10; then compiler automatically add public static final in front of int a=10;
	
	private void eat() {
		
		//In Interface we can create private and default and static  concrete methods
		
	}
	
	
	


}












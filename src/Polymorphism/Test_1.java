package Polymorphism;

public class Test_1 {
	

	
	//same class = same name method
	//CAN WE OVERLOAD MAIN METHOD ---> YES
	
	public static void main() {
	
	System.out.println("1");
		
	}
	
	public static void main(int a) {
	
	System.out.println("2");
	
	}
	public static void main(String a) {
	
	System.out.println("3");
	
	}
	
	public static void main(String[] args) {
		
	   main();
	   main(1);
	   main("a");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

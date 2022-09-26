package Polymorphism;

public class Test {
	
	//Method Overloading
	
	//Polymorphism : Poly = Many &  Morphism= Forms
	//EX : Water ---> Solid , Liquid , Gases
	//Types of Polymorphism : 1) Compile time polymorphism / Static   ----> Method call at compile --> Method Overloading
	                     //   2) Run time Polymorphism / Dynamic  --> Method call at Run-time ---> Method overriding
	
	//Method Overloading CRITERIA
	//1) In same class
	//2) Same method name
	//3) Different Argument
	   //a) Change Sequence of argument
	   //b)Change No. of Argument
	   //c) Change Type of Argument
	public void m1 (String a, int b) {  //NO OF Argument 2 (String and Int)
	
	System.out.println("I am m1");   
		
	}
	public void m1 (int b , String a) {
	
	System.out.println("I am m2");          //2
	
	}
	
     public void m1 () {
    	 
    	 System.out.println("I am m_1");  //0
    	 
     }
     
     public void m1 (int a) {
    	 
    	 System.out.println("I am m_2");   //1- Argument
    	 
     }
     
     public static void m1 (String a) {
    	 
    	 System.out.println("I am m");   //1- Argument
    	 
     }
	public static void main(String[] args) {
		
		Test t=new Test ();  //create object because non-static method
		
		t.m1("Priyanka", 6);
		t.m1(6, "Priyanka");
		t.m1();
		t.m1(6);
	    m1("a");        //without creating object because static method
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

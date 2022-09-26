package AccessModifier_1;

public class Test_1 {
	
	//all access modifier present in the class and call then in main method
	
	   public int a=10;
	protected int b=20;
	          int c=30;  //default
      private int d=40;
	
	public static void main(String[] args) {
		
		//Access modifier helps to restrict the scope of class , method , constructor , variable
		//Types of Access modifier
		//1)Public  2) Protected 3)Default  4)Private
		
		Test_1 demo=new Test_1();
		
		System.out.println(demo.a);  //public
		System.out.println(demo.b);  //protected
		System.out.println(demo.c);  //default
		System.out.println(demo.d);  //private     
		
		// all access modifier present in the class we can easily call them in main method by creating object because non-static member
		
		
		
		
		
		
		
		
		
		
		
	}

}

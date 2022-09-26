package AccessModifier_1;

public class Test_2 {
	
	
 public static void main(String[] args) {
	 
	 //if 2 class in same package
		
		demo run=new demo();
		
		System.out.println(run.a);  //public
		System.out.println(run.b);  //protected
		System.out.println(run.c);  //default
		//System.out.println(run.d);  //private
		                        //if 2 class in same package then we can't call only 2nd class(i.e demo)private access modifier in main method
		
	}

}

  class demo{
	   
	       public int a=5;
		protected int b=10;
		          int c=15;  //default
		  private int d=20;
		   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  }
package Test;

public class Variables {
	
	int b=100;  //Instance variable (variable declare inside the class but outside methods,blocks,constructor)
    int f=33;
    
	static int c=50;  //static/class variable (variable declare inside the class by using static keyword )
	static int e=1000;

	public static void main(String[] args) {
		
		int a=10;  //local variable (variable declare inside the methods)
		
		//////STATIC MEMBER (TO CALL BY CLASS NAME)
		
		System.out.println(Variables.c);   //to call static methods or variables inside the main methods 
		                                   //output 50
		System.out.println(c);             // also we directly call c by print like this
		System.out.println(e);
		
		///////NON-STATIC (WE NEED TO CREAT OBJECT OF CLASS)
		
		//System.out.println(b);  ----(Don't call directly because error is show)
		//System.out.println(Variables.b);   ------(Don't call by class name, error is show)
		
		Variables v = new Variables();  // CREAT OBJECT //THIS IS A SYNTAX FOR OBJECT CREATION 
		                                //TO CALL NON-STATIC MEMBER INSIDE THE MAIN METHODS
		
		System.out.println(v.b);
		System.out.println(v.f);
		
		
		
		
		
		
		
	

	}

}

package Test;

public class Logical_operator {

	public static void main(String[] args) {
		
		//Logical Operator (&& , || , !)=( And , Or , Logical Not )
		  
		int a = 40;
		int b = 55;
		
		// And Logical Operator (&&)
		System.out.println("And Logical Operator (&&)");
		System.out.println(a<b && a>b);  // T && F   ---->It gives False 
		System.out.println(b>a && a!=b);  // T && T  --->It gives True
		System.out.println(a==b && b>a); // F && T  ---> It gives False
		System.out.println(a>b && a==b);  // F && F  --->It gives False
		
		// OR Logical Operator (||)
		System.out.println("OR Logical Operator (||)");
		System.out.println(a<b || a>b);  // T && F   ---->It gives True 
		System.out.println(b>a || a!=b);  // T && T  --->It gives True
		System.out.println(a==b || b>a); // F && T  ---> It gives True
		System.out.println(a>b || a==b);  // F && F  --->It gives False
		
		// Logical Not Operator (!) (condition result)
		System.out.println(" condition result(!)");
		System.out.println(!(a<b));  //True condition ---> but it gives False output
		System.out.println(!(a==b));  //False condition --->but it gives true output
		System.out.println(!(a!=b));  //True condition --> but it gives false output
		System.out.println(!(a>b));  //False condition ---> but it gives True output
		

	}

}

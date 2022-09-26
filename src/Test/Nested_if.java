package Test;

public class Nested_if {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		    if (a<b) {  //true      //if 1st condition false then directly else execute
		    		
		    		
		    	 System.out.println("a is less thab b");
		    	
		        if (b>c) //false
		           System.out.println("b is greater than c");
		        
                if(a!=b)   //TRUE
                	System.out.println("a is not equal to b ");
              
                if (c!=b)   //TRUE
                	System.out.println("c is not equal to b");
               
                if (c<=a)  //FALSE
                	System.out.println("c is less than equal to a");
              
                if (c<=b)  //FALSE is LESS THAN EQUAL TO b"
                    System.out.println("c is LESS THAN EQUAL TO b");
                
                
		    }
                else {
                	System.out.println("sorry");
                	System.out.println("above all condition are mismatch");
                }
      
		
		
		
		
		
		
		
		
		
		
	}
		
	}
		
	


package AccessModifier_2;

public class Test_6IMP {

	public static void main(String[] args) {
		
		//String is a non-primitive data type
				//string is a array of character   //syntax of array------> char [] c={'B','U','G'}
				//string is a sequence of character
				//in java string is an object
				//there are 2 ways to create string object
//1) by new keywords -----> String s=new String ("Bug");  ---->it store in heap memory in that SCP(String Constant Pool)-->It create 2 object
//2) by literals ----->  string s="Bug";  ----> it directly store in  SCP(String Constant Pool) ----> it create 1 object
				//public final class string extends object implements 3 interface{}	--> syntax
				//string object are immutable(unmodified/unchangeable)
				
		String s=new String ("Test");    //stored in Heap memory //using new keyword
		System.out.println(s);
		
		String p=new String ("Test");  
		System.out.println(s==p);   ////false because it create 2 object in Heap memory
		
           String s1="Test";    //stored in SCP(String Constant Pool)  //by literals
           System.out.println(s1);
		
		
		     String s2= "Test" ;   //stored in SCP(String Constant Pool)
		
		     System.out.println(s==s1);   //false because both stored in different memory (s stored in Heap memory and s1 stored in SCP)
		
		     System.out.println(s1==s2);//true because s1 and s2 both stored in SCP //and also it don't create object it refer the object
		     
		     System.out.println(s.equals(s1));  //content comparison ----> equals()--->true
		
		
		
		
		
		
		
		
		
	}

}

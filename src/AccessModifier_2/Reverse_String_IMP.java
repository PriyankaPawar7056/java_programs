package AccessModifier_2;

public class Reverse_String_IMP {

	public static void main(String[] args) {
		
		//Reverse String very IMP for Interview
		
		String s1="Priyanka Pawar";     
		String rev="";                       //for store purpose
		
		System.out.println(s1.length());     //14 because it count space too
		
	for(int i=s1.length()-1;i>=0;i--) {  

			rev=rev+s1.charAt(i);      
			
	}
	
		System.out.println(rev);              //rawap aknayirp
		
		//ORRR
		System.out.print(s1.charAt(7));
		System.out.print(s1.charAt(6));   //just remove ln in print 
		System.out.print(s1.charAt(5));
		System.out.print(s1.charAt(4));
		System.out.print(s1.charAt(3));
		System.out.print(s1.charAt(2));
		System.out.print(s1.charAt(1));
		System.out.print(s1.charAt(0));
		

		String s= new String ();
		
		
		
		
		
		
		
		

	}

}

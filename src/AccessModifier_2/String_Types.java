package AccessModifier_2;

public class String_Types {

	public static void main(String[] args) {
		
		//Methods Of String
		
		String s1="Ambition";  
		
		System.out.println(s1.length());   //8//length() ----> provide length string  --->int (return type)
		
		System.out.println(s1.charAt(0));  //t  //charAt(index)--->return char based index--->char (return type)
		
		System.out.println(s1.toUpperCase());  //AMBITION  //toUpperCase()--->string in upper case--->string (return type)
		
		System.out.println(s1.toLowerCase());  //ambition //toLowerCase()---> string in lower case--->string (return type)
		
		System.out.println(s1.concat("IsTheFirstStepToSucces"));//concat()--->append/join two string in single string--->string (return type)
		
		System.out.println(s1.contains("tion"));  //true //contains(char sequence)---boolean (return type)
		                                          //contains()--->he check in above string "tion" present or not if yes then gives true output
		System.out.println(s1.endsWith("on"));  //endsWith(suffix)--->boolean (return type)
		
		String file="datatest.pdf";
		
		if(file.endsWith(".pdf")) {
		System.out.println("send the file");
		}else {
		System.out.println("file format not supported");
		}
		
		System.out.println(s1.startsWith("Am"));  //true //startsWith(suffix)--->boolean (return type)
		
		System.out.println(s1.equals("Ambition")); //true //equals()-->content comparison--->case sensitive--->boolean (return type)
		
	    System.out.println(s1.equalsIgnoreCase("ambition")); //true //equalsIgnoreCase()-->content comparison--->case not sensitive--->boolean 
		
	    System.out.println(s1.isEmpty());	//false //isEmpty()--->boolean (return type)
		                                     //isEmpty : if length is zero then true otherwise false
		String s2="  the second step is action  ";
		
		System.out.println(s2.trim());  //the second step is action 
		                                //trim()---> remove start and end spaces--->string (return type)
		String s3="  Test  ";
		String replacedata=s3.replace('T', 'B');
		System.out.println( replacedata.trim());  //Best
		//ORR
		System.out.println(s3.replace('T', 'B'));  //  Best //without creating object
		
		String s4="abc@123gmail.com#123456789#PriyankaPawar";
				
		String [] a=s4.split("#");  //split("Regex")--->split string--->sub string--->string[]
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		
		String s5 = "";     //isEmpty : if length is zero then true otherwise false
		
		
		System.out.println(s5.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

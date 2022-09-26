package Test;

public class Jump_Statement_break {

	public static void main(String[] args) {
		

		//It is a type of CONTROL STATEMENT
				//(3) Jump Statement
				//(a) Break
		
		
		for (int a=0;a<=5;a++ ) {
			
			System.out.println(a);
			
		if(a==2) {             //0 1 2
			break;            //it is used to break looping statement execution condition
			                 //it breaks when it get true condition/cases
			                //if we print System.out.println(); after the break then only 0 1 print because condition breaks before the print
		}
		
	
		}
		System.out.println("ok!");
	}

}

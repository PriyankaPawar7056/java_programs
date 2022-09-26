package Abstraction;

public class Test {

	public static void main(String[] args) {
		
		SBI sbi=new SBI ();
		
		sbi.Loan();
		sbi.rateOfIneterest();
		sbi.m1();
		sbi.m2();
		HDFC hdfc=new HDFC ();
			hdfc.Loan();	
		hdfc.rateOfIneterest();
		hdfc.m1();
		
		//RBI rbi = new RBI();      //We can not create object of ABSTRACT CLASS but we can create a REFERANCE OF ABSTRACT CLASS
		
		
		RBI rbi=new SBI ();           //we can create REFERANCE
		
		rbi.Loan();
		rbi.rateOfIneterest();
		rbi.m1();
		//rbi.m2();     //we can not call (child class ) SBI method BECAUSE HE ONLY PROVIDE BODY That's why  he call only all RBI methods
		
		ICICI icici = new ICICI();
		
		icici.Loan();
        icici.rateOfIneterest();
        icici.m1();
        
        
        
	}

}

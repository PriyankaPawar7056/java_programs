package Method_Overriding;

public class Test {

	public static void main(String[] args) {
		
		RBI rbi=new RBI();
		System.out.println("Rate of Interest RBI = " +rbi.RateOfInterest());  //0
		
		
		SBI sbi=new SBI ();
		System.out.println("Rate of Interest SBI = " +sbi.RateOfInterest());  //8
		
		HDFC hdfc=new HDFC ();
		System.out.println("Rate of Interest HDFC = " +hdfc.RateOfInterest());  //9
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

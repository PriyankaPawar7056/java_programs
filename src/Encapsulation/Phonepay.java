package Encapsulation;

import java.util.Scanner;

public class Phonepay {

	public static void main(String[] args) {
		
		
		TJSB_Bank tjsb =new TJSB_Bank();
		
		System.out.println(tjsb.getBalance());
		
       tjsb.setBalance(5000);
		
		System.out.println(tjsb.getBalance());
		
		tjsb.setBalance(1000);
		
		System.out.println(tjsb.getBalance());
		
		tjsb.setBalance(2000);
		
	   System.out.println(tjsb.getBalance());
		
		SBI sbi=new SBI ();
		
		System.out.println(sbi.getBlance());  //String Default Value Is null
		
		sbi.setBlance("Priyanka");
		
		System.out.println(sbi.getBlance()); 
		
		
		
		
		
		
		
		
		
		
		

	}

}

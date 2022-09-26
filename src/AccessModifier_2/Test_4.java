package AccessModifier_2;

import AccessModifier_1.Test_3;

public class Test_4 extends Test_3{
	
	//when access modifier outside the package and call them through child class

	public static void main(String[] args) {
		
		Test_4 p=new Test_4();
		
		System.out.println(p.a);  //public
		System.out.println(p.b);  //protected
	  //  System.out.println(p.c);  //default
	  //  System.out.println(p.d);  //private
		                         // when we have 2 different package then we don't extend /(inheritance) default and private Access modifier

	}

}

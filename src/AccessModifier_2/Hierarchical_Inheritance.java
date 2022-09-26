package AccessModifier_2;

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		
		//multiple child class inherit single parent class --> Hierarchical_Inheritance
		//Hierarchical  Inheritance: single parent class inherited multiple child class //A(m1)--->B(m1,m2),C(m1,m3),D(m1,m4)
		A a=new A ();  //m1
		a.m1();
	
		B b=new B();   //m1,m2
		b.m2();
		b.m1();
		
		C c=new C();   //m1,m3
		c.m3();
		c.m1();

	}

}

   class A{
	
	      public void m1() {
		     System.out.println("I am m1");
	}
}
	class B extends A{
	
	public void m2(){
		System.out.println("I am m2");
	}
	}
	class C extends A{
	
	public void m3() {
		System.out.println("I am m3");
		
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	

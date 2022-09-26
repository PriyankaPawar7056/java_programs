package AccessModifier_2;

public class Multiple_Inheritance {
	
	//multiple  Inheritance : Multiple parent class inherited single child class //A(m1,m2),B(m1,m3)--->C
    // IN JAVA multiple inheritance is not possible through class because it create diamond ambiguity problem
	//but yes it is possible through interface --->class implements class (syntax)
	// class extends class ---> syntax
	//ambiguity problem means while compile code it shows error 
	//Those who don't have a body in java called as abstract --->(INTERFACE)
	//Those who have a body in java called concrete method --->(CLASSES)
	public static void main(String[] args) {
		
	//	C c=new C ();
		//c.m3();
		//c.m1();
	}

}

//class A{

    //  public void m1(){
       // System.out.println("I am m1");
   // }
//}
//class B{

      // public void m1() {
           // System.out.println("I am m2");
//}
//class C extends A,B {   //not possible in java without using interface
                        //it create diamond ambiguity problem
     // public void m3() {
     //      System.out.println("I am m3");
 //   }
//}










package AccessModifier_2;

public class SingleLevel_Inheritance extends Parent_class{
	
	//single level Inheritance :Single child class acquire properties and behavior of single parent class//A(m1)--->B(m1,m2)
	
	public void m2() {
		
		System.out.println("I am m2");
	}
	
	public static void main(String[] args) {
		
		SingleLevel_Inheritance S=new SingleLevel_Inheritance();
		
		S.m1();
		S.m2();
		S.m3();
		
                   //OOPs Consept (1) Inheritance
	}             // SingleLevel_Inheritance IT IS TYPE OF Inheritance
	              //Inheritance means : IT is mechanism in which child class acquire all the property and behavior of parent class 
	              // for Inheritance extends keyword used
	              //ADVANTAGES: CODE REUSABILITY AND IT HELPS TO ACHIVE RUNTIME POLYMORPHISM
	              //SYNTAX: Class childclass extends parentclass{
                           //             }
                  //TYPES:
	              //1)single level Inheritance :Single child class acquire properties and behavior of single parent class//A(m1)--->B(m1,m2)
	              //2)multi-level  Inheritance : A(m1)--->B(m1,m2)--->C(m1,m2,m3) 
	              //3)Hierarchical  Inheritance: single parent class inherited multiple child class //A(m1)--->B(m1,m2),C(m1,m3),D(m1,m4)
	              //4)multiple  Inheritance : Multiple parent class inherited single child class //A(m1,m2),B(m1,m3)--->C
	              //5)hybrid  Inheritance :It is combination of single level, multi-level, Hierarchical, multiple  Inheritance
}                                       //iT is not possible in java
                                        //A--->B--->C--->D,E--->F















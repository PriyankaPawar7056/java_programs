package AccessModifier_2;

public class Multilevel_Inheritance {
	
	//multi-level  Inheritance : A(m1)--->B(m1,m2)--->C(m1,m2,m3) 
	
	public static void main(String[] args) {
		
	 T a=new T ();  //M1
        a.m1();
        
     P b=new P();  //M2,M1
        b.m2();
        b.m1();
        
     L c=new L();  //M3,M2,M1
        c.m3();
        c.m2();
        c.m1();
		}

}

class T {

	public void m1() {
		System.out.println("I am m1");
	}
}

class P extends T{
	
    public void m2() {
	System.out.println("I am m2");
    }
}
class L extends P{

    public void m3() {
	System.out.println("I am m3");
    }
}











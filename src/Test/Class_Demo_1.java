package Test;

public class Class_Demo_1 {
	
	int a=75;
	
	static int b=66;

	public void play () {
		
		System.out.println("I am playing football");
	}
	public void eat() {
		System.out.println("i am eating mango");
	}
	public static void sing () {
		
		System.out.println("i am singing a song");
	}
	public static void run() {
		System.out.println("i am running");
	}
	public static void main(String[] args) {
		
	/////////static member we can call directly or by class name
		System.out.println(b);
		
		System.out.println(Class_Demo_1.b);
		
		Class_Demo_1.sing();
		
		Class_Demo_1.run();
		run();
		
		////////non-static member we call it by creating object
		Class_Demo_1 demo = new Class_Demo_1 ();
		
	   System.out.println(demo.a);
		
		demo.play();
		
		demo.eat();
		
		
		
		
		
	
		
		
		

	}

}

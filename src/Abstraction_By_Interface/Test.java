package Abstraction_By_Interface;

public class Test implements InterfaceI_1,Interface_2{

	

	@Override
	public void play() {
		System.out.println("I play cricket");
		
	}

	@Override
	public void display() {
		System.out.println("mobile display");
		
	}


public static void main(String[] args) {
	
	Test t=new Test();
	t.play();
	t.display();

}


}
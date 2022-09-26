package Test;

public class Inc_Dec_Operator {

	public static void main(String[] args) {
		
		//Increment and Decrement Operator
		
		int a = 50;
		//FOR INCREMENT
		System.out.println(++a);  //50+1=51  //pre-increment
		System.out.println(a++);  //51 ----> here 1 is add but it is not showing in console/output
		System.out.println(++a);  //52+1=53  ---> here 52 because pre-increment+1 i.e 53
		System.out.println(a++);  //53   //post-increment
		System.out.println(++a);  //54+1=55
		
		//FOR DECREMENT
		System.out.println(--a);  //55-1=54-->in Increment and Decrement Operator previous value will be consider for printing latest  
		System.out.println(a--);  //54   //post-decrement
		System.out.println(--a); //53-1=52 //pre-decrement
		
          for (int i=5;i<10;i++) {
			
			System.out.println(i);
		}
		
		
		

	}

}

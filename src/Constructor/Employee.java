package Constructor;

public class Employee {
	
	//it is used to reduce the lines of code
	//It is used to initialized an object
	
    //Instance variable
	    String Name;
        int Emp_ID;
	
  Employee(String Name,int Emp_ID){  //Name and Emp_ID is a LOCAL VARIABLE NAME so for this we use THIS keyword to refer current claas instance variable 
		
		this.Name=Name;
		this.Emp_ID=Emp_ID;
		
	}
	

	public static void main(String[] args) {
		
		Employee e=new Employee("Priyanka", 101);
		System.out.println("Employee : "+e.Name+" "+e.Emp_ID);
		
		Employee e1=new Employee("Rani" , 102);
		System.out.println("Employee : "+e1.Name+" "+e1.Emp_ID);
		
	}

}

package ClassObjects;

public class Employee {
	
	int empId;
	String empName;
	String desig;
	int salary;
	
	
	//Constructor
	/* Employee(int id , String name, String dept, int sal){
	 
		empId =id;
		empName=name;
		desig = dept;
		salary= sal;
	} */ 
	
	
	
	void setData(int id , String name, String dept, int sal) {
		
		empId =id;
		empName=name;
		desig = dept;
		salary= sal;
	}
	
	
	
	// Method Display to display all the values on console
	void display() {
		
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(desig);
		System.out.println(salary);

		
	}
	
	
	public static void main(String[] args) {
		
		// Assigning values to the class variables using Object ------> First Method
		
		//Object creation to access the Employee variables
		/*Employee emp = new Employee(); 
		emp.empId = 12585;
		emp.empName = "Rohan Das";
		emp.desig = "Tester";
		emp.salary = 45000;
		
		emp.display(); */ // We are calling he method here as the execution starts from the main 
		
//		System.out.println();
		
		/*Employee emp2 = new Employee(); 
		emp2.empId = 77545;
		emp2.empName = "Monika Singh Rathore";
		emp2.desig = "Technology Analyst";
		emp2.salary = 95000;
		
		emp2.display();  */  // We are calling he method here as the execution starts from the main 
		
		
		
		
		
		// Assigning values to the class variables using Constructor ------> Second Method
		
		/*Employee emp1 = new Employee(101, "Mohan Singh", "Developer", 154554);
		emp1.display();
		
		System.out.println();
		
		Employee emp2 = new Employee(102, "Palak Mujjal", "Tester", 774654);
		emp2.display(); */
		
		
		
		
		// Assigning values to the class variables using Methods ------> Third Method
		
		Employee emp1 = new Employee();
		emp1.setData(101, "Muskan", "Cybersecurity", 7897854);
		emp1.display();
		
		System.out.println();
		
		Employee emp2 = new Employee();
		emp2.setData(102, "Rohan Singh", "Support", 878546);
		emp2.display();
		
		
		
	}
}

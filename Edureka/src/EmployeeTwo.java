
public class EmployeeTwo {

	int empno;
	float salary;
	String name;

	//constructor with parameters passing
//	EmployeeTwo(int empno, float salary,String name) {
//		System.out.println("******");
//		
//		
//     this.empno = empno; 
//	 this.name = name; 
//	 this.salary = salary;
//		 
//
//	}

	
	//constructor with no parameters passing
	EmployeeTwo() {
	System.out.println("******");
	
  empno = 23; 
 name = "Toofan"; 
 salary = 345.09f;
	 	}

	
	void getDetails() {

		System.out.println(name + " | " + empno + " | " + salary);
	}

}

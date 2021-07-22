
public class ObjectTest1 {

	public static void main(String[] args) {

		//creating object for employee
		Employee emp = new Employee();
		
		//access the state of obj using reference
		System.out.println(emp.empno + " | "+emp.name+" | "+emp.salary); //0 | null | 0.0
		
		//access the state f obj using method
		emp.getDetails(); //0 | null | 0.0
		
		//to change the state of obj 
		//1) using reference
		emp.empno = 10;
		emp.name = "abc";
		emp.salary = 1500f;
		emp.getDetails(); //10 | abc | 1500.0

		
		//2) using method
		
		emp.setDetails();
		emp.getDetails(); //10 | bac | 5000.0
		

	}

}

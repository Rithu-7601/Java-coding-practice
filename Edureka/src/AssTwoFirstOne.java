import java.util.Scanner;

public class AssTwoFirstOne {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int id[] = new int[5];
		double salary[] = new double[5];
		String name[] = new String[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter employee ID");
			id[i] = sc.nextInt();
			System.out.println("Enter employee name");
			name[i] = sc.next();
			System.out.println("Enter employee salari");
			salary[i] = sc.nextDouble();
		}
		display(id, salary, name);

	}

	static void display(int id[], double salary[], String name[]) {

		System.out.println("---------------------------");
		System.out.println("ID\t Name\t Salary");

		System.out.println("---------------------------");

//		for (int i = 0; i < id.length; i++) {
//			System.out.println(id[i]);
//		}
//		for (int i = 0; i < name.length; i++) {
//			System.out.println("\t" + name[i]);
//		}
//		for (int i = 0; i < salary.length; i++) {
//			System.out.println("\t" + salary[i]);
//		}
		
		  for (int i = 0; i < 5; i++) {
	            System.out.println(id[i] + "      " + name[i] + "       " + salary[i]);
	        }
		
		
	}

}

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		
		printTables(num); //method call signature
		
	}
	static void printTables (int num) { // method passing parameters
		
		for(int i =1; i <= 10; i++) {
			
			int s = num * i;
			System.out.println(num + "*" + i+ "=" + s);
		}
		
	}

}

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		int n1 = 0, n2 = 1, count;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the count: ");
		count = sc.nextInt();
		
		for(int i = 0; i <= count; i++) {
			 System.out.print(n1+" ");
			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			
			sc.close();
		}
		
	}

}

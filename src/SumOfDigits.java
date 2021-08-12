import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		while(num > 0) {
			
			int last = num % 10;
			sum = sum + last;
			num = num / 10;
			
		}
		System.out.println(sum);
	}

}

import java.util.Scanner;

public class RevOfNum {

	public static void main(String[] args) {
		
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number ");
		int num = sc.nextInt();
		
		while(num > 0) {
			
			int last = num % 10;
			rev = rev * 10 + last;
			num = num /10;
		}
		System.out.println(rev);

	}

}

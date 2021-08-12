import java.util.Scanner;
public class SumOfNumInRange {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the starting range ");
		int start = sc.nextInt();
		
		System.out.println("enter the ending range");
		int end = sc.nextInt();
	
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}

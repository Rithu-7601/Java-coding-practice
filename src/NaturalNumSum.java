import java.util.Scanner;

public class NaturalNumSum {

	public static void main(String[] args) {
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the nth number ");
		int num = sc.nextInt();
		
		
		for(int i=1; i <= num; i++)
		{
			sum += i;
		}
		System.out.println(sum);

	}

}

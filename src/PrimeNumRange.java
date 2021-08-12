import java.util.Scanner;

public class PrimeNumRange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number ");
		int fnum = sc.nextInt();
		
		System.out.println("enter last number ");
		int lnum = sc.nextInt();
		
		for(int i = fnum; i <= lnum; i++) {
			
			//logic starts here
			int count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count++;
			}
			if(count == 2)
				System.out.println(i);
		}

	}

}

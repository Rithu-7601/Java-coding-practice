
import java.util.Scanner;
public class FactorialNumber
{
	public static void main(String args[])
	
	{
	
	int n, factorial = 1;
	Scanner sc = new Scanner (System.in);
	System.out.println("enter a number");
	 n = sc.nextInt();
	
	 for(int i=1; i <= n; i++) {
		factorial *= i;
		
	 }
	 System.out.println(factorial);
	
		
	}
 
}

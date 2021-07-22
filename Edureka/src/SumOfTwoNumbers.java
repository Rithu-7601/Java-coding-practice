import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first no: ");
		int fno = sc.nextInt();
		
		
		
		
		System.out.println("Enter second no: ");
		int sno = sc.nextInt();//2
		
		int sum = fno + sno;
		System.out.println("Sum = "+sum);
		System.out.println(fno + "+" + sno + "=" + sum );
		sc.nextLine();//\n
		
		System.out.println("enter your hobby: ");
		String s = sc.nextLine();
		System.out.println(s);
		
//		System.out.println("enter your hobbies: ");
//		String a = sc.nextLine();

		
		//		System.out.println(a);
//		int fno = Integer.parseInt(args[0]);// "10" -> 10
//		int lno = Integer.parseInt(args[1]);// "20" -> 20
//		int sum = fno + lno;
//		System.out.println("Sum = "+sum);   
	}

}

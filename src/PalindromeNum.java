import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a string ");
		String value1 = sc.next();
		
		//calculate the lenght of entred string
		int len = value1.length();
		
		//declare a var to store the reversed string
		String value2 = "";
		
		// loop to perform continuous iterations till the length of the string.
		for(int i = 0; i<len; i++) {
			
			//Pick out each character of the string by using charAt() function one by one
			//and store in the declared string variable in reverse order
			char ch = value1.charAt(i);
			value2 = ch + value2;		
		}
		
		System.out.println("the reversed string is  "+value2);
		
		//to check whether reversed string is palindrome or not
		if(value1.equals(value2)) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		

	}

}

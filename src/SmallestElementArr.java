import java.util.Scanner;

;

public class SmallestElementArr {

	public static void main(String[] args) {
		int len, min;
		Scanner sc = new Scanner(System.in);
		
		int []a = new int[100];
		System.out.println("Enter the length of the array: ");
		len = sc.nextInt();
		
		System.out.println("Enter the elements in the array ");
		for(int i =0; i < len; i++) {
			a[i] = sc.nextInt();
		}
		min = a[0];
		for(int i =0; i < len; i++) {
		if(min > a[i]) {
			min = a[i];
		}
		}
		System.out.println(min);
		}
		

	}



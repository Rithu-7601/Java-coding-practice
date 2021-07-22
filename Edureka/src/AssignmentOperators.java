
public class AssignmentOperators {

	public static void main(String[] args) {
	
		int n = 8;
		n *= 2;
		System.out.println(n);
		
		int a = 5;
		a *= a += 10; 
		System.out.println(a); //75
		
		int c = 2;
		c /= 2;
		System.out.println(c); //1
		
		int d = 15;
		d %= 3;
		System.out.println(d); // remainder 0
				
		
	}

}

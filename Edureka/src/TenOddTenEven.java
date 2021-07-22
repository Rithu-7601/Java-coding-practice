
public class TenOddTenEven {

	public static void main(String[] args) {
		
		System.out.println ("the even numbers:");
		for(int i = 1; i <=10; i++ ) {
			if(i % 2 == 0) {
		
				System.out.println (i);
			}
		}
		
		System.out.println ("the odd numbers:");
		for (int i = 1; i <= 10; i ++) {
			if(i % 2 != 0) {
				
				System.out.println(i);
			}
		}
		
	}

}

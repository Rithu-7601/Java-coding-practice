
public class NaturalNumbers {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 3; i++) {
		printNaturalNumbers ();
		}
		

	}//main method over
	
//	method defention to display first 10 natural no's
	static void printNaturalNumbers () {
		System.out.println("first 10 natural num are: ");
		int i;
		for (i = 1; i <= 10; i++) {
			
			if(i == 10) {
				System.out.println(i);
			}
			else
			{
			System.out.print(i + ", ");
			}
		}

	}
}

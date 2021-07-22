
public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {23, 34,56,67, 78, 91};
		
		System.out.println("No. of subjects: " +marks.length);
		
		for (int i = 0; i < marks.length; i++)
		{
			System.out.println("marks for subject - " +(i+1) + "=" + marks[i]);
		}
			
		
//		array iteration using enhanced for loop
		System.out.println("obtained marks are:");
		for (int mark : marks) {
			if (mark == 91) {
				System.out.println(mark);
			}
			
		else {
			System.out.print(mark +"|");
		}
		}
		}

	}



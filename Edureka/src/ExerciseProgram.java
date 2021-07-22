

public class ExerciseProgram {

	public static void main(String[] args) {
		int number = 23, sum = 0;  
		  
		while(number > 0)  
		{  
		
		  
		
		sum = sum + number % 10;  
		
		number = number / 10;  
		}  
		//prints the result  
		System.out.println("Sum of Digits: "+sum); 

	}

}


public class ArrayCreation {

	public static void main(String[] args) {
		
		int[] marks = new int[8];
				marks[0] = 23;
		        marks[1] = 34;
		        marks[2] = 45;
		        
		        System.out.println("array size: "+ marks.length);
		        
		        for(int i = 0; i < marks.length; i++) {
		        	System.out.print(marks[i]+ " ");
		        }
		        System.out.println();
		        
		        boolean []status = new boolean[6];
		        for(boolean stat : status)
		        {
		        	System.out.print(stat + " ");
		        }
		        System.out.println();
		        
		        String []names = new String[8];
		        names[0] = "Cat";
		        names[1] = "dog";
		        for (String name : names) {
		        	System.out.print(name+ " ");
		        }
 
	}

}

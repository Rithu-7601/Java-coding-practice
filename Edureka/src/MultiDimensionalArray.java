
public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] n = new int[5][4];
		n[1][1] = 1;
		n[2][3] = 4;
		
		System.out.println("size of the array = "+ n.length);
		
		for(int i=0; i<n.length; i++) {
			
			System.out.println("size of inner array : n["+i+"]"+" = "+n[i].length);
			
		}
		
			//to disp arr in matrix form 
		
 		for(int i=0; i<n.length; i++) {
			System.out.print("n["+i+"] --> ");
			for(int j=0; j<n[i].length; j++) {
				
				System.out.print(n[i][j]+ " ");
			}
			System.out.println();
		}
		

	}

}

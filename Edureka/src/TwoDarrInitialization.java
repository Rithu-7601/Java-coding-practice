
public class TwoDarrInitialization {

	public static void main(String[] args) {
		int[][] n = {{2,4,3},{1,5},{9,7,8,5}};
	
		
		System.out.println("size of the array = "+ n.length);
		
		for(int i=0; i<n.length; i++) {
			
			System.out.println("size of inner array : n["+i+"]"+" = "+n[i].length);
			
		}
		
			//to disp arr in matrix form 
		
 		for(int[] x: n) {
			
			for(int y : x) {
				
				System.out.print(y+ " ");
			}
			System.out.println();
		
	}

}
}
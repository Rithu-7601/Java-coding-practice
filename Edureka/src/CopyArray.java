
public class CopyArray {

	public static void main(String[] args) {
		int[] a= {12,13,14,15};
		int[] b = new int[a.length];

		for(int i=0; i < a.length; i++) {
			b[i] = a[i];
		}
		
		for(int i=0; i < a.length; i++) {
		System.out.println(a[i]);
		}
		
		for(int i=0; i < a.length; i++) {
			System.out.println(b[i]);
			}
		
	}

}

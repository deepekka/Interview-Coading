package array;

public class Copy_element_to_array {

	public static void main(String[] args) {
		int[]a= {1,5,6,25,63,2,6,66,45};
		int[]b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for (int i : b) {
			System.out.print(i+" ");
		}
	}
}

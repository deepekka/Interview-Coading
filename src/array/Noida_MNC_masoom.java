package array;

import java.util.Arrays;

public class Noida_MNC_masoom {

	public static void main(String[] args) {
		int []a= {1,2,5,7,3,8,0,4,65,87,3,6};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[0]);
			System.out.println(a[a.length-1]);
			System.out.println("--------------");
		}
	}
}

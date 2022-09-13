package array;

import java.util.Scanner;
import java.util.TreeSet;

public class Synopsis {

	public int smallest(int a[]) {
		TreeSet<Integer> t=new TreeSet<>();
		for(int i:a) {
		t.add(i);
		}
		System.out.println(t);
		int j=1,small;
			for(int num:t) {
				if(num!=j)
					small=j;
				else
					j++;
			}
			return j;
		}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Synopsis s=new Synopsis();
		System.out.println("enter size of array 'N'");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the number");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println(s.smallest(a));
		sc.close();
	}
}

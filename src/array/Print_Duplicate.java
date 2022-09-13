package array;

import java.util.Scanner;

public class Print_Duplicate {

public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		{
			System.out.println("Enter the number of element to be inserted");
			int n=sc.nextInt();
			int[]a=new int[n];
			System.out.println("enter the element");
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			sc.close();
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("element="+a[j]);
				}
				}
			}
}
}
}
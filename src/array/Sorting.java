package array;

import java.util.Scanner;

public class Sorting {

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
			for(int i=0;i<n;i++) {
				for(int j=0;j<n-1;j++)
				{
					if(a[j]>a[j+1]) {
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
		for (int i : a) {
			System.out.print(i+" ");
		}
		}
	}
}

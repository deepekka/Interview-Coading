package array;

import java.util.Scanner;

public class Remove_Duplicate {

public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		{
			System.out.println("Enter the number of element to be inserted");
			int n=sc.nextInt();
			int[]a=new int[n];
			System.out.println("enter the element in sorted order");
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			sc.close();
			int j=0;
			int temp[]=new int[a.length];
			for(int i=0;i<a.length-1;i++) {
				if(a[i]!=a[i+1])
				{
					temp[j]=a[i];
					j++;
				}
			}
			temp[j]=a[a.length-1];
			for (int i=0;i<=j;i++) {
				System.out.print(temp[i]);
			}
		}
		
}
}

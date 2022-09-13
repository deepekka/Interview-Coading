package array;

import java.util.Scanner;

public class Max_Min_Element {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	{
		//System.out.println("Enter the number of element to be inserted");
		int n=sc.nextInt();
		int[]a=new int[n];
		//System.out.println("enter the element ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		int temp;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
				
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		//System.out.println("max="+a[a.length-1]);
		System.out.println(a[0]);
	}
}
}

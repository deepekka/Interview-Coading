package array;

import java.util.Scanner;

public class Sum_of_array {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	{
		System.out.println("Enter the number of element to be inserted");
		int n=sc.nextInt();
		int[]a=new int[n];
		System.out.println("enter the element ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum="+sum);
	}
	
}
}

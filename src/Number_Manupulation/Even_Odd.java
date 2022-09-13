package Number_Manupulation;

import java.util.Scanner;

public class Even_Odd {
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	System.out.print("even numbers till "+n+" are= ");
	for(int i=2;i<=n;i++) {
		if(i%2==0) 
			System.out.print(i+" ");
	}
	System.out.println();
	System.out.print("odd numbers till "+n+" are=");
	for(int i=2;i<=n;i++) {
		if(i%2!=0) 
			System.out.print(i+" ");}
}
}
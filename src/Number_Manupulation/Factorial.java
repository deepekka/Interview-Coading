package Number_Manupulation;

import java.util.Scanner;

public class Factorial  {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		sc.close();
		int fact=1;
		if(n==0)
			System.out.println(1);
		else {
		while(n>0) {
			fact=fact*n;
			n--;
		}
		System.out.println(fact);
		}
	}
}

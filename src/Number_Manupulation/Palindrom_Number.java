package Number_Manupulation;

import java.util.Scanner;

public class Palindrom_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		sc.close();
		int remainder=0,sum=0,temp=n;
		while(n!=0) {
			remainder=n%10;
			sum=sum*10+remainder;
			n=n/10;
		}
		if(temp==sum) 
			System.out.println("Palindrom");
		else
			System.out.println("Not palindrome");
	}

}

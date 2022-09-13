package Number_Manupulation;

import java.util.Scanner;

public class Prime_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		sc.close();
		int flag=0;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) 
					flag++;
			}
			if(flag>0) 
				System.out.println("Not Prime");
			else
				System.out.println("prime");
		}
	}


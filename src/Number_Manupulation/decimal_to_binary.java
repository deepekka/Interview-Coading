package Number_Manupulation;

import java.util.Scanner;

public class decimal_to_binary {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		long n=sc.nextLong();
		int r=0;
		String binary="";
		while(n>0) {
			r=(int)n%2;
			binary=r+binary;
			n=n/2;
		}
		System.out.println(binary);
	}
}

//in built method
/*
public static void main(String args[]){  
System.out.println(Integer.toBinaryString(11));  
}
*/
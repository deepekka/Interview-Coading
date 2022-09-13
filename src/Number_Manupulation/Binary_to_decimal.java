package Number_Manupulation;

import java.util.Scanner;

public class Binary_to_decimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Binary_to_decimal btd=new Binary_to_decimal();
		System.out.println("Enter the binary number");
		long n=sc.nextLong();
		int r=0,deci=0,i=0;
		while(n>0) {
			r=(int)n%10;
			deci=deci+r*(int)(Math.pow(2,i));
			n=n/10;
			i++;
		}
		System.out.println(deci);
	}
}

//using string
/* 
public static void main(String args[]){  
String binaryString="1010";  
int decimal=Integer.parseInt(binaryString,2);  
System.out.println(decimal);  
}
*/
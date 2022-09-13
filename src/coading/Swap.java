package coading;

import java.util.Scanner;

//swap without using 3rd variable or any method
public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st word");
		String s1=sc.next();
		System.out.println("enter 2nd word");
		String s2=sc.next();
		sc.close();
		System.out.print("s1="+s1);
		System.out.println(" | s2="+s2);
		System.out.println("------------------");
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.print("s1="+s1);
		System.out.println(" | s2="+s2);
	}
}

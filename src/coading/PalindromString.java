package coading;

import java.util.Scanner;

public class PalindromString {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);{
			System.out.println("Enter the word");
			String s=sc.next();
			sc.close();
			String rev="";
			for(int i=s.length()-1;i>=0;i--) {
				 rev=rev+s.charAt(i);
			}
			System.out.println(rev);
			if(s.equals(rev))
				System.out.println("Palindrom");
			else
				System.out.println("Not Palindrom");
		}
	}

}

package coading;

import java.util.Scanner;

public class Vowels_and_Consonants {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		sc.close();
		s=s.replaceAll("\\W", "");//replace all special character and space 
		s=s.toUpperCase();
		int vowels=0,cons=0;
		int len=s.length();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A'|| s.charAt(i)=='E'|| s.charAt(i)=='I'|| 
					s.charAt(i)=='O'|| s.charAt(i)=='U') {
				vowels++;
			}
		}
		System.out.println("vowels= "+vowels);
		cons=len-vowels;
		System.out.println("Consonants= "+cons);
}
}

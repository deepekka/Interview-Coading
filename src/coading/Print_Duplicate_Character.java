package coading;

import java.util.Scanner;

public class Print_Duplicate_Character {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		//System.out.println("enter the character to be searched");
		//char ch=sc.next().charAt(0);
		sc.close();
		char c=' ',ch=' ';
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j) ) {
					ch=s.charAt(i);
					c=s.charAt(j);
				}
			}
			System.out.println(ch);
			s=s.replace(c,' ');
		}
		}
	}
}

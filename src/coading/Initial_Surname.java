package coading;

import java.util.Scanner;

public class Initial_Surname {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		sc.close();
		s=' '+s;
		String word="",out="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ' && i<s.lastIndexOf(' ')) {
				word=word+s.charAt(i+1)+'.';
			}
		}
		out=word+s.substring(s.lastIndexOf(' '));
		System.out.println(out);
	}
}

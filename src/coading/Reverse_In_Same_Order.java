package coading;

import java.util.Scanner;

public class Reverse_In_Same_Order {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		sc.close();
		s=s+' ';
		String word="",rev="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				word=s.charAt(i)+word;
			}else {
				rev=rev+' '+word;
				word="";
			}
		}
		System.out.println(rev.trim());
	}

}

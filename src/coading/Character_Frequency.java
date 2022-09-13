package coading;

import java.util.Scanner;

public class Character_Frequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		//System.out.println("enter the character to be searched");
		//char ch=sc.next().charAt(0);
		sc.close();
		int freq=1;
		char c=' ';;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j) ) {
					freq++;
					c=s.charAt(j);
				}
			}
			//if(s.charAt(i)==ch)
			System.out.println(" frequency of "+s.charAt(i)+" ----" +freq);
			freq=1;
			s=s.replace(c,' ');
		}
		}
	}
	
}

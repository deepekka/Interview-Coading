package coading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Amagnam {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st word");
		String s1=sc.next();
		System.out.println("enter 2nd word");
		String s2=sc.next();
		sc.close();
		{
			if(s1.length()==s2.length()) {
				List<Character>c1=new ArrayList<Character>();
				List<Character>c2=new ArrayList<Character>();
				for(int i=0;i<s1.length();i++) {
					
					c1.add(s1.charAt(i));
					c2.add(s2.charAt(i));
				}
				Collections.sort(c1);
				Collections.sort(c2);
				if(c1.equals(c2)) {
					System.out.println("Anagram");
				}
				else
					System.out.println("Not Anagram");
			}
			else
				System.out.println("Not Anagram");
		}
		
		
	}
}

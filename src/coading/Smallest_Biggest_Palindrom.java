package coading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Smallest_Biggest_Palindrom {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);{
		System.out.println("Enter the string");
		String s=sc.nextLine();
		sc.close();
		s=s+' ';
		String word="",rev="";
		ArrayList<String> palindrom=new ArrayList<String>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				word=word+s.charAt(i);
				rev=s.charAt(i)+rev;
			}else {
				if(word.equals(rev)) {
					palindrom.add(word);
				}
				
				word="";
				rev="";
			}
		}
		Collections.sort(palindrom);
		//System.out.println(palindrom);
		System.out.println("largest="+palindrom.get(0));
		System.out.println("smallest="+palindrom.get(palindrom.size()-1));
	}
	
}
}
//my noon is the house of tenet of halah with my aidia of aibohphobia in mom
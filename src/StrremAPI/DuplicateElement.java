package StrremAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateElement {
public static void main(String[] args) {
	
	
	List<Integer>l1=Arrays.asList(2,6,3,4,2,5,6,9,8,7,2,6,4,5,6,5,4,8,9);
	System.out.println(l1);
	
	//print all the unique elements
	System.out.println("unique elements");
	l1.stream().distinct().forEach(e->System.out.print(e+","));
	System.out.println();
	
	
	//print the elements which are repeated
	//first create hashSet
	HashSet<Integer> h1=new HashSet<>();
	// boolean return
	
	System.out.println("repeated elements");
	l1.stream().filter(e->!h1.add(e)).forEach(e->System.out.print(e+","));
}
}

package StrremAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Even_number {
public static void main(String[] args) {
	  List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
	  
	  //even
	 List<Integer>evenList= myList.stream().filter(e->e%2==0).collect(Collectors.toList());
	 System.out.println(evenList);
	 
	 //starts with 1
	 //first convert all element to string
	 List<String> startswith1 = myList.stream().map(e->e+"").filter(e->e.startsWith("1")).collect(Collectors.toList());
	 System.out.println(startswith1);
}
}

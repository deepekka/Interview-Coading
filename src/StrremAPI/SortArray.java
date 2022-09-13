package StrremAPI;

import java.util.ArrayList;
import java.util.List;


public class SortArray {
public static void main(String[] args) {
	
	int []a= {2,5,65,25,45,36,98,52,0,26,14};
	
	List<Integer> l1=new ArrayList<>();
	for (Integer integer : a) {
		l1.add(integer);
	}
	l1.stream().sorted().forEach(e->System.out.print(e+" "));
}
}

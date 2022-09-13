package StrremAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// i/p={1,2,5,6,5,2,3,5,8,7,6,4,2,1,3,6,5,9}
// o/p={1-2,2-3,3-2,4-1,5-4,6-3,7-1,8-1,9-1}

// i/p={"deep","amar","deep","arif","vivek","arif","vivek","vivek"}
// o/p={amar-1,deep-2,arif-2,vivek-3}

public class Frequency {
public static void main(String[] args) {
	List<Integer> l1=Arrays.asList(1,2,5,6,5,2,3,5,8,7,6,4,2,1,3,6,5,9);
	
	Map<Integer, Long> collect = l1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	collect.forEach((key,value)->{
		System.out.print(key+"-"+value+',');
	});
	System.out.println();
	System.out.println("*****************");
	
	
	
	List<String> l2=Arrays.asList("deep","amar","deep","arif","vivek","arif","vivek","vivek");
	
	Map<String,Long> count=l2.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	count.forEach((key,value)->{
		System.out.print(key+"-"+value+",");
	});
}
}

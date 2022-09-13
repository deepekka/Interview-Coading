
package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class HashMapp {
public static void main(String[] args) {
	HashMap<String, Integer>m=new HashMap<>();
	m.put("Deep", 2000);
	m.put("Arif", 8000);
	m.put("Vivek", 5000);
	m.put("Amar", 3000);
	
	
	//using while loop
	Iterator<Entry<String,Integer>>itr=m.entrySet().iterator();
	while(itr.hasNext()) {
		Entry<String,Integer>e=itr.next();
		System.out.println(e.getKey()+"-----"+e.getValue());
	}
	
	
	System.out.println("********************");
	//using for loop
	for(Entry<String,Integer>e:m.entrySet()) {
		System.out.println(e.getKey()+"-----"+e.getValue());
	}
}
}

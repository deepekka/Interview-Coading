package Collection;

import java.util.Comparator;

public class My_Custom_String implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {

		
		String s1=(String)o1;
		String s2=(String)o2;
		
		Integer  l1=s1.length();
		Integer l2=s2.length();
			if(l1>l2)
				return +1;
			if(l1<l2)
				return -1;
			else
				return s1.compareTo(s2);
	}

}

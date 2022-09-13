package Collection;

import java.util.TreeSet;

public class StringTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> tree=new TreeSet(new My_Custom_String());
		
		tree.add("mom");
		tree.add("dad");
		tree.add("ramu");
		tree.add("Malayalam");
		tree.add("halah");
		
		System.out.println(tree);
	}
}

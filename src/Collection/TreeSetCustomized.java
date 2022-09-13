package Collection;

import java.util.TreeSet;

public class TreeSetCustomized {

	public static void main(String[] args) {
		TreeSet<Integer> tree=new TreeSet(new My_Custom());
		tree.add(0);
		tree.add(15);
		tree.add(20);
		tree.add(5);
		tree.add(10);
		System.out.println(tree);
	}
}

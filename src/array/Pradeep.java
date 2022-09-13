package array;

import java.util.ArrayList;
import java.util.List;

public class Pradeep {
public static void main(String[] args) {
	int p=2;
	int r=50;
	int x=5;
	int rem=0,sum=0;
	List<Integer>l=new ArrayList<>();
	for(int i=p;i<=r;i++) {
		int num=15;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		
			if(sum==x) {
				l.add(i);
				num=0;
				sum=0;
			}
		}
	}
	System.out.println(l);
}
}

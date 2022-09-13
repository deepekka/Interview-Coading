package coading;

public class Assesment {
public static void main(String[] args) {
	String s1="Ab,c,de!$";
	String s2=s1.substring(0,7);

	String s3=s1.substring(7);
	String s4="";
	for(int i=s2.length()-1;i>=0;i--) {
		s4=s4+s2.charAt(i);
	}
	System.out.println(s1);
	System.out.println(s4+s3);
}
}

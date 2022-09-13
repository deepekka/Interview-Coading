package coading;

public class Global_Logic {
public static void main(String[] args) {
	String s="deep.nishant@gmail.com";
	String s1="",s2="",s3="",s4="",s5="";
	int a=s.indexOf('.');
	int b=s.lastIndexOf('.');
	int c=s.indexOf('@');

for(int i=s.length()-1;i>=0;i--) {
	if(s.charAt(i)!='.' && s.charAt(i)!='@')
	 s4=s4+s.charAt(i); 
}

		s1=s4.substring(0,a);
		s2=s4.substring(a,c-1);
		s3=s4.substring(c-1,b-2);
		s5=s4.substring(b-2);
		System.out.println(s);
		System.out.println(s1+"."+s2+"@"+s3+"."+s5);		
}
}

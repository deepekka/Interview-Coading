package Number_Manupulation;

import java.util.Scanner;

//153= 1*1*1 + 5*5*5 + 3*3*3
//1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4

//153/10
//53/10
//3/10
public class Armstrong {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		sc.close();
		int power=0,remainder=0,temp=n;
		int sum=0;
		while(temp>0) {
			temp=temp/10;
			power++;
		}
		//System.out.println(power);
		temp=n;
		while(temp>0) {
			remainder=temp%10;
			sum=sum+(int)Math.pow(remainder, power);
			temp=temp/10;
		}
		//System.out.println(sum);
		if(sum==n) 
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
}
}

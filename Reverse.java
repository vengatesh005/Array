package scannerr;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	int a= sc.nextInt();
	int sum=0;
	int rve=0;
	while(a>0) {
		sum=a%10;
		rve=(rve*10)+sum;	
		a=a/10;
	}
	System.out.println(rve);
	 
	}

}

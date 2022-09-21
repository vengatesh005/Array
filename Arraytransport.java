package scannerr;

import java.util.Scanner;

public class Arraytransport {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements");
		int a[][]=new int [3][3];
		int b[][]=new int [3][3];
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				 a[row][col]=sc.nextInt();
			}
		}
		for(int row=0;row<b.length;row++) {
			for(int col=0;col<b[row].length;col++) {
			b[col][row]	=a[row][col];
			}
}
		for(int row=0;row<b.length;row++) {
			for(int col=0;col<b[row].length;col++) {
			System.out.print(b[row][col]);
			}	
			System.out.println();
}
	}
}
	



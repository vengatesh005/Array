package scannerr;

import java.util.Scanner;

public class samplepro {
        
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("a:");
	    int a=sc.nextInt();
	    System.out.println("b:");
	    int b=sc.nextInt();
	      if(a>b)
	    	  System.out.println("a is greter");
	    	  else if(b>a)
		    	  System.out.println("b is greter");
	    	  else
	    		  System.out.println("both are equal");
	      
	}

}

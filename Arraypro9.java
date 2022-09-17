package scannerr;

public class Arraypro9 {
	public static void main(String[] args) {
	char[] gender= {'1','2','3','4'};
	
	for(int  i=0;i<gender.length;i++)
	{
		int a = gender[i];
		    a = a+1;
	     char c = (char)a;
	    gender[i]=c;
	    System.out.println(c);	
	    }

  }

}



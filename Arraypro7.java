package scannerr;

public class Arraypro7 {
	public static void main(String[] args) {
		char[] gender= {'A','B','C','D'};
		
		for(int  i=0;i<gender.length;i++)
		{
			int a = gender[i];
			    a = a+32;
		     char C = (char)a;
		    gender[i]=C;
		    System.out.println(gender[i]);	
		    }

	}

}



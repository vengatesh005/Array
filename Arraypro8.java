package scannerr;

public class Arraypro8 {
	public static void main(String[] args) {
		char[] gender= {'A','B','C','D'};
		
		for(int  i=0;i<gender.length;i++)
		{
			int a = gender[i];
			    a = a+2;
		     char c = (char)a;
		    gender[i]=c;
		    System.out.println(gender[i]);	
		    }

	}

}



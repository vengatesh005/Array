package scannerr;

public class Arraypro10 {
	public static void main(String[] args) {
		char[] gender= {'M','N','T','Z'};
		
		for(int  i=0;i<gender.length;i++)
		{
			int a = gender[i];
			    a = a+1;
		     if(a>90)
		    	 a=a-26;
		     char c=(char)a;
		     gender[i]=c;
		     
		     System.out.println(c);
		    }

	  }
}

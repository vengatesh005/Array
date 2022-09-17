package scannerr;

public class Arraypro5 {	

	public static void main(String[] args) {
		char[] gender= {'M','F','T'};
		
		for(int i=0;i<gender.length;i++)
		{
			int a = gender[i];
			    a = a+32;
			char c= (char) a;
			gender[i]=c;
			System.out.println(c);

		}
			
		
	}

}

package scannerr;

public class Arraypro11 {
	public static void main(String[] args) {
		char[] gender= {'M','N','T','Z'};		
		for(int  i=0;i<gender.length;i++)
		{
			if (i%2==0)
			{
				int a=gender[i];
						a=a+3;
				if(a>90){ 
					a=a-26;
				}
				char c=(char)a;
				gender[i]=c;
			   }
			else
			{
				int a=gender[i];
				a=a+2;
				if(a>90){
					
					a=a-26;	
				}
				char c=(char)a;
				gender[i]=c;
				
			}
				System.out.println(gender[i]);
			
			}
}
}




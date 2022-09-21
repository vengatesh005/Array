package scannerr;




		public class Selectionsortarray {

			public static void main(String[] args) {
			int a[]= new int[]{13,16,11,10};
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)	
				{
					if(a[i]>a[j])
					{
					int smallest=a[i];
					    a[i]=a[j];
					    a[j]=smallest;
					}
					
				}
			}
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i]+"  ");
				}
				
			}

			



		
	}



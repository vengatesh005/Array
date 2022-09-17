package scannerr;

public class Arraypro3 {

	public static void main(String[] args) {
		 int even=0;
		 int odd=0;
		int[] a= {21,34,56,89,66,44,90};
		System.out.println(a.length);
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]%2==0)
			   {
				 even=even+a[i];
			   }
			 else if(a[i]%2!=0)
			 {
				 odd=odd+a[i];			 
			 }			 
		 }
		 System.out.println("even number:"+even);
		 System.out.println("odd number:"+odd);
		 System.out.println(even-odd);
	}

}

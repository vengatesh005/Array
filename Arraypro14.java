package scannerr;

public class Arraypro14 {

	public static void main(String[] args) {
	int a[]= {7,5,4};
	int b[]= {1,8,6};
	int c=a.length+b.length;
	int arr[]=new int [c];
	for(int i=0;i<arr.length;i++)
	{
		if(i<3)
		{
			arr[i]=a[i];
		}
	else 
	{
		arr[i]=b[i-a.length];
	}
	System.out.print(arr[i]);
	}

   }
}

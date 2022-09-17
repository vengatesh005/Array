package scannerr;

public class Arraybubble {

	public static void main(String[] args) {
	int a[]= new int[]{5,6,4,3,9,8,2,1};
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)	
		{
			if(a[i]>a[j])
			{
			int temp=a[i];
			    a[i]=a[j];
			    a[j]=temp;
			}
			
		}
	}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
	}

	}



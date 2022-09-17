package scannerr;

public class Arraytranport {
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{2,3,4},{7,8,3}};
		int sum[][]=new int [3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{	
			System.out.print(a[j][i]+" ");
		}
		
		System.out.println();
	    }
	
	}

}

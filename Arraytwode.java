package scannerr;

public class Arraytwode {
	public static void main(String[] args) {
		int a[][]= {{1,3,4},{2,3,4},{7,8,3}};
		int b[][]= {{9,8,5},{3,2,1},{4,2,4}};
		int sum[][]=new int [3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				sum [i][j]=a[i][j]-b[i][j];
			System.out.print(sum[i][j]+" ");
		}
		
		System.out.println();
	    }
	
	}

}

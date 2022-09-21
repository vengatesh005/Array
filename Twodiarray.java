package scannerr;

public class Twodiarray {
	public static void main(String[] args) {
		int a[][]= {{1,3,4},{2,3,4},{7,8,3}};
		int sum[][]=new int [3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				sum[i][j]=a[i][j];
			System.out.print(sum[i][j]);
		}
		
		System.out.println();
	    }
	
	}

}

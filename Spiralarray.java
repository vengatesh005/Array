package scannerr;

public class Spiralarray {
	public static void main(String[] args) {
		Spiralarray obj = new Spiralarray();
		obj.array();
	
	}
	
	public void array()
	{
	
	int arr[][]=new int[5][5];
	int value=1;
	int mincol=0;
	int minrow=0;
	int maxcol=arr.length-1;
	int maxrow=arr.length-1;
	int len=arr.length*arr.length;
	while(value<=len) 
	{
	
		for(int col=mincol;col<=maxcol;col++)
		{
			arr[minrow][col]=value;
			value++;
		}
			for(int row=minrow+1;row<=maxrow;row++) {
			
				arr[row][maxcol]=value;
				value++;
		}
		
			for(int col=maxcol-1;col>=mincol;col--) {
				arr[maxrow][col]=value;
				value++;
		}
		
		
			for(int row=maxrow-1;row>=minrow+1;row--) {
				arr[row][mincol]=value;
				value++;
		}	
			minrow++;
			mincol++;
			maxrow--;
			maxcol--;
    }
	
	
	
	
	for(int row=0 ; row<5 ; row++)
	{
		for(int col=0 ; col<5 ; col++)
		{
			System.out.print(arr[row][col]+"\t");
		}
		System.out.println();
	}
  }
}

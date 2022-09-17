package scannerr;
import java.util.Scanner;
public class Arraypro21 {

	public static void main(String[] args) {
		Scanner vs=new Scanner(System.in);
		int arr[][]= new int [3][3];
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr.length;col++)
			{
				System.out.println("input values");
				arr[row][col]=vs.nextInt();
					System.out.println(arr[col][row]);
			
		}
		
			System.out.println();
		
	}

}
}

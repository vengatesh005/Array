package scannerr;

public class Arraypro4 {
			
						public static void main(String[] args) {
							int	sum=0;
							double avg=0;
							int[] marks={100,135,117,155,110};
							System.out.println(marks.length);
							
							for(int i= 0;i<marks.length; i++) 
							{ 
							   sum=	sum+marks[i];
							   avg=sum/marks.length;
							}
							 System.out.println("average the value:"+avg);
		}

	}




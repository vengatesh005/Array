package scannerr;

public class arraypro1 {

	public static void main(String[] args) {
				int[] marks= {100,135,117,155,110};
				System.out.println(marks.length);
				
				for(int i= 0;i<marks.length; i++)
				{ 
					if(marks[i]%2==0)
					    {
						System.out.println("even number:"+marks[i]);
					    }
					else if(marks[i]%2!=0)
					     {
						System.out.println("odd number:"+marks[i]);
					     } 
						
				}
					
			}

		}

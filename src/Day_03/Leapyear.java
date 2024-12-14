package Day_03;

public class Leapyear {

	public static void main(String[] args) {
			
			for(int leapyear=2000; leapyear<=2100 ; leapyear=leapyear+4) 
			{
				if((leapyear-1) % 4 == 0) {
					
					System.out.print(" ");           
					}
				else
					{
						System.out.print(leapyear + " ");
					}
				 
			}
		
	}

}

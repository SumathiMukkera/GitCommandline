package Day_03;
import java.util.Scanner;
public class NumberFactors {
  
	public static void main(String[] args) 
	{
	int num;
	Scanner S = new Scanner(System.in);
	System.out.println("enter any number");
	num=S.nextInt();
	for(int i=1;i<=num;i++) {
		if(num%i == 0) {
			System.out.println(i+" ");
		}
	}
   }
}

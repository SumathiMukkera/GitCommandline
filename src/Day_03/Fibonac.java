package Day_03;

import java.util.Scanner;

public class Fibonac {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    
	    int n = s.nextInt();
	    int num = 0;
	    int num2 = 1;
	    int fibonacci;
	 
	    for (int i=1; i<n; i++) {
		    System.out.print(num + ",");
	        fibonacci = num + num2;
	        num = num2;
	        num2 = fibonacci;
	    }
		

	}

}

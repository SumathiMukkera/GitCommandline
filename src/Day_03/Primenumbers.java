package Day_03;

public class Primenumbers {

	public static void main(String[] args) {
		int num = 30; 
	    int count;  
	    for (int i = 2; i <= num; i++) {
	      count = 0;  
	      for (int j = 2; j <= i/2 ; j++) {
	        if (i % j == 0) {
	          count = 1;  
	          break;
	   	        }
	       }

	  	      if (count == 0) {
	        System.out.print(i+" ");  
	      }
	    }
	  }
	
}

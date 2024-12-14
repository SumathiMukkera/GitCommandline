package Day_03;

import java.util.Scanner;

public class DecimalConversion {
  int num;
  int rem;
  static Scanner SC = new Scanner(System.in); 
  public static void main(String[] args) {
	DecimalConversion DC = new DecimalConversion();
	System.out.println("enter any Decimal number");
	DC.num =SC.nextInt(); 
	DC.binaryconvert();
	System.out.println("enter any Decimal number");
	DC.num =SC.nextInt(); 
	DC.octalconverter();
	System.out.println("enter any Decimal number");
	DC.num =SC.nextInt(); 
	DC.hexaconverter();
	
  }
	void binaryconvert() 
	{
	int decimal=num;
	String binary="";
	while (num!=0) {
		rem= num%2;
		binary=rem+binary;
			num =num/2;
			
		}
	System.out.println("Binary number of "+ decimal +" is = " + binary);
	}
	
	void octalconverter() {
		int dec = num;
		String octal="";
		while(num!= 0) {
			rem=num%8;
			octal=rem+octal;
			num=num/8;
			
		}
		System.out.println("octal number of "+ dec +" is = " + octal);
	}
	void hexaconverter() {
		int dec = num;
		char hexa[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String Hexa="";
		while(num!= 0) {
			rem=num%16;
			Hexa=hexa[rem]+Hexa;
			num=num/16;
			
		}
		System.out.println("Hexa decimal number of "+ dec +" is = " + Hexa);
	}
	
}

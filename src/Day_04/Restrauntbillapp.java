package Day_04;

import java.util.Arrays;
import java.util.Scanner;

public class Restrauntbillapp {
	static int []itemnumber = {1,2,3,4,5};
	static String []vegitemname = {"Paneer tikka","Cashew pulao","Veg fried rice","Gobi 65 ","Veg. thali"};
	static Float []vegitemprice = {120.00f,150.00f,130.00f,100.00f,140.00f};
	static String []nvitemname = {"Chicken biryani","Fish curry","Chicken 65","Mutton gravy","Chicken fried rice"};
	Float []nvitemprice = {200.00f,150.00f,120.00f,220.00f,180.00f};
	static Scanner SC = new Scanner(System.in);
	
	public void vegmenu() {
		
		int []itemnumber = {1,2,3,4,5};
		String []itemname = {"Paneer tikka","Cashew pulao","Veg fried rice","Gobi 65 ","Veg. thali"};
		Float []itemprice = {120.00f,150.00f,130.00f,100.00f,140.00f};
		System.out.println("Below are the dishes available currently to order :  ");
		System.out.println(itemnumber[0]+". "+ itemname[0]+"- Rs."+itemprice[0]+"(per item)");
		System.out.println(itemnumber[1]+". "+ itemname[1]+"- Rs."+itemprice[1]+"(per item)");
		System.out.println(itemnumber[2]+".  "+ itemname[2]+"- Rs."+itemprice[2]+"(per item)");
		System.out.println(itemnumber[3]+". "+ itemname[3]+"- Rs."+itemprice[3]+"(per item)");
		System.out.println(itemnumber[4]+". "+ itemname[4]+"- Rs."+itemprice[4]+"(per item)");
		
		}
		
	public void nonvegmenu() {
		
		int []itemnumber = {1,2,3,4,5};
		String []itemname = {"Chicken biryani","Fish curry","Chicken 65","Mutton gravy","Chicken fried rice"};
		Float []itemprice = {200.00f,150.00f,120.00f,220.00f,180.00f};
		System.out.println("Below are the dishes available currently to order :  ");
		System.out.println(itemnumber[0]+". "+ itemname[0]+"- Rs."+itemprice[0]+"(per item)");
		System.out.println(itemnumber[1]+". "+ itemname[1]+"- Rs."+itemprice[1]+"(per item)");
		System.out.println(itemnumber[2]+".  "+ itemname[2]+"- Rs."+itemprice[2]+"(per item)");
		System.out.println(itemnumber[3]+". "+ itemname[3]+"- Rs."+itemprice[3]+"(per item)");
		System.out.println(itemnumber[4]+". "+ itemname[4]+"- Rs."+itemprice[4]+"(per item)");
	}
	public void order() {
		System.out.println("[1] dine-in \r\n"
				+ "\r\n"
				+ "[2] take away ");
		int option =SC.nextInt();
		System.out.println("Please select the category from the below list :  \r\n"
				+ "\r\n"
				+ "[1] vegetarian \r\n"
				+ "\r\n"
				+ "[2] Non-vegetarian ");
		int Category = SC.nextInt();
		if(Category ==1) {
			vegmenu();
			int num=SC.nextInt();
			if(itemnumber[num]>0)
			 {
			 System.out.println("Please enter number of "+vegitemname[num-1]+ " you would like to order -");
			 num=SC.nextInt();
			 System.out.println("Would you like to order one more dish ? [Y] or [N] - ");
			 
			}
		
	     }else if(Category==2) {
	    	 nonvegmenu();
			 int num=SC.nextInt();
			 if(itemnumber[num]>0) {
					 System.out.println("Please enter number of "+nvitemname[num-1]+ " you would like to order -");
					 num=SC.nextInt();
					 System.out.println("Would you like to order one more dish ? [Y] or [N] - ");
					 
			 }
	}
	}

	public static void main(String[] args) {
   	  	Restrauntbillapp RB = new Restrauntbillapp();
		
		RB.order();
      }
}

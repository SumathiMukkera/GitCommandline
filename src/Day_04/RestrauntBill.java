package Day_04;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class RestrauntBill {
	  
    public static void main(String[] args) {
	     	  
	RestrauntBill RB = new RestrauntBill();
	
	Scanner SC = new Scanner(System.in);
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
	    if (Category==1) {
	    	 RB.vegmeal();
	     }else if(Category==2) {
	    	 RB.Nonvegmeal();
	     }
	      
	      
    }
    
	      void vegmeal() {
	    	  
	    	  LinkedHashMap<String, Double> Vegitarian = new LinkedHashMap<>();
	      	
	    	  Vegitarian.put("Paneer tikka", 120.00);
	    	  Vegitarian.put("Cashew pulao", 150.00);
	    	  Vegitarian.put("Veg fried rice", 130.00);
	    	  Vegitarian.put("Gobi 65", 100.00);
	    	  Vegitarian.put("Veg. thali", 140.00);
	    	  System.out.println("Below are the dishes available currently to order :");
	    	  
	    	  for (Entry<String, Double> vegoption :Vegitarian.entrySet()) 
	    	  {
	    		  System.out.println(vegoption.getKey()+"-"+vegoption.getValue());
	    	  }
	    	  
	  }
		void Nonvegmeal() {
			
			LinkedHashMap<String,Double> Non_Vegitarian = new LinkedHashMap<>();  
	    	  
	    	  Non_Vegitarian.put("Chicken biryani", 200.00);
	    	  Non_Vegitarian.put("Fish curry", 150.00);
	    	  Non_Vegitarian.put("Chicken 65", 120.00);
	    	  Non_Vegitarian.put("Mutton gravy", 220.00);
	    	  Non_Vegitarian.put("Chicken fried rice", 180.00);
	    	  
	    	  System.out.println("Below are the dishes available currently to order :");
	    	  
	    	  for (Entry<String, Double> nonvegoption :Non_Vegitarian.entrySet()) 
	    	  {
	    		  System.out.println(nonvegoption.getKey()+"-"+nonvegoption.getValue());
	    	  }
	    	  
		  }
		}
		
	
	
     
	
 
package Day_02;
import java.util.Scanner;

public class Employeetakehome
{
	String Employeename;
	double basicsalary;
	double taxrate;
	double bonus;
	double BOA;
	double yearlygross;
	double yearlytax;
	double Monthlygross;
	double monthlytax;
	double monthlytakehome;
	double PF;

	
 public static void main(String[] args)
 {
	Scanner scan = new Scanner(System.in);
	
	Employeetakehome Emp = new Employeetakehome();
	
	System.out.println("Enter Employee Basic salary");
	Emp.basicsalary = scan.nextDouble();
	System.out.println("Enter employee bonus");
	Emp.bonus = scan.nextDouble();
	System.out.println("Entera Empolyee BOA");
	Emp.BOA = scan.nextDouble();
	Emp.Monthlygross();
	Emp.yealyGross();
	Emp.Taxslab();
	scan.close();
}
	
	void Monthlygross() {
		PF= basicsalary * 0.12;
		System.out.println("PF of empolyee"+ PF );
		Monthlygross = (basicsalary + BOA + bonus)- PF;
		System.out.println("Monthy gross salry = "+ Monthlygross );
	}
	
	void yealyGross() {
	
		yearlygross =  	Monthlygross * 12 ;
		System.out.println("Yearly gross salary is = " + yearlygross);
		
	}
	
	void Taxslab() {
		
		double Yg = yearlygross;
		if(Yg< 250000) {
			taxrate = 0;
			yearlytax = Yg * taxrate ;
			monthlytax = yearlytax/12;
			monthlytakehome = Monthlygross - monthlytax;
			System.out.println("Monthly take home salary of employee is =" + monthlytakehome );
		}else
		if ( Yg>250000 && Yg < 500000) {
			taxrate = 0.05;
			yearlytax = Yg * taxrate ;
			monthlytax = yearlytax/12;
			monthlytakehome = Monthlygross - monthlytax;
			System.out.println("Monthly take home salary of employee is =" + monthlytakehome );
		} else if(Yg > 500000 && Yg < 750000) {
					taxrate = Yg * 0.1 ; 
					yearlytax = Yg * taxrate ;
					monthlytax = yearlytax/12;
					monthlytakehome = Monthlygross - monthlytax;
					System.out.println("Monthly take home salary of employee is =" + monthlytakehome );
		}else if(Yg > 750000 && Yg < 1000000) {
			taxrate = 0.15  ; 
			yearlytax = Yg * taxrate ;
			monthlytax = yearlytax/12;
			monthlytakehome = Monthlygross - monthlytax;
			System.out.println("Monthly take home salary of employee is =" + monthlytakehome );
       	}else if(Yg >1000000 && Yg < 1250000) {
			taxrate = 0.2  ; 
			yearlytax = Yg * taxrate ;
			monthlytax = yearlytax/12;
			monthlytakehome = Monthlygross - monthlytax;
			System.out.println("Monthly take home salary of employee is =" + monthlytakehome );
		}else if(Yg > 1250000 && Yg <1500000) {
			taxrate = 0.25  ; 
			yearlytax = Yg * taxrate ;
			monthlytax = yearlytax/12;
			monthlytakehome = Monthlygross - monthlytax;
			System.out.println("Monthly take home salary of employee is =" + monthlytakehome );
		}else if(Yg > 1500000) {
			taxrate = 0.3 ; 
			yearlytax = Yg * taxrate ;
			monthlytax = yearlytax/12;
			monthlytakehome = Monthlygross - monthlytax;
			System.out.println("Monthly take home salary of employee is =" + monthlytakehome );
		}
	}

}

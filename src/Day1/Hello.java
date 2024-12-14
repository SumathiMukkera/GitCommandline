package Day1;
import java.util.Scanner; 
public class  Hello {
	float Total,avg;
	String Studentname;
	float Marks1 ;
	float Marks2 ;
	float Marks3;
	float Marks4;
  	public static void main(String[] args) {
  		Scanner Scr = new Scanner(System.in);
  		Hello Hs = new Hello();
  		System.out.println("enter student name");
  		Hs.Studentname = Scr.next();
  		System.out.println("enter student marks1");
  		Hs.Marks1 = Scr.nextFloat();
  		System.out.println("enter student marks2");
  		Hs.Marks2 = Scr.nextFloat();
  		System.out.println("enter student marks3");
  		Hs.Marks3 = Scr.nextFloat();
  		System.out.println("enter student marks4");
  		Hs.Marks4 = Scr.nextFloat();
  		
   		Hs.addtotalmarks();
  		Hs.average();
		
  	}
			void addtotalmarks() {
				
				Total = Marks1 + Marks2 + Marks3 + Marks4 ;
				
		System.out.println("Student totsl marks = "+ Total);
				}
		
		void average() {
		avg = (Marks1 + Marks2 + Marks3 + Marks4) /4;
		
		System.out.println("Student avegare score is = " + avg);
		}
	
}
package Day_03;

public class CalculateMarks {
      float M1;
      float M2;
      float M3;
      float M4;
      float sum;
      float avg;
      
	public CalculateMarks(float m1,float m2, float m3, float m4) {
	   M1=m1;
	   M2=m2;
	   M3=m3;
	   M4=m4;
		float sum1 = calculatesum();
		System.out.println("Total marks of a student is = "+ sum1);
		calculateavg(sum1);
		System.out.println("average of student marks is = "+ avg);
		
	}
	
	public CalculateMarks(float m1, float m2, float m3) {
		M1=m1;
		M2=m2;
		M3=m3;
		M4=35;
		float sum1 = calculatesum();
		System.out.println("Total marks of a student is = "+ sum1);
		calculateavg(sum1);
		System.out.println("average of student marks is = "+ avg);
		
	}
	public CalculateMarks(float m1, float m2) {
		M1=m1;
		M2=m2;
		M3=35;
		M4=35;
		float sum1 = calculatesum();
		System.out.println("Total marks of a student is = "+ sum1);
		calculateavg(sum1);
		System.out.println("average of student marks is = "+ avg);
		
	}
	public CalculateMarks(float m1) {
		M1=m1;
		M2=35;
		M3=35;
		M4=35;
		float sum1 = calculatesum();
		System.out.println("Total marks of a student is = "+ sum1);
		calculateavg(sum1);
		System.out.println("average of student marks is = "+ avg);
		
	}
	public CalculateMarks() {
		M1=35;
		M2=35;
		M3=35;
		M4=35;
		float sum1 = calculatesum();
		System.out.println("Total marks of a student is = "+ sum1);
		calculateavg(sum1);
		System.out.println("average of student marks is = "+ avg);
		
	}
	float calculatesum()
	{
		sum = M1+M2+M3+M4;
		return sum;
				
	}
	void calculateavg(float sum) 
	{
		
		avg =sum/4;
	}
	
	public static void main(String[] args) {
		
		CalculateMarks CM = new CalculateMarks(89.4f ,69.4f , 78.0f, 84.0f);
		CalculateMarks CM1 = new CalculateMarks(89.4f ,69.4f , 78.0f);
		CalculateMarks CM2= new CalculateMarks(69.4f , 84.0f);
		CalculateMarks CM3= new CalculateMarks(69.4f);
		CalculateMarks CM4= new CalculateMarks();
	}

}

package Day1;
public class Student {
	
	String Studentname;
	byte Math;
	byte English;
	int Science ;
	int Social;
	int Totalmarks;
	float Average;
	
	void addition () {
		
		Totalmarks = Math + English + Science + Social ;
		
		System.out.println(Studentname + " totalmarks of all the subjects = " + Totalmarks);
		
	}
	
	void average() {
		
		Average = Totalmarks/4 ;
		
		System.out.println(Studentname + " average of totalmarks = " + Average);
	}
	
	public static void main(String[] args) {
		
		Student Stu1 = new Student();
		Stu1.Studentname = "Ram";
		Stu1.Math = 70;
		Stu1.English = 60;
		Stu1.Science = 50;
		Stu1.Social = 60;
		Stu1.addition();
		Stu1.average();
		
		Student Stu2 = new Student();
		Stu2.Studentname = "Dave";
		Stu2.Math = 80;
		Stu2.English = 46;
		Stu2.Science = 75;
		Stu2.Social = 94;
		Stu2.addition();
		Stu2.average();
		
		Student Stu3 = new Student();
		Stu3.Studentname = "Eva";
		Stu3.Math = 82;
		Stu3.English = 76;
		Stu3.Science = 65;
		Stu3.Social = 54;
		Stu3.addition();
		Stu3.average();
		
		Student Stu4 = new Student();
		Stu4.Studentname = "Sandy";
		Stu4.Math = 82;
		Stu4.English = 93;
		Stu4.Science = 77;
		Stu4.Social = 67;
		Stu4.addition();
		Stu4.average();
		
		
	}

}

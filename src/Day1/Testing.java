package Day1;

public class Testing {
	
public static void multiply(int d , int f) {
		
	int m = d * f ; 
	
	System.out.println(m);
}

public static void add(int a , int b ) {
	
	int c = a+b;
	
System.out.println(c);
}

public static void useif() {
	
	int A = 4 ,B = 10;
	
	if ( A*B < 10)
	{
		System.out.println("it is working");
	} else
	
	System.out.println("it is not working");
}
public static void main(String[] args) {
	
	System.out.println("Hello world!");
	
	multiply(4,5);
	
	add(8,7);
	
	useif();
}
}

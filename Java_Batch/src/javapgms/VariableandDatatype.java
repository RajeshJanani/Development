package javapgms;

public class VariableandDatatype {
	// Globally declared

	static int y = 80;
	// static - without creating an object access the methods and variables directly
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Local declaration
		
		char c = 'x';
		char c1 = '1';
		String name = "Janani";
		int x = 90;
		long l = 98763524;
		float f = 10.24f;
		double d = 12.34567d;
		boolean b = true;

		System.out.println("The value of c is : " + c); 
		// + - concatenation operator - joining two things
		System.out.println();
		System.out.println(c1);
		System.out.println("-------------------");
		System.out.println(name);
		System.out.println(x);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b);
		System.out.println(y);
		
	}

}

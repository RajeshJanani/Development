package javapgms;

public class Recursion {

	static int count =0;
	
	static void print()
	{
		count++;
		
		if (count <=5)
		{
			System.out.println("hello");
			print();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print();
		
	}

}

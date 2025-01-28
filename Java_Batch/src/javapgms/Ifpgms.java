package javapgms;

public class Ifpgms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "jana";
		
		if (name.equals("janani"))
		{
			System.out.println("yes ur name is correct");
		}
		
		else
		{
			System.out.println("No it is not correct");
		}
		
		int x = 10;
		
		if (x > 50)
		{
			System.out.println("x is greater than 50");
		}
		
		else
		{
			System.out.println("x is lesser than 50");
		}
		
		// greatest of 3 numbers
		
		int a = 100 , b = 50 , c=90;
		
		if (a>b && a >c)
		{
			System.out.println(" A is greater ");
		}
		
		else if(b > c)
		{
			System.out.println(" B is greater");
		}
		else
		{
			System.out.println(" C is greater ");
		}
		
	}

}

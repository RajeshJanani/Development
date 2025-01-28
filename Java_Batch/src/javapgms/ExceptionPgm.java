package javapgms;

public class ExceptionPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a=10,b=0;
			
			System.out.println(a/b);
		}
		
		catch(Exception e)
		{
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		
		
	}

}

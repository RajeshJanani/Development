package javapgms;

public class MethodsPgm {

	public void add()
	{
		int a =10,b=10,c;
		c= a+b;
		System.out.println(c);
	}
	
	public void sub()
	{
		int a =10,b=10,c;
		c= a-b;
		System.out.println(c);
	}
	
	public static void mul()
	{
		int a =10,b=10,c;
		c= a*b;
		System.out.println(c);
	}
	
	public int addition()
	{
		int a=10,b=90,c;
		c=a+b;
		return c;
	}
	
	public static String name()
	{
		String stuname = "Janani";
		return stuname;
	}
	
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsPgm obj = new MethodsPgm();
		obj.add();
		obj.sub();
		mul();
		int res = obj.addition();
		System.out.println(res);
		
		String res1 = name();
		System.out.println(res1);
		
		obj.div(100, 10);
	}

}

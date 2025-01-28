package javapgms;

abstract class sam
{
	
}

public class Methodover {

	void add()
	{
		int a=10,b=20,c;
		c=a+b;
	System.out.println(c);	
	}
	
	void add(int a)
	{
		int b=20,c;
		c=a+b;
		System.out.println(c);
	}
	
	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methodover obj = new Methodover();
		obj.add();
		obj.add(10);
		int ans = obj.add(3, 90);
		System.out.println(ans);
	}

}

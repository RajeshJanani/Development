package javapgms;

class parent
{
	void sample()
	{
		System.out.println("this is a parent class");
	}
}

class child extends parent
{
	void sample()
	{
		super.sample();
		System.out.println("this is a child class");
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child obj = new child();
		obj.sample();
		
		
	}

}

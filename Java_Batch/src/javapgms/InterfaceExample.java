package javapgms;

class diagram implements Draw
{
	public void drawing()
	{
		System.out.println("simple example");
		System.out.println(rect);
	}
}



public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//diagram ob = new diagram();
		Draw ob = new diagram();
		ob.drawing();
		ob.sample();
		Draw.sam();
	}

}

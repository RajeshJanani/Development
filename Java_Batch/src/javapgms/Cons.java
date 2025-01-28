package javapgms;

public class Cons {

	int val;
	int y;
	
	Cons()  // No args Constructor
	{
		 val =5;
		System.out.println("No Arguement constructor" );
	}
	
	Cons(int x) // parameterized constructor
	{
		y =x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cons obj = new Cons();
		System.out.println(obj.val);
		Cons obj1 = new Cons(10);
		System.out.println(obj1.y);
	}

}

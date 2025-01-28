package javapgms;

enum day
{
	mon,tues,wed,thrus,fri,sat,sun
}

public class Firstpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		day d = day.mon;
		System.out.println(d);
		
		System.out.println("hai hello welcome");
		
		String str1 = "hello";
		String str2 = "World";
		
		String res = str1+ " " + str2;
		System.out.println(res);
		
		String res1 = str1.concat(" ").concat(str2);
		System.out.println(res1);
		
		String name = "Alice";
		int age = 25;

		String formatted = String.format("Name: %s, Age: %d", name, age);
		System.out.println(formatted); 
		
		System.out.printf("Name: %s, Age: %d", name, age);
		
	}

}

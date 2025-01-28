package javapgms;

public class StringandMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hai";
		String s2 = "HELLO";
		String s3="";
		String s4="Hai";
		
		int x =90;
		int y =100;
		
		int len = s1.length();
		System.out.println(len);
	
		int len1 = s2.length();
		System.out.println(len1);
		
		String upper = s1.toUpperCase();
		System.out.println(upper);
		
		System.out.println(s2.toLowerCase());
		
		System.out.println(s3.isEmpty());
		
		System.out.println(s1.startsWith("ha"));
		
		System.out.println(s1.equals(s4));
		
		System.out.println(s1.equalsIgnoreCase(s4));
		
		System.out.println(s1.concat("Jana"));
		
		System.out.println("The square root value is : " +Math.sqrt(x));
		System.out.println(Math.cbrt(y));
		System.out.println(Math.min(x, y));
		System.out.println(Math.max(x, y));
		System.out.println(Math.pow(2, 3));
	}

}

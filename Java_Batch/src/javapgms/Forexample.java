package javapgms;

public class Forexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print the numbers from 1 to 10
		
		for (int i =1; i <=10 ; i++)
		{
			System.out.println("the value is " + i);
		}
		
		
		// print the first even numbers
		
		for (int x = 2; x <=20 ; x+=2 )
		{
			System.out.println("the even numbers are : " + x);
		}
		
		for (int y=5; y>=1 ; y--)
		{
			System.out.println(y);
		}
		
		// sum of first 10 digits
		
		int a, n =10,sum=0;
		
		for(a=1; a<=n; a++)
		{
			sum = sum+a;  
			System.out.println(sum);
		}
		
	}

}

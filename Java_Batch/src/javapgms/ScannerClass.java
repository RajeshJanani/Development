package javapgms;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 
	     System.out.println("Enter the x value : ");
		 int x = sc.nextInt();
		 System.out.println("Enter the y value : ");
		 int y = sc.nextInt();
		 
		 int c = x+y;
		 System.out.println("The addition is :" + c);
		 
		 
		sc.close();
	}

}

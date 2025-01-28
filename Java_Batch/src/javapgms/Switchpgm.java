package javapgms;

import java.util.Scanner;

public class Switchpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Mobile Brand : ");
		String brand = sc.nextLine();
		
		switch(brand)
		{
		case "samsung" :
			System.out.println("Price is 20000");
			break;
		case "Vivo" :
			System.out.println("price is 10000");
			break;
			default:
				System.out.println("Enter the proper brand  name");
		}
	}

}

package javapgms;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int matrix[][] = { {1,2,3}, {4,5,6} , {7,8,9} };
		
			for(int i =0;i<3;i++)  // for row
		{
			for (int j=0;j<3;j++) // for column
			{
				System.out.print(matrix[i][j] + " ");
			}
			
			System.out.println();
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements : ");
		int n = sc.nextInt();
		
		int array[] = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		
		for(int i=0; i<n; i++)  
		{  
		  	array[i]=sc.nextInt();  
		}   
		System.out.println("Array elements are: ");  
		for (int i=0; i<n; i++)   
		{  
			System.out.print("  "+ array[i]);  
			System.out.println();
		}  
		System.out.println();
		sc.close();
		
		Arrays.sort(array); 
		System.out.println("Elements of array sorted in Ascending order: ");  
		 
		for (int i = 0; i < array.length; i++)   
		{       
		   System.out.print("  "+ array[i]);   
		}  
	}

}

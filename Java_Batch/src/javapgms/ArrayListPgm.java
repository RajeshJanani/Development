package javapgms;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class ArrayListPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<Integer>();
		Vector<Integer> arr1 = new Vector<Integer>();
		Stack<Integer> arr2 = new Stack<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		System.out.println(arr);
		System.out.println(arr.get(1));
		
		arr.set(1, 5);
		
		arr.remove(2);
		
		System.out.println(arr);
		
		System.out.println(arr.contains(3));
		
		System.out.println(arr.size());
	}

}

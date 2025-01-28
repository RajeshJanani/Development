package javapgms;

public class SingleDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int array[] = new int[5];
		
		array[0] = 1;
		array[1]=22;
		array[2]=33;
		array[3]=4;
		array[4]=55;*/
		
		int array[] = { 1,2,3,4,5};
		
		for (int i = 0; i< array.length; i++)
			System.out.println(array[i]);
		
		for(int z : array )
		System.out.println(array[z]);
		
		
	}

}

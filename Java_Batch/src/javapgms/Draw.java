package javapgms;

public interface Draw {

	int rect =4;
	
	void drawing();
	
	default void sample()
	{
		System.out.println("default method");
	}
	
	static void sam()
	{
		System.out.println("Static methods");
	}
	
}

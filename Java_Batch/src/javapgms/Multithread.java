package javapgms;

class MultithreadingDemo extends Thread {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}


public class Multithread 

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		 for (int i = 0; i < n; i++) {
	            MultithreadingDemo object
	                = new MultithreadingDemo();
	            object.start();
	        }
	    }
		
	}



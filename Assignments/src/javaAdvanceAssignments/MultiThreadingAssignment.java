package javaAdvanceAssignments;

class HelloWorldThread extends Thread{
	
	public HelloWorldThread(Runnable target){
			super(target);
	}

}

class HelloWorldRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello World");
	}	
}


public class MultiThreadingAssignment extends Thread{
	
	public static void main(String [] args) {
		HelloWorldRunnable helloRunnable = new HelloWorldRunnable();
	    HelloWorldThread helloThread = new HelloWorldThread(helloRunnable);
	    helloThread.start();
						
	}
	
	
}

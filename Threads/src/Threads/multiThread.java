package Threads;
public class multiThread extends Thread{
	public void run()
	{
		System.out.println("Concurrent Threat started running");
	}


public static void main(String[]args) {
	multiThread mt =new multiThread();
	mt.start();
}
}
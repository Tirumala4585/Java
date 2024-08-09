package com.programs;

public class MultiThreading extends Thread{
	public void run()
	{
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" I = "+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
	public static void main(String []args) {
		MultiThreading obj1 = new MultiThreading();
		MultiThreading obj2 = new MultiThreading();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.setName("First Thread");
		t2.setName("Second Thread");
		  
		t1.start();
		t2.start();	
	}
}

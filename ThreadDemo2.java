package com.threadprograms;

public class ThreadDemo2 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
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
		ThreadDemo2 obj = new ThreadDemo2();
		Thread t = new Thread(obj);
        t.setName("Thread1");
		t.start();
		Thread t1 = Thread.currentThread();
		t1.setName("Thread2");
		for(int i=1;i<=10;i++)
		{
			System.out.println(t1.getName()+" I = "+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
	}

}

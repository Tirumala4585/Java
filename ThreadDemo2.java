package com.threadprograms;

class Odd extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
		    if(i%2!=0)
			System.out.println(this.getName()+" I = "+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
class Even extends Thread{
    public void run() {
	for(int i=1;i<=10;i++) {
	   if(i%2==0)
	       System.out.println(this.getName()+" I = "+i);
	    try {
		Thread.sleep(1500);
	    }
	    catch(InterruptedException ie) {
			ie.printStackTrace();
	     }
	 }
   }
}
public class ThreadDemo2{		
	public static void main(String []args) {
		Odd obj1 = new Odd();
		obj1.start();
		obj1.setName("Odd");
		
		
		Even obj2 = new Even();
		obj2.start();
		obj2.setName("Even");
		
	}
}

		
	

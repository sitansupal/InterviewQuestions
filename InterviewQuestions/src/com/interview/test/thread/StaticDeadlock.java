package com.interview.test.thread;

public class StaticDeadlock {
	
	public static boolean y;
	
	static {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				y=true;
				System.out.println("I am inside...");
			}
			
		});
		t.start();
	//		try {
	//			t.join();
	//		} catch (InterruptedException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		}
	}
	
	public static void main(String[] args) {
		System.out.println(y);
	}

}

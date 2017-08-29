package com;

public class App {

	public static void main(String[] args) {
		new App();

	}

	public App() {
		MyThread a = new MyThread();
		MyThread b = new MyThread();

		Thread t = new Thread(a);
//		t.run();
		t.start();
		new Thread(b).start();
		t.run();
		
		
		int ret ;
		MyCallableThread myCallableThread = new MyCallableThread();
		try {
			ret = myCallableThread.call();
			System.out.println(ret);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com;

public class MyThread implements Runnable {

	@Override
	public void run() {
		try {
//			Test test = new Test();
			for (int count = 0; count < 100; count++) {
//				test.addToCounter(1);
				Test.addToCounter(1);
				Thread.sleep(7);
//				throw new Exception("qwer");
			}
	
//			System.out.println(test.getCounter());
			System.out.println(Test.getCounter());
		} catch (InterruptedException ex) {
			System.out.println(MyThread.class.getName() + ex);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package com;

import java.util.concurrent.Callable;

public class MyCallableThread implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		
		for (int count = 0; count < 100; count++) {

			Thread.sleep(7);
//			throw new Exception ("asdf");
		}

		return -5;
	}

}

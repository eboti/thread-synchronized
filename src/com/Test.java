package com;

public class Test {

	private static Integer counter = 0;

	// 1st solution: class level synchronized 
//	public void addToCounter(Integer number) {
//		synchronized (getClass()) {
//			counter += number;			
//		}
//	}

	public static synchronized void addToCounter(Integer number) {
			counter += number;				

	}
	
//	public Integer getCounter() {
//		return counter;
//	}
	
	public static Integer getCounter(){
		return counter;
	}
}

package com.tistory.tazz009.observer;

public class ObserverExample {

	public static void main(String[] args) {
		System.out.println("Enter Text > ");
		
		final EventSource evSrc = new EventSource();
		
		final ResponseHandler respHandler = new ResponseHandler();
		
		evSrc.addObserver(respHandler);
		
		Thread thread = new Thread(evSrc);
		thread.start();
	}
	
}

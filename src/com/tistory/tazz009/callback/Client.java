package com.tistory.tazz009.callback;

public class Client {

	public static void main(String[] args) {
		
		CallbackEvent event = new CallbackEvent() {
			
			@Override
			public void callbackMethod() {
				System.out.println("test!!!");
			}
		};
		
		EventRegistration test = new EventRegistration(event);
		
		test.callFunc();
	}
	
}

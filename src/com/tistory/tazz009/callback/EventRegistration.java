package com.tistory.tazz009.callback;

public class EventRegistration {

	private CallbackEvent callbackEvent;
	
	public EventRegistration(CallbackEvent event) {
		this.callbackEvent = event;
	}
	
	public void callFunc() {
		callbackEvent.callbackMethod();
	}
	
}

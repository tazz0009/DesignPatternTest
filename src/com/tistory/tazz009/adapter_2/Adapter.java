package com.tistory.tazz009.adapter_2;

/**
 * @author User
 *
 */
public class Adapter implements Target {

	private Adaptee adapter;
	
	public Adapter() {
		this.adapter = new Adaptee();
	}

	@Override
	public void request() {
		adapter.specificRequest();
	}
	
}

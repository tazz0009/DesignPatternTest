package com.tistory.tazz009.adapter_2;

public class Client {
	
	static Target target;
	
	public static void main(String[] args) {
		target = new Adapter();
		target.request();
	}

}

package com.tistory.tazz009.adapter;

public class Client {
	
	static Target target;
	
	public static void main(String[] args) {
		target = new Adapter();
		target.request();
	}

}

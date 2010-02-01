package com.tistory.tazz009.singleton;

public class SingletonExample {

	public static void main(String[] args) {
		SingletonExample se = new SingletonExample();
		se.methodA();
		se.methodB();
	}
	
	public void methodA() {
		SingletonCounter sc = SingletonCounter.getInstance();
		System.out.println("methodA : " + sc.getNextInt());
	}

	public void methodB() {
		SingletonCounter sc = SingletonCounter.getInstance();
		System.out.println("methodB : " + sc.getNextInt());
	}
}

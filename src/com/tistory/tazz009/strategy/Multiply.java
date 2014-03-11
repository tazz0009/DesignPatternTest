package com.tistory.tazz009.strategy;

public class Multiply implements Strategy {

	@Override
	public int execute(int a, int b) {
		System.out.println("Called Multiply's execute()");
		return a * b;
	}

}

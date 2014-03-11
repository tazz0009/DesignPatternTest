package com.tistory.tazz009.strategy;

public class Subtract implements Strategy {

	@Override
	public int execute(int a, int b) {
		System.out.println("Called Subtract's execute()");
		return a - b;
	}

}

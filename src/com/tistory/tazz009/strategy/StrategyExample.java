package com.tistory.tazz009.strategy;

/**
 * <pre>
 * Strategy Pattern - 전략 패턴
 * 
 * 동적으로 알고리즘을 교체할 수 있는 구조
 * 
 * 알고리즘 인터페이스를 정의하고, 각각의 알고리즘 클래스별로 캡슐화하여 
 * 각각의 알고리즘을 교체 사용 가능하게 한다.
 * 
 * 즉, 하나의 결과를 만드는 목적(메소드)은 동일하나, 그 목적을 달성할 수 있는 
 * 방법(전략, 알고리즘)이 여러가지가 존재 할 경우
 * 
 * 기본이 되는 템플릿 메서드(Template Method Pattern) 패턴과 함께 
 * 가장 많이 사용되는 패턴 중에 하나이다.
 * 
 * </pre>
 */

public class StrategyExample {

	public static void main(String[] args) {
		Context context;
		
		context = new Context(new Add());
		int resultAdd = context.executeStrategy(3, 4);
		System.out.println("Result Add : " + resultAdd);

		context = new Context(new Subtract());
		int resultSubtract = context.executeStrategy(3, 4);
		System.out.println("Result Subtract : " + resultSubtract);
		
		context = new Context(new Multiply());
		int resultMultiply = context.executeStrategy(3, 4);
		System.out.println("Result Multiply : " + resultMultiply);
	}
	
}

package com.tistory.tazz009.factory;

/**
 * <pre>
 * 
 * Abstract Factory Pattern(이하 추상 팩토리 패턴)은 공통의 테마를 가진 
 * 팩토리의 그룹을 캡슐화하는 방법을 제공하는 디자인 패턴이다.
 * 
 * 일반적으로 클라이언트 소프트웨어는 추상 팩토리의 구체적인 
 * 구현체를 생성하고 그 구현체의 인터페이스를 사용한다. 
 * 
 * 클라이언트는 생성된 객체의 인터페이스만 사용하기 때문에 
 * 각각의 내부 팩토리로부터 얻는 구체적인 객체에 대해 알지 못한다.
 * 
 * 이 패턴은 어떤 객체들의 그룹에 대한 구체적인 구현을 일반적인 
 * 사용법(인터페이스)으로부터 분리시킨다.
 * 
 * </pre>
 */

public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

	protected abstract Pizza createPizza(String type);
	
}

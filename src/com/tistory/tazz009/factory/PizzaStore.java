package com.tistory.tazz009.factory;

/**
 * <pre>
 * 
 * Abstract Factory Pattern(���� �߻� ���丮 ����)�� ������ �׸��� ���� 
 * ���丮�� �׷��� ĸ��ȭ�ϴ� ����� �����ϴ� ������ �����̴�.
 * 
 * �Ϲ������� Ŭ���̾�Ʈ ����Ʈ����� �߻� ���丮�� ��ü���� 
 * ����ü�� �����ϰ� �� ����ü�� �������̽��� ����Ѵ�. 
 * 
 * Ŭ���̾�Ʈ�� ������ ��ü�� �������̽��� ����ϱ� ������ 
 * ������ ���� ���丮�κ��� ��� ��ü���� ��ü�� ���� ���� ���Ѵ�.
 * 
 * �� ������ � ��ü���� �׷쿡 ���� ��ü���� ������ �Ϲ����� 
 * ����(�������̽�)���κ��� �и���Ų��.
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

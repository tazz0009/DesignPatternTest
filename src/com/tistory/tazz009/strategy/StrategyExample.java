package com.tistory.tazz009.strategy;

/**
 * <pre>
 * Strategy Pattern - ���� ����
 * 
 * �������� �˰����� ��ü�� �� �ִ� ����
 * 
 * �˰��� �������̽��� �����ϰ�, ������ �˰��� Ŭ�������� ĸ��ȭ�Ͽ� 
 * ������ �˰����� ��ü ��� �����ϰ� �Ѵ�.
 * 
 * ��, �ϳ��� ����� ����� ����(�޼ҵ�)�� �����ϳ�, �� ������ �޼��� �� �ִ� 
 * ���(����, �˰���)�� ���������� ���� �� ���
 * 
 * �⺻�� �Ǵ� ���ø� �޼���(Template Method Pattern) ���ϰ� �Բ� 
 * ���� ���� ���Ǵ� ���� �߿� �ϳ��̴�.
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

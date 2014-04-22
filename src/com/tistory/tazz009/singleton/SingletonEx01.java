package com.tistory.tazz009.singleton;

/**
 * 
 * Ŭ���� �ε�� new�� ������ �˴ϴ�. �׻� 1���� �ν��Ͻ��� ������ �ǰ���. 
 * �ڵ尡 ���� ª�� �����ϴ�. ���ɵ� �ٸ� ����� ���� �����ϴ�. 
 *
 */
public class SingletonEx01 {

	private static SingletonEx01 singleton = new SingletonEx01();
	
	private SingletonEx01() {
	}

	public static SingletonEx01 getInstance() {
		return singleton;
	}
	
}

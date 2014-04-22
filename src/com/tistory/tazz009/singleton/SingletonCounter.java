package com.tistory.tazz009.singleton;

/**
 * 
 * Singleton ������ �̿��ϸ�, 
 * �ϳ��� ��ü�� ���� �ƹ������� ������ �� �ִ�.
 * 
 * singleton���� �߿��� ���� ���� �� �����Դϴ�.
 * 
 * ù°, private ��� ������ �ڱ� �ڽ��� Ŭ������ �ν��Ͻ��� �����ϴ�.
 * 
 * ��°, private �����ڸ� �����Ͽ�, 
 * �ܺο��� ����� �ν��Ͻ��� �������� ���ϰ� �մϴ�.
 * 
 * ��°, getInstance() �޽�带 ���� ��ü�� static�ϰ� ������ �� �ֽ��ϴ�.
 * 
 */
public class SingletonCounter {

	private static SingletonCounter singletone = new SingletonCounter();
	private int cnt = 0;

	private SingletonCounter() {
	}

	public static SingletonCounter getInstance() {
		return singletone;
	}

	public int getNextInt() {
		return ++cnt;
	}

}

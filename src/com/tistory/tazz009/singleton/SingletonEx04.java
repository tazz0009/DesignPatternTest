package com.tistory.tazz009.singleton;

/**
 * 
 * �׹�° ����� ���� Ŭ������ ����ϴ� ����Դϴ�. 
 * ������ 3���� ��������� Singleton Ŭ������ 
 * �ڱ� �ڽ��� Ÿ���� ������ ��� ������ ������ �ִµ�, 
 * �׹�°�� ���� ���� Ŭ������ ������ �ֽ��ϴ�. 
 * ���� Ŭ������ ȣ��Ǵ� ������ ���� ������ �Ǳ� ������, 
 * �ӵ��� ������ �ʿ�ġ �ʴٸ� ���������� �ʽ��ϴ�.
 * 
 */
public class SingletonEx04 {

	private SingletonEx04() {
	}

	public static SingletonEx04 getInstance() {
		return SingletonHolder.singleton;
	}
	
	private static class SingletonHolder {
		static final SingletonEx04 singleton = new SingletonEx04();
	}
}

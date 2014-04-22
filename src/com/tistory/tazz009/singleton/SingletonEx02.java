package com.tistory.tazz009.singleton;

/**
 * 
 * Ŭ���� �ε�ÿ��� �ν��Ͻ��� �������� �ʽ��ϴ�. 
 * getInstance()�� ó�� ȣ��� �� ������ ������. 
 * �׷��� synchornized�� �ɷ� �־ ������ �� �����ϴ�. 
 * �ν��Ͻ��� ����� �ʿ䰡 ���� ���� �ν��Ͻ��� �������� �ʴ´ٴ� ���� 
 * ù��° �溡�� ���� �����Դϴ�.
 *
 */
public class SingletonEx02 {

	private static SingletonEx02 singleton;
	
	private SingletonEx02() {
	}

	public static synchronized SingletonEx02 getInstance() {
		if (singleton == null) {
			singleton = new SingletonEx02();
		}
		return singleton;
	}
	
}

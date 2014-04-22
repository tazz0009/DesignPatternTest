package com.tistory.tazz009.singleton;

/**
 * 
 * ù��°�� ������ ������ ����(synchronized �� �� �ɷ���)�� 
 * �ι�°�� ������ �� �� ���� �ν��Ͻ��� �ƿ� ������ �ʴ´��� 
 * ������ �̾ƿ� ����Դϴ�. �ڵ�� ���� ��ϴ�.
 * 
 * ���⼭ �߿��� ���� if(single == null) �� �� ���̳� üũ�մϴ�. 
 *
 * volatile Ű����� ������ ���ڼ��� �����մϴ�.
 * (���ڼ��̶� JVM�� �����ϴ� �ּҴ����� ���� ���մϴ�. 
 * �� ��ü ������ JVM�� �����ϴ� �ּҴ����� �� �� ����Ǿ�� �Ϸ�Ǵ� �۾��̶� ���Դϴ�.)
 * 
 */
public class SingletonEx03 {

	private volatile static SingletonEx03 singleton;
	
	private SingletonEx03() {
	}

	public static SingletonEx03 getInstance() {
		if (singleton == null) {
			synchronized (SingletonEx03.class) {
				if (singleton == null) {
					singleton = new SingletonEx03();
				}
			}
		}
		return singleton;
	}
	
}

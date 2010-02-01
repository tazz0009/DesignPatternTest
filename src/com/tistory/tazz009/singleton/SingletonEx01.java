package com.tistory.tazz009.singleton;

/**
 * 
 * 클래스 로드시 new가 실행이 됩니다. 항상 1개의 인스턴스를 가지게 되겠죠. 
 * 코드가 가장 짧고 쉽습니다. 성능도 다른 방법에 비해 좋습니다. 
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

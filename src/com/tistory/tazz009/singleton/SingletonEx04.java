package com.tistory.tazz009.singleton;

/**
 * 
 * 네번째 방법은 내부 클래스를 사용하는 방법입니다. 
 * 기존의 3가지 방법에서는 Singleton 클래스가 
 * 자기 자신의 타입을 가지는 멤버 변수를 가지고 있는데, 
 * 네번째의 경우는 내부 클래스가 가지고 있습니다. 
 * 내부 클래스가 호출되는 시점에 최초 생성이 되기 때문에, 
 * 속도도 빠르고 필요치 않다면 생성하지도 않습니다.
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

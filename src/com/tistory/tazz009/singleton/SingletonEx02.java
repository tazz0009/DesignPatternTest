package com.tistory.tazz009.singleton;

/**
 * 
 * 클래스 로드시에는 인스턴스가 생성되지 않습니다. 
 * getInstance()가 처음 호출될 때 생성이 되지요. 
 * 그러나 synchornized가 걸려 있어서 성능이 안 좋습니다. 
 * 인스턴스를 사용할 필요가 없을 때는 인스턴스가 생성되지 않는다는 점이 
 * 첫번째 방벙에 비해 장점입니다.
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

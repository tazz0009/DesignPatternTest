package com.tistory.tazz009.singleton;

/**
 * 
 * 첫번째의 장점인 성능이 좋다(synchronized 가 안 걸려서)와 
 * 두번째의 장점인 안 쓸 때는 인스턴스를 아예 만들지 않는다의 
 * 장점만 뽑아온 방법입니다. 코드는 제일 깁니다.
 * 
 * 여기서 중요한 점은 if(single == null) 을 두 번이나 체크합니다. 
 *
 * volatile 키워드는 변수의 원자성을 보장합니다.
 * (원자성이란 JVM이 실행하는 최소단위의 일을 말합니다. 
 * 즉 객체 생성은 JVM이 실행하는 최소단위가 몇 번 실행되어야 완료되는 작업이란 뜻입니다.)
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

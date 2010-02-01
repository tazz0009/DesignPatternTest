package com.tistory.tazz009.singleton;

/**
 * 
 * Singleton 패턴을 이용하면, 
 * 하나의 객체를 만들어서 아무데서나 접근할 수 있다.
 * 
 * singleton에서 중요한 것은 다음 세 가지입니다.
 * 
 * 첫째, private 멤버 변수로 자기 자신의 클래스의 인스턴스를 가집니다.
 * 
 * 둘째, private 생성자를 지정하여, 
 * 외부에서 절대로 인스턴스를 생성하지 못하게 합니다.
 * 
 * 셋째, getInstance() 메쏘드를 통해 객체를 static하게 가져올 수 있습니다.
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

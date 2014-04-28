package com.tistory.tazz009.adapter;

/**
 * 이미 구현되어 있는 코드가 있는데, 
 * 둘이 연결 좀 시켜주고 싶을 때가 있죠. 
 * @author User
 *
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		this.specificRequest();	// 다중상속
	}
	
}

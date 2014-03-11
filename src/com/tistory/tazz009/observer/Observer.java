package com.tistory.tazz009.observer;

/**
 * <pre>
 * 
 * 옵저버 패턴(Observer Pattern)에서는 한 객체의 상태가 바뀌면 
 * 그 객체에 의존하는 다른 객체들한테 연락이 자동으로
 * 갱신되는 방식으로 일대다(one-to-many)의존성을 정의 한다.
 * 
 * 한 객체의(주제) 상태가 바뀌면 그 객체에 의존하는 다른객체들(옵저버)에게 연락이 간다.
 * 주제 이면서 옵저버 일수도 있다.
 * 
 * 옵저버 패턴에서 상태를 저장하고 있는 것은 주제 책체다. 
 * 옵저버는 이 상태를 사용은 하지만 반드시 가지고 있어야 하는 것은 아니다. 
 * 되도록이면 서로간에 결합도는 떨어뜨리고 상태를 통하여 
 * 옵저버가 주제에 의존적인 성질을 가지게 한다.
 * 
 * </pre>
 */

public interface Observer {

	public void update(double ibmPrice, double aaplPrice, double googPrice);

}

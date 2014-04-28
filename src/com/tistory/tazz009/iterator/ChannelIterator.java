package com.tistory.tazz009.iterator;

/**
 * 
 * 프로그래밍을 하다 보면, array나 List, Set, Map과 같은 애들을 많이 씁니다. 
 * 얘네들의 특징은 어떤 데이터들의 집합체라는 겁니다. 
 * 원래 집합체란 게 속에 뭐가 들었냐가 중요하죠. 
 * 그래서 집합체들을 다룰 때는 얘들이 가지고 있는 개별 원소에 대해서 이런 저런 작업들을 할 일이 많습니다.
 * iterator를 쓰게 되면, 집합체와 개별 원소들간에 분리시켜 생각할 수가 있습니다. 
 * 심지어는 그 집합체가 어떤 클래스의 인스턴스인지 조차 신경쓰지 않아도 됩니다.
 * 
 * @author User
 *
 */
public interface ChannelIterator {
	
	public boolean hasNext();
	
	public Channel next();

}

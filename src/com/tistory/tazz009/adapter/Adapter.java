package com.tistory.tazz009.adapter;

/**
 * �̹� �����Ǿ� �ִ� �ڵ尡 �ִµ�, 
 * ���� ���� �� �����ְ� ���� ���� ����. 
 * @author User
 *
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		this.specificRequest();	// ���߻��
	}
	
}

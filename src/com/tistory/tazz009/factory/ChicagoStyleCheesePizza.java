package com.tistory.tazz009.factory;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza(){
		name = "��ī�� ǳ�� ����";
		dough = "��ī�� ��¼�� ũ����Ʈ";
		sauce = "��ī�� �丶�� �ҽ�";
		
		toppings.add("�ܶ���� ��¥���� ġ�� �װ���ǥ");
	}
	
	@Override
	public void cut(){
		System.out.println("��ī�� ���ڴ� �׸��ڸ��� �ڸ���");
	}
	
}

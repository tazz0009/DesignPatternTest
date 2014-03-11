package com.tistory.tazz009.factory;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza(){
		name = "시카코 풍의 피자";
		dough = "시카코 어쩌구 크러스트";
		sauce = "시카코 토마토 소스";
		
		toppings.add("잔뜩들은 모짜렐라 치즈 뚱곰이표");
	}
	
	@Override
	public void cut(){
		System.out.println("시카코 피자는 네모자르케 자른다");
	}
	
}

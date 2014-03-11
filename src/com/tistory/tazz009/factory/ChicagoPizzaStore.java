package com.tistory.tazz009.factory;

public class ChicagoPizzaStore extends PizzaStore{
	
	@Override
	public Pizza createPizza(String type){
		if(type.equals("cheese")){
			return new NYStyleCheesePizza();
		}else if(type.equals("pepperoni")){
		}
		return null;
	}
}

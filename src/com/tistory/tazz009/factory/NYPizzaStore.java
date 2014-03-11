package com.tistory.tazz009.factory;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else {
		}
		return null;
	}

}

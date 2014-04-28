package com.tistory.tazz009.template;

public class HousingClient {

	private static HouseTemplate  houseTypeForWood;
	private static HouseTemplate  houseTypeForGlass;

	public static void main(String[] args) {
		houseTypeForWood = new WoodenHouse();
		
		houseTypeForWood.buildHouse();
		
		System.out.println("***********");

		houseTypeForGlass = new GlassHouse();
		
		houseTypeForGlass.buildHouse();
	}
}

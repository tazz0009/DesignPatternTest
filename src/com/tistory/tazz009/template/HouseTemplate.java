package com.tistory.tazz009.template;

public abstract class HouseTemplate {

	public final void buildHouse() {
		buildFoundation();	// 기초공사
		buildPillars();		// 기둥 만들기
		buildWalls();		// 벽 만들기
		buildWindows();		// 창 만들기
		System.out.println("House is built.");
	}

	private void buildFoundation() {
		System.out.println("Building foundation with cement, iron rods and sand.");
	}

	public  abstract void buildPillars();
	public  abstract void buildWalls();
	
	private void buildWindows() {
		System.out.println("Building Glass Windows.");
	}
	
}

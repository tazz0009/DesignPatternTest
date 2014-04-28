package com.tistory.tazz009.template;

public abstract class HouseTemplate {

	public final void buildHouse() {
		buildFoundation();	// ���ʰ���
		buildPillars();		// ��� �����
		buildWalls();		// �� �����
		buildWindows();		// â �����
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

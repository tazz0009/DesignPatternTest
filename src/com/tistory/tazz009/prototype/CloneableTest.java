package com.tistory.tazz009.prototype;

public class CloneableTest {

	public static void main(String[] args) {
		Clone c1 = new Clone("한사람", 33);
		Clone c2 = c1;
		
		System.out.println(c1);		// 한사람씨(33세)
		System.out.println(c2);		// 한사람씨(33세)
		
		c2.setName("두사람");
		
		System.out.println(c1);		// 두사람씨(33세)
		System.out.println(c2);		// 두사람씨(33세)
		System.out.println(c1.hashCode());	
		System.out.println(c2.hashCode());	// c1, c2는 같다.
		
		try {
			
			Clone c3 = (Clone) c1.clone();
			c3.setName("또다른사람");
			
			System.out.println(c1);		// 두사람씨(33세)
			System.out.println(c3);		// 또다른사람씨(33세)
			System.out.println(c1.hashCode());	
			System.out.println(c3.hashCode()); // c1, c3은 다르다.
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
	
}

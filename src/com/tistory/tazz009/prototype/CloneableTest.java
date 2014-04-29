package com.tistory.tazz009.prototype;

public class CloneableTest {

	public static void main(String[] args) {
		Clone c1 = new Clone("�ѻ��", 33);
		Clone c2 = c1;
		
		System.out.println(c1);		// �ѻ����(33��)
		System.out.println(c2);		// �ѻ����(33��)
		
		c2.setName("�λ��");
		
		System.out.println(c1);		// �λ����(33��)
		System.out.println(c2);		// �λ����(33��)
		System.out.println(c1.hashCode());	
		System.out.println(c2.hashCode());	// c1, c2�� ����.
		
		try {
			
			Clone c3 = (Clone) c1.clone();
			c3.setName("�Ǵٸ����");
			
			System.out.println(c1);		// �λ����(33��)
			System.out.println(c3);		// �Ǵٸ������(33��)
			System.out.println(c1.hashCode());	
			System.out.println(c3.hashCode()); // c1, c3�� �ٸ���.
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
	
}

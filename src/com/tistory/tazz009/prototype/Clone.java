package com.tistory.tazz009.prototype;

class Clone implements Cloneable, Comparable<Clone> {

	private String name;
	private int age;
	
	public Clone() {
		this("", 0);
	}

	public Clone(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "씨(" + age + "세)";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public int compareTo(Clone o) {
		if (o.age > this.age) {
			return 1;
		} else if (o.age < this.age) {
			return -1;
		} else {
			return name.compareTo(o.name) * -1;	// * -1 하면 내림차순, 안하면 오름차순 
		}
	}
}
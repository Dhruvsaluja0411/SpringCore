package com.springcore.ci;

public class Person {
	@Override
	public String toString() {
		return this.name + " : " + this.personId + " : " + this.certi.name;
	}

	private String name;
	private int personId;
	private Certificate certi;
	
	public Person(String name, int personId, Certificate certi) {
		this.name = name;
		this.personId = personId;
		this.certi = certi;
	}
	
}

package com.springcore.ci;

public class Certificate {
	@Override
	public String toString() {
		return this.name;
	}

	public Certificate(String name) {
		super();
		this.name = name;
	}

	public String name;
}

package com.springcore.lifecycle;

public class Samosa {
	public Samosa(double price) {
		super();
		this.price = price;
	}

	public Samosa() {
		super();
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting the price");
		this.price = price;
	}
	
	public void init() {
		System.out.println("init method is called");
	}
	public void destroy() {
		System.out.println("destroy method is called");
	}

	private double price;
}

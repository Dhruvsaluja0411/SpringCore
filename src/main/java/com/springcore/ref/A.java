package com.springcore.ref;

public class A {
	@Override
	public String toString() {
		return "A [x=" + x + ", obj=" + obj + "]";
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
	private int x;
	private B obj;
}

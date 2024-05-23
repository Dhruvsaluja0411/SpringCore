package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demo")
public class Demo {
	@Value("#{22+11}")
	private int x;
	@Value("#{8>6 ? 88:66}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(4)}")
	private double z;
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	@Value("#{new java.lang.String('Dhruv')}")
	private String name;
	@Value("#{8>6}")
	private Boolean rel;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getRel() {
		return rel;
	}
	public void setRel(Boolean rel) {
		this.rel = rel;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", rel=" + rel + "]";
	}
}

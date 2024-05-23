package com.springcore.javacore;

import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
	public void study()
	{
		System.out.println("Student is reading book.");
	}
}

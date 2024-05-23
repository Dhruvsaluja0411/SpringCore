package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Course {
	@Override
	public String toString() {
		return "Course [subject=" + subject + "]";
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	private String subject;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("starting init method");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("starting destroy method");
	}

}

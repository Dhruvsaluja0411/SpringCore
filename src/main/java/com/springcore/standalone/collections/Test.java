package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standaloneconfig.xml");
		Person p = ctx.getBean("Person1",Person.class);
		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName());
		System.out.println(p.getProp());
		System.out.println(p.getProp().getClass().getName());
		System.out.println(p.getFeeStructure());
		System.out.println(p.getFeeStructure().getClass().getName());

	}

}

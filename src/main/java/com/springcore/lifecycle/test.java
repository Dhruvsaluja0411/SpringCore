package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		ctx.registerShutdownHook();
		Samosa s = (Samosa) ctx.getBean("s1");
		Pepsi p = (Pepsi) ctx.getBean("p1");
		Course c = (Course) ctx.getBean("c1");
		System.out.println(s);
		System.out.println(p);
		System.out.println(c);
	}

}

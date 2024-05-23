package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		Emp e1 = ctx.getBean("emp1", Emp.class);
		System.out.println(e1);
	}

}

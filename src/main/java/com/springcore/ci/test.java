package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Certificate c = (Certificate) ctx.getBean("certi");
		Person p = (Person) ctx.getBean("person");
		Addition add = (Addition) ctx.getBean("add"); 
		System.out.println(p);
		add.doSum();
	}

}

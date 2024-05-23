package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotypeConfig.xml");
		Student s = ctx.getBean("student",Student.class);
		System.out.println(s);
		System.out.println(s.hashCode());
		Student s2 = ctx.getBean("student",Student.class);
		System.out.println(s2.hashCode());
	}

}

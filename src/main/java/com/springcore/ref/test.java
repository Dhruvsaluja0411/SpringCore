package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/ref/referenceconfig.xml");
		A a = (A) ctx.getBean("aref");
		
		System.out.println(a);
	}

}

package com.springcore.javacore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(JavaConfig.class); 
		Student st = ctx.getBean("myStudent",Student.class);
		Client cl = ctx.getBean("superior",Client.class);
		System.out.println(st);
		st.study();
		System.out.println(cl);
		cl.work();
		
		
	}
}

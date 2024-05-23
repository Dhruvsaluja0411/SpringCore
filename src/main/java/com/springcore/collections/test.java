package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Employee e1 = (Employee) context.getBean("Employee1");
		System.out.println(e1);
		System.out.println(e1.getPhones().getClass().getName());
	}

}

package com.springcore.spel;

import org.springframework.expression.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/spel/spelConfig.xml");
		Demo d = ctx.getBean("demo", Demo.class);
		System.out.println(d);
		SpelExpressionParser spel = new SpelExpressionParser();
		Expression expression = spel.parseExpression("22+12");
		System.out.println(expression.getValue());

	}

}

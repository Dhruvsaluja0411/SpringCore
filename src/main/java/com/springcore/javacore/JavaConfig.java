package com.springcore.javacore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javacore")
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa()
	{
		Samosa sm = new Samosa();
		return sm;
	}
	
	@Bean(name = {"Client","superior"})
	public Client getClient()
	{
		// Making an object fo client to return
		Client cl = new Client(getSamosa());
		return cl;
	}
}

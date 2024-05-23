package com.springcore.javacore;

import org.springframework.stereotype.Component;

public class Client {
	private Samosa samosa;
	
	public Client(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void work()
	{
		this.samosa.display();
		System.out.println("The client is working...");
	}
}

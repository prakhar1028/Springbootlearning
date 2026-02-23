package com.Prakhar.Modulefirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModulefirstApplication implements CommandLineRunner {

	@Autowired
	Paying p;
	public static void main(String[] args) {
		SpringApplication.run(ModulefirstApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception
	{
		p.pay();
	}
}
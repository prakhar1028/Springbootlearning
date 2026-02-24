package com.Prakhar.Modulefirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModulefirstApplication implements CommandLineRunner {

	//@Autowired
	//Paying p;
	//@Autowired
	Notificatonservice notification;
	//public ModulefirstApplication(@Qualifier("smsnotif") Notificatonservice notification)
	public ModulefirstApplication( Notificatonservice notification)
	{
		this.notification=notification;
	}
	public static void main(String[] args) {
		SpringApplication.run(ModulefirstApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception
	{
       notification.send("Hello");
	}
}
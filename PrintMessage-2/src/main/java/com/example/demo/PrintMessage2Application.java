package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrintMessage2Application {

	public static void main(String[] args) {
		System.out.println("Welcome!!");
		SpringApplication.run(PrintMessage2Application.class, args);
		System.out.println("Bye!");
	}

}

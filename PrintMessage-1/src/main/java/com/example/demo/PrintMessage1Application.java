package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrintMessage1Application {

	public static void main(String[] args) {
		SpringApplication.run(PrintMessage1Application.class, args);
		System.out.println("How are you?");
	}

}

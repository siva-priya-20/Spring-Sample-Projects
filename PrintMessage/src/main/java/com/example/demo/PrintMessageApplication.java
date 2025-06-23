package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrintMessageApplication {

	public static void main(String[] args) {
		System.out.println("hello!!");
		SpringApplication.run(PrintMessageApplication.class, args);
	}

}

package com.todoappigt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.todoappigt.*")
public class ToDoIgtTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoIgtTestApplication.class, args);
	}
}

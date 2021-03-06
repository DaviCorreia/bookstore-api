package com.example.davi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@EntityScan(basePackages = {"com.example.davi.domain"})

@EnableJpaRepositories("com.example.davi.repositories")
@EntityScan("com.example.davi.domain")
@ComponentScan({ "com.example.davi.config", "com.example.davi.service" })
@ComponentScan({"com.example.davi.resources"})
@ComponentScan({"com.example.davi.exception"})
public class BookstoreApplication {



	public static void main(String[] args) {

		SpringApplication.run(BookstoreApplication.class, args);
	}


}

package com.klef.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.klef.controller")

public class SpringBootMvcsdpprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcsdpprojectApplication.class, args);
		System.out.println("hi page iam running without any error !!");
		
		
	}

}

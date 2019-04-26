package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.capg")
@EntityScan(basePackages= {"com.capg.model"})
@SpringBootApplication
public class TdsApplicationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TdsApplicationsApplication.class, args);
	}

}

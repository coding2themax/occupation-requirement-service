package com.coding2themax.career.occupation_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.coding2themax.career.*")
public class OccupationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OccupationServiceApplication.class, args);
	}

}

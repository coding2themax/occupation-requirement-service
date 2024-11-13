package com.coding2themax.career.occupation.requirement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.coding2themax.persistance.occupation.service.*",
		"com.coding2themax.career.occupation.requirement.*" })
public class OccupationRequirementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OccupationRequirementServiceApplication.class, args);
	}

}

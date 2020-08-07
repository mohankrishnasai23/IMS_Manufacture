package com.cts.imsproj.manufacture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableEurekaClient
public class ImsManufacturingDeptApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImsManufacturingDeptApplication.class, args);
	}
}

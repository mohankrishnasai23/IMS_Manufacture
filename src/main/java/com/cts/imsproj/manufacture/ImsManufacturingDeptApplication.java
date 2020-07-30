package com.cts.imsproj.manufacture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ImsManufacturingDeptApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImsManufacturingDeptApplication.class, args);
	}
}

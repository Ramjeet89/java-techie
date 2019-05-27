package com.java.spring.cloud.pcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ServiceRegistryPcfApplication {

	@GetMapping("/")
	public String getMessage(){
		return "Welcome to java knowledge";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryPcfApplication.class, args);
	}
}

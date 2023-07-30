package com.amarjeet.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestApiPracticalApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiPracticalApplication.class, args);
	}

}

package com.amarjeet.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {

	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("/getEmployee")
	public String getEmployee()
	{
		String url="http://ADDRESS-SERVICE/getAddress";
		String address=restTemplate.getForObject(url, String.class);
		return "Name: Amarjeet Kumar Singh, Email:amarjeetcs79@gmail.com" + address;
	}
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello";
	}
}

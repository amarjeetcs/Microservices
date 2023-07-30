package com.amarjeet.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AddressController {
	
	@GetMapping("/getAddress")
	public String getAddress()
	{
		
		return "Kundahalli Gate Bangalore";
		
	}

}

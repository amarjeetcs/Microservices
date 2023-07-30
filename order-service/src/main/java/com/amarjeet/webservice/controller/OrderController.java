package com.amarjeet.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amarjeet.webservice.common.Payment;
import com.amarjeet.webservice.common.TransactionRequest;
import com.amarjeet.webservice.common.TransactionResponse;
import com.amarjeet.webservice.entity.Order;
import com.amarjeet.webservice.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService service;

	@PostMapping("/bookOrder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {
		return service.saveOrder(request);
	}
	
	@GetMapping("/getOrderDetails")
	public List<Order> getOrderDetails()
	{
		return service.getOrderDetails();
		
	}
	@GetMapping("/getName")
	public String getName()
	{
		return "Amarjeet";
	}
	

	
}

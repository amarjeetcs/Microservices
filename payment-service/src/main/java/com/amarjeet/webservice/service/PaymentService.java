package com.amarjeet.webservice.service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amarjeet.webservice.entity.Payment;
import com.amarjeet.webservice.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository repository;
	public List<Payment> getOrderDetails()
	{
		return repository.findAll();
	}
	
	public Payment doPayment(Payment payment)
	{
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return repository.save(payment);
	}
	
	public String paymentProcessing()
	{
		//api should be 3rd party payment gateway(paytm,paypal...)
		return new Random().nextBoolean()?"success":"false";
	}
	
	public Payment findPaymentHistoryByOrderId(int orderId) {
       return repository.findByOrderId(orderId);
	

}
}

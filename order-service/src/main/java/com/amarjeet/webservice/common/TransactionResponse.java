package com.amarjeet.webservice.common;

import com.amarjeet.webservice.entity.Order;

public class TransactionResponse {
	private Order order;
	private double amount;
	private String transactionId;
	private String message;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public TransactionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionResponse(Order order, double d, String transactionId, String message) {
		super();
		this.order = order;
		this.amount = d;
		this.transactionId = transactionId;
		this.message = message;
	}

	@Override
	public String toString() {
		return "TransactionResponse [order=" + order + ", amount=" + amount + ", transactionId=" + transactionId
				+ ", message=" + message + "]";
	}

}

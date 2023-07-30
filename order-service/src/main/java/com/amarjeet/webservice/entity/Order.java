package com.amarjeet.webservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ORDER_TB")
public class Order {
	@Id
	private int id;
	private String name;
	private int qyt;
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQyt() {
		return qyt;
	}

	public void setQyt(int qyt) {
		this.qyt = qyt;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int id, String name, int qyt, double price) {
		super();
		this.id = id;
		this.name = name;
		this.qyt = qyt;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", qyt=" + qyt + ", price=" + price + "]";
	}

}

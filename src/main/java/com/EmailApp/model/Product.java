package com.EmailApp.model;

import java.time.LocalDate;

public class Product {

	private String name;
    private LocalDate expirationDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", expirationDate=" + expirationDate + ", getName()=" + getName()
				+ ", getExpirationDate()=" + getExpirationDate() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Product(String name, LocalDate expirationDate) {
		super();
		this.name = name;
		this.expirationDate = expirationDate;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}

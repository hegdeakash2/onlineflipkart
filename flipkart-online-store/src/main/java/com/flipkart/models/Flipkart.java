package com.flipkart.models;
  

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Flipkart {
	@Id
	@GeneratedValue(generator = "flip_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "flip_id", sequenceName ="flipkart_id", initialValue = 10,allocationSize = 1)
	private Integer flipkartId;
	private String productName;
	private String category;
	private String topoffers;
	private double price;

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "flipkart_id")
	private Set<Customer> customer;
	
	

	
	public Flipkart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flipkart(String productName, String category, String topoffers, double price,Set <Customer> customer) {
		super();
		this.productName = productName;
		this.category = category;
		this.topoffers = topoffers;
		this.price = price;
		this.customer = customer;
	}

	public Integer getflipkartId() {
		return flipkartId;
	}

	public void setflipkartId(Integer flipkartId) {
		this.flipkartId = flipkartId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTopoffers() {
		return topoffers;
	}

	public void setTopoffers(String topoffers) {
		this.topoffers = topoffers;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Set<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Flipkart [flipkartId=" + flipkartId + ", productName=" + productName + ", category=" + category
				+ ", topoffers=" + topoffers + ", price=" + price + ", customer=" + customer + "]";
	}
	
	
}
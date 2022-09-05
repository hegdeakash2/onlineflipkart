package com.flipkart.service;

import java.util.List;
import java.util.Set;

import com.flipkart.models.Flipkart;


public interface IFlipkartService {

	void addFlipkart(Flipkart flipkart);
	void updateFlipkart(Flipkart flipkart);
	void deleteFlipkart(int flipkartId);
	
	List<Flipkart> getAll();
	
	Flipkart getByProductId(int flipkartId);
	Set<Flipkart> getByCategory(String Category);
	Set<Flipkart> getByFlipkartCustomerName(String name);
	Set<Flipkart> getByFlipkartCustomerMobile(long mobile);
	

	
	
	
	
}

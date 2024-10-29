package com.klef.service;

import com.klef.model1.Customer;

public interface CustomerService {

	
	
	public String CustomerRegistration(Customer c);
	public Customer checkCustomerLogin(String email,String password);
}

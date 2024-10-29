package com.klef.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.model1.Customer;
import com.klef.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	private CustomerRepository cs;
	public String CustomerRegistration(Customer c)
	{
		cs.save(c);
		
		return "done added succefuly!!";
	}
	@Override
	public Customer checkCustomerLogin(String email, String password) {
		// TODO Auto-generated method stub
		return cs.checkCustomerLogin(email, password);
	}
}

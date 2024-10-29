package com.klef.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.model1.Admin;
import com.klef.model1.Customer;
import com.klef.repository.AdminRepository;
import com.klef.repository.CustomerRepository;

@Service
public class AdminServiceImpl implements AdminService {
    
    @Autowired
    private CustomerRepository crepo;

    @Autowired
    private AdminRepository adminrepo;
    
    @Override
    public List<Customer> viewalldata() {
        return crepo.findAll();
    }

    @Override
    public Admin checkAdminLogin(String username, String pass) {
        // Validate inputs (optional)
        if (username == null || pass == null) {
            throw new IllegalArgumentException("Username or password cannot be null");
        }
        return adminrepo.checkAdminLogin(username, pass);
    }
}

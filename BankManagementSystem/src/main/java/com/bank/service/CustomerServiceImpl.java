package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.CustomerMaster;
import com.bank.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepo;
	
	@Override
	public List<CustomerMaster> findAllCustomers() {
		return (List<CustomerMaster>) customerRepo.findAll();
	}

	@Override
	public CustomerMaster saveCustomer(CustomerMaster customerMaster) {
		CustomerMaster savedCustomer =  customerRepo.save(customerMaster);
		return savedCustomer;
	}

	
	
}

package com.bank.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.CustomerMaster;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerMaster, String>{

	
	//public List<CustomerMaster> findCustomerMasters();
}

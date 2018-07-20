package com.bank;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bank.model.BranchMaster;
import com.bank.model.CustomerMaster;
import com.bank.service.BranchService;
import com.bank.service.CustomerService;

@SpringBootApplication
public class BankManagementSystemApplication implements CommandLineRunner{

	private static final Logger LOG = LoggerFactory.getLogger(BankManagementSystemApplication.class);
	
	@Autowired
	BranchService branchService;
	
	@Autowired
	CustomerService customerService;
	
	public static void main(String[] args) {
		SpringApplication.run(BankManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		BranchMaster b1 = new BranchMaster("redhills", "chennai");
		BranchMaster b2 = new BranchMaster("adyar", "chennai");
		BranchMaster b3 = new BranchMaster("annanagar", "chennai");
		
		branchService.saveBranch(b1);
		branchService.saveBranch(b2);
		branchService.saveBranch(b3);
		
		String today = "13/07/2018";
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(today);
		CustomerMaster c1 = new CustomerMaster("sflkjjd", "sfjdks", "reuhsjh", "chennai", "1234567890", "asdf",date1);
		CustomerMaster c2 = new CustomerMaster("akdjf", "sldfgeoe", "sdwejd", "chennai", "1234567890", "asdf",date1);
		CustomerMaster c3 = new CustomerMaster("asdlkf", "dkfjhd", "asgfahsdj", "chennai", "1234567890", "asdf",date1);
		
		customerService.saveCustomer(c1);
		customerService.saveCustomer(c2);
		customerService.saveCustomer(c3);
		
		
	}
}

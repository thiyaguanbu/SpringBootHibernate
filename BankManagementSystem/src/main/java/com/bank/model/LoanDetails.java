package com.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loan_details")
public class LoanDetails {
	
//	customer_number varchar(6)
//	branch_id varchar(6)
//	loan_amount INT(7)

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loan_number")
	private long loanNumber;
	
	@Column(name = "loan_amount")
	private long loanAmount;
	
	@Column(name = "customer_number")
	private CustomerMaster customerMaster;
	
	@Column(name = "branch_id")
	private BranchMaster branchMaster;
	
	

}

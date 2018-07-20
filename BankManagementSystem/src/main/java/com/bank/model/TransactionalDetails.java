package com.bank.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "transactional_details")
public class TransactionalDetails {
	
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_number")
	private long transactionNumber;
	
	@Column(name = "date_of_transaction")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateOfTrasaction;
	
	@Column(name = "medium_of_transaction")
	private String mediumOfTransaction;

	@Column(name = "transaction_type")
	private String transactionType;
	
	@Column(name = "transaction_amount")
	private long transactionAmount;
	
	@Column(name = "account_master")
	private AccountMaster accountMaster;
	
	
	

}

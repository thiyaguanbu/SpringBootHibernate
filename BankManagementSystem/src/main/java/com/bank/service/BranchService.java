package com.bank.service;

import java.util.List;

import com.bank.model.BranchMaster;


public interface BranchService {

	 List<BranchMaster> findAllBranchs(int branchId);
	 void saveBranch(BranchMaster branchMaster);

	
	
}

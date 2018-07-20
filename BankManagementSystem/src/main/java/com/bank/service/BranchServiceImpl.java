package com.bank.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.BranchMaster;
import com.bank.repository.BranchRepository;

@Service
public class BranchServiceImpl implements BranchService{

	@Autowired
	BranchRepository branchRepo;
	
	private static final Logger LOG = LoggerFactory.getLogger(BranchServiceImpl.class);
	
	
	@Override
	public List<BranchMaster> findAllBranchs(int branchId) {
		List<BranchMaster> BranchMasters = (List<BranchMaster>) branchRepo.findAll();
		return BranchMasters;
	}

	@Override
	public void saveBranch(BranchMaster branchMaster) {
		branchRepo.save(branchMaster);
		LOG.info("BranchMaster is saved");
		
	}
	
	

}

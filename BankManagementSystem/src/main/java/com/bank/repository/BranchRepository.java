package com.bank.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.BranchMaster;

@Repository
public interface BranchRepository extends CrudRepository<BranchMaster, String>{

	//public List<BranchMaster> findBranchMasters();

	
}

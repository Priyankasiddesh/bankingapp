package com.priyanka.springbootbankapp.controller;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AccountRepository extends CrudRepository<Account,Integer>{
	List<Account> findAll();
	Account findById(int id); 

}

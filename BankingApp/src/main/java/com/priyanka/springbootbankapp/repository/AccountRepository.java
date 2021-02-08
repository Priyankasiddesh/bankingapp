package com.priyanka.springbootbankapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.priyanka.springbootbankapp.entity.Account;
@Repository
public interface AccountRepository extends CrudRepository<Account,Integer>{
	List<Account> findAll();


}

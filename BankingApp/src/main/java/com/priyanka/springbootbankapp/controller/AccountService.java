package com.priyanka.springbootbankapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	@PersistenceContext
	private EntityManager em;


	 @Autowired // establish injection
	    private AccountRepository accountRepository;

	    // GET-ALL
	    public List<Account> getAllAccount() {
	    	List<Account> acc = em.createNativeQuery("SELECT * FROM Account" ).getResultList();	        
	        return acc;
	    }

	    // GET
	    public Account getAccountById(int id) {
	        return accountRepository.findById(id);
	    }


}

package com.priyanka.springbootbankapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.priyanka.springbootbankapp.jdbc.Jdbc;


@Service
public class AccountService  {
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
	    public Optional<Account> getAccountById(int id) {
			 System.out.println(id);
			 System.out.println(accountRepository.findById(id));

	        return accountRepository.findById(id);
	    }

	


}

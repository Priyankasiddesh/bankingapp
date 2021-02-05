package com.priyanka.springbootbankapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TransactionServiceImpl implements TransactionService{
	@Autowired
	private TransactionService transrepo;


	
	public  List<Transaction> getTransactions() {
		List<Transaction> account = transrepo.getTransactions();
		  return account;
	}

	
	public List<Transaction_deposit_response_entity> deposit(int custId,int amount) {
		return transrepo.deposit(custId,amount);
	}

	
	public List<Transaction_withdraw_response_entity> withdraw(int custId,int amount) {
		return transrepo.withdraw(custId,amount);
	}

	
	public int balance(Transaction account) {
	 return transrepo.balance(account);
	}
	public Optional<Transaction> getTransactionById(int id) {
		 System.out.println(id);

		return transrepo.findById(id);
	}


	@Override
	public <S extends Transaction> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Transaction> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<Transaction> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Iterable<Transaction> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Iterable<Transaction> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(Transaction entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll(Iterable<? extends Transaction> entities) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}




}

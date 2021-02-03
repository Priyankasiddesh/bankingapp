package com.priyanka.springbootbankapp.controller;

import java.util.List;

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
	public Transaction getTransactionById(int id) {
		return transrepo.findById(id);
	}


	@Override
	public Transaction findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.priyanka.springbootbankapp.controller;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TransactionService extends CrudRepository<Transaction,Integer> {
	public  List<Transaction> getTransactions() ;
	//public Transaction findById(int id);
	 public List<Transaction_deposit_response_entity> deposit(int accountnum,int amount) ;
	    public List<Transaction_withdraw_response_entity> withdraw(int accountnum,int amount) ;
		 public int balance(Transaction transaction);




}

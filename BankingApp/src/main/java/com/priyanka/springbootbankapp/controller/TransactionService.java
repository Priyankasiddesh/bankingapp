package com.priyanka.springbootbankapp.controller;

import java.util.List;

public interface TransactionService {
	public  List<Transaction> getTransactions() ;
	public Transaction findById(int id);
	 public List<Transaction_deposit_response_entity> deposit(int accountnum,int amount) ;
	    public List<Transaction_withdraw_response_entity> withdraw(int accountnum,int amount) ;
		 public int balance(Transaction transaction);




}

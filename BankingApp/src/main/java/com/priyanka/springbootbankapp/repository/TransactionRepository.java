package com.priyanka.springbootbankapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.priyanka.springbootbankapp.entity.Transaction;
import com.priyanka.springbootbankapp.response.entity.Transaction_deposit_response_entity;
import com.priyanka.springbootbankapp.response.entity.Transaction_withdraw_response_entity;
public interface TransactionRepository {
	public  List<Transaction> getTransactions() ;
	public Transaction findById(int id); 
	 public List<Transaction_deposit_response_entity> deposit(int accountnum,int amount) ;
    public List<Transaction_withdraw_response_entity> withdraw(int accountnum,int amount) ;
	 public int balance(Transaction transaction);

}

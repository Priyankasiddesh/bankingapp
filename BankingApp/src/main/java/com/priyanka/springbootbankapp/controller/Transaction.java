package com.priyanka.springbootbankapp.controller;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Transaction")
public class Transaction {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	int transid;
	int custId;
	Date date;
	String description;
	String reference;
	int withdrawl;
	int deposit;
	int balance;
	
	
	public Transaction() {
		
	}
	
	
	public Transaction(int transid, int custid, Date date, String description, String reference, int withdrawl,
			int deposit, int balance) {
		super();
		this.transid = transid;
		this.custId = custid;
		this.date = date;
		this.description = description;
		this.reference = reference;
		this.withdrawl = withdrawl;
		this.deposit = deposit;
		this.balance = balance;
	}
	public int getTransid() {
		return transid;
	}
	public void setTransid(int transid) {
		this.transid = transid;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custid) {
		this.custId = custid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public int getWithdrawl() {
		return withdrawl;
	}
	public void setWithdrawl(int withdrawl) {
		this.withdrawl = withdrawl;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}

package com.priyanka.springbootbankapp.controller;

public class Transaction_deposit_response_entity {
	private int custId;
	//private String account_holder_name;
	private int balance;
	private int deposit_amount;

	public Transaction_deposit_response_entity() {
		super();
	}
	public Transaction_deposit_response_entity( int custId,int balance,int deposit_amount) {
		super();
		this.custId = custId;
		//this.account_holder_name = account_holder_name;
		this.balance = balance;
		this.deposit_amount = deposit_amount;
		
	}

	public int getcustId() {
		return custId;
	}

	public void setAccount_num(int custId) {
		this.custId = custId;
	}

	//public String getAccount_holder_name() {
		//return account_holder_name;
	//}

	//public void setAccount_holder_name(String account_holder_name) {
		//this.account_holder_name = account_holder_name;
	//}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getDeposit_amount() {
		return deposit_amount;
	}

	public void setDeposit_amount(int deposit_amount) {
		this.deposit_amount = deposit_amount;
	}
	

}

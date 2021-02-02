package com.priyanka.springbootbankapp.controller;

public class Transaction_withdraw_response_entity {
	public Transaction_withdraw_response_entity() {
		super();
	}
	private int custId;
	//private String account_holder_name;
	private int balance;
	private int withdraw_amount;
	
	public Transaction_withdraw_response_entity(int custId, String account_holder_name, int balance,
			int withdraw_amount) {
		super();
		this.custId = custId;
		//this.account_holder_name = account_holder_name;
		this.balance = balance;
		this.withdraw_amount = withdraw_amount;
		
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	//public String getAccount_holder_name() {
	//	return account_holder_name;
	//}

	//public void setAccount_holder_name(String account_holder_name) {
	//	this.account_holder_name = account_holder_name;
	//}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getWithdraw_amount() {
		return withdraw_amount;
	}

	public void setWithdraw_amount(int withdraw_amount) {
		this.withdraw_amount = withdraw_amount;
	}
	

}

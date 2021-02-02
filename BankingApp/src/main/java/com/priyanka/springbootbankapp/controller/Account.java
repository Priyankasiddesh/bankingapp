package com.priyanka.springbootbankapp.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String bankname;
	String branch;
	int Accountholder;
	String accountnumber;
	Enum accounttype;
	String bankcode;
	
	public Account() {
		
	}
	public Account(int id, String bankname, String branch, int Accountholder, String accountnumber, Enum accounttype,
			String bankcode) {
		super();
		this.id = id;
		this.bankname = bankname;
		this.branch = branch;
		this.Accountholder = Accountholder;
		this.accountnumber = accountnumber;
		this.accounttype = accounttype;
		this.bankcode = bankcode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getAccountholder() {
		return Accountholder;
	}
	public void setAccountholder(int Accountholder) {
		this.Accountholder = Accountholder;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public Enum getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(Enum accounttype) {
		this.accounttype=accounttype;
	}
	public String getBankcode() {
		return bankcode;
	}
	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}
	

}

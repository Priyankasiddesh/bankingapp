package com.priyanka.springbootbankapp.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Customer {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	int custid;
	String name;
	int Accountid;
	
	public Customer() {
		
	}
	
	public Customer(int custid, String name, int accountid) {
		super();
		this.custid = custid;
		this.name = name;
		Accountid = accountid;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountid() {
		return Accountid;
	}
	public void setAccountid(int accountid) {
		Accountid = accountid;
	}

}

package com.priyanka.springbootbankapp.controller;

import java.util.ArrayList;
import java.util.List;
import com.priyanka.springbootbankapp.jdbc.Jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class TransactionRepositoryImpl extends Jdbc implements TransactionRepository {

	String SQL1 = "SELECT * FROM Transaction";
	public List<Transaction> getTransactions() {
		 List<Transaction> acc = null ;
		 try {
			   acc = jdbcTemplate.query(SQL1,new BeanPropertyRowMapper<Transaction>(Transaction.class));  //to map the row of account using bean property 
			  } 
		 catch (DataAccessException e) {
			   e.printStackTrace();
			  }
			  return acc; // returns the list of account
		
	}
	String SQL2 = "update Transaction a set a.balance=?,a.deposit=? where a.custid=?";
	public List<Transaction_deposit_response_entity> deposit(int custId,int amount) {
		List<Transaction_deposit_response_entity> listOfEntities = new ArrayList<Transaction_deposit_response_entity>();
		try {
			Transaction_deposit_response_entity entity= new Transaction_deposit_response_entity();
			List<Transaction> acc= this.getTransactions();
			Transaction namAcc=null;
			for(Transaction a:acc) {
				if(a.getCustId()==custId) {
					System.out.println("acount "+a);
					namAcc=a;
				}
			}
			int totalAmount = (int) (namAcc.getBalance()+amount);
			int a =  jdbcTemplate.update(SQL2,totalAmount,amount);
	         if(namAcc.getBalance() !=  0) {
	                 entity.setBalance(totalAmount);
	                 entity.setDeposit_amount(amount);
	         }
	         listOfEntities.add(entity);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return listOfEntities;
		
	}
	String SQL4 = "update Transaction a set a.balance=?,a.withdraw=? where a.custid=?";
	public List<Transaction_withdraw_response_entity> withdraw(int custId,int amount) {
		List<Transaction_withdraw_response_entity> listOfEntities1 = new ArrayList<Transaction_withdraw_response_entity>();
		try {
			Transaction_withdraw_response_entity entity1= new Transaction_withdraw_response_entity();
			List<Transaction> acc= this.getTransactions();
			Transaction namAcc1=null;
			for(Transaction a:acc) {
				if(a.getCustId()==custId) {
					System.out.println("acount "+a);
					namAcc1=a;
				}
			}
			int totalAmount = (int) (namAcc1.getBalance()-amount);
			int a =  jdbcTemplate.update(SQL4,totalAmount,amount,namAcc1.getCustId());
	         if ( namAcc1.getBalance() != 0 ) {
	                 entity1.setCustId(custId);
	                 entity1.setBalance(totalAmount);
	                 entity1.setWithdraw_amount(amount);
	         }
	         listOfEntities1.add(entity1);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return listOfEntities1;
		
		
	}

	public int balance(Transaction transaction) {
		// TODO Auto-generated method stub
		return 0;
	} 

	//String SQL3 = "INSERT INTO account(accountnum,name,balance)VALUES(?,?,?)";
	//@Override
	//public int createAccount(Account account) { // the insert method @Overrided by by accountholderDao interface
		//int count = jdbcTemplate.update(SQL3, new Object[] {
			     //account.getAccountNumber(),account.getName(),account.getBalance() });
			 // return count;
	//}
}

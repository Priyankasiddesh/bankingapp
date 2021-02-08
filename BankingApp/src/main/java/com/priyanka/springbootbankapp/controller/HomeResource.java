package com.priyanka.springbootbankapp.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.priyanka.springbootbankapp.entity.Account;
import com.priyanka.springbootbankapp.entity.Customer;
import com.priyanka.springbootbankapp.entity.Transaction;
import com.priyanka.springbootbankapp.repository.CustomerRepository;
import com.priyanka.springbootbankapp.repositoryimpl.TransactionRepositoryImpl;
import com.priyanka.springbootbankapp.response.entity.Transaction_deposit_response_entity;
import com.priyanka.springbootbankapp.response.entity.Transaction_withdraw_response_entity;
import com.priyanka.springbootbankapp.service.AccountService;
import com.priyanka.springbootbankapp.serviceimpl.TransactionServiceImpl;

@RestController
public class HomeResource {
	@Autowired
	private CustomerRepository repo;
	@Autowired
	private AccountService accountService;
	@Autowired
	private TransactionRepositoryImpl trans;
	@Autowired
	private TransactionServiceImpl transim;
	@GetMapping("/")
	public String home() {
		return("<h3>Welcome</h3>");
	}
	
	 @RequestMapping(value="/customer", method = RequestMethod.GET, produces = "application/json") 
	    public List<Customer> getAll() 
	    { 
	        return repo.findAll(); 
	    } 
	 @GetMapping("/customer/{id}") 
	    public Customer getCustomerById( 
	        @PathVariable(value = "id") int id) 
	    { 
	        return repo.findById(id); 
	    } 
	 
	 @RequestMapping(value="/account", method = RequestMethod.GET, produces = "application/json") 
	 public @ResponseBody List<Account> getAllAccount(){
		 System.out.println(accountService);
	        return accountService.getAllAccount();
		 
	 }
	 @RequestMapping(value="/account/{accid}",method=RequestMethod.GET,produces="application/json")
	 public Optional<Account> getAccountById(
			 @PathVariable(value = "accid") int id) 
	 {
		 System.out.println(id);
		 return accountService.getAccountById(id);
	 }	  

	 
	 @RequestMapping(value="/transaction", method = RequestMethod.GET, produces = "application/json") 
		public  List<Transaction> getTransactions() {
			return trans.getTransactions();
		}
	 
	 @RequestMapping(value="/transaction/{id}", method = RequestMethod.GET, produces = "application/json") 
	 public Optional<Transaction> getTransactionById(@PathVariable(value="id") int id) {
		 System.out.println(id);

		 return transim.getTransactionById(id);
	 }
	 
	 @RequestMapping(value = "/transaction/deposit/{custId}/{amount}", method = RequestMethod.POST, produces = "application/json")
	 public List<Transaction_deposit_response_entity> deposit(@PathVariable int custId,@PathVariable int amount) {

		 List<Transaction_deposit_response_entity> depositEntity = trans.deposit(custId,amount);
//		  headers.add("Account Created  - ", String.valueOf(account.getDeposit()));
		  return depositEntity;
		 }
	 
	 
	 
	 @RequestMapping(value = "/account/withdraw/{custId}/{amount}", method = RequestMethod.POST,produces = "application/json")
	 public List<Transaction_withdraw_response_entity> withdraw(@PathVariable int custId,@PathVariable int amount) {
			 
		 List<Transaction_withdraw_response_entity> withdrawEntity=trans.withdraw(custId,amount);
		  //headers.add("Account Created  - ", String.valueOf(account.getWithdraw()));
		  return withdrawEntity;
		 }

	    
}

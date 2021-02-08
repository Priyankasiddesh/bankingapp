package com.priyanka.springbootbankapp.repository;

import org.springframework.stereotype.Repository;

import com.priyanka.springbootbankapp.entity.Customer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


@Repository
public interface CustomerRepository extends CrudRepository <Customer,Integer>{
    List<Customer> findAll(); 
	Customer findById(int id); 


}

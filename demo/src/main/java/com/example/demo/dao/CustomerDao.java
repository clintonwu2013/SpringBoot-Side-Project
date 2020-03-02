package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Customer;

@Repository
public interface CustomerDao extends CrudRepository<Customer, Long>{

}

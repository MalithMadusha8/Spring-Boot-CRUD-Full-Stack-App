package com.example.SpringBootCRUD.repository;

import com.example.SpringBootCRUD.model.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Long> {
}

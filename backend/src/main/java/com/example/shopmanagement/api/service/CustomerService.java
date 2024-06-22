package com.example.shopmanagement.api.service;

import com.example.shopmanagement.api.model.Customer;

import com.example.shopmanagement.api.repository.CustomerRepotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepotory customerRepotory;

    public List<Customer> getAllCustomers() {
       return customerRepotory.findAll();
    }
    public Optional<Customer> getCustomerById(String id) {
        return customerRepotory.findById(id);
    }

    public Customer addCustomer(Customer customer) {
        return customerRepotory.save(customer);
    }

    public Customer updateCustomer(String id, Customer customer) {
        customer.setId(Integer.parseInt(id));
        return customerRepotory.save(customer);
    }

    public void deleteCustomer(String id) {
        customerRepotory.deleteById(id);
    }
}

package edu.wctc.customer.dao;

import edu.wctc.customer.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getCustomerList();
}

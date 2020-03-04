package edu.wctc.customer.service;

import edu.wctc.customer.dao.CustomerDAO;
import edu.wctc.customer.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class LastNameSortingCustomerService implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    public List<Customer> getCustomerList() {
        List<Customer> list= customerDAO.getCustomerList();
        list.sort(Comparator.comparing(Customer::getLastName));

        return null;
    }
}

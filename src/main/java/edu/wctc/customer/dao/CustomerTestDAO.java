package edu.wctc.customer.dao;

import edu.wctc.customer.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerTestDAO implements CustomerDAO {
    @Override
    public List<Customer> getCustomerList(){
        Customer c = new Customer();
        c.setFirstName("Stacy");
        c.setLastName("Read");
        c.setFreePasses(5);
        c.setPostalCode("A2D 4R5");
        c.setEventCode("PAX 2002");

        List<Customer> list = new ArrayList<>();
        list.add(c);
        return list;
    }
}

package edu.wctc.customer.dao;

import edu.wctc.customer.entity.Customer;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Primary
@Repository
public class CustomerFileDAO implements CustomerDAO {
    @Override
    public List<Customer> getCustomerList() {
        List<Customer> list = new ArrayList<>();

        Resource resource = new ClassPathResource("/customers.txt");

        try (Scanner input = new Scanner(resource.getFile())){

        while(input.hasNext()){
            Customer c = new Customer();
            c.setFirstName(input.nextLine());
            c.setLastName(input.nextLine());
            c.setFreePasses(Integer.parseInt(input.nextLine()));
            c.setPostalCode(input.nextLine());
            c.setEventCode(input.nextLine());
            list.add(c);
        }

        } catch (IOException e){

        }
        return list;
    }
}

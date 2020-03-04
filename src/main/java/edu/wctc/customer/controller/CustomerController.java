package edu.wctc.customer.controller;

import edu.wctc.customer.entity.Customer;
import edu.wctc.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/validation")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @RequestMapping("/list")
    public String showCustomerList(Model model){
        List<Customer> list = customerService.getCustomerList();
        model.addAttribute("allCustomers", list);
        return "customer/customer-list";
    }

    @InitBinder
    public void trimWhitespace(WebDataBinder dataBinder){
        StringTrimmerEditor ste = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, ste);
    }

    @RequestMapping("/form")
    public String showForm(Model model){
        model.addAttribute("theCustomer", new Customer());
        return "customer/customer-form";
    }

    @RequestMapping("/processForm")
    public String orderTickets(@Valid @ModelAttribute("theCustomer") Customer theCustomer,
                               BindingResult validation){
        System.out.println(theCustomer.toString());

        if (validation.hasErrors()) {
            return "customer/customer-form";
        }
        return "customer/customer-confirmation";
    }
}

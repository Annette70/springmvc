package edu.wctc.simple;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class InvoiceController {

    @RequestMapping("/showInvoice")
    public String showForm() {
        return "simple/simple-invoice";
    }

    @RequestMapping("/check")
    public String shoutHello(HttpServletRequest request,HttpServletRequest request2,HttpServletRequest request3,
                             HttpServletRequest request4,  Model model){

        String cardNumber = request.getParameter("cardNumber");
        String nameOnCard = request2.getParameter("nameOnCard");
        String expirationDate = request3.getParameter("expirationDate");
        String securityCode = request4.getParameter("securityCode");

        String message = "Hello " + nameOnCard + "\n" +
                "Your card number is: " + cardNumber + "\n" +
                "The expiration date is: " + expirationDate + "\n" +
                "The security code is: "+ securityCode;

        model.addAttribute("message", message);

        return "simple/simple-invoice-result";
    }
}

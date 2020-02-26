package edu.wctc.simple;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller

public class SimpleFormController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "simple/simple-form";
    }
    @RequestMapping("/shout")
    public String shoutHello(HttpServletRequest request, Model model){

        String theName = request.getParameter("studentName");

        theName = theName.toUpperCase();

        String message = "Hello " + theName + "!!!!";

        model.addAttribute("message", message);

        return "simple/simple-form-result";
    }
    @RequestMapping("/shoutAgain")
    public String shoutHelloAgain(@RequestParam String studentName, Model model){

        studentName = studentName.toUpperCase();

        String message = "Hello again " + studentName +"!!!!!";
        model.addAttribute("message", message);

        return "simple/simple-form-result";
    }
}

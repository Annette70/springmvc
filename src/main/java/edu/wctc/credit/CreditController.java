package edu.wctc.credit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/credit")
public class CreditController {

    @RequestMapping("/showForm")
   public String showForm(Model model){
        Credit theCredit = new Credit();

        model.addAttribute("bindingCredit", theCredit);

        return "credit/form";
    }

    @RequestMapping("/processForm")
    public String processForm(Model model){
      return "credit/display";
    }
}

package edu.wctc.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model){
        Student theStudent = new Student();

        model.addAttribute("bindingStudent",theStudent);

        return "student/form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("bindingStudent") Student bindingStudent){
        System.out.println(bindingStudent.getFirstName());
        System.out.println(bindingStudent.getLastName());
        return "/student/confirm";
    }

}

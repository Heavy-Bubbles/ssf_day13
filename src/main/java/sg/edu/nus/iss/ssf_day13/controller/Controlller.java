package sg.edu.nus.iss.ssf_day13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import sg.edu.nus.iss.ssf_day13.controller.model.Contact;

@Controller
@RequestMapping(path = "/")
public class Controlller {

    // request method to load landing page
    @GetMapping
    public String showAddressBook(Model model){
        model.addAttribute("contact", new Contact());
        return "AddressBook";
    }
    
    // post mapping to send data from client (save contact info)
    @PostMapping("/contact")
    public String saveAddressBook(Contact contact, Model model){
        System.out.println("Name: " + contact.getName());
        System.out.println("Email: " + contact.getEmail());
        System.out.println("Phone Number: " + contact.getPhoneNumber());
        return "AddressBook";
    }
}

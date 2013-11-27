package com.devipuram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
 
    @RequestMapping("home")
    public String loadHomePage(Model m) {
        m.addAttribute("name", "Devotee");
        return "home";
    }
    
    
    @RequestMapping("success")
    public String showSucessPage(@RequestParam("payment_id") String transactionId,Model m) {
        m.addAttribute("transactionId", transactionId);
        return "success";
    }
}

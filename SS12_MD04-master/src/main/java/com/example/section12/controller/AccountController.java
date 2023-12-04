package com.example.section12.controller;

import com.example.section12.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("account")
public class AccountController {
    @RequestMapping("")
    public String index() {
        return "account";
    }

    @RequestMapping("add")
    public String add(Model model) {
        Account account=new Account();
        model.addAttribute("account",account);
        return "add";
    }

    @RequestMapping("/store")
    public String store(@ModelAttribute("account") Account account) {
        return "home";
    }
}

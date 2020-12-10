package com.universumshop.universumshop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class NavigationController {


    @GetMapping("/contacts")
    public String getContact(Model model) {
        model.addAttribute("activePage", "contacts");
        return "contacts";
    }

    @GetMapping("/index")
    public String getIndex(Model model) {
        model.addAttribute("activePage", "index");
        return "index";
    }

    @GetMapping("/login")
    public String getLogin(Model model) {
        model.addAttribute("activePage", "login");
        return "login";
    }

    @GetMapping("/adminpanel")
    public String getAdmin(Model model) {
        model.addAttribute("activePage", "adminpanel");
        return "adminpanel";
    }


    @GetMapping("/orders")
    public String getOrders(Model model) {
        model.addAttribute("activePage", "orders");
        return "orders";
    }

    @GetMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("activePage", "users");
        return "users";
    }

}


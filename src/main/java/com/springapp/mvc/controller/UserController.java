package com.springapp.mvc.controller;

import com.springapp.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public String redirectLogin(){
        return "redirect:/login";
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String printWelcome(Model model) {
        model.addAttribute("message", "Log in, please");
        return "index";
    }

    @RequestMapping(value = "/error")
    public String returnError(){
        return "error";
    }
    @RequestMapping(value = "/allusers", method = RequestMethod.GET)
    public String showAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "allusers";
    }






}

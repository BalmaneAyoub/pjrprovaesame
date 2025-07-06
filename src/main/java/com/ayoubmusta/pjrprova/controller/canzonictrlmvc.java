package com.ayoubmusta.pjrprova.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.ayoubmusta.pjrprova.services.CanzoniService;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class canzonictrlmvc {
    @Autowired
    private CanzoniService canzoniserv;

    @GetMapping("/")
    public String findALL(Model m) {
        m.addAttribute("canzoni", canzoniserv.findAll());
        return "index";
    }
    
}

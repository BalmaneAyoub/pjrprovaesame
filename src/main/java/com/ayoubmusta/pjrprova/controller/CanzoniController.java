package com.ayoubmusta.pjrprova.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.ayoubmusta.pjrprova.entities.Canzoni;
import com.ayoubmusta.pjrprova.services.CanzoniService;




@RestController
@RequestMapping("api")
public class CanzoniController {

    @Autowired
    private  CanzoniService canzoniserv;

    @GetMapping("/{cantante}")
    public List<Canzoni> findByCantante(@PathVariable String cantante) {
        return canzoniserv.findByCantante(cantante);
    }

    @GetMapping("/all")
    public List<Canzoni> getMethodName() {
        return canzoniserv.findAll();
    }
    
    
    

}

/*
 * 
 * 
 */

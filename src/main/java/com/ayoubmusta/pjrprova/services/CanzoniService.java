package com.ayoubmusta.pjrprova.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayoubmusta.pjrprova.entities.Canzoni;
import com.ayoubmusta.pjrprova.repos.CanzoniRepo;

@Service
public class CanzoniService {

    @Autowired
    private CanzoniRepo canzonedao;

    public List<Canzoni> findByCantante(String cantante){
        
       return canzonedao.findByCantante(cantante);

    }

    public List<Canzoni> findAll(){
        return canzonedao.findAll();

    }
}


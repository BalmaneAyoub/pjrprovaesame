package com.ayoubmusta.pjrprova.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayoubmusta.pjrprova.entities.Canzoni;

@Repository
public interface CanzoniRepo extends JpaRepository<Canzoni,Integer>{

    List<Canzoni> findByCantante(String cantante);

}

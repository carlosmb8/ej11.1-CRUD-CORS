package com.example.ej7crudcors.repository;


import com.example.ej7crudcors.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {

    List<Persona> findByName(String name);
}

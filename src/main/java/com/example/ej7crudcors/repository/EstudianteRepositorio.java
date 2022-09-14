package com.example.ej7crudcors.repository;


import com.example.ej7crudcors.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstudianteRepositorio extends JpaRepository<Estudiante, String> {

//    List<EstudianteOutputDTO> findEstudiantesByPersona(String name);
}

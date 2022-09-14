package com.example.ej7crudcors.application;



import com.example.ej7crudcors.dto.input.ProfesorInputDTO;
import com.example.ej7crudcors.dto.output.ProfesorOutputDTO;
import com.example.ej7crudcors.entity.Profesor;

import java.util.List;

public interface ProfesorService {
    public ProfesorOutputDTO insertarProfesor(ProfesorInputDTO profesorDTO);
    public ProfesorOutputDTO editarProfesor(String id, Profesor profesor);
    public void eliminarProfesor(String id);
    public Profesor buscarProfesorPorId(String id);
//    public List<ProfesorOutputDTO> buscarProfesorsPorName(String name);
    public List<Profesor> dameAllProfesors() throws Exception;
}

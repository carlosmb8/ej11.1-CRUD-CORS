package com.example.ej7crudcors.application;

import com.example.ej7crudcors.dto.input.EstudianteInputDTO;
import com.example.ej7crudcors.dto.output.EstudianteOutputDTO;
import com.example.ej7crudcors.entity.Estudiante;

import java.util.List;

public interface EstudianteService {
    public EstudianteOutputDTO insertarEstudiante(EstudianteInputDTO estudianteDTO);
    public void editarEstudiante(String id, Estudiante estudiante);
    public String eliminarEstudiante(String id);
    public Estudiante buscarEstudiantePorId(String id);

//    public List<EstudianteOutputDTO> buscarEstudiantesPorName(String name);

    public List<Estudiante> dameAllEstudiantes() throws Exception;
}

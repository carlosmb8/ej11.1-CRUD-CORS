package com.example.ej7crudcors.controller;

import com.example.ej7crudcors.application.EstudianteServiceImpl;
import com.example.ej7crudcors.dto.input.EstudianteInputDTO;
import com.example.ej7crudcors.dto.output.EstudianteOutputDTO;
import com.example.ej7crudcors.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EstudianteControlador {

    @Autowired
    EstudianteServiceImpl estudianteServiceImpl;



    @GetMapping("estudiantes/{id}")
    public EstudianteOutputDTO dameEstudiante(@PathVariable String id) {
        Estudiante e = estudianteServiceImpl.buscarEstudiantePorId(id);
        EstudianteOutputDTO estudianteOutputDTO = new EstudianteOutputDTO(e);
        return estudianteOutputDTO;
    }

//    @PostMapping("estudiantes")
//    public List<EstudianteOutputDTO> dameEstudiantePorNombre(@RequestParam String name) {
//
//        return estudianteServiceImpl.buscarEstudiantesPorName(name);
//    }

    @GetMapping("estudiantes")
    public Iterable<Estudiante> dameEstudiantes() throws Exception{

        return estudianteServiceImpl.dameAllEstudiantes();
    }

    @PostMapping("estudiantes/insertar")
    public String insertaEstudiante(@RequestBody EstudianteInputDTO estudianteDTO) {

        estudianteServiceImpl.insertarEstudiante(estudianteDTO);

        return "Estudiante insertado correctamente";

    }

    @PutMapping("estudiantes/editar")
    public void editarEstudiante(@RequestParam String id, @RequestBody Estudiante estudiante) {
        estudianteServiceImpl.editarEstudiante(id, estudiante);
    }

    @DeleteMapping("estudiantes/eliminar")
    public String eliminarEstudiante(@RequestParam String id) {
        return estudianteServiceImpl.eliminarEstudiante(id);
    }


}

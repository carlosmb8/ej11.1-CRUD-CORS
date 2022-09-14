package com.example.ej7crudcors.dto.output;


import com.example.ej7crudcors.entity.Estudiante;
import lombok.Data;

@Data
public class EstudianteOutputDTO {
    String id_estudiante;
    PersonaOutputDTO personaOutputDTO;
    int num_hours_week;
    String coments;
    ProfesorOutputDTO profesorOutputDTO;
    String branch;

    public EstudianteOutputDTO(Estudiante estudiante){
        setId_estudiante(estudiante.getId_estudiante());
        setPersonaOutputDTO (new PersonaOutputDTO(estudiante.getPersona()));
        setNum_hours_week(estudiante.getNum_hours_week());
        setComents(estudiante.getComents());
        setProfesorOutputDTO(new ProfesorOutputDTO(estudiante.getProfesor()));
        setBranch(estudiante.getBranch());
    }
}

package com.example.ej7crudcors.dto.output;


import com.example.ej7crudcors.entity.Profesor;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ProfesorOutputDTO {

    String id_profesor;
    PersonaOutputDTO personaOutputDTO;
    String coments;
    String branch;


    public ProfesorOutputDTO(Profesor profesor){
        setId_profesor(profesor.getId_profesor());
        setPersonaOutputDTO(new PersonaOutputDTO(profesor.getPersona()));
        setComents(profesor.getComents());
        setBranch(profesor.getBranch());
    }
    public ProfesorOutputDTO(){};
}

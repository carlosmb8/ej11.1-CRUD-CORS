package com.example.ej7crudcors.dto.input;


import com.example.ej7crudcors.entity.Persona;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfesorInputDTO {

    String id_profesor;
    Integer id_persona;
    Persona persona;
    String coments;
    String branch;

}

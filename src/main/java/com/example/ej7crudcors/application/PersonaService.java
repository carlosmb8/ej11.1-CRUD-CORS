package com.example.ej7crudcors.application;

import com.example.ej7crudcors.dto.input.PersonaInputDTO;
import com.example.ej7crudcors.dto.output.PersonaOutputDTO;
import com.example.ej7crudcors.entity.Persona;

import java.util.List;

public interface PersonaService {
    public PersonaOutputDTO insertarPersona(PersonaInputDTO personaDTO);
    public void editarPersona(Integer id, Persona persona);
    public void eliminarPersona(Integer id);
    public Persona buscarPersonaPorId(Integer id);
    public List<PersonaOutputDTO> buscarPersonaPorName(String name);
    public List<Persona> dameAllPersonas() throws Exception;

}

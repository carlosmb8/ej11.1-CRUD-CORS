package com.example.ej7crudcors.controller;

import com.example.ej7crudcors.application.PersonaServiceImpl;
import com.example.ej7crudcors.application.ProfesorServiceImpl;
import com.example.ej7crudcors.dto.input.PersonaInputDTO;
import com.example.ej7crudcors.dto.output.PersonaOutputDTO;
import com.example.ej7crudcors.dto.output.ProfesorOutputDTO;
import com.example.ej7crudcors.entity.Persona;
import com.example.ej7crudcors.feign.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class PersonaControlador {

    @Autowired
    PersonaServiceImpl personaServiceImpl;

    @Autowired
    ProfesorServiceImpl profesorServiceImpl;

    @Autowired
    RestTemplate clienteRest;

    @Autowired
    Feign clienteFeign;


    @GetMapping("personas/{id}")
    public PersonaOutputDTO damePersona(@PathVariable Integer id) {
        return new PersonaOutputDTO(personaServiceImpl.buscarPersonaPorId(id));
    }

    @PostMapping("personas")
    public List<PersonaOutputDTO> damePersonaPorNombre(@RequestParam String name) {

        return personaServiceImpl.buscarPersonaPorName(name);
    }

//    @GetMapping("personas")
    @GetMapping("getall")
    public Iterable<Persona> damePersonas() throws Exception {

        return personaServiceImpl.dameAllPersonas();
    }


    //    @PostMapping("personas/insertar")
    public PersonaOutputDTO addPerson(@RequestBody PersonaInputDTO personaDTO) {

        return personaServiceImpl.insertarPersona(personaDTO);

    }

    @CrossOrigin(origins = "*")
    @PostMapping("addperson")
    public PersonaOutputDTO insertaPersona(@RequestBody PersonaInputDTO personaDTO) {

        return personaServiceImpl.insertarPersona(personaDTO);

    }

    @PutMapping("personas/editar")
    public void editarPersona(@RequestParam Integer id, @RequestBody Persona persona) {
        personaServiceImpl.editarPersona(id, persona);
    }

    @DeleteMapping("personas/eliminar")
    public String eliminarPersona(@RequestParam Integer id) {
        personaServiceImpl.eliminarPersona(id);
        return "La persona con el id: " + id + " ha sido borrada correctamete";
    }


    //Usando RestTemplate
//    @GetMapping("personas/profesor/{id}")
//    public ProfesorOutputDTO getProfesorRest(@PathVariable String id){
//
//        return clienteRest.getForObject("http://localhost:8081/profesores/" + id, ProfesorOutputDTO.class);
//    }

//    @GetMapping("personas/profesor/{id}")
//    public ProfesorOutputDTO getProfesorFeing(@PathVariable String id){
//
//        return clienteFeign.dameProfesor(id);
//    }

//    @CrossOrigin(origins = {"http://domain1.com","http://domain2.com"},
//            allowedHeaders = "X-AUTH-TOKEN",
//            allowCredentials = "false",
//            maxAge = 15 * 60,
//            methods = {
//                    RequestMethod.GET,
//                    RequestMethod.POST
//    })
}

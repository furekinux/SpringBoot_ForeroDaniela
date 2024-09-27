package com.example.explicacionJPA.controller;

import com.example.explicacionJPA.model.Person;
import com.example.explicacionJPA.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
    @Autowired
    private PersonService personService;


    // Obtener todas las personas
    // http://localhost:8080/api/persons con verbo GET
    @GetMapping
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }

    // Obtener a una persona por id
    @GetMapping("/{id}") /*Si se obtiene de afuera, @PathVariable*/
    public Person getPersonById(@PathVariable Long id){
        return personService.getPersonById(id).orElseThrow();
    }

    // Crear una Persona
    // http://localhost:8080/api/persons con verbo POST
    // {
    //  "name":"Juan",
    //  "age":12
    // }
    @PostMapping
    public Person createPerson(@RequestBody Person person){
        return personService.savePerson(person);
    }

    // Actualizar una Persona
    // http://localhost:8080/api/persons/1 con verbo PUT
    // {
    //  "name":"Elsa",
    //  "age":22
    // }
    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Long id, @RequestBody Person person){
        return personService.updatePerson(id,person);
    }

    // Borrar una persona
    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id){
        personService.deletePerson(id);
    }

}
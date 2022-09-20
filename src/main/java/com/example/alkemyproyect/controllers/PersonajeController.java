package com.example.alkemyproyect.controllers;

import com.example.alkemyproyect.entities.Personaje;
import com.example.alkemyproyect.services.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "personaje")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @GetMapping("")
    public List<Personaje> getAll() throws Exception {
        try {
            return personajeService.findAll();

        }catch (Exception e){
            throw new Exception();
        }
    }

    @GetMapping("/{id}")
    public Personaje getOne(@PathVariable Long id) throws Exception{
        try {
            return personajeService.findById(id);

        }catch (Exception e){
            throw new Exception();
        }
    }

    @PostMapping("")
    public Personaje save(@RequestBody Personaje entity) throws Exception{
        try {
            return personajeService.save(entity);

        }catch (Exception e){
            throw new Exception();
        }
    }

    @PutMapping("/{id}")
    public Personaje update(@PathVariable Long id, @RequestBody Personaje entity) throws Exception{
        try {
            return personajeService.update(id,entity);

        }catch (Exception e){
            throw new Exception();
        }
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id) throws Exception{
        try {
            return personajeService.delete(id);

        }catch (Exception e){
            throw new Exception();
        }
    }

}

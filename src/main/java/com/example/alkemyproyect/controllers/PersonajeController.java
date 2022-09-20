package com.example.alkemyproyect.controllers;

import com.example.alkemyproyect.entities.Personaje;
import com.example.alkemyproyect.services.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
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
            List<Personaje> personaje= personajeService.findAll();
            return personaje;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public Personaje getOne(@PathVariable Long id) throws Exception {
        try {
            Personaje personaje=personajeService.findById(id);
            return personaje;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @GetMapping("")
    public Personaje save(@RequestBody Personaje entity) throws Exception{
        try {
            Personaje personaje=personajeService.save(entity);
            return personaje;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public Personaje update(@PathVariable Long id,@RequestBody Personaje entity) throws Exception{
        try {
            Personaje personaje=personajeService.update(id,entity);
            return personaje;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public boolean delete(@PathVariable Long id) throws Exception{
        try {
            return personajeService.delete(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }


}

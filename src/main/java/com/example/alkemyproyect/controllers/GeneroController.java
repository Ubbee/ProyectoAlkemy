package com.example.alkemyproyect.controllers;

import com.example.alkemyproyect.entities.Genero;
import com.example.alkemyproyect.entities.Personaje;
import com.example.alkemyproyect.services.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "genero")
public class GeneroController {

    @Autowired
    private GeneroService generoService;

    @GetMapping("")
    public Genero save(@RequestBody Genero entity) throws Exception{
        try {
            Genero genero= (Genero) generoService.save(entity);
            return genero;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    
}

package com.example.alkemyproyect.services;

import com.example.alkemyproyect.entities.Personaje;
import com.example.alkemyproyect.repositories.PersonajeReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PersonajeService implements BaseService<Personaje>{

    @Autowired
    private PersonajeReository personajeRepository;

    @Override
    @Transactional
    public List findAll() throws Exception {
        try {
            List<Personaje> entities= personajeRepository.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Personaje findById(Long id) throws Exception {
        try {
            Optional<Personaje> entityOptional= personajeRepository.findById(id);
            return entityOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Personaje save(Personaje entity) throws Exception {
        try {
            entity= personajeRepository.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Personaje update(Long id, Personaje entity) throws Exception {
        try {
            Optional<Personaje> entityOptional= personajeRepository.findById(id);
            Personaje personaje= entityOptional.get();
            personaje = personajeRepository.save(entity);
            return personaje;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            if (personajeRepository.existsById(id)) {
                personajeRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

package com.example.alkemyproyect.services;

import com.example.alkemyproyect.entities.Pelicula;
import com.example.alkemyproyect.entities.Personaje;
import com.example.alkemyproyect.repositories.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class peliculaService implements BaseService<Pelicula>{
    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    @Transactional
    public List<Pelicula> findAll() throws Exception {
        try {
            List<Pelicula> entities= peliculaRepository.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Pelicula findById(Long id) throws Exception {
        try {
            Optional<Pelicula> entityOptional= peliculaRepository.findById(id);
            return entityOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Pelicula save(Pelicula entity) throws Exception {
        try {
            entity= peliculaRepository.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Pelicula update(Long id, Pelicula entity) throws Exception {
        try {
            Optional<Pelicula> entityOptional= peliculaRepository.findById(id);
            Pelicula pelicula = entityOptional.get();
            pelicula = peliculaRepository.save(pelicula);
            return pelicula;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            if (peliculaRepository.existsById(id)) {
                peliculaRepository.deleteById(id);
                return true;
            }else {
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

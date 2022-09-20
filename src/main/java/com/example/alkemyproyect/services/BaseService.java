package com.example.alkemyproyect.services;

import com.example.alkemyproyect.entities.Personaje;

import javax.transaction.Transactional;
import java.util.List;

public interface BaseService<E> {

    public List<E> findAll() throws Exception;
    public E findById(Long id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(Long id, E entity) throws Exception;
    public boolean delete(Long id) throws Exception;

}

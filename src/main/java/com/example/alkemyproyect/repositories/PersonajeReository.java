package com.example.alkemyproyect.repositories;

import com.example.alkemyproyect.entities.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeReository extends JpaRepository<Personaje, Long> {
}

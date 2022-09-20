package com.example.alkemyproyect.repositories;

import com.example.alkemyproyect.entities.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepository extends JpaRepository<Personaje, Long> {
}

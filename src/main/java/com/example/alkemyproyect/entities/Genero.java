package com.example.alkemyproyect.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Genero")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "imagen")
    private String imagen;

    @OneToMany(mappedBy="genero")
    private List<Pelicula> pelisAsociadas= new ArrayList<Pelicula>();
}

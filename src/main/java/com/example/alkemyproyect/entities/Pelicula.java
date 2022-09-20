package com.example.alkemyproyect.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Pelicula")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="Imagen")
    private String imagen;
    @Column(name="Titulo")
    private String titulo;
    @Column(name="Fecha_De_Creacion")
    private Date fechaDeCreacion;
    @Column(name="Calificacion")
    private int Calificacion;

    @ManyToOne
    private Genero genero;
    @OneToMany(mappedBy ="pelisAsociadas",cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Personaje> personajes=new ArrayList<>();

}

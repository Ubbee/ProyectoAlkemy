package com.example.alkemyproyect.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Personaje")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name ="imagen")
    private String imagen;
    @Column(name ="nombre")
    private String nombre;
    @Column(name ="edad")
    private int edad;
    @Column(name ="peso")
    private float peso;
    @Column(name ="historia")
    private String historia;

    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name ="fk_pelis_Asociadas")
    private Pelicula pelisAsociadas;

}

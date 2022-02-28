package com.alkemy.alkemy.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="personaje")
@Getter @Setter
public class Personaje {

    //Atributos
    @Id
    @GeneratedValue
    private  Long id;

    @Column
    private String imagen;
    private String nombre;
    private int edad;
    private Double peso;
    private String historia;

    @ManyToMany // Relacion muchos a muchos con PeliculaSerie
    @JoinTable(name = "personaje_pelicula_serie",
            joinColumns = @JoinColumn(name = "id_personaje"),
            inverseJoinColumns = @JoinColumn(name = "id_pelicula_serie")
    )
    private Set<PeliculaSerie> peliculaSeries ;

    //Constructores
    public Personaje() {
    }

    public Personaje(String imagen, String nombre, int edad, double peso, String historia, Set<PeliculaSerie> peliculaSeries) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.peliculaSeries = peliculaSeries;
    }

   //Getters y Setters generados con lombok

}

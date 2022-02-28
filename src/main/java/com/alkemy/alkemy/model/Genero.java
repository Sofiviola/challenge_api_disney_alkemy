package com.alkemy.alkemy.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="genero")
@Getter
@Setter
public class Genero {

    //Atributos
    @Id
    @GeneratedValue
    private  Long id;

    @Column
    private String imagen;
    private String nombre;

    @OneToMany //Relacion con peliculaSerie
    @JoinColumn(name = "genero_id")
    private List<PeliculaSerie> peliculaSeries;

    //Constructores
    public Genero() {
    }

    public Genero(String imagen, String nombre,List<PeliculaSerie> peliculaSeries) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.peliculaSeries = peliculaSeries;
    }

   //Getters y Setters generados con lombok
}

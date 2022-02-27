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
    private  long id;

    private String imagen;
    private String nombre;
    private PeliculaSerie peliculaSerie;

    @OneToMany //Relacion con peliculaSerie
    @JoinColumn(name = "product_id")
    private List<PeliculaSerie> peliculaSeries;

    //Constructores
    public Genero() {
    }

    public Genero(String imagen, String nombre, PeliculaSerie peliculaSerie, List<PeliculaSerie> peliculaSeries) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.peliculaSerie = peliculaSerie;
        this.peliculaSeries = peliculaSeries;
    }

   //Getters y Setters generados con lombok
}

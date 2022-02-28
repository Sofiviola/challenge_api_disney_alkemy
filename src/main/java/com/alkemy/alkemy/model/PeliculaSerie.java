package com.alkemy.alkemy.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="pelicula_serie")
@Getter
@Setter
public class PeliculaSerie {
    //Atributos
    @Id
    @GeneratedValue
    private  Long id;

    @Column
    private String imagen;
    private String titulo;
    private Date fechaCreacion;
    private int calificacion;

    //Constructores

    public PeliculaSerie() {
    }



    //Getters y Setters generados con lombok
}

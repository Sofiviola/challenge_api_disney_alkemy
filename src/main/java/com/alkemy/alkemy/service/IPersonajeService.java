package com.alkemy.alkemy.service;

import com.alkemy.alkemy.model.Personaje;

public interface IPersonajeService {

    //CRUD
    void crearPersonaje (Personaje personaje);
    void modificarPersonaje (Personaje personaje);
    void eliminarPersonaje (Long id);

    //
}

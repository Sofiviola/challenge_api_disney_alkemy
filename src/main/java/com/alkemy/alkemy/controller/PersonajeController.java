package com.alkemy.alkemy.controller;

import com.alkemy.alkemy.model.Personaje;
import com.alkemy.alkemy.service.IPersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personaje")
public class PersonajeController {

    @Autowired
    IPersonajeService iPersonajeService;

    //CRUD
    @PostMapping
    public ResponseEntity<?> crearPersonaje(@RequestBody Personaje personaje){
        iPersonajeService.crearPersonaje(personaje);
        return ResponseEntity.ok(HttpStatus.OK);
    }


    @PutMapping
    public ResponseEntity<?> modificarPersonaje(@RequestBody Personaje personaje) {
        ResponseEntity<?> response = null;
        if (personaje.getId() != null){
            iPersonajeService.modificarPersonaje(personaje);
            response = ResponseEntity.ok(HttpStatus.OK);
        }else{
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id){
       iPersonajeService.eliminarPersonaje(id);
        ResponseEntity.status(HttpStatus.OK).body("Deleted");
    }

    //
}

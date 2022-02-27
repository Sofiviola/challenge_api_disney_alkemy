package com.alkemy.alkemy.repository;

import com.alkemy.alkemy.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonajeRepository extends JpaRepository<Personaje, Long> {
}

package com.alkemy.alkemy.repository;

import com.alkemy.alkemy.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGeneroRepository extends JpaRepository<Genero, Long> {
}

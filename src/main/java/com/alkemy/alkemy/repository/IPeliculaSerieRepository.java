package com.alkemy.alkemy.repository;

import com.alkemy.alkemy.model.PeliculaSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPeliculaSerieRepository extends JpaRepository<PeliculaSerie, Long> {
}

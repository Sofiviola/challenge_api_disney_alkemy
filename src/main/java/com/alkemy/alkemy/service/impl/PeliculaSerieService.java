package com.alkemy.alkemy.service.impl;

import com.alkemy.alkemy.repository.IPeliculaSerieRepository;
import com.alkemy.alkemy.service.IPeliculaSerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaSerieService implements IPeliculaSerieService {

    @Autowired
    IPeliculaSerieRepository iPeliculaSerieRepository;


}

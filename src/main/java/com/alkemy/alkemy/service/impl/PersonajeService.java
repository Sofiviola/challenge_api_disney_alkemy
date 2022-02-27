package com.alkemy.alkemy.service.impl;

import com.alkemy.alkemy.repository.IPersonajeRepository;
import com.alkemy.alkemy.service.IPersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeService implements IPersonajeService {

    @Autowired
    IPersonajeRepository iPersonajeRepository;



}

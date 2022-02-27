package com.alkemy.alkemy.service.impl;

import com.alkemy.alkemy.repository.IGeneroRepository;
import com.alkemy.alkemy.service.IGeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService implements IGeneroService {

    @Autowired
    IGeneroRepository iGeneroRepository;


}

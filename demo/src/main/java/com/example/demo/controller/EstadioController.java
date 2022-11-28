package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.EstadioRepository;

//@CrossOrigin(origins = "", allowedHeaders = "")
@RestController
@RequestMapping("/estadio")
public class EstadioController {
    
    @Autowired
    EstadioRepository estadioRepository;
    
    @DeleteMapping("/{id}")
    public void getSeleccionesbyGrupo(@PathVariable Integer id) {
        estadioRepository.deleteById(id);
    }
}

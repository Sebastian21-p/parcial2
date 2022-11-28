package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Partido;
import com.example.demo.repository.PartidoRepository;

//@CrossOrigin(origins = "", allowedHeaders = "")
@RestController
@RequestMapping("/partidos")
public class PartidoController {
    
    @Autowired
    PartidoRepository partidoRepository;
    
    @GetMapping
    public List<Partido> getAll() {
        return partidoRepository.findAll();
    }
    
    @GetMapping("/{id}/resultados")
    public void getSeleccionesbyGrupo(@PathVariable Integer id) {
        Partido partido = partidoRepository.findById(id).orElse(null);
        if(partido != null) {
            
        }
        
    }
}

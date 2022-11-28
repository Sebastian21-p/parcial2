package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Continente implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @Id
    @SequenceGenerator(name="continente_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="continente_id_seq")
    private Integer id;
    
    private String nombre;
    
    @JsonIgnore
    @OneToMany(mappedBy="continente")
    private List<Seleccion> selecciones;    
}
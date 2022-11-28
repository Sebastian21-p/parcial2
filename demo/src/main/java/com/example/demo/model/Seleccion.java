package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class Seleccion implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name="seleccion_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seleccion_id_seq")
    private Integer id;
    
    private String nombre;
    
    @ManyToOne
    @JoinColumn(name="continente_id")
    private Continente continente;
    
    private String grupo;
    
}
package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class Estadio implements Serializable{
private static final long serialVersionUID = 1L;
    
    @Id
    @SequenceGenerator(name="estadio_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="estadio_id_seq")
    private Integer id;
    
    private String nombre;
    
    private Integer capacidad;

}

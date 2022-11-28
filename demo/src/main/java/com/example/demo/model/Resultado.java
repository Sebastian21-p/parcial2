package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

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
public class Resultado implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name="resultado_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="resultado_id_seq")
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name="partido_id")
    private Partido partido;
    
    @ManyToOne
    @JoinColumn(name="seleccion_id")
    private Seleccion seleccion;
    
    private Integer goles;
    private Integer amarillas;
    private Integer rojas;
}

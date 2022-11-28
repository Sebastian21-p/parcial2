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
public class Partido implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name="partido_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="partido_id_seq")
    private Integer id;
    
    private Date fecha;
    
    @ManyToOne
    @JoinColumn(name="estadio_id")
    private Estadio estadio;
}

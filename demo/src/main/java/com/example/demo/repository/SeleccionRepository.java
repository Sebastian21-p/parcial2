package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Seleccion;

public interface SeleccionRepository extends JpaRepository<Seleccion, Integer> {

}
package com.diw.practica.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import  com.diw.practica.model.Libro;


public interface libro_repository extends JpaRepository<Libro,Long> {
}

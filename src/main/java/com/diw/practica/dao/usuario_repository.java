package com.diw.practica.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import  com.diw.practica.model.Usuario;


public interface usuario_repository extends JpaRepository<Usuario,Long> {
}

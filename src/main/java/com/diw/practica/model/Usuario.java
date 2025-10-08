package com.diw.practica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Usuario {
    @Id
    private String nombre;
    @OneToMany
    private List<Libro> librosPrestados;
    private enum rol {ADMIN, PROFESOR, ALUMNO};

    public Usuario() {
    }

    public Usuario(String nombre, String email, String password, String rol) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}

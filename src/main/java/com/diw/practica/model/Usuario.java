package com.diw.practica.model;

import java.util.List;

public class Usuario {
    private String nombre;
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

package com.diw.practica.model;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String nombre;
    @OneToMany
    private List<Libro> librosPrestados;
    private enum rol {ADMIN, PROFESOR, ALUMNO};
    @Enumerated(EnumType.STRING)
    private rol rol;


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

package com.diw.practica.model;

import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {

    public enum Estado {
        PENDIENTE, ESPERA, TRAMITADO
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private int fecha;
    private double precioEstimado;

    @Enumerated(EnumType.STRING)
    private Estado estadoLibro;

    public Libro() {
    }

    public Libro(String titulo, String autor, String editorial, int fecha, String isbn, double precioEstimado, Estado estadoLibro) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.fecha = fecha;
        this.isbn = isbn;
        this.precioEstimado = precioEstimado;
        this.estadoLibro = estadoLibro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public double getPrecioEstimado() {
        return precioEstimado;
    }

    public void setPrecioEstimado(double precioEstimado) {
        this.precioEstimado = precioEstimado;
    }

    public Estado getEstadoLibro() {
        return estadoLibro;
    }

    public void setEstadoLibro(Estado estadoLibro) {
        this.estadoLibro = estadoLibro;
    }
}
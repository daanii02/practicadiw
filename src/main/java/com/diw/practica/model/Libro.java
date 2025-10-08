package com.diw.practica.model;
import jakarta.persistence.*;

@Entity
public class Libro {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String titulo;
        private String autor;
        private String editorial;
        private int fecha;
        private String isbn;
        private enum estado {PENDIENTE, ESPERA, TRAMITADO};
        @Enumerated(EnumType.STRING)
        private estado estadoLibro;

        public Libro() {
        }


        public Libro(String titulo, String autor, String editorial, int fecha, String isbn, double precioEstimado) {
            this.titulo = titulo;
            this.autor = autor;
            this.editorial = editorial;
            this.fecha = fecha;
            this.isbn = isbn;
            this.estadoLibro = null;
        }

        // Getters y Setters
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
        public String getIsbn() {
            return isbn;
        }
        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }
        public estado getEstadoLibro() {
            return estadoLibro;
        }
        public void setEstadoLibro(estado estadoLibro) {
            this.estadoLibro = estadoLibro;
        }

    }
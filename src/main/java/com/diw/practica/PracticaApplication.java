package com.diw.practica;

import com.diw.practica.dao.libro_repository;
import com.diw.practica.model.Libro;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticaApplication {

    private libro_repository libroRepository;

    public PracticaApplication(libro_repository libroRepository) {
        this.libroRepository = libroRepository;
    }
    public static void main(String[] args) {
        SpringApplication.run(PracticaApplication.class, args);

    }
    @PostConstruct
    public void init(){
        Libro libro= new Libro();
        libro.setTitulo("El Quijote");
        libro.setAutor("Miguel de Cervantes");
        libro.setEditorial("Editorial1");
        libro.setIsbn("1234567890");
        libroRepository.save(libro);
    }


}

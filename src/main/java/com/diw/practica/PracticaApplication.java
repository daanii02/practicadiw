package com.diw.practica;

import com.diw.practica.dao.libro_repository;
import com.diw.practica.model.Libro;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class PracticaApplication {

    @Autowired
    private libro_repository libroRepository;

    public static void main(String[] args) {
        SpringApplication.run(PracticaApplication.class, args);
    }

}

@Component
class DataInitializer {

    @Autowired
    private libro_repository libroRepository;

    @PostConstruct
    public void init() {
        Libro libro = new Libro();
        libro.setTitulo("El Quijote");
        libro.setAutor("Miguel de Cervantes");
        libro.setEditorial("Editorial1");
        libro.setIsbn("1234567890");
        libroRepository.save(libro);

        System.out.println("📚 Libro inicial insertado en la base de datos.");
    }
}



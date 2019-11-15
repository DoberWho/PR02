package com.mitienda.spring;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(StartApplication.class);

    @Autowired
    private CategoriasRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

    @Override
    public void run(String... args) {

        log.info("StartApplication...");
        
        // Creamos objetos y los guardamos en la base de datos
        repository.save(new Categoria("Java"));
        repository.save(new Categoria("Node"));
        repository.save(new Categoria("Python"));

        // Recogemos todos los Objetos de la base de datos
        Iterable<Categoria> arTODOS = repository.findAll();
        // .forEach(x -> System.out.println(x))

        // Recogemos el Objecto con ID
        Optional<Categoria> item = repository.findById(1l);
        // item..ifPresent(x -> System.out.println(x)); // Devuelve el objecto si existe
        Categoria cat = item.get();

        // Recoger todos los que tengan con nombre; es homologo a like %Node% en SQL
        List<Categoria> arList = repository.findByName("Node");
        
        // Borrar por Objecto
        repository.delete(cat);
        // Borrar el ID
        repository.deleteById(1L);
        // Contarlos que hay en la base de datos
        repository.count();

    }

}
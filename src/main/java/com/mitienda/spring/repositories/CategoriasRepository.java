package com.mitienda.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mitienda.spring.models.Categoria;

import java.util.List;

public interface CategoriasRepository extends CrudRepository<Categoria, Long> {

    List<Categoria> findByName(String name);

}

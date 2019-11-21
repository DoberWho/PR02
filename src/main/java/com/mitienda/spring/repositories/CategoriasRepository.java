package com.mitienda.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mitienda.spring.models.Categoria;

public interface CategoriasRepository extends CrudRepository<Categoria, Long> {

}

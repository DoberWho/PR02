package com.mitienda.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mitienda.spring.models.Categoria;

@Repository
public interface CategoriasRepository extends CrudRepository<Categoria, Long> {

}

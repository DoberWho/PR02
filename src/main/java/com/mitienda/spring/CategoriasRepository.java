package com.mitienda.spring;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoriasRepository extends CrudRepository<Categoria, Long> {

    List<Categoria> findByName(String name);

}

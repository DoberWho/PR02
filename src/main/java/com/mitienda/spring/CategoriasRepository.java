package com.mitienda.spring;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoriasRepository extends CrudRepository<Categorias, Long> {

    List<Categorias> findByName(String name);

}

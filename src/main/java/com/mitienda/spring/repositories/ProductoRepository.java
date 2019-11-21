package com.mitienda.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mitienda.spring.models.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {

}

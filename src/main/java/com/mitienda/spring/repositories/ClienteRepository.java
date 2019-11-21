package com.mitienda.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mitienda.spring.models.Clientes;

@Repository
public interface ClienteRepository extends CrudRepository<Clientes, Long> {

}

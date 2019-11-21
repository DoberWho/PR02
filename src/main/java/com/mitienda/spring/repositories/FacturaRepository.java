package com.mitienda.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mitienda.spring.models.Factura;

@Repository
public interface FacturaRepository extends CrudRepository<Factura, Long> {

}

package com.mitienda.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mitienda.spring.models.FacturaLinea;

@Repository
public interface FacturaLineaRepository extends CrudRepository<FacturaLinea, Long> {

}

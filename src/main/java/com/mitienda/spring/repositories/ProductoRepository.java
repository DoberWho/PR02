package com.mitienda.spring.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mitienda.spring.models.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {

	@Query(value = "select * from productos where id_categoria = ?1", nativeQuery = true)
	ArrayList<Producto> findByCategoryId(Long idCat);

}

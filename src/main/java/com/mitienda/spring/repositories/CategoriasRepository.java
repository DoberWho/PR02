package com.mitienda.spring.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mitienda.spring.models.Categoria;

@Repository
public interface CategoriasRepository extends CrudRepository<Categoria, Long> {

	@Query(value = "select id,name,roll_no from USER_INFO_TEST where rollNo = ?1", nativeQuery = true)
	ArrayList<Categoria> findUserUsingRollNo(String rollNo);
}

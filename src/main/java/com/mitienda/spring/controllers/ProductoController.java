package com.mitienda.spring.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.mitienda.spring.models.Producto;
import com.mitienda.spring.repositories.ProductoRepository;

public class ProductoController {

	private static ProductoController instance;

	private ProductoController() {
	}

	public static ProductoController getInstance() {
		if (instance == null) {
			instance = new ProductoController();
		}
		return instance;
	}

	@Autowired
	private ProductoRepository repository;

	/**
	 * Guarda o Actualiza un objecto
	 * 
	 * @param cat
	 * @return
	 */
	public Producto save(Producto cat) {
		return repository.save(cat);
	}

	/**
	 * 
	 * @return Devuelve el numero de Items que tenemos en la base de datos
	 */
	public long count() {
		return repository.count();
	}

	/**
	 * 
	 * @return Devuelve todos los Objectos de la Tabla
	 */
	public List<Producto> list() {
		ArrayList<Producto> ret = new ArrayList<>();
		for (Producto t : repository.findAll()) {
			ret.add(t);
		}
		return ret;
	}

	/**
	 * Borra de la base de datos el objecto que se le pasa por parametro
	 * 
	 * @param cat - <strong>TIENE QUE TENER ID</strong>
	 */
	public void delete(Producto cat) {
		repository.delete(cat);
	}

	/**
	 * Borra de la base de datos el objecto con el ID que se le pasa por parametro
	 * 
	 * @param id
	 */
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	/**
	 * 
	 * @param id
	 * @return Devuelve el Objecto que corresponda con el ID o null en caso de no
	 *         existir en la base de datos
	 */
	public Producto findById(Long id) {
		Optional<Producto> item = repository.findById(id);
		// item..ifPresent(x -> System.out.println(x)); // Devuelve el objecto si existe
		if (!item.isPresent()) {
			return null;
		}
		return item.get();
	}

}

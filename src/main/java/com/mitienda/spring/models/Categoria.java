package com.mitienda.spring.models;

import java.util.Date;

public class Categoria {

	private Integer id;
	private Date created;
	private String nombre;

	public Integer getId() {
		return id;
	}

	private void setId(Integer id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	private void setCreated(Date created) {
		this.created = created;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
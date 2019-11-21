package com.mitienda.spring.menu;

import com.mitienda.spring.controllers.CategoryController;

public class MenuCategoria {

	private CategoryController ctrl;

	public MenuCategoria() {
		this.ctrl = CategoryController.getInstance();
	}
}

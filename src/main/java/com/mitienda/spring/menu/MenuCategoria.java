package com.mitienda.spring.menu;

import java.util.List;

import com.mitienda.spring.controllers.CategoryController; 

public class MenuCategoria {
	
	private CategoryController ctrl;
	
	public MenuCategoria() {
		this.ctrl = CategoryController.getInstance();
	}
	
	/*
	 CategoryController ctrl = CategoryController.getInstance();
        
        // Creamos objetos y los guardamos en la base de datos
        ctrl.save(new Categoria("Java"));
        ctrl.save(new Categoria("Node"));
        ctrl.save(new Categoria("Python"));
        

        // Recogemos todos los Objetos de la base de datos
         List<Categoria> arTODOS = ctrl.list(); 

        // Recogemos el Objecto con ID
         Categoria cat = ctrl.findById(1l);  
        
        // Borrar por Objecto
         ctrl.delete(cat);
        // Borrar el ID
         ctrl.deleteById(1L);
        // Contarlos que hay en la base de datos
         ctrl.count();
	 * 
	 * 
	 */

}

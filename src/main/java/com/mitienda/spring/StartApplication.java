package com.mitienda.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mitienda.spring.controllers.CategoryController;
import com.mitienda.spring.menu.menuPrincipal;
import com.mitienda.spring.models.Categoria;

@SpringBootApplication
public class StartApplication extends menuPrincipal implements CommandLineRunner {
	
	@Autowired
	CategoryController ctrl;
	
	@Autowired
	menuPrincipal menu;

	private static final Logger log = LoggerFactory.getLogger(StartApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

	@Override
	public void run(String... args) {
		log.info("StartApplication...");

		/**
		 * Aqui controlar los Menus y el cambio entre ellos. Y En cada menu; usar su
		 * respectivo Controller y Repository
		 */
		menu.iniciaMenu();
		
		Categoria cat = new Categoria();
		cat.setNombre("test");
		ctrl.save(cat);

		for (Categoria item : ctrl.list()) {
			System.out.println(item);			
		}

	}

}
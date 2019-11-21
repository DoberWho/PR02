package com.mitienda.spring;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mitienda.spring.menu.menuPrincipal;
import com.mitienda.spring.models.Categoria;
import com.mitienda.spring.repositories.CategoriasRepository;

@SpringBootApplication
public class StartApplication extends menuPrincipal implements CommandLineRunner {

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

		menuPrincipal.iniciaMenu();

	}

}
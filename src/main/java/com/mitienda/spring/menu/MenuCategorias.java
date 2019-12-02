package com.mitienda.spring.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mitienda.spring.controllers.CategoryController;
import com.mitienda.spring.models.Categoria;

@Controller
public class MenuCategorias implements crud {

	@Autowired
	CategoryController ctrl;

	List<Categoria> categoriasLista = new ArrayList<>();

	public static Scanner keyboard = new Scanner(System.in);
 

	public void mostrarCategorias() {

		boolean salida = true;

		int opcion;
		System.out.print("Elige una opcion\n");

		System.out.print("1 para Ver\n");
		System.out.print("2 para Crear\n");
		System.out.print("3 para Borrar\n");
		System.out.print("4 para Modificar\n");
		System.out.print("5 para Volver al menu Principal\n");

		do {

			opcion = Integer.parseInt(keyboard.nextLine());

			switch (opcion) {
			case 1:
				System.out.println("Has elegido ver");
				ver();
				break;
			case 2:
				System.out.println("Has elegido crear");
				crear();
				break;
			case 3:
				System.out.println("Has elegido Borrar");
				borrar();
				break;
			case 4:
				System.out.println("Has elegido modificar");
				modificar();
				break;
			case 5:
				System.out.println("Has elegido volver al Menu Principal");
				menuPrincipal.iniciaMenu();
				break;
			default:
				break;
			}

		} while (salida);

		System.out.print("Gracias por usar la apliacion");

	}

	@Override
	public void ver() {
 
		categoriasLista = ctrl.list();// cat.list(); // TODO: Por Hacer

		for (int i = 0; i < categoriasLista.size(); i++) {

			System.out.println(i + " = " + categoriasLista.get(i));

		}
	}

	@Override
	public void modificar() {

		System.out.println("Dime la posicion de la Categoria que quieres Modificar");
		keyboard.reset();

		String eleccion;
		eleccion = keyboard.nextLine();
		int opcion = Integer.parseInt(eleccion);
		categoriasLista.get(opcion);
		int id = categoriasLista.get(opcion).getId();

		System.out.println("Dime El nuevo nombre de la Categoria");
		keyboard.reset();
		String nuevoNombre = keyboard.nextLine();

		// TODO: Por Hacer
		/*
		 * cat = (Categoria) cat.getByid(id); cat.setNombre(nuevoNombre); cat.save(); //
		 */

	}

	@Override
	public void borrar() {
		keyboard.reset();

		String eleccion;
		System.out.println("Dime la posicion de la Categoria que quieres Borrar");
		eleccion = keyboard.nextLine();
		int opcion = Integer.parseInt(eleccion);

		// TODO: Por Hacer
		// categoriasLista.get(opcion).delete();

	}

	@Override
	public void crear() {

		System.out.println("Dime el nombre del la nueva categoria");

		keyboard.reset();

		String nuevaCat = keyboard.nextLine();
		Categoria cat = new Categoria();
		cat.setNombre(nuevaCat);
		ctrl.save(cat);

		System.out.println("Se ha insertado la nueva Categoria");

	}
}

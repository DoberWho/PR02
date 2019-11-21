package com.mitienda.spring.menu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.mitienda.spring.models.Factura;
import com.mitienda.spring.models.comun.DbObject;

public class menuFactura implements crud {

	List<DbObject> facturaLista = new ArrayList<>();
	Factura fac = new Factura();
	public static Scanner keyboard = new Scanner(System.in);

	public menuFactura() {

	}

	public static menuFactura menu = new menuFactura();

	public static void mostrarFactura() {

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
				menu.ver();
				break;
			case 2:
				System.out.println("Has elegido crear");
				menu.crear();
				break;
			case 3:
				System.out.println("Has elegido Borrar");
				menu.borrar();
				break;
			case 4:
				System.out.println("Has elegido modificar");
				menu.modificar();
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

		facturaLista = fac.list();

		for (int i = 0; i < facturaLista.size(); i++) {

			System.out.println(i + " = " + facturaLista.get(i));

		}
	}

	@Override
	public void modificar() {

		Date fecha = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String eleccion;

		System.out.println("Dime la posicion del Articulo que quieres Modificar");
		eleccion = keyboard.nextLine();
		int opcion = Integer.parseInt(eleccion);
		facturaLista.get(opcion);
		int id = facturaLista.get(opcion).getId();
		fac = (Factura) fac.getByid(id);

		System.out.println("Dime la fecha de Factura");
		String nuevaFechaFactura = keyboard.nextLine();
		try {
			fecha = sdf.parse(nuevaFechaFactura);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fac.setFecha(fecha);
		System.out.println("Dime el ID del cliente");
		int nuevoIdCliente = Integer.parseInt(keyboard.nextLine());
		fac.setId_cliente(nuevoIdCliente);
		System.out.println("Dime la Serie de la Factura");
		int nuevaSerieCliente = Integer.parseInt(keyboard.nextLine());
		fac.setSerie(nuevaSerieCliente);

		fac.save();

	}

	@Override
	public void borrar() {
		keyboard.reset();

		String eleccion;
		System.out.println("Dime la posicion de la Categoria que quieres Borrar");
		eleccion = keyboard.nextLine();
		int opcion = Integer.parseInt(eleccion);

		facturaLista.get(opcion).delete();

	}

	@Override
	public void crear() {

		keyboard.reset();
		Date fecha = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		System.out.println("Dime la fecha de Factura");
		String nuevaFechaFactura = keyboard.nextLine();

		try {
			fecha = sdf.parse(nuevaFechaFactura);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		fac.setFecha(fecha);
		System.out.println("Dime el ID del cliente de la Factura");
		int nuevoIdCliente = Integer.parseInt(keyboard.nextLine());
		fac.setId_cliente(nuevoIdCliente);
		System.out.println("Dime la Serie de la Factura");
		int nuevaSerieCliente = Integer.parseInt(keyboard.nextLine());
		fac.setSerie(nuevaSerieCliente);

		fac.save();

		System.out.println("Se ha insertado el nuevo cliente");

	}

}

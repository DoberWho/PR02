package com.mitienda.spring.menu;

import java.util.Scanner;

public abstract class menuPrincipal {

		
		public static void iniciaMenu() {
		
		boolean salida = true;
		
		int opcion;
		System.out.print("Elige una opcion\n");
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("1 para Categorias\n");
		System.out.print("2 para Clientes\n");
		System.out.print("3 para Facturas\n");
		System.out.print("4 para Factura Linea\n");
		System.out.print("5 para Producto\n");
		System.out.print("6 para Salir\n");
		
		do {
		
		opcion = Integer.parseInt(keyboard.nextLine());
		
		switch (opcion) {
		case 1:
			System.out.println("Has elegido Categorias");
			menuCategorias.mostrarCategorias();
			break;
		case 2:
			System.out.println("Has elegido Clientes");
			menuClientes.mostrarClientes();
			break;
		case 3:
			System.out.println("Has elegido Facturas");
			menuFactura.mostrarFactura();
	
			break;
		case 4:
			System.out.println("Has elegido Factura Linea");
			break;
		case 5:
			System.out.println("Has elegido Producto");
			break;
		case 6:
			System.out.println("Has elegido Salir");
			salida = false;
			break;
		default:
			break;
		}
		}while(salida);
		System.out.print("Gracias por usar nuestra aplicacion");
		}

}

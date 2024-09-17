package com.example.Market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class MarketApplication {

	public static void main(String[] args) {
		boolean menu=true;
		Scanner scanner = new Scanner(System.in);

		Tienda tienda = new Tienda("Peor es nada");
		Prenda prendita = new Prenda("Kalvin Klein","XS","Camisa");
		tienda.addProduct(prendita);

		while (menu){

			System.out.println("--- Bienvenido a tienda: "+tienda.getNombre()+"---\n" +
					"1. Ver items disponibles\n" +
					"2. Agregar items\n" +
					"3. Modificar items\n" +
					"4. Eliminar items");
			int choice = scanner.nextInt();

			switch (choice){
				case 1 -> {
					System.out.println("--- Ver productos ---\n");
					tienda.readItems();
				}

				case 2 -> {
					System.out.println("--- Agregar items ---\n");
					System.out.println("Ingrese los datos para el item a continuación.");
					Prenda a = new Prenda();
					System.out.println("\nNombre:");
					String name = scanner.nextLine();
					name = scanner.nextLine();
					a.setNombre(name);
					System.out.println("\nTalla:");
					String size = scanner.nextLine();
					a.setTalla(size);
					System.out.println("\nTipo:");
					String type = scanner.nextLine();
					a.setTipo(type);
					tienda.addProduct(a);
				}

				case 3 -> {
					System.out.println("--- Modificar items ---\n");

				}
				case 4 -> {
					System.out.println("--- Eliminar items ---\n");
				}
				default -> {
					System.out.println("--- Cerrando sesión ---\n");
					menu=false;
				}
			}
		}
	}

}

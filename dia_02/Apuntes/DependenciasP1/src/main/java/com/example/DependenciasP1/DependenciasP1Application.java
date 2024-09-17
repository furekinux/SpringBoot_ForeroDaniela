package com.example.DependenciasP1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciasP1Application {

	public static void main(String[] args) {
		// 1. Dependencias directas: Estos se establecen de manera inmediata entre dos módulos.
		//

		// 2. Dependencias transitivas: Estas se generan de manera directa,
		// Si el módulo A depende de B y tambien B depende de C
		// Entonces hay dependencia transitiva de A hacia C.

		SpringApplication.run(DependenciasP1Application.class, args);
	}

}

package com.openWebinars.spring;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
public class OpenApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenApiRestApplication.class, args);
	}

	@Bean
	public CommandLineRunner lonmbokTest() {
		return args -> {
			
			Persona p1 = new Persona();
			p1.setNombre("Pepe");
			p1.setApellidos("Pérez");
			p1.setFechaNacimiento(LocalDate.of(1999, 1, 30));
		
			Persona p2 = new Persona();
			p2.setNombre("Marcos");
			p2.setApellidos("Martínez");
			p2.setFechaNacimiento(LocalDate.of(1999, 12, 30));
			
			System.out.println(p1);
			System.out.println(p2);
		};
	}
	
}

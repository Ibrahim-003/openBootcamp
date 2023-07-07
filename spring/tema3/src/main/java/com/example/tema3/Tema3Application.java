package com.example.tema3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Tema3Application {

	public static void main(String[] args) {
		SpringApplication.run(Tema3Application.class, args);

		ApplicationContext context = SpringApplication.run(Tema3Application.class, args);
		MotocicletaRepository repository = context.getBean(MotocicletaRepository.class);

//		System.out.println(repository.count());
//
//		System.out.println("El num de motos en base de datos es: " + repository.count());

		Motocicleta kawasaki = new Motocicleta(null, "Kawasaki", "GTW-255", 2019);
		repository.save(kawasaki);

		System.out.println("El num de motos en base de datos es: " + repository.count());
		System.out.println(repository.findAll());
	}

}

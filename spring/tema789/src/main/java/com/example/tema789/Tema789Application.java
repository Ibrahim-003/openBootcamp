package com.example.tema789;

import com.example.tema789.entities.Laptop;
import com.example.tema789.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class Tema789Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Tema789Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null, "Lenovo", "YOGA_09", 4039.99, LocalDate.of(2022, 2, 3));
		Laptop laptop2 = new Laptop(null, "Apple", "MacZ500", 5000.00, LocalDate.of(2023, 2, 3));

		repository.save(laptop1);
		repository.save(laptop2);

		System.out.println("Numero de laptops en la base de datos: " + repository.findAll().size());
	}

}

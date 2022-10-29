package com.carteira.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.carteira.model.entity"})
@EnableJpaRepositories(basePackages = {"com.carteira.repositories"})
@ComponentScan(basePackages = {"com.carteira.controller", "com.carteira.service", "com.carteira.service.impl"})
@SpringBootApplication
public class CarteiraDigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarteiraDigitalApplication.class, args);
	}

}

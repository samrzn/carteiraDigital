package com.carteira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

	@GetMapping("/user")
	public String testeHelloWorldAPI() {
		return "Olá mundo, sou uma API funcional =D";
	}
	
}

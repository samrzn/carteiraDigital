package com.carteira.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carteira.model.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	// query method -> este realiza verificação de e-mail na base.
	boolean existsByEmail(String email); 
	
	Optional<Usuario> findByEmail(String email);
	
}

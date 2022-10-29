package com.carteira.services;

import java.util.Optional;

import com.carteira.model.entity.Usuario;

public interface UsuarioService {

	Usuario autenticar(String email, String senha);

	Usuario salvarUsuario(Usuario usuario);

	void validarEmail(String email); // verifica se e-mail existe na base, não pode retornar valor por isso "void".

	Optional<Usuario> buscarPorId(Long id);

}

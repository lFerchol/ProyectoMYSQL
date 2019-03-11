package com.mysql.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.entity.Usuario;
import com.mysql.model.IUsuario;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private IUsuario crudUsuario;
	
	@Override
	public Iterable<Usuario> obtenerRegistros() {
		return  crudUsuario.findAll();
	}

}

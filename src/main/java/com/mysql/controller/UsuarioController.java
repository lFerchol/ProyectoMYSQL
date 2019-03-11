package com.mysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.entity.Usuario;
import com.mysql.services.UsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@RequestMapping("/registros")
	public Iterable obtenerRegistros() {
		Iterable<Usuario> usuario = service.obtenerRegistros();
		return usuario;
	}
	
	@RequestMapping("/registros2")
	public String getNombreUsuario() {
		return "Juan Pérez";
	}
}

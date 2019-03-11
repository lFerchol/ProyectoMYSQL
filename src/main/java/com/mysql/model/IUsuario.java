package com.mysql.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mysql.entity.Usuario;

@Repository
public interface IUsuario extends CrudRepository<Usuario, Long> {
	
}

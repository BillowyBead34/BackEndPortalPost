package com.bolsadeideas.springboot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	
	public Usuario findByUserName(String username);
	//public Usuario findByUserNameAndEmail(String username, String email);
	
	@Query("select u from User u where u.UserName=?1")
	public Usuario findByUserName2(String username);
	
	//@Query("select u from User u where u.UserName=?1 and u.Email=?2")
	//public Usuario findByUsername2(String username, String email);

}

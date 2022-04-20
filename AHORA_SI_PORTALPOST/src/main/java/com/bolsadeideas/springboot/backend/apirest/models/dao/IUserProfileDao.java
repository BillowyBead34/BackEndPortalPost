package com.bolsadeideas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Business;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Region;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Role;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Status;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Usuario;

public interface IUserProfileDao extends JpaRepository<Usuario, Long>{

	/*
	@Query("from Status")
	public List<Status> findAllStatus();
	*/
	@Query("from Role")
	public List<Role> findAllRoles();
	@Query("from Business")
	public List<Business> findAllBusiness();
}

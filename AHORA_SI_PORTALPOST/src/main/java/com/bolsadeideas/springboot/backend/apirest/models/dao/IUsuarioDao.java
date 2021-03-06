package com.bolsadeideas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Business;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Region;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Role;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Status;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Long>{
	
	public Usuario findByUserName(String username);
	//public Usuario findByUserNameAndEmail(String username, String email);
	
	@Query("select u from user u where u.Username=?1")
	public Usuario findByUserName2(String username);
	
	//@Query("select u from User u where u.UserName=?1 and u.Email=?2")
	//public Usuario findByUsername2(String username, String email);
	
	@Query("from Status")
	public List<Status> findAllStatus();
	
	@Query("from Role")
	public List<Role> findAllRoles();
	
	@Query("from Business")
	public List<Business> findAllBusiness();

}

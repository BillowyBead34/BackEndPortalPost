package com.bolsadeideas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Bank;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Business;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Operation;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Region;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Role;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Status;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Usuario;

public interface ITransactionDao extends JpaRepository<Usuario, Long>{

	@Query("from Operation")
	public List<Operation> findAllOperation();
	@Query("from BankId")
	public List<Bank> findAllBank();
	@Query("from UserId")
	public List<Usuario> findAllUser();
}

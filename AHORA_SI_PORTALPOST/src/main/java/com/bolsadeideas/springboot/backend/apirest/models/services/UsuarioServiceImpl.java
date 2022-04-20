package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IClienteDao;
import com.bolsadeideas.springboot.backend.apirest.models.dao.IUsuarioDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Business;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Region;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Role;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Status;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	
	@Autowired
	private IUsuarioDao clienteDao;
	
	

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return (List<Usuario>) clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Usuario> findAll(Pageable pageable) {
		return clienteDao.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Usuario save(Usuario cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Status> findAllStatus() {
		return clienteDao.findAllStatus();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Role> findAllRoles() {
		return clienteDao.findAllRoles();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Business> findAllBusiness() {
		return clienteDao.findAllBusiness();
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

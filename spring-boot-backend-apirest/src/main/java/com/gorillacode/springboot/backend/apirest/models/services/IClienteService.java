package com.gorillacode.springboot.backend.apirest.models.services;

import java.util.List;

import com.gorillacode.springboot.backend.apirest.models.enity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);

}

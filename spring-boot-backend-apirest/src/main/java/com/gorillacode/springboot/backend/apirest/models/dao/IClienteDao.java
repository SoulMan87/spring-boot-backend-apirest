package com.gorillacode.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.gorillacode.springboot.backend.apirest.models.enity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}

package org.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.example.Cliente;


public interface ClienteRepository extends CrudRepository<Cliente,Long> {

}

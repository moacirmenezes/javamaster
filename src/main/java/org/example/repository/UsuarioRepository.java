package org.example.repository;

import org.example.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



 
public interface UsuarioRepository extends CrudRepository<Usuario,Long>{
    @Query("SELECT U.login, U.senha FROM Usuario U WHERE U.login = ?1 and U.senha = ?2")
    public String efetuarLogin(String login, String senha);
    public Usuario findByLogin(String login);
}

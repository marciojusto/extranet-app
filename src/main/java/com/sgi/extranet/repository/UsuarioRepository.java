package com.sgi.extranet.repository;

import com.sgi.extranet.model.Usuario;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends ReactiveCrudRepository<Usuario, Integer> {

}

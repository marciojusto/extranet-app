package com.sgi.extranet.repository;

import com.sgi.extranet.model.Usuario;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UsuarioRepository extends ReactiveCrudRepository<Usuario, Integer> {

    Mono<Usuario> findById(Integer id);
}

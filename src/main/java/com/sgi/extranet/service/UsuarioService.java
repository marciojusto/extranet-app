package com.sgi.extranet.service;

import com.sgi.extranet.model.Usuario;
import com.sgi.extranet.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Flux<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Mono<Usuario> findById(Integer id) {
        return usuarioRepository.findById(id);
    }
}

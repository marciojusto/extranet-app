package com.sgi.extranet.controller;

import com.sgi.extranet.model.Usuario;
import com.sgi.extranet.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    public Flux<Usuario> listAll() {
        return usuarioService.findAll();
    }

    @GetMapping(path = "{id}")
    public Mono<Usuario> findById(@PathVariable Integer id) {
        return usuarioService.findById(id)
                             .switchIfEmpty(monoResponseStatusNotFoundException());
    }

    private <T> Mono<T> monoResponseStatusNotFoundException() {
        return Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado!"));
    }
}

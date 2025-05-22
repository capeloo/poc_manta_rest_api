package com.example.poc_manta_rest_api.controller;

import com.example.poc_manta_rest_api.model.Usuario;
import com.example.poc_manta_rest_api.model.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping(path = "/usuario")
    public Usuario adicionarUsuario (@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @GetMapping(path = "/usuarios")
    public List<Usuario> listarUsuarios () {
        return usuarioRepository.findAll();
    }
}

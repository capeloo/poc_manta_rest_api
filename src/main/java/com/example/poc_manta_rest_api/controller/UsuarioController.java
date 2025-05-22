package com.example.poc_manta_rest_api.controller;

import com.example.poc_manta_rest_api.entity.Usuario;
import com.example.poc_manta_rest_api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(path = "/usuario")
    public Usuario adicionarUsuario (@RequestBody Usuario usuario) {
        return usuarioService.adicionar(usuario);
    }

    @GetMapping(path = "/usuarios")
    public List<Usuario> listarUsuarios () {
        return usuarioService.listarTodos();
    }
}

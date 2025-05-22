package com.example.poc_manta_rest_api.service;

import com.example.poc_manta_rest_api.entity.Usuario;
import com.example.poc_manta_rest_api.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario adicionar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

}

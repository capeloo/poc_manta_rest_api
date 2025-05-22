package com.example.poc_manta_rest_api.controller;

import com.example.poc_manta_rest_api.model.Usuario;
import com.example.poc_manta_rest_api.model.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping(path = "/usuario")
    public @ResponseBody String adicionarUsuario (
            @RequestParam String login,
            @RequestParam String senhaHash,
            @RequestParam String nome,
            @RequestParam String email,
            @RequestParam String bio,
            @RequestParam boolean isPremium
    ) {
        Usuario usr = new Usuario();
        usr.setLogin(login);
        usr.setSenhaHash(senhaHash);
        usr.setNome(nome);
        usr.setEmail(email);
        usr.setBio(bio);
        usr.setPremium(isPremium);
        usuarioRepository.save(usr);
        return "Usuário adicionado!";
    }

    @GetMapping(path = "/usuarios")
    public @ResponseBody Iterable<Usuario> ListarUsuarios () {
        return usuarioRepository.findAll();
    }
}

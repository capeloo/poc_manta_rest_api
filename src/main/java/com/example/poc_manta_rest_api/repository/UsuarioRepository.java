package com.example.poc_manta_rest_api.repository;

import com.example.poc_manta_rest_api.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}

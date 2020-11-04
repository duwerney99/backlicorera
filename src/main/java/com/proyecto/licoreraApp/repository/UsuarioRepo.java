package com.proyecto.licoreraApp.repository;

import com.proyecto.licoreraApp.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {

}

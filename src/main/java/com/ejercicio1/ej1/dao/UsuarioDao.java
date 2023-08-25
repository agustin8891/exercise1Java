package com.ejercicio1.ej1.dao;

import com.ejercicio1.ej1.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);

}
package com.ejercicio1.ej1.controllers;

import com.ejercicio1.ej1.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsuarioController {

    @RequestMapping(value = "usuarios")
    public Usuario getUsuarios() {
        Usuario usuario = new Usuario();
        usuario.setNombre("juan");
        usuario.setApellido("Gonzales");
        usuario.setEmail("juan@gmail.com");
        usuario.setTelefono("451122321");
        return usuario;
    }

}



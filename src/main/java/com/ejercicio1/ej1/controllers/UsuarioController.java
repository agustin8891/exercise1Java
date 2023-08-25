package com.ejercicio1.ej1.controllers;

import com.ejercicio1.ej1.dao.UsuarioDao;
import com.ejercicio1.ej1.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id) {
        usuarioDao.eliminar(id);
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario) {
        usuarioDao.registrar(usuario);
    }


}



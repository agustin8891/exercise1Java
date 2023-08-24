package com.ejercicio1.ej1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsuarioController {

    @RequestMapping(value = "usuarios")
    public String getUsuarios() {
        return "asdf";
    }

}



package com.mobiuni.controller;

import com.mobiuni.model.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.mobiuni.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsuarioController {

    //@Autowired
    //private UsuarioService usuarioService;

    //@PostMapping("/login")
    //public String loginSubmit(@RequestParam String email,
    //@RequestParam String senha) {
    //Usuario usuario = usuarioService.autenticar(email, senha);
    //if (usuario != null) {
    //return "redirect:/";
    //} else {
    //return "redirect:/login?erro";
    //}
    //}
}



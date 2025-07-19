package com.mobiuni.controller;

import com.mobiuni.model.Usuario;
import com.mobiuni.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PerfilController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/perfil")
    public String exibirPerfil(Model model) {
        // Simula um usuário logado — substitua por autenticação real depois
        Usuario usuario = usuarioRepository.findById(1L).orElse(null);

        model.addAttribute("usuario", usuario);
        return "perfil"; // Thymeleaf procurará o arquivo perfil.html
    }
}

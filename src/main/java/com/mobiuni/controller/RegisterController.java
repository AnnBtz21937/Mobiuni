package com.mobiuni.controller;

import com.mobiuni.model.Usuario;
import com.mobiuni.repository.UsuarioRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/register")
    public String mostrarFormulario() {
        return "register"; // mostra register.html
    }

    @PostMapping("/register")
    public String cadastrarUsuario(@RequestParam String nome,
                                   @RequestParam String email,
                                   @RequestParam String senha,
                                   @RequestParam String pcd,
                                   HttpSession session) {

        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenha(senha); // você pode criptografar depois
        usuario.setPcd(pcd.equalsIgnoreCase("sim")); // precisa adicionar esse campo no model

        usuarioRepository.save(usuario);

        session.setAttribute("usuarioLogado", usuario); // login automático após cadastro

        return "redirect:/index"; // ou redirect:/home
    }
}

package com.mobiuni.service;

import com.mobiuni.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public Usuario autenticar(String email, String senha) {
        // Usuário fixo com seus dados
        if (email.equals("anabeatrizssa231@gmail.com") && senha.equals("12345")) {
            Usuario usuario = new Usuario();
            usuario.setId(1L);
            usuario.setNome("Ana Beatriz");
            usuario.setEmail(email);
            usuario.setSenha(senha);
            usuario.setPcd(true); // ou false, dependendo do que quiser
            usuario.setModoAcessibilidade("visual"); // ou outro: auditiva, física...
            return usuario;
        }

        // Retorna null se não for válido
        return null;
    }
}

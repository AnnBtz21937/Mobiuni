package com.mobiuni.controller;

import com.mobiuni.model.Postagem;
import com.mobiuni.model.TipoDeficiencia;
import com.mobiuni.model.Usuario;
import com.mobiuni.repository.PostagemRepository;
import com.mobiuni.repository.TipoDeficienciaRepository;
import com.mobiuni.repository.UsuarioRepository;
import com.mobiuni.factory.TipoAcessibilidade;
import com.mobiuni.factory.PostagemFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/comunidade")
public class PostagemController {

    @Autowired
    private PostagemRepository postagemRepository;

    @Autowired
    private TipoDeficienciaRepository tipoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public String listarPostagens(@RequestParam(required = false) Long tipoId,
                                  @RequestParam(required = false) String bairro,
                                  Model model) {

        List<Postagem> postagens;

        if (tipoId != null && bairro != null && !bairro.isEmpty()) {
            postagens = postagemRepository.findByTipoDeficiencia_IdAndBairroContainingIgnoreCase(tipoId, bairro);
        } else if (tipoId != null) {
            postagens = postagemRepository.findByTipoDeficiencia_Id(tipoId);
        } else if (bairro != null && !bairro.isEmpty()) {
            postagens = postagemRepository.findByBairroContainingIgnoreCase(bairro);
        } else {
            postagens = postagemRepository.findAll();
        }

        model.addAttribute("postagens", postagens);
        model.addAttribute("tipos", tipoRepository.findAll());
        return "comunidade"; // comunidade.html
    }

    @PostMapping("/nova")
    public String novaPostagem(@RequestParam String texto,
                               @RequestParam Long tipoId,
                               @RequestParam String bairro,
                               @RequestParam Long usuarioId,
                               @RequestParam String status) { // novo parâmetro: acessivel, inacessivel, desconhecido

        TipoDeficiencia tipo = tipoRepository.findById(tipoId).orElse(null);
        Usuario usuario = usuarioRepository.findById(usuarioId).orElse(null);

        // Usando o Factory para criar a base da postagem
        TipoAcessibilidade tipoEnum = TipoAcessibilidade.valueOf(status.toUpperCase());
        com.mobiuni.factory.Postagem postagemFactory = PostagemFactory.criarPostagem(tipoEnum, usuario.getNome(), texto);

        // Convertendo para a entidade JPA Postagem
        Postagem postagem = new Postagem();
        postagem.setTexto(postagemFactory.getConteudo());
        postagem.setBairro(bairro);
        postagem.setData(LocalDateTime.now());
        postagem.setTipoDeficiencia(tipo);
        postagem.setAutor(usuario);
        postagem.setStatusAcessibilidade(postagemFactory.getTipo().getDescricao());


        postagemRepository.save(postagem);
        return "redirect:/comunidade";
    }

}

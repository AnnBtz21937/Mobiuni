package com.mobiuni.controller;

import com.mobiuni.model.Ponto;
import com.mobiuni.service.PontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pontos")
public class PontoController {

    @Autowired
    private PontoService pontoService;

    @PostMapping("/salvar")
    public Ponto salvar(@RequestBody Ponto ponto) {
        return pontoService.salvar(ponto);
    }

    @GetMapping("/listar")
    public List<Ponto> listarTodos() {
        return pontoService.listarTodos();
    }

    @GetMapping("/bairro")
    public List<Ponto> buscarPorBairro(@RequestParam String nome) {
        return pontoService.buscarPorBairro(nome);
    }
}


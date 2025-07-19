package com.mobiuni.service;

import com.mobiuni.model.Ponto;
import com.mobiuni.repository.PontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PontoService {

    @Autowired
    private PontoRepository pontoRepository;

    public Ponto salvar(Ponto ponto) {
        return pontoRepository.save(ponto);
    }

    public List<Ponto> listarTodos() {
        return pontoRepository.findAll();
    }

    public List<Ponto> buscarPorBairro(String bairro) {
        return pontoRepository.findByBairro(bairro);
    }
}

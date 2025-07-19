package com.mobiuni.controller;

import com.mobiuni.strategy.AcessibilidadeContext;
import com.mobiuni.strategy.AuditivaStrategy;
import com.mobiuni.strategy.FisicaStrategy;
import com.mobiuni.strategy.VisualStrategy;
import com.mobiuni.strategy.AcessibilidadeStrategy;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/acessibilidade")
public class AcessibilidadeController {

    private final AcessibilidadeContext contexto = new AcessibilidadeContext();

    @PostMapping("/modo")
    public String aplicarModo(@RequestParam String tipo) {
        AcessibilidadeStrategy strategy;

        switch (tipo.toLowerCase()) {
            case "visual":
                strategy = new VisualStrategy();
                break;
            case "auditiva":
                strategy = new AuditivaStrategy();
                break;
            case "fisica":
                strategy = new FisicaStrategy();
                break;
            default:
                return "Tipo de deficiência não reconhecido";
        }

        contexto.setEstrategia(strategy);  // ✅ Método correto
        contexto.aplicarAjustes();         // ✅ Executa a estratégia
        return "Ajustes de acessibilidade aplicados para: " + tipo;
    }
}

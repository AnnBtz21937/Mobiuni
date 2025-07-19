package com.mobiuni.controller;
import com.mobiuni.config.ContrasteConfig;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/acessibilidade")
public class ContrasteController {

    @PostMapping("/contraste")
    public ResponseEntity<String> alterarContraste(@RequestParam boolean ativar) {
        ContrasteConfig contraste = ContrasteConfig.getInstancia();

        if (ativar) {
            contraste.ativarContraste();
        } else {
            contraste.desativarContraste();
        }

        return ResponseEntity.ok("Contraste " + (contraste.isContrasteAtivo() ? "ativado" : "desativado"));
    }
}


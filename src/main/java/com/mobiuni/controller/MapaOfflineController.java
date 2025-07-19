package com.mobiuni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapaOfflineController {

    @GetMapping("/mapa-offline")
    public String exibirMapaOffline() {
        return "mapaoffline"; // Thymeleaf busca mapaoffline.html em src/main/resources/templates
    }
}


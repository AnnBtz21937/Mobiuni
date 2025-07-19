package com.mobiuni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SobreNosController {

    @GetMapping("/sobrenos")
    public String mostrarPaginaSobreNos() {
        return "sobrenos"; // Thymeleaf procurará por templates/sobrenos.html
    }
}


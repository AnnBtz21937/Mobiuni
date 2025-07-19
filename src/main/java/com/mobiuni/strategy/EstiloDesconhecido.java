package com.mobiuni.strategy;

public class EstiloDesconhecido implements EstiloMapaStrategy {
    public String aplicarEstilo() {
        return "Marcador amarelo com ícone ❓";
    }
}

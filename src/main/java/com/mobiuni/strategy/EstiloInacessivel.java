package com.mobiuni.strategy;

public class EstiloInacessivel implements EstiloMapaStrategy {
    public String aplicarEstilo() {
        return "Marcador vermelho com ícone 🚫";
    }
}
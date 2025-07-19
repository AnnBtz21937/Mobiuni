package com.mobiuni.strategy;

public class AcessibilidadeContext {

    private AcessibilidadeStrategy estrategia; // nome corrigido

    public void setEstrategia(AcessibilidadeStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void aplicarAjustes() {
        if (estrategia != null) {
            estrategia.aplicar();
        } else {
            System.out.println("Nenhuma estratégia definida.");
        }
    }
}

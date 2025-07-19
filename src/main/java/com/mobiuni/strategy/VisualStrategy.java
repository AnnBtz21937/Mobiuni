package com.mobiuni.strategy;

public class VisualStrategy implements AcessibilidadeStrategy {
    @Override
    public void aplicar() {
        System.out.println("Aplicando recursos visuais: alto contraste, leitura de tela, aumento de fonte...");
    }
}

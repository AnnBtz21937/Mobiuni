package com.mobiuni.strategy;

public class FisicaStrategy implements AcessibilidadeStrategy {
    @Override
    public void aplicar() {
        System.out.println("Aplicando navegação por teclado, atalhos e botões grandes...");
    }
}

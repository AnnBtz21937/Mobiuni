package com.mobiuni.strategy;

public class AuditivaStrategy implements AcessibilidadeStrategy {
    @Override
    public void aplicar() {
        System.out.println("Aplicando recursos auditivos: legendas, transcrição de áudio...");
    }
}

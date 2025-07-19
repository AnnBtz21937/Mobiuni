package com.mobiuni.factory;

public class PontoFactory {
    public static PontoAcessibilidade criar(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "acessivel" -> new PontoAcessivel();
            case "inacessivel" -> new PontoInacessivel();
            default -> new PontoDesconhecido();
        };
    }
}

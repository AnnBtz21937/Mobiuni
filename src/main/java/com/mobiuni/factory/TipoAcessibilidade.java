package com.mobiuni.factory;

public enum TipoAcessibilidade {
    ACESSIVEL("♿ Acessível"),
    INACESSIVEL("🚫 Inacessível"),
    DESCONHECIDO("❓ Desconhecido");

    private final String descricao;

    TipoAcessibilidade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
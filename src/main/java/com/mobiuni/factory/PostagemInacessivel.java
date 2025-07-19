package com.mobiuni.factory;

public class PostagemInacessivel extends Postagem {
    public PostagemInacessivel(String autor, String conteudo) {
        super(autor, conteudo);
    }

    @Override
    public TipoAcessibilidade getTipo() {
        return TipoAcessibilidade.INACESSIVEL;
    }
}
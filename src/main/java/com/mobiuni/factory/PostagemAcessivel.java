package com.mobiuni.factory;

public class PostagemAcessivel extends Postagem {
    public PostagemAcessivel(String autor, String conteudo) {
        super(autor, conteudo);
    }

    @Override
    public TipoAcessibilidade getTipo() {
        return TipoAcessibilidade.ACESSIVEL;
    }
}

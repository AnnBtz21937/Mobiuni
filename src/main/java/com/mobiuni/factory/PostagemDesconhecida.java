package com.mobiuni.factory;

public class PostagemDesconhecida extends Postagem {
    public PostagemDesconhecida(String autor, String conteudo) {
        super(autor, conteudo);
    }

    @Override
    public TipoAcessibilidade getTipo() {
        return TipoAcessibilidade.DESCONHECIDO;
    }
}
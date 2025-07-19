package com.mobiuni.factory;

public class PostagemFactory {
    public static Postagem criarPostagem(TipoAcessibilidade tipo, String autor, String conteudo) {
        return switch (tipo) {
            case ACESSIVEL -> new PostagemAcessivel(autor, conteudo);
            case INACESSIVEL -> new PostagemInacessivel(autor, conteudo);
            case DESCONHECIDO -> new PostagemDesconhecida(autor, conteudo);
        };

    }
}
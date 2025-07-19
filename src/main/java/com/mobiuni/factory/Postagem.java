package com.mobiuni.factory;

public abstract class Postagem {
    protected String autor;
    protected String conteudo;

    public Postagem(String autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
    }

    public abstract TipoAcessibilidade getTipo(); // define o tipo ♿, 🚫 ou ❓

    public String getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }
}

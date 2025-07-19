package com.mobiuni.config;

/**
 * Singleton para gerenciar o modo de contraste acessível no sistema.
 */
public class ContrasteConfig {

    private static ContrasteConfig instancia;
    private boolean contrasteAtivo;

    // Construtor privado
    private ContrasteConfig() {
        this.contrasteAtivo = false; // padrão: contraste desativado
    }

    // Método para obter a única instância
    public static synchronized ContrasteConfig getInstancia() {
        if (instancia == null) {
            instancia = new ContrasteConfig();
        }
        return instancia;
    }

    public boolean isContrasteAtivo() {
        return contrasteAtivo;
    }

    public void ativarContraste() {
        this.contrasteAtivo = true;
    }

    public void desativarContraste() {
        this.contrasteAtivo = false;
    }

    public void alternarContraste() {
        this.contrasteAtivo = !this.contrasteAtivo;
    }
}

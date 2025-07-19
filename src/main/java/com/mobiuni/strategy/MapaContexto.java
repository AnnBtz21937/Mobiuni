package com.mobiuni.strategy;

public class MapaContexto {
    private EstiloMapaStrategy estrategia;

    public void setEstrategia(EstiloMapaStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public String renderizarPonto() {
        return estrategia.aplicarEstilo();
    }
}

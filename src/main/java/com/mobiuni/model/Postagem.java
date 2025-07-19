package com.mobiuni.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String texto;

    private String bairro;

    private LocalDateTime data;

    private String statusAcessibilidade; // ♿, 🚫, ❓

    @ManyToOne
    @JoinColumn(name = "tipo_deficiencia_id")
    private TipoDeficiencia tipoDeficiencia;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public TipoDeficiencia getTipoDeficiencia() {
        return tipoDeficiencia;
    }

    public void setTipoDeficiencia(TipoDeficiencia tipoDeficiencia) {
        this.tipoDeficiencia = tipoDeficiencia;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public String getStatusAcessibilidade() {
        return statusAcessibilidade;
    }

    public void setStatusAcessibilidade(String statusAcessibilidade) {
        this.statusAcessibilidade = statusAcessibilidade;
    }
}

package com.mobiuni.model;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;
    private boolean pcd;

    // Novo campo: modo de acessibilidade aplicado (visual, auditiva, física etc.)
    private String modoAcessibilidade;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isPcd() {
        return pcd;
    }

    public void setPcd(boolean pcd) {
        this.pcd = pcd;
    }

    public String getModoAcessibilidade() {
        return modoAcessibilidade;
    }

    public void setModoAcessibilidade(String modoAcessibilidade) {
        this.modoAcessibilidade = modoAcessibilidade;
    }
}



package com.gestor_financeiro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Entity
@Table(name = "DESPESA")
public class Despesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDespesa;
    private String nome;
    private String categoria;
    private String data;
    private BigDecimal valor;

    public Despesa() {

    }

    public Despesa(Integer idDespesa, String nome, String categoria, String data, BigDecimal valor) {
        this.idDespesa = idDespesa;
        this.nome = nome;
        this.categoria = categoria;
        this.data = data;
        this.valor = valor;
    }

    public Integer getIdDespesa() {
        return idDespesa;
    }

    public void setIdDespesa(Integer idDespesa) {
        this.idDespesa = idDespesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}

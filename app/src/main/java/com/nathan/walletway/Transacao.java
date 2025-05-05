package com.nathan.walletway;

public class Transacao {
    private String descricao;
    private double valor;
    private String tipo; // "Receita" ou "Despesa"

    public Transacao(String descricao, double valor, String tipo) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }
}

package com.mycompany;

import java.sql.Date;

public class ProdutoCarrinho {
    private String nome;
    private int quantidade;
    private double valor;
    private String cpfCliente;
    private Date dataCompra; 

   public ProdutoCarrinho(String cpfCliente, String nome, int quantidade, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.cpfCliente = cpfCliente;
    }

    // Construtor e outros métodos

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }
    
    public String getCpfCliente() {
        return cpfCliente;
    }

    int getPreco() {
        
        return 0;
        
    }

    void setQuantidade(int i) {
        
    }

    Object getDataCompra() {
       
        return null;
       
    }
}


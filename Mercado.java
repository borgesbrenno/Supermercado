/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;

/**
 *
 * @author silva
 */
public class Mercado {
    private int quantidade;
    private String frutas;
    private String doces;
    private String bebidas;
    private String limpeza;
    private String congelados;
    private String padaria;
    private String acougue;
    
    //construtor vazio
    public Mercado(){
    }
    //construtor com parametros
    public Mercado(String frutas, String doces, String bebidas, String limpeza, String congelados, String padaria, String acougue){
        this.frutas = frutas;
        this.doces = doces;
        this.bebidas = bebidas;
        this.limpeza = limpeza;
        this.congelados = congelados;
        this.padaria = padaria;
        this.acougue = acougue;
    }
    
    //alt + insert 
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getFrutas() {
        return frutas;
    }

    public void setFrutas(String frutas) {
        this.frutas = frutas;
    }

    public String getDoces() {
        return doces;
    }

    public void setDoces(String doces) {
        this.doces = doces;
    }

    public String getBebidas() {
        return bebidas;
    }

    public void setBebidas(String bebidas) {
        this.bebidas = bebidas;
    }

    public String getLimpeza() {
        return limpeza;
    }

    public void setLimpeza(String limpeza) {
        this.limpeza = limpeza;
    }

    public String getCongelados() {
        return congelados;
    }

    public void setCongelados(String congelados) {
        this.congelados = congelados;
    }

    public String getPadaria() {
        return padaria;
    }

    public void setPadaria(String padaria) {
        this.padaria = padaria;
    }

    public String getAcougue() {
        return acougue;
    }

    public void setAcougue(String acougue) {
        this.acougue = acougue;
    }
    
    //metodos
    public int adicionar(){
        this.quantidade += 1;
        return quantidade;
    }
    
    public int retirar(){
        this.quantidade -= 1;
        return quantidade;
    }
}

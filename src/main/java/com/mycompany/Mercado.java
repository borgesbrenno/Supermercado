package com.mycompany;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
    private int quantidadeMorango;
    private String morango;
    
    private int quantidadeAmeixa;
    private String ameixa;
    
    private int quantidadeFini;
    private String fini;
    
    private int quantidadeSeteBelo;
    private String seteBelo;
    
    private int quantidadeGuarana;
    private String guarana;
    
    private int quantidadeCoca;
    private String cocacola;
    
    private String detergente;
    private int quantidadeDetergente;
    
    private String desinfetante;
    private int quantidadeDesinfetante;
    
    private String frango;
    private int quantidadeFrango;
    
    private String pao;
    private int quantidadePao;
    
    private String bisnaga;
    private int quantidadeBisnaga;
    
    private String carne;
    private int quantidadeCarne;
    
    public String quantidade;
    public String produto;    
    public String preco;
    
    // Adicione um método para obter o preço como double
    public double getPrecoAsDouble() {
        try {
            return Double.parseDouble(preco);
        } catch (NumberFormatException e) {
            // Lida com a conversão caso ocorra algum erro
            return 0.0;
        }
    }
    
    public int getQuantidadeMorango() {
        return quantidadeMorango;
    }

    public void setQuantidadeMorango(int quantidadeMorango) {
        this.quantidadeMorango = quantidadeMorango;
    }

    public int getQuantidadeAmeixa() {
        return quantidadeAmeixa;
    }

    public void setQuantidadeAmeixa(int quantidadeAmeixa) {
        this.quantidadeAmeixa = quantidadeAmeixa;
    }

    public int getQuantidadeFini() {
        return quantidadeFini;
    }

    public void setQuantidadeFini(int quantidadeFini) {
        this.quantidadeFini = quantidadeFini;
    }

    public int getQuantidadeGuarana() {
        return quantidadeGuarana;
    }

    public int getQuantidadeSeteBelo() {
        return quantidadeSeteBelo;
    }

    public void setQuantidadeSeteBelo(int quantidadeSeteBelo) {
        this.quantidadeSeteBelo = quantidadeSeteBelo;
    }

    public String getSeteBelo() {
        return seteBelo;
    }

    public void setSeteBelo(String seteBelo) {
        this.seteBelo = seteBelo;
    }

    public void setQuantidadeGuarana(int quantidadeGuarana) {
        this.quantidadeGuarana = quantidadeGuarana;
    }

    public int getQuantidadeCoca() {
        return quantidadeCoca;
    }

    public void setQuantidadeCoca(int quantidadeCoca) {
        this.quantidadeCoca = quantidadeCoca;
    }

    public int getQuantidadeDetergente() {
        return quantidadeDetergente;
    }

    public void setQuantidadeDetergente(int quantidadeDetergente) {
        this.quantidadeDetergente = quantidadeDetergente;
    }

    public int getQuantidadeDesinfetante() {
        return quantidadeDesinfetante;
    }

    public void setQuantidadeDesinfetante(int quantidadeDesinfetante) {
        this.quantidadeDesinfetante = quantidadeDesinfetante;
    }

    public int getQuantidadeFrango() {
        return quantidadeFrango;
    }

    public void setQuantidadeFrango(int quantidadeFrango) {
        this.quantidadeFrango = quantidadeFrango;
    }

    public int getQuantidadePao() {
        return quantidadePao;
    }

    public void setQuantidadePao(int quantidadePao) {
        this.quantidadePao = quantidadePao;
    }

    public int getQuantidadeBisnaga() {
        return quantidadeBisnaga;
    }

    public void setQuantidadeBisnaga(int quantidadeBisnaga) {
        this.quantidadeBisnaga = quantidadeBisnaga;
    }

    public int getQuantidadeCarne() {
        return quantidadeCarne;
    }

    public void setQuantidadeCarne(int quantidadeCarne) {
        this.quantidadeCarne = quantidadeCarne;
    }

    public Mercado(String morango, String ameixa, String fini, String guarana, String cocacola, String detergente, String desinfetante, String frango, String pao, String bisnaga, String carne, String quantidade, String produto, String preco) {
        this.morango = morango;
        this.ameixa = ameixa;
        this.fini = fini;
        this.fini = seteBelo;
        this.guarana = guarana;
        this.cocacola = cocacola;
        this.detergente = detergente;
        this.desinfetante = desinfetante;
        this.frango = frango;
        this.pao = pao;
        this.bisnaga = bisnaga;
        this.carne = carne;
        this.quantidade = quantidade;
        this.produto = produto;
        this.preco = preco;
    }
    
    public Mercado(){
    }

    Mercado(String produto, String quantidade, String preco) {
    }

    public String getMorango() {
        return morango;
    }

    public void setMorango(String morango) {
        this.morango = morango;
    }

    public String getAmeixa() {
        return ameixa;
    }

    public void setAmeixa(String ameixa) {
        this.ameixa = ameixa;
    }

    public String getFini() {
        return fini;
    }

    public void setFini(String fini) {
        this.fini = fini;
    }

    public String getGuarana() {
        return guarana;
    }

    public void setGuarana(String guarana) {
        this.guarana = guarana;
    }

    public String getCocacola() {
        return cocacola;
    }

    public void setCocacola(String cocacola) {
        this.cocacola = cocacola;
    }

    public String getDetergente() {
        return detergente;
    }

    public void setDetergente(String detergente) {
        this.detergente = detergente;
    }

    public String getDesinfetante() {
        return desinfetante;
    }

    public void setDesinfetante(String desinfetante) {
        this.desinfetante = desinfetante;
    }

    public String getFrango() {
        return frango;
    }

    public void setFrango(String frango) {
        this.frango = frango;
    }

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    public String getBisnaga() {
        return bisnaga;
    }

    public void setBisnaga(String bisnaga) {
        this.bisnaga = bisnaga;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getProduto() {
        return produto;
    }
    
    public void setProduto(String produto){
        this.produto = produto;
    }

    public String getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(String quantidade){
        this.quantidade = quantidade;
    }
    
    public String getPreco() {
        return preco;
    }
    
    public void setPreco(String preco){
        this.preco = preco;
    }

    public Object getId() {
        return null;
    }

    public void setId(int aInt) {
    }

    //Métodos
    public int adicionarUmAmeixa(){
        this.quantidadeAmeixa += 1;
        return quantidadeAmeixa;
    }
    
    public int removerUmAmeixa(){
        this.quantidadeAmeixa-=1;
        return quantidadeAmeixa;
    }
    
    //Métodos
    public int adicionarUmMorango(){
        this.quantidadeMorango += 1;
        return quantidadeMorango;
    }
    
    public int removerUmMorango(){
        this.quantidadeMorango-=1;
        return quantidadeMorango;
    }
    
    //Métodos
    public int adicionarUmFini(){
        this.quantidadeFini += 1;
        return quantidadeFini;
    }
    
    public int removerUmFini(){
        this.quantidadeFini-=1;
        return quantidadeFini;
    }
    
    //Métodos
    public int adicionarUmGuarana(){
        this.quantidadeGuarana += 1;
        return quantidadeGuarana;
    }
    
    public int removerUmGuarana(){
        this.quantidadeGuarana-=1;
        return quantidadeGuarana;
    }
    
    //Métodos
    public int adicionarUmCoca(){
        this.quantidadeCoca += 1;
        return quantidadeCoca;
    }
    
    public int removerUmCoca(){
        this.quantidadeCoca -= 1;
        return quantidadeCoca;
    }
    
    //Métodos
    public int adicionarUmDetergente(){
        this.quantidadeDetergente += 1;
        return quantidadeDetergente;
    }
    
    public int removerUmDetergente(){
        this.quantidadeDetergente -= 1;
        return quantidadeDetergente;
    }
    
    //Métodos
    public int adicionarUmDesinfetante(){
        this.quantidadeDesinfetante += 1;
        return quantidadeDesinfetante;
    }
    
    public int removerUmDesinfetante(){
        this.quantidadeDesinfetante -= 1;
        return quantidadeDesinfetante;
    }
    
    //Métodos
    public int adicionarUmFrango(){
        this.quantidadeFrango += 1;
        return quantidadeFrango;
    }
    
    public int removerUmFrango(){
        this.quantidadeFrango -= 1;
        return quantidadeFrango;
    }
    
    //Métodos
    public int adicionarUmPao(){
        this.quantidadePao += 1;
        return quantidadePao;
    }
    
    public int removerUmPao(){
        this.quantidadePao -= 1;
        return quantidadePao;
    }
    
    //Métodos
    public int adicionarUmBisnaga(){
        this.quantidadeBisnaga += 1;
        return quantidadeBisnaga;
    }
    
    public int removerUmBisnaga(){
        this.quantidadeBisnaga -= 1;
        return quantidadeBisnaga;
    }
    
    //Métodos
    public int adicionarUmCarne(){
        this.quantidadeCarne += 1;
        return quantidadeCarne;
    }
    
    public int removerUmCarne(){
        this.quantidadeCarne -= 1;
        return quantidadeCarne;
    }
    
    //Métodos
    public int adicionarUm7belo(){
        this.quantidadeSeteBelo += 1;
        return quantidadeSeteBelo;
    }
    
    public int removerUm7belo(){
        this.quantidadeSeteBelo -= 1;
        return quantidadeSeteBelo;
    }
    
    private int quantidadeMorangos = 0;
    
    // Novo método getItens()
    public List<Mercado> getItens() {
        List<Mercado> itens = new ArrayList<>();
        itens.add(this);
        return itens;
    }
    
    private String cpfCliente;

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    void limparCarrinho() {
        
    }

    void salvarCompras(String cpfCliente, List<ProdutoCarrinho> produtos) {
        
    }

    List<ProdutoCarrinho> getProdutosSalvos() {
        
        return null;
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projetos;

/**
 *
 * @author Gabriel
 */
public class Caixa {
    public String produto;
    public String NomeProduto;
    public String quantidade;
    public String valor;
    public String ValorTotal;
    public String descricao;
    public String teste;
    public String comanda;
    public String nQTD;
    
    public String getProduto(){
        return produto;
    }
    public void setProduto(String produto){
        this.produto = produto;
    }
    
    
    public String getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(String quantidade){
        this.quantidade = quantidade;
    }
    
    
    public String getValor(){
        return valor;
    }
    public void setValor(String valor){
        this.valor = valor;
    }
    
    
    public String getValorTotal(){
        return ValorTotal;
    }
    public void setValorTotal(String ValorTotal){
        this.ValorTotal = ValorTotal;
    }
    
    public String getNomeProduto(){
        return NomeProduto;
    }
    public void setNomeProduto(String NomeProduto){
        this.NomeProduto = NomeProduto;
    }
    
     public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getteste(){
        return teste;
    }
    public void setteste(String teste){
        this.teste = teste;
    }

    public String getComanda() {
        return comanda;
    }

    public void setComanda(String comanda) {
        this.comanda = comanda;
    }

    public String getnQTD() {
        return nQTD;
    }

    public void setnQTD(String nQTD) {
        this.nQTD = nQTD;
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Gabriel
 */
public class Preco {
    public String CodProduto;
    public String Valor;
    public String Nome;
    
      public String getCodProd(){
        return CodProduto;
    }
    
    public void setCodPros(String CodProduto){
        this.CodProduto = CodProduto;
    }
    
    public String getValor(){
        return Valor;
    }
    
    public void setValor(String Valor){
        this.Valor = Valor;
    }
    
     public String getNome(){
        return Nome;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    
    
    
}

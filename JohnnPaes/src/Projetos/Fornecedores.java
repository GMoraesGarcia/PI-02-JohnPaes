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
public class Fornecedores {
    private String Empresa;
    private String CNPJ;
    private String NomeContato;
    private String Telefone;
    private String Celular;
    private String teste;
    
    
     public String getEmpresa(){
        return Empresa;
    }
    public void setEmpresa(String Empresa){
        this.Empresa = Empresa;
    }
    
     public String getCNPJ(){
        return CNPJ;
    }
    public void setCNPJ (String CNPJ){
        this.CNPJ = CNPJ;
    }
    
     public String getNomeContato(){
        return NomeContato;
    }
    public void setNomeContato(String NomeContato){
        this.NomeContato = NomeContato;
    }
    
     public String getTelefone(){
        return Telefone;
    }
    public void setTelefone(String Telefone){
        this.Telefone = Telefone;
    }
    
     public String getCelular(){
        return Celular;
    }
    public void setCelular(String Celular){
        this.Celular = Celular;
    }
    
      public String getteste(){
        return teste;
    }
    public void setteste(String teste){
        this.teste = teste;
    }
}

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
public class Funcionarios {
    private String nome;
    private String data_nascimento;
    private String CPF;
    private String endereco;
    private String salario;
    private String cargo;
    private String supervisor;
    private String bairro;
    private String rua;
    private String numero;
    private String cidade;
    private String uf;
    private String complemento;
       
    
     public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    
    
    public String getNascimento(){
        return data_nascimento;
    }
    public void setNascimento(String data_nascimento){
        this.data_nascimento = data_nascimento;
    }
    
    
    public String getCPF(){
        return CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    
    
    public String getSalario(){
        return salario;
    }
    public void setSalario(String salario){
        this.salario = salario;
    }
    
    
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    
    public String getSupervisor(){
        return supervisor;
    }
    public void setSupervisor(String supervisor){
        this.supervisor = supervisor;
    }
    
    public String getBairro(){
        return bairro;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getRua(){
        return rua;
    }
    public void setRua(String rua){
        this.rua = rua;
    }
    
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getCidade(){
        return cidade;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public String getUF(){
        return uf;
    }
    public void setUF(String uf){
        this.uf = uf;
    }
    
     public String getComplemento(){
        return complemento;
    }
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
}

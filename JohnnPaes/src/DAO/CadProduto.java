package DAO;

public class CadProduto {
    
    private String Produto;
    private String Descricao;
    private String tipo;
    private String Fornecedor;
    private String Quantidade;
    private String id;
    
     public String getID(){
        return id;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    public String getProduto(){
        return Produto;
    }
    
    public void setProduto(String Produto){
        this.Produto = Produto;
    }
    
    public String getDescricao(){
        return Descricao;
    }
    
    public void setDescricao(String Descricao){
        this.Descricao = Descricao;
    }
    
    public String gettipo(){
        return tipo;
    }
    
    public void settipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getFornecedor(){
        return Fornecedor;
    }
    
    public void setFornecedor(String Fornecedor){
        this.Fornecedor = Fornecedor;
    }
    
    public String getQuantidade(){
        return Quantidade;
    }
    
    public void setQuantidade(String Quantidade){
        this.Quantidade = Quantidade;
    }
}

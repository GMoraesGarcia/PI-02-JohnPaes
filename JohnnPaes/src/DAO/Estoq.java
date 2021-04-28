package DAO;

public class Estoq {
    
    private String COD_Pro;
    private String Quantidade;
    private String Valor_Compra;
    
    public String getCodPro(){
        return COD_Pro;
    }
    
    public void setCodPro(String COD_Pro){
        this.COD_Pro = COD_Pro;
    }
    
    public String getQuant(){
        return Quantidade;
    }
    
    public void setQuant(String Quantidade){
        this.Quantidade = Quantidade;
    }
    
    public String getValor(){
        return Valor_Compra;
    }
    
    public void setValor(String Valor_Compra){
        this.Valor_Compra = Valor_Compra;
    }
}

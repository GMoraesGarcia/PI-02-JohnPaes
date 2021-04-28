/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projetos;

import DAO.Estoq;

import Projetos.connectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Gabriel
 */
public class CaixaDAO {
    public ArrayList<Caixa> pesquisa(){
      Connection conn = null;
      PreparedStatement stmt = null;
      ResultSet rs = null;
      ArrayList<Caixa>cx = new ArrayList<Caixa>();
      try{
          conn = connectionFactory.getConnection();
          stmt = conn.prepareStatement("select * from prod_preco");
          rs = stmt.executeQuery();
          while(rs.next()){
          Caixa caixas = new Caixa();
          caixas.setProduto(rs.getString("id"));
          caixas.setNomeProduto(rs.getString("nome"));
          caixas.setDescricao(rs.getString("descricao"));
          caixas.setValor(rs.getString("Valor_unit"));
          
           cx.add(caixas);
          }
          connectionFactory.closeConnection(conn, stmt, rs);
        }
     catch(Exception e){
         JOptionPane.showMessageDialog(null, "erro ao litrar contatos" + e.getMessage());
        }
      return cx;
     }
     
      public void create (Caixa p){
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;

        try{
                        
         
             
            stmt = con.prepareStatement("insert into prods_comanda(com_id,prod_id,quantidade,valor_unitario) "
                                        + "VALUES(?,?,?,?)");
            stmt.setString(1, p.getComanda());
            stmt.setString(2, p.getProduto());
            stmt.setString(3, p.getQuantidade());
            stmt.setString(4, p.getValor());
            stmt.executeUpdate();
        }
        
        /*catch(com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(null, "Baixa quantidade em estoque" + ex);
        }*/
        
        catch(Exception e){
           
         JOptionPane.showMessageDialog(null, e);
        }
        
      
        finally{
            connectionFactory.closeConnection(con, stmt);
        }   
    }  
      
    public void teste (Caixa p){
       Connection con = connectionFactory.getConnection();
       PreparedStatement stmt = null;
       
        try {
            stmt = con.prepareStatement("insert into comandas(data) value(sysdate())");
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    
    }  
    
    public void limiteQTD (Caixa p){
       Connection con = connectionFactory.getConnection();
       PreparedStatement stmt = null;
         ResultSet rs = null;
       
        try {
            stmt = con.prepareStatement("Select quantidade from estoques");
            rs = stmt.executeQuery();
            
            if(rs.next()){
                 Caixa caixas = new Caixa();
                 caixas.setnQTD(rs.getString(1));
                
            }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
    
    }
}


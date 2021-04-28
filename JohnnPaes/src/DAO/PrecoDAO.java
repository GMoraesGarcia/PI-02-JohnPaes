/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Projetos.connectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class PrecoDAO {
    public void cadastrar (Preco p){
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        
         try{
            stmt = con.prepareStatement("INSERT INTO estoques (valor_unit,prod_id,quantidade) values (?,?,0)");
            stmt.setString(1, p.getValor());
            stmt.setString(2, p.getCodProd());
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null, "Inserido.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            connectionFactory.closeConnection(con,stmt);
        }
    }
    
    public void atualizar (Preco p){
         Connection con = connectionFactory.getConnection();
         PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("UPDATE estoques set Valor_unit = ? where prod_id = ?");
            stmt.setString(1, p.getValor());
            stmt.setString(2, p.getCodProd());
            stmt.executeUpdate();
      
             
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            connectionFactory.closeConnection(con,stmt);
        }
    
    
    }
    
    public ArrayList<Preco> pesquisa(){
      Connection conn = null;
      PreparedStatement stmt = null;
      ResultSet rs = null;
      ArrayList<Preco>pre = new ArrayList<Preco>();
      try{
          conn = connectionFactory.getConnection();
          stmt = conn.prepareStatement(" select * from pesq_cad_preco;");
          rs = stmt.executeQuery();
          while(rs.next()){
          Preco fornecedores = new Preco();
          fornecedores.setCodPros(rs.getString("id"));
          fornecedores.setNome(rs.getString("nome"));
          fornecedores.setValor(rs.getString("Valor_unit"));
         
           pre.add(fornecedores);
          }
          connectionFactory.closeConnection(conn, stmt, rs);
      }
     catch(Exception e){
         JOptionPane.showMessageDialog(null, "erro ao litrar contatos" + e.getMessage());
     
     }
        return pre;
    }
}    
    

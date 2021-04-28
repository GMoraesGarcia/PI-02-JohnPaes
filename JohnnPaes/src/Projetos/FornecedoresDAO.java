/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projetos;

import Projetos.connectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.awt.List;
import java.sql.ResultSet;

/**
 *
 * @author Gabriel
 */
public class FornecedoresDAO {
    public void create (Fornecedores p){
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO Fornecedores(empresa,nome_contato,cnpj,telefone,celular) values(?,?,?,?,?)");
            stmt.setString(1, p.getEmpresa());
            stmt.setString(2, p.getNomeContato());
            stmt.setString(3, p.getCNPJ());
            stmt.setString(4, p.getTelefone());
            stmt.setString(5, p.getCelular());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido");
           
            
           
        }
        catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
        }
        finally{
            connectionFactory.closeConnection(con, stmt);
        }
}
    public void update (Fornecedores p){
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
     try{
            stmt = con.prepareStatement("update fornecedores set empresa = ?,nome_contato = ?, telefone = ?,celular = ?  where cnpj = ?");
            stmt.setString(1, p.getEmpresa());
            stmt.setString(2, p.getNomeContato());
            stmt.setString(3, p.getTelefone());
            stmt.setString(4, p.getCelular());
            stmt.setString(5, p.getCNPJ());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alterado");
        }
        catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
        }
        finally{
            connectionFactory.closeConnection(con, stmt);
        }
    
    
    }
    
    public ArrayList<Fornecedores> pesquisa(){
      Connection conn = null;
      PreparedStatement stmt = null;
      ResultSet rs = null;
      ArrayList<Fornecedores>fornece = new ArrayList<Fornecedores>();
      try{
          conn = connectionFactory.getConnection();
          stmt = conn.prepareStatement("select * from fornecedores");
          rs = stmt.executeQuery();
          while(rs.next()){
          Fornecedores fornecedores = new Fornecedores();
          fornecedores.setEmpresa(rs.getString("empresa"));
          fornecedores.setNomeContato(rs.getString("nome_contato"));
          fornecedores.setCNPJ(rs.getString("CNPJ"));
          fornecedores.setTelefone(rs.getString("Telefone"));
          fornecedores.setCelular(rs.getString("Celular"));
           fornece.add(fornecedores);
          }
          connectionFactory.closeConnection(conn, stmt, rs);
      }
     catch(Exception e){
         JOptionPane.showMessageDialog(null, "erro ao litrar contatos" + e.getMessage());
     
     }
      return fornece;
     }
    
    public void deletar(Fornecedores p){
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
     try{
            stmt = con.prepareStatement("delete from fornecedores where cnpj = ?");
            stmt.setString(1, p.getCNPJ());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido");
            
        }
        catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
        }
        finally{
            connectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    public void ultimoCod(Fornecedores p){
     Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
         ResultSet rs = null;
         
         try{
            stmt = con.prepareStatement("select (cod +1) from comanda order by cod desc limit 1");          
             rs = stmt.executeQuery();
            
          
        }
        catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
        }
        finally{
            connectionFactory.closeConnection(con, stmt);
        }
    
    
    }
    
}

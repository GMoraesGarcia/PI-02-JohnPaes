package DAO;

import Projetos.connectionFactory;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadProdutoDAO {
    
    public void Novo (CadProduto p){
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("INSERT INTO Produtos(nome,descricao,tipo,forn_id) values (?,?,?,?)");
          
            stmt.setString(1, p.getProduto());
            stmt.setString(2, p.getDescricao());
            stmt.setString(3, p.gettipo());
            stmt.setString(4, p.getFornecedor());
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
    
    public void Excluir (CadProduto p){
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("delete from Produtos where id=?;");
            stmt.setString(1, p.getID());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluído com sucesso.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            connectionFactory.closeConnection(con,stmt);
        }
    }
    
    public void Alterar (CadProduto p){
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("  UPDATE produtos set nome = ?,descricao=?,tipo=? where id =?;");
            stmt.setString(1, p.getProduto());
            stmt.setString(2, p.getDescricao());
            stmt.setString(3, p.gettipo());
             stmt.setString(4, p.getID());
            
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
    
    
}

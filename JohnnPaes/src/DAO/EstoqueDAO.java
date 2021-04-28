/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Projetos.connectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class EstoqueDAO {
    
    public void Novo (Estoq p){
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("INSERT INTO estoque(Cod_PRODUTO,Quantidade,Valor_Compra) values (?,?,?)");
            stmt.setString(1, p.getCodPro());
            stmt.setString(2, p.getQuant());
            stmt.setString(3, p.getValor());
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
    
    public void Atualizar (Estoq p){
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("update estoques set dat_de_atualizacao = sysdate(), quantidade = quantidade + ? where prod_id = ?");
            stmt.setString(1, p.getQuant());
            stmt.setString(2, p.getCodPro());
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

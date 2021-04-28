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
public class FuncionariosDAO {
    public void create (Funcionarios p){
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(" call SP_FUNC(?,?,?,?,?,?,?,?,?,?,?);");
            stmt.setString(1, p.getnome());
            stmt.setString(2, p.getNascimento());
            stmt.setString(3, p.getCPF());
            stmt.setString(4, p.getCargo());
            stmt.setString(5, p.getSalario());
            stmt.setString(6, p.getBairro());
            stmt.setString(7, p.getRua());
            stmt.setString(8, p.getNumero());
            stmt.setString(9, p.getCidade());
            stmt.setString(10, p.getUF());
            stmt.setString(11, p.getComplemento());
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
    public void update(Funcionarios p){
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
     try{
            stmt = con.prepareStatement(" update funcionarios set cargo =?,salario =?,bairro =?, rua =?,numero =?, cidade =?,uf =?,complemento =? where cpf =?");
            stmt.setString(1, p.getCargo());
            stmt.setString(2, p.getSalario());
            stmt.setString(3, p.getBairro());
            stmt.setString(4, p.getRua());
            stmt.setString(5, p.getNumero());
            stmt.setString(6, p.getCidade());
            stmt.setString(7, p.getUF());
            stmt.setString(8, p.getComplemento());
            stmt.setString(9, p.getCPF());
          
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
     public ArrayList<Funcionarios> pesquisa(){
      Connection conn = null;
      PreparedStatement stmt = null;
      ResultSet rs = null;
      ArrayList<Funcionarios>funcionario = new ArrayList<Funcionarios>();
      try{
          conn = connectionFactory.getConnection();
          stmt = conn.prepareStatement("select * from funcionarios ");
          rs = stmt.executeQuery();
          while(rs.next()){
          Funcionarios funcionarios = new Funcionarios();
          funcionarios.setnome(rs.getString("nome"));
          funcionarios.setNascimento(rs.getString("DataNascimento"));
          funcionarios.setCPF(rs.getString("CPF"));
          funcionarios.setCargo(rs.getString("cargo"));
          funcionarios.setSalario(rs.getString("Salario"));
          funcionarios.setBairro(rs.getString("bairro"));
          funcionarios.setRua(rs.getString("rua"));
          funcionarios.setNumero(rs.getString("numero"));
          funcionarios.setCidade(rs.getString("cidade"));
          funcionarios.setUF(rs.getString("uf"));
          funcionarios.setComplemento(rs.getString("complemento"));
          
           funcionario.add(funcionarios);
          }
          connectionFactory.closeConnection(conn, stmt, rs);
      }
     catch(Exception e){
         JOptionPane.showMessageDialog(null, "erro ao litrar contatos" + e.getMessage());
     
     }
      return funcionario;
     }
     public void deletar (Funcionarios p){
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
     try{
            stmt = con.prepareStatement("delete from funcionarios where cpf =  ?");
            stmt.setString(1, p.getCPF());
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
    
    
    }


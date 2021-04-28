/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Projetos.connectionFactory;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel
 */
public class LoginDAO {
    public void autenticar (Logar p){
       
     Connection con = connectionFactory.getConnection();
     PreparedStatement stmt = null;
        ResultSet rs = null;
      
      try{
            stmt = con.prepareStatement("select * from funcionarios where nome =? and senha = ? and cargo=?");
            stmt.setString(1, p.getUsuario());
            stmt.setString(2, p.getSenha());
            stmt.setString(3, p.getCargo());
            rs = stmt.executeQuery();
            
           if(rs.next()) {
            Logar log = new Logar();
            log.setUsuario(rs.getString("nome"));
            log.setSenha(rs.getString("senha"));
            log.setCargo(rs.getString("cargo"));
           
            }
            
            JOptionPane.showMessageDialog(null, "Bem Vindo.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
}

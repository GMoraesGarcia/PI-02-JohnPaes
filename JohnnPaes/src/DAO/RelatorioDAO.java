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
public class RelatorioDAO {
     public ArrayList<Relatorio> getRelatorio1(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Relatorio> Relatorios = new ArrayList<Relatorio>();
        try{
            conn = connectionFactory.getConnection();
            stmt = conn.prepareStatement("call relat_vendas_prod(?)");
            rs = stmt.executeQuery();
            while(rs.next()) {
            Relatorio rela = new Relatorio();
            rela.setData(rs.getString("dat_inicial"));
           
            Relatorios.add(rela);
            }
            connectionFactory.closeConnection(conn, stmt, rs);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao listar empresa" + e.getMessage());
        }
        return Relatorios;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import dados.Mat;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 277109
 */

    
    public class Mat_DAO {
  
    public void inserir(Mat material) throws Exception {
        Conexao c = new Conexao();
        String sql = "INSERT INTO MATERIAL (desc_mat,qts_mat, vlr_mat) VALUES (?, ?,?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, material.gettxt_desc());
        ps.setInt(2, material.getQuantqts_mat());
        ps.setDouble(3, material.gettxt_valor());
        ps.execute();
        c.confirmar();
        
    }
    
    
    
     public Mat recuperarcodigo() throws Exception {
       Conexao c = new Conexao();
        String sql = "SELECT max(cod_mat) as 'cod_mat' FROM farmacia.material";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        Mat material = new Mat();
        if (rs.next()) { 
           material.settxt_cod(rs.getInt("cod_mat")+1 );
           
        } else{   
            material= null;
            }

        return material;
    }
    
  
} 


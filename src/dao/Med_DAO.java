
   package dao;
import dados.Med;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
   
 
    public class Med_DAO {
  
    public void inserir(Med medicamento) throws Exception {
        Conexao c = new Conexao();
        String sql = "INSERT INTO MEDICAMENTO (desc_med,qts_med, vlr_med) VALUES (?, ?,?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, medicamento.gettxt_desc());
        ps.setInt(2, medicamento.gettxt_qts_med());
        ps.setDouble(3, medicamento.gettxt_valor_med());
        ps.execute();
        c.confirmar();
        
    }
    
    
    
     public Med recuperarcodigo() throws Exception {
       Conexao c = new Conexao();
        String sql = "SELECT max(cod_med) as 'cod_med' FROM farmacia.medicamento";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        Med medicamento = new Med();
        if (rs.next()) { 
           medicamento.settxt_cod_med(rs.getInt("cod_med")+1 );
           
        } else{   
            medicamento= null;
            }

        return medicamento;
    }
    
  
} 


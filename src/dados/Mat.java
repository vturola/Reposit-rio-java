/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;
 // definindo variáveis
import gui.Cad_Mat;



   
/**
 *
 * @author 277109
 */
public class Mat {
    
    
     private int txt_cod;
    private String txt_desc;
    private int qts_mat;
    private Double txt_valor;

    

   
   public Mat() {
        this.txt_cod = 0;
        this.txt_desc = "";
        this.qts_mat = 0;
        this.txt_valor = 0.0;
        
        
        
        
   }
   
   
   
    public int gettxt_cod() {
        return txt_cod;
    }
    
 
    
    public void settxt_cod(int txt_cod) {
        this.txt_cod = txt_cod;
    }
    
    
     public String gettxt_desc() {
        return txt_desc;
    }
    
   public void settxt_desc(String txt_desc) {
        this.txt_desc = txt_desc;
    }

    public Double gettxt_valor() {
        return txt_valor;
    }

    public void settxt_valor(Double txt_valor) {
        this.txt_valor = txt_valor;
    }


    public int getQuantqts_mat() {
        return qts_mat;
    }

    public void setqts_mat(int qts_mat) {
        this.qts_mat = qts_mat;
    } 
   
    
}

    
   
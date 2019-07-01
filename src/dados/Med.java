/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;
import gui.Cad_Med;
/**
 *
 * @author 277109
 */
public class Med {
    
    
     private int txt_cod_med;
    private String txt_desc_med;
    private int txt_qts_med;
    private Double txt_valor_med;

    

   
   public Med(){
        this.txt_cod_med = 0;
        this.txt_desc_med = "";
        this.txt_qts_med = 0;
        this.txt_valor_med = 0.0;
        
        
        
        
   }
   
   
   
    public int gettxt_cod_med() {
        return txt_cod_med;
    }
    
 
    
    public void settxt_cod_med(int txt_cod_med) {
        this.txt_cod_med = txt_cod_med;
    }
    
    // get e set nome produto
     public String gettxt_desc() {
        return txt_desc_med;
    }
    
   public void settxt_desc_med(String txt_desc_med) {
        this.txt_desc_med = txt_desc_med;
    }

    public Double gettxt_valor_med() {
        return txt_valor_med;
    }

    public void settxt_valor_med(Double txt_valor_med) {
        this.txt_valor_med = txt_valor_med;
    }


    public int gettxt_qts_med() {
        return txt_qts_med;
    }

    public void setqts_med(int qts_mat) {
        this.txt_qts_med = txt_qts_med;
    } 
   
    
}

    
   


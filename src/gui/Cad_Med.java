/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import dados.Mat;
import dados.Med;
import dao.Conexao;
import dao.Med_DAO;
import javax.swing.JOptionPane;
/**
 *
 * @author 277109
 */
public class Cad_Med extends javax.swing.JFrame {
  private Med medicamento = null;
   private Med_DAO medicamentoDAO = new Med_DAO();
   
   int cod_med = 0;
    /**
     * Creates new form Cad_Med
     */
    public Cad_Med() throws ClassNotFoundException, Exception {
        initComponents();
        
          cod_med   =  medicamentoDAO.recuperarcodigo().gettxt_cod_med();
        
        
        txt_cod_med.setText(String.valueOf(cod_med) ); 
        
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigo_med = new javax.swing.JLabel();
        desc_med = new javax.swing.JLabel();
        valor_med = new javax.swing.JLabel();
        qts_med = new javax.swing.JLabel();
        botao_cad_med = new javax.swing.JButton();
        txt_cod_med = new javax.swing.JTextField();
        txt_desc_med = new javax.swing.JTextField();
        txt_valor_med = new javax.swing.JTextField();
        txt_qts_med = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codigo_med.setText("Código do medicamento:");

        desc_med.setText("Descrição do medicamento:");

        valor_med.setText("Valor:");

        qts_med.setText("Quantidade:");

        botao_cad_med.setText("Cadastrar");
        botao_cad_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cad_medActionPerformed(evt);
            }
        });

        txt_cod_med.setEnabled(false);

        txt_valor_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valor_medActionPerformed(evt);
            }
        });
        txt_valor_med.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_valor_medKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigo_med)
                            .addComponent(desc_med)
                            .addComponent(qts_med)
                            .addComponent(valor_med))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_qts_med, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                    .addComponent(txt_valor_med)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_desc_med, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cod_med, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(botao_cad_med)))
                .addGap(0, 65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo_med)
                    .addComponent(txt_cod_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desc_med)
                    .addComponent(txt_desc_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qts_med)
                    .addComponent(txt_qts_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor_med)
                    .addComponent(txt_valor_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(botao_cad_med)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_valor_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valor_medActionPerformed
       if (validarForm()) {
        
         medicamento = new Med();
            medicamento.settxt_desc_med(txt_desc_med.getText().trim());
            medicamento.setqts_med((int)txt_qts_med.getValue());
            medicamento.settxt_valor_med(Double.parseDouble(txt_valor_med.getText()));

          
                try {
                    medicamentoDAO.inserir(medicamento);
                    
                    JOptionPane.showMessageDialog(this,"Dados Inseridos com sucesso");
                    
                    cod_med = cod_med + 1; 
                    
                     txt_cod_med.setText(String.valueOf(txt_cod_med));
                    
                        txt_valor_med.setText("");
                        txt_desc_med.setText("");
                     txt_qts_med.setValue(1);
                     
                  
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao inserir o produto.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }    
          
         }   
    }                                        

   private boolean validarForm() {
        
        // verificando se os campos estão preenchidos
        if ( txt_desc_med.getText().isEmpty()){
              JOptionPane.showMessageDialog(this, "Preencha o campo Produto.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_desc_med.requestFocus();
            return false;
        }
        
        
        if (txt_valor_med.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe um preço para o produto.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_valor_med.requestFocus();
            return false;
        }
        
        // campo quantidade não precisa verificar pois por padrão já inicia com 1
   
        // validadndo os dados preenchidos pelos usúarios
        
        // campo JTextField 
        
        if (txt_desc_med.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "Nome do produto inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_desc_med.requestFocus();
            return false;
        }
        
        // campo JFormattedTextField
        
       if (Double.parseDouble(txt_valor_med.getText()) <= 0) {
         
             
            JOptionPane.showMessageDialog(this, "Preço inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_valor_med.requestFocus();
            return false;
        }
          // campo JSpinner
        if (((int) txt_qts_med.getValue())  <= 0) {
            JOptionPane.showMessageDialog(this, "Quantidade de produto inválida", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_qts_med.requestFocus();
            return false;
        }
        return true; // TODO add your handling code here:
    }//GEN-LAST:event_txt_valor_medActionPerformed

    private void txt_valor_medKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_valor_medKeyTyped
     String caracteres="0987654321.";
       if(!caracteres.contains(evt.getKeyChar()+"")){
       evt.consume();
}
    }//GEN-LAST:event_txt_valor_medKeyTyped

    private void botao_cad_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cad_medActionPerformed
        
        if (validarForm()) {
        
         medicamento = new Med();
            medicamento.settxt_desc_med(txt_desc_med.getText().trim());
            medicamento.setqts_med((int) txt_qts_med.getValue());
            medicamento.settxt_valor_med(Double.parseDouble(txt_valor_med.getText()));

          
                try {
                   medicamentoDAO.inserir(medicamento);
                    
                    JOptionPane.showMessageDialog(this,"Dados Inseridos com sucesso");
                    
                    cod_med = cod_med + 1; 
                    
                     txt_cod_med.setText(String.valueOf(cod_med));
                    
                        txt_valor_med.setText("");
                        txt_desc_med.setText("");
                     txt_qts_med.setValue(1);
                     
                  
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao inserir o produto.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }    
          
         }   
    }//GEN-LAST:event_botao_cad_medActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_cad_med;
    private javax.swing.JLabel codigo_med;
    private javax.swing.JLabel desc_med;
    private javax.swing.JLabel qts_med;
    private javax.swing.JTextField txt_cod_med;
    private javax.swing.JTextField txt_desc_med;
    private javax.swing.JSpinner txt_qts_med;
    private javax.swing.JTextField txt_valor_med;
    private javax.swing.JLabel valor_med;
    // End of variables declaration//GEN-END:variables
}

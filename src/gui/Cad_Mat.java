/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dados.Mat;
import dao.Conexao;
import dao.Mat_DAO;
import javax.swing.JOptionPane;

/**
 *
 * @author 277109
 */
public class Cad_Mat extends javax.swing.JFrame {

    
    private Mat material = null;
   private Mat_DAO materialDAO = new Mat_DAO();
   
   int cod_mat = 0;
   // variavel código, controlar o próximo código a ser apresentado na tela
        
    /**
     * Creates new form Cad_Prod
     */
    public Cad_Mat() throws ClassNotFoundException, Exception {
        initComponents();
        
          cod_mat   =  materialDAO.recuperarcodigo().gettxt_cod();
        
        
        txt_cod.setText(String.valueOf(cod_mat) ); 
        
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        txt_desc = new javax.swing.JTextField();
        txt_valor = new javax.swing.JTextField();
        qts_mat = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código material:");

        jLabel2.setText("Descrição do material:");

        jLabel3.setText("Quantidade:");

        jLabel4.setText("Valor:");

        txt_cod.setEnabled(false);

        txt_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_valorKeyTyped(evt);
            }
        });

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(96, 96, 96)
                                .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qts_mat, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jButton1)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(qts_mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_valorKeyTyped
       String caracteres="0987654321.";
       if(!caracteres.contains(evt.getKeyChar()+"")){
       evt.consume();
}        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valorKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        if (validarForm()) {
        
         material = new Mat();
            material.settxt_desc(txt_desc.getText().trim());
            material.setqts_mat((int) qts_mat.getValue());
            material.settxt_valor(Double.parseDouble(txt_valor.getText()));

          
                try {
                    materialDAO.inserir(material);
                    
                    JOptionPane.showMessageDialog(this,"Dados Inseridos com sucesso");
                    
                    cod_mat = cod_mat + 1; 
                    
                     txt_cod.setText(String.valueOf(cod_mat));
                    
                        txt_valor.setText("");
                        txt_desc.setText("");
                     qts_mat.setValue(1);
                     
                  
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao inserir o produto.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }    
          
         }   
    }//GEN-LAST:event_jButton1ActionPerformed

   private boolean validarForm() {
        
        // verificando se os campos estão preenchidos
        if ( txt_desc.getText().isEmpty()){
              JOptionPane.showMessageDialog(this, "Preencha o campo Produto.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_desc.requestFocus();
            return false;
        }
        
        
        if (txt_valor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe um preço para o produto.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_valor.requestFocus();
            return false;
        }
        
        // campo quantidade não precisa verificar pois por padrão já inicia com 1
   
        // validadndo os dados preenchidos pelos usúarios
        
        // campo JTextField 
        
        if (txt_desc.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "Nome do produto inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_desc.requestFocus();
            return false;
        }
        
        // campo JFormattedTextField
        
       if (Double.parseDouble(txt_valor.getText()) <= 0) {
         
             
            JOptionPane.showMessageDialog(this, "Preço inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_valor.requestFocus();
            return false;
        }
          // campo JSpinner
        if (((int) qts_mat.getValue())  <= 0) {
            JOptionPane.showMessageDialog(this, "Quantidade de produto inválida", "Alerta", JOptionPane.WARNING_MESSAGE);
            qts_mat.requestFocus();
            return false;
        }
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner qts_mat;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextField txt_desc;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
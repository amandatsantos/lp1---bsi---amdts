/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package invoice;
import javax.swing.JOptionPane;
import invoice.Invoice;


/**
 *
 * @author tavar
 */
public class InvoiceTela extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceTela
     */
    public InvoiceTela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        numero_invoice = new javax.swing.JLabel();
        quant_comprada_item_invoice = new javax.swing.JLabel();
        descricao_invoice = new javax.swing.JLabel();
        preco_item_invoice = new javax.swing.JLabel();
        quant_comprada_item = new javax.swing.JSpinner();
        numero = new javax.swing.JTextField();
        preco_item = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        descricao = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        numero_invoice.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        numero_invoice.setText("Número :");

        quant_comprada_item_invoice.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        quant_comprada_item_invoice.setText("Quantidade de Itens :");

        descricao_invoice.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        descricao_invoice.setText("Descrição : ");

        preco_item_invoice.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        preco_item_invoice.setText("Preço:");

        quant_comprada_item.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        numero.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });

        preco_item.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        preco_item.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        preco_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preco_itemActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Informação ");

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setText("consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        descricao.setText("jTextField1");
        descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(preco_item_invoice)
                                .addGap(86, 86, 86)
                                .addComponent(preco_item))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(quant_comprada_item_invoice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quant_comprada_item))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(descricao_invoice)
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(numero_invoice))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero_invoice)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricao_invoice)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quant_comprada_item_invoice)
                    .addComponent(quant_comprada_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preco_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preco_item_invoice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(50, 50, 50))
        );

        preco_item.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroActionPerformed

    private void preco_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preco_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preco_itemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//         Invoice v1 = new Invoice("xxxx",  "parafuso", 5 ,  20.0) ;
//         JOptionPane.showMessageDialog(null, " informações da compra \n"+ v1.getDescricao()+ 
//                "\n"+v1.getNumero() + "\n" + v1.getPreco_item() +"\n"+ v1.getQuant_compradada_item()+"\n"+ v1.getInvoiceAmout());
//            String descricao_invoice = descricao.getText();
//            String numero_invoice = numero.getText();
//            String  preco_item_invoice = preco_item.getText();
//            String quant_comprada_item_invoice = quant_comprada_item.();
            
//            if(btnCalculo.getText().length() > 0){
//           
//           Invoice i1 = new Invoice();
//        
//        i1.setNum(textNum.getText());
//        i1.setDesc(textDesc.getText());
//        i1.setPreco(Double.parseDouble(textPreco.getText()));
//        i1.setQt((Integer)spinnerQt.getValue());
//        
//        
//         JOptionPane.showMessageDialog(null,"Numero: " + i1.getNum() + "\nDescrição: " + i1.getDesc() + 
//                "\nQuantidade: " + i1.getQt()+ "\nPreço: " + i1.getPreco() + "\nResultado: " + i1.getInvoiceAmount());
//       } else{
//           JOptionPane.showMessageDialog(null,"Inválido");
//       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InvoiceTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField descricao;
    private javax.swing.JLabel descricao_invoice;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField numero;
    private javax.swing.JLabel numero_invoice;
    private javax.swing.JTextField preco_item;
    private javax.swing.JLabel preco_item_invoice;
    private javax.swing.JSpinner quant_comprada_item;
    private javax.swing.JLabel quant_comprada_item_invoice;
    // End of variables declaration//GEN-END:variables
}
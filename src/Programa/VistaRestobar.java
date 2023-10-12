package Programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VistaRestobar extends javax.swing.JFrame {
    ConexionDB conSQL = new ConexionDB();

    private final JComboBox<String> cmbBebidas;

    public VistaRestobar() {
        initComponents();
        lblIdMesa.setVisible(false);lblIdMesa.setBounds(10, 10, 100, 20);
        txtIdMesa.setVisible(false);txtIdMesa.setBounds(120, 10, 150, 20);
        lblPedidoMesa.setVisible(false);
        txtPedidoMesa.setVisible(false);txtPedidoMesa.setBounds(240, 10, 120, 20);
        txtIdPedido.setVisible(false);txtIdPedido.setBounds(240, 10, 120, 20);
        cmbBebidas = new JComboBox<>(new String[]{"Agua", "Coca-cola", "Fanta", "Sprite", "Café", "Café con leche", "Cortado", "Lágrima"});
        getContentPane().add(cmbBebidas);
        cmbBebidas.setBounds(100, 150, 150, 30);
        cmbBebidas.setVisible(false);
        lblProducto.setVisible(false);
        btnProductoBebidas.setVisible(false); 
        btnProductoPlatos.setVisible(false);
        btnProductoPostres.setVisible(false); 
        btnVolver.setVisible(false);
        btnGuardarMesa.setVisible(false);
        btnGuardarMesa.setBackground(new java.awt.Color(255, 153, 0));
        btnGuardarMesa.setBounds(10, 100, 110, 30);
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearPedido = new javax.swing.JButton();
        btnCrearMesa = new javax.swing.JButton();
        btnAgregarPedido = new javax.swing.JButton();
        lblProducto = new javax.swing.JLabel();
        lblIdMesa = new javax.swing.JLabel();
        txtIdMesa = new javax.swing.JTextField();
        lblPedidoMesa = new javax.swing.JLabel();
        txtPedidoMesa = new javax.swing.JTextField();
        btnProductoBebidas = new javax.swing.JButton();
        btnProductoPlatos = new javax.swing.JButton();
        btnProductoPostres = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtIdPedido = new javax.swing.JTextField();
        btnGuardarMesa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tito Restobar");
        setBackground(new java.awt.Color(0, 102, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N

        btnCrearPedido.setBackground(new java.awt.Color(255, 153, 0));
        btnCrearPedido.setText("Crear Pedido");
        btnCrearPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPedidoActionPerformed(evt);
            }
        });

        btnCrearMesa.setBackground(new java.awt.Color(255, 153, 0));
        btnCrearMesa.setText("Crear Mesa");
        btnCrearMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMesaActionPerformed(evt);
            }
        });

        btnAgregarPedido.setBackground(new java.awt.Color(255, 153, 0));
        btnAgregarPedido.setText("Agregar Pedido a Mesa");
        btnAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPedidoActionPerformed(evt);
            }
        });

        lblProducto.setText("Agregar Producto: ");

        lblIdMesa.setText("Agregar Id:");

        txtIdMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdMesaActionPerformed(evt);
            }
        });

        lblPedidoMesa.setText("Ingresar Id de Mesa: ");

        txtPedidoMesa.setText("Id de Mesa:");
        txtPedidoMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPedidoMesaActionPerformed(evt);
            }
        });

        btnProductoBebidas.setBackground(new java.awt.Color(255, 153, 0));
        btnProductoBebidas.setText("Bebidas");
        btnProductoBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoBebidasActionPerformed(evt);
            }
        });

        btnProductoPlatos.setBackground(new java.awt.Color(255, 153, 0));
        btnProductoPlatos.setText("Platos");
        btnProductoPlatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoPlatosActionPerformed(evt);
            }
        });

        btnProductoPostres.setBackground(new java.awt.Color(255, 153, 0));
        btnProductoPostres.setText("Postres");
        btnProductoPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoPostresActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(255, 153, 0));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtIdPedido.setText("Agregar Id: ");
        txtIdPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPedidoActionPerformed(evt);
            }
        });

        btnGuardarMesa.setText("Guardar");
        btnGuardarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtIdMesa)
                    .addComponent(btnCrearMesa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIdMesa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearPedido)
                            .addComponent(lblProducto)
                            .addComponent(txtIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPedidoMesa)
                            .addComponent(btnAgregarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPedidoMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProductoPostres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(btnProductoPlatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProductoBebidas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearMesa)
                    .addComponent(btnCrearPedido)
                    .addComponent(btnAgregarPedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPedidoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPedidoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnProductoBebidas)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProductoPlatos)
                    .addComponent(btnGuardarMesa))
                .addGap(18, 18, 18)
                .addComponent(btnProductoPostres)
                .addGap(18, 18, 18)
                .addComponent(btnVolver)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPedidoActionPerformed
        if(btnCrearPedido.isEnabled()){
        lblProducto.setVisible(true);
        txtIdPedido.setVisible(true);
        btnProductoBebidas.setVisible(true);
        btnProductoPlatos.setVisible(true);
        btnProductoPostres.setVisible(true);
        }
    }//GEN-LAST:event_btnCrearPedidoActionPerformed

    private void btnAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPedidoActionPerformed
    if(btnAgregarPedido.isEnabled()){
        lblPedidoMesa.setVisible(true);
        txtPedidoMesa.setVisible(true);
    
        JButton btnAgregarPedidoAMesa = new JButton("Agregar");
        btnAgregarPedidoAMesa.setBackground(new java.awt.Color(255, 153, 0));
        getContentPane().add(btnAgregarPedidoAMesa);
        btnAgregarPedidoAMesa.setVisible(true);
        btnAgregarPedidoAMesa.setBounds(285, 100, 110, 30);
        
    }
    }//GEN-LAST:event_btnAgregarPedidoActionPerformed

    private void btnCrearMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMesaActionPerformed
    if(btnCrearMesa.isEnabled()){
        lblIdMesa.setVisible(true);
        txtIdMesa.setVisible(true);
        btnGuardarMesa.setVisible(true); 
    }
    }//GEN-LAST:event_btnCrearMesaActionPerformed

    private void txtPedidoMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPedidoMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPedidoMesaActionPerformed

    private void btnProductoBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoBebidasActionPerformed
        if(btnProductoBebidas.isEnabled()){
        btnProductoPlatos.setVisible(false);
        btnProductoPostres.setVisible(false);
        btnVolver.setVisible(true);
        }
    }//GEN-LAST:event_btnProductoBebidasActionPerformed

    private void btnProductoPlatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoPlatosActionPerformed
        if(btnProductoPlatos.isEnabled()){
        btnProductoBebidas.setVisible(false);
        btnProductoPostres.setVisible(false);
        btnVolver.setVisible(true);
        }
    }//GEN-LAST:event_btnProductoPlatosActionPerformed

    private void btnProductoPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoPostresActionPerformed
        if(btnProductoPostres.isEnabled()){
        btnProductoPlatos.setVisible(false);
        btnProductoBebidas.setVisible(false);
        btnVolver.setVisible(true);
        }
    }//GEN-LAST:event_btnProductoPostresActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if(btnVolver.isEnabled()){
        btnProductoBebidas.setVisible(true);
        btnProductoPlatos.setVisible(true);
        btnProductoPostres.setVisible(true);
        btnVolver.setVisible(false);
        }
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtIdPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPedidoActionPerformed

    private void txtIdMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdMesaActionPerformed
        // Obtén el valor del campo de texto
        String idMesa = txtIdMesa.getText();

        System.out.println("El valor de txtIdMesa es: " + idMesa);
    }//GEN-LAST:event_txtIdMesaActionPerformed

    private void btnGuardarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMesaActionPerformed
        if(btnGuardarMesa.isEnabled()){
        String idMesa = txtIdMesa.getText();
        System.out.println("El valor de txtIdMesa es: " + idMesa);
        lblIdMesa.setVisible(false);
        txtIdMesa.setVisible(false);
        btnGuardarMesa.setVisible(false);
        }
    }//GEN-LAST:event_btnGuardarMesaActionPerformed

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
            java.util.logging.Logger.getLogger(VistaRestobar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaRestobar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaRestobar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaRestobar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaRestobar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPedido;
    private javax.swing.JButton btnCrearMesa;
    private javax.swing.JButton btnCrearPedido;
    private javax.swing.JButton btnGuardarMesa;
    private javax.swing.JButton btnProductoBebidas;
    private javax.swing.JButton btnProductoPlatos;
    private javax.swing.JButton btnProductoPostres;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblIdMesa;
    private javax.swing.JLabel lblPedidoMesa;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JTextField txtIdMesa;
    private javax.swing.JTextField txtIdPedido;
    private javax.swing.JTextField txtPedidoMesa;
    // End of variables declaration//GEN-END:variables
}

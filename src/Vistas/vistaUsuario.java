package Vistas;

import Modelo.Usuario;
import java.awt.event.KeyEvent;
import java.io.*;
import javax.swing.JOptionPane;

public class vistaUsuario extends javax.swing.JFrame {

    public vistaUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        txbNombre = new javax.swing.JTextField();
        txbApellido = new javax.swing.JTextField();
        txbDni = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Nombre:");

        lblApellido.setText("Apellido:");

        lblDni.setText("D.N.I:");

        txbApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbApellidoActionPerformed(evt);
            }
        });

        txbDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txbDniKeyPressed(evt);
            }
        });

        aceptar.setText("ACEPTAR");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblApellido)
                    .addComponent(lblNombre)
                    .addComponent(lblDni))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aceptar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txbDni)
                        .addComponent(txbApellido)
                        .addComponent(txbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txbApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni)
                    .addComponent(txbDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(aceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txbApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbApellidoActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        try {
            Usuario usuario = new Usuario(txbApellido.getText(), txbNombre.getText(), Integer.parseInt(txbDni.getText()));
            System.out.println(usuario.toString());
            File archivo = new File("//Desktop//Datos.txt");
            JOptionPane.showMessageDialog(this, "El Usuario se registro correctamente.");
            VistaLibro vl = new VistaLibro(usuario);
            vl.setVisible(true);

            this.dispose();
        } catch (NumberFormatException e) {

        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void txbDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbDniKeyPressed
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                Usuario usuario = new Usuario(txbNombre.getText(),txbApellido.getText(), Integer.parseInt(txbDni.getText()));
                System.out.println(usuario.toString());
                File archivo = new File("//Desktop//Datos.txt");
                JOptionPane.showMessageDialog(this, "El Usuario se registro correctamente.");
                VistaLibro vl = new VistaLibro(usuario);
                vl.setVisible(true);

                this.dispose();
            }

        } catch (NumberFormatException e) {

        }

    }//GEN-LAST:event_txbDniKeyPressed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(vistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txbApellido;
    private javax.swing.JTextField txbDni;
    private javax.swing.JTextField txbNombre;
    // End of variables declaration//GEN-END:variables
}

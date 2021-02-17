/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaProyectoFinal;

import Controlador.CtrlLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author Paccha
 */
public class IngresoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form IngresoUsuario
     */
    public IngresoUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(280, 235);
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
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseñá = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Ingresar Usuario: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 60, 99, 16);

        jLabel2.setText("Ingresar clave:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 100, 80, 16);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(150, 60, 90, 24);

        txtContraseñá.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñáActionPerformed(evt);
            }
        });
        getContentPane().add(txtContraseñá);
        txtContraseñá.setBounds(150, 100, 90, 24);

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 150, 58, 30);

        jLabel4.setText("SISTEMA ACADEMICO GESTOR DE NOTAS ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 20, 260, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraseñáActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñáActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñáActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        CtrlLogin D = new CtrlLogin();
       if(D.comprobarCuenta()){
            if(  D.Autenticacion(txtUsuario.getText(), txtContraseñá.getText())){
           this.setVisible(false);
           AgregarAlumnosMateria AM = new AgregarAlumnosMateria();
           AM.setVisible(true);   
        }else{
            JOptionPane.showMessageDialog(null, "Credenciales Incorrectas");
        }
       }else{
            this.setVisible(false);
            AgregarAlumnosMateria AM = new AgregarAlumnosMateria();
            AM.setVisible(true);   
       }
       
       
    
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(IngresoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtContraseñá;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

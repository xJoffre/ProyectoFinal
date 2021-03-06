/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaProyectoFinal;


import Controlador.CtrlLogin;
import java.awt.Toolkit;

/**
 *
 * @author Paccha
 */
public class VistaRegistro extends javax.swing.JFrame {

    /**
     * Creates new form VistaRegistro
     */
    public VistaRegistro() {
        initComponents();
        jbtRegistrarUsuario.setEnabled(false);

    }

     public void confirmaringreso() {
        if (txtNombre.getText().isEmpty()) {
            labelnombre.setText("CAMPO NECESARIO");
        } else {
            labelnombre.setText("");
        }
        if (txtApellido.getText().isEmpty()) {
            labelapellido.setText("CAMPO NECESARIO");
        } else {
            labelapellido.setText("");
        }
        if (txtUsuario.getText().isEmpty()) {
            labelusuario.setText("CAMPO NECESARIO");
        } else {
            labelusuario.setText("");
        }
        if (txtClave.getText().isEmpty()) {
            labelcontraseña.setText("CAMPO NECESARIO");
        } else {
            labelcontraseña.setText("");
        }

        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty()
                || txtUsuario.getText().isEmpty() || txtClave.getText().isEmpty()) {
            jbtRegistrarUsuario.setEnabled(false);
        } else {
            jbtRegistrarUsuario.setEnabled(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtRegistrarUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        labelnombre = new javax.swing.JLabel();
        labelapellido = new javax.swing.JLabel();
        labelusuario = new javax.swing.JLabel();
        labelcontraseña = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jbtRegistrarUsuario.setText("Registrar");
        jbtRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRegistrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jbtRegistrarUsuario);
        jbtRegistrarUsuario.setBounds(190, 260, 63, 24);

        jLabel1.setText("Nombre: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 50, 51, 20);

        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 90, 47, 20);

        jLabel6.setText("Registre nombre de Usuario:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 150, 170, 35);

        jLabel7.setText("Registre Clave:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 200, 84, 16);

        jLabel8.setText("REGISTRO DOCENTE");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(170, 10, 170, 26);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(100, 50, 180, 30);

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellido);
        txtApellido.setBounds(100, 90, 180, 30);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(180, 154, 98, 30);

        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClaveKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaveKeyTyped(evt);
            }
        });
        getContentPane().add(txtClave);
        txtClave.setBounds(180, 200, 98, 30);

        labelnombre.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        labelnombre.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(labelnombre);
        labelnombre.setBounds(300, 60, 140, 20);

        labelapellido.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        labelapellido.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(labelapellido);
        labelapellido.setBounds(300, 100, 140, 20);

        labelusuario.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        labelusuario.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(labelusuario);
        labelusuario.setBounds(300, 160, 130, 20);

        labelcontraseña.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        labelcontraseña.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(labelcontraseña);
        labelcontraseña.setBounds(300, 210, 130, 21);

        setSize(new java.awt.Dimension(488, 352));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jbtRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRegistrarUsuarioActionPerformed

        CtrlLogin D = new CtrlLogin();
        D.crearDocente(txtNombre.getText(), txtApellido.getText(), txtUsuario.getText(), txtClave.getText());
        D.GuardarFichero();
        this.setVisible(false);
        Login L = new Login();
        L.setVisible(true);
    }//GEN-LAST:event_jbtRegistrarUsuarioActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
        confirmaringreso();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        // TODO add your handling code here:
        confirmaringreso();
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        // TODO add your handling code here:
        confirmaringreso();
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void txtClaveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyReleased
        // TODO add your handling code here:
        confirmaringreso();
    }//GEN-LAST:event_txtClaveKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (txtNombre.getText().length() >= 30) {
            evt.consume();

        }
        if (Character.isDigit(validar)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            labelnombre.setText("Solo letras");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (txtApellido.getText().length() >= 30) {
            evt.consume();

        }
        if (Character.isDigit(validar)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            labelapellido.setText("Solo letras");
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() >= 32 && evt.getKeyChar() <= 32) {
            evt.consume();
            labelusuario.setText("Sin espacios");
        } else {
            labelusuario.setText("");
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() >= 32 && evt.getKeyChar() <= 32) {
            evt.consume();
            labelcontraseña.setText("Sin espacios");
        } else {
            labelcontraseña.setText("");
        }
    }//GEN-LAST:event_txtClaveKeyTyped

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
            java.util.logging.Logger.getLogger(VistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbtRegistrarUsuario;
    private javax.swing.JLabel labelapellido;
    private javax.swing.JLabel labelcontraseña;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JLabel labelusuario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

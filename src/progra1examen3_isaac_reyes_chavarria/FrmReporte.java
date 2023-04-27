package progra1examen3_isaac_reyes_chavarria;

public class FrmReporte extends javax.swing.JFrame {

    
    public FrmReporte() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lconcarro = new javax.swing.JLabel();
        lsincarro = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tcodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setText("producto inactivo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 190, 170, 50);

        jLabel3.setText("producto activo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 140, 150, 50);

        lconcarro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lconcarro.setForeground(new java.awt.Color(204, 0, 0));
        lconcarro.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(lconcarro);
        lconcarro.setBounds(120, 150, 130, 30);

        lsincarro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lsincarro.setForeground(new java.awt.Color(255, 0, 0));
        lsincarro.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(lsincarro);
        lsincarro.setBounds(120, 200, 130, 30);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 330, 110, 30);
        getContentPane().add(tcodigo);
        tcodigo.setBounds(120, 260, 130, 22);

        jLabel5.setText("Buscar por codigo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 250, 120, 40);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("REPORTES");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 60, 330, 60);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        bbuscar.setText("Buscar");
        bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuscarActionPerformed(evt);
            }
        });
        jPanel2.add(bbuscar);
        bbuscar.setBounds(210, 200, 150, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 130, 430, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.hide();
      
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
       lconcarro.setText(String.valueOf(ClsInventario.getsiactivo()));
       lsincarro.setText(String.valueOf(ClsInventario.getnoactivo()));
        
    }//GEN-LAST:event_formWindowActivated

    private void bbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbuscarActionPerformed
       ClsInventario.Buscarcodigo(tcodigo.getText());
        
    }//GEN-LAST:event_bbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lconcarro;
    private javax.swing.JLabel lsincarro;
    private javax.swing.JTextField tcodigo;
    // End of variables declaration//GEN-END:variables
}

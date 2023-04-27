
package progra1examen3_isaac_reyes_chavarria;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class formulario extends javax.swing.JFrame {

   ClsInventario encuesta = new ClsInventario();
   DefaultTableModel modeloTabla = new DefaultTableModel();
   boolean activo = false;

    public formulario() {
        initComponents();
        String[] columnas = new String[]{"CODIGO:", "CANTIDAD:", "DESCRIPCION:","ESTA ACTIVO", "TIPO"};
        modeloTabla.setColumnIdentifiers(columnas);
        TablaEncuesta.setModel(modeloTabla);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tcantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tcodigo = new javax.swing.JTextField();
        rsi = new javax.swing.JRadioButton();
        rno = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tdescripcion = new javax.swing.JTextField();
        lnumero = new javax.swing.JLabel();
        bagregar = new javax.swing.JButton();
        bborrar = new javax.swing.JButton();
        bmodificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEncuesta = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ctipo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setText("ACTIVO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 100, 90, 20);
        jPanel1.add(tcantidad);
        tcantidad.setBounds(120, 110, 80, 22);

        jLabel3.setText("CODIGO:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 60, 90, 40);
        jPanel1.add(tcodigo);
        tcodigo.setBounds(100, 70, 130, 22);

        buttonGroup1.add(rsi);
        rsi.setSelected(true);
        rsi.setText("SI");
        rsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsiActionPerformed(evt);
            }
        });
        jPanel1.add(rsi);
        rsi.setBounds(370, 120, 40, 21);

        buttonGroup1.add(rno);
        rno.setText("NO");
        jPanel1.add(rno);
        rno.setBounds(420, 120, 50, 21);

        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 330, 130, 40);

        jLabel4.setText("DESCRIPCION:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 60, 90, 40);
        jPanel1.add(tdescripcion);
        tdescripcion.setBounds(340, 70, 230, 22);

        lnumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lnumero.setForeground(new java.awt.Color(255, 0, 0));
        lnumero.setIcon(new javax.swing.ImageIcon("C:\\Users\\isaac\\OneDrive\\Imágenes\\CONTA2.png")); // NOI18N
        lnumero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lnumero);
        lnumero.setBounds(500, 0, 180, 60);

        bagregar.setText("Agregar");
        bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagregarActionPerformed(evt);
            }
        });
        jPanel1.add(bagregar);
        bagregar.setBounds(20, 330, 100, 40);

        bborrar.setText("Borrar");
        bborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bborrarActionPerformed(evt);
            }
        });
        jPanel1.add(bborrar);
        bborrar.setBounds(150, 330, 100, 40);

        bmodificar.setText("Modifcar");
        bmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(bmodificar);
        bmodificar.setBounds(280, 330, 110, 40);

        TablaEncuesta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(TablaEncuesta);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 170, 490, 130);

        jLabel8.setText("CONTIDAD:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 100, 90, 40);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel5.setText("CONTROL DE INVENTARIO");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 10, 170, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 270, 50);

        ctipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DESECHABLES", "COMESTIBLES", "ABARROTES", "ROPA" }));
        jPanel1.add(ctipo);
        ctipo.setBounds(230, 120, 120, 22);

        jLabel10.setText("TIPO:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(250, 100, 50, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 740, 450);

        jMenu2.setText("Inicio");

        jMenuItem1.setText("Reportes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      
       this.show();
      lnumero.setText(String.valueOf(encuesta.getConsecutivo()));
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
      if (!tcantidad.getText().equals("") && !tcodigo.getText().equals("") && !tdescripcion.getText().equals(""))
        {
            
            if ( (Integer.parseInt(tcantidad.getText())< 0) || (Integer.parseInt(tcantidad.getText())>500000)  ) 
           {
              JOptionPane.showMessageDialog(null, "SOLO CANTIDAD POSITIVA");
           } 
            else 
           {
              ConsultaDeVehiculo();
              Insertar();
               
           encuesta.SetSalvarDatos(tcodigo.getText(), activo, Integer.parseInt(tcantidad.getText()), tdescripcion.getText());
           lnumero.setText(String.valueOf(ClsInventario.getConsecutivo()));
          
          } 
                
        tcodigo.setText("");
        tcantidad.setText("");
        tdescripcion.setText("");
        rsi.setSelected(true);
        } 
        else {
        JOptionPane.showMessageDialog(null, "Los campos estan en vacios");
        
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void ConsultaDeVehiculo()
    {
        if (rsi.isSelected()) 
               {
                   activo = true;
                   encuesta.setsiactivo();
               } else if (rno.isSelected())
               {
                   activo = false;
                   encuesta.setnoactivo();
               }
    }
    
    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        
    }//GEN-LAST:event_jButton1MouseEntered

    public void Modificar(){
        String mensaje = "";
        int fila = TablaEncuesta.getSelectedRow();
        modeloTabla.setValueAt(tcodigo.getText(), fila, 0);
         modeloTabla.setValueAt(tcantidad.getText(), fila, 1);
          modeloTabla.setValueAt(tdescripcion.getText(), fila, 2);

          
          if (rsi.isSelected()) 
                  mensaje = "Si";
               else if (rno.isSelected())
                   mensaje = "No";
          modeloTabla.setValueAt(mensaje, fila, 3);
          
    }
    
    public void Borrar() {
        int fila = TablaEncuesta.getSelectedRow();
       modeloTabla.removeRow(fila);
    }

    public void Insertar() 
    {
        String mensaje ="";
        if (activo == true) 
            mensaje= rsi.getText();
         else mensaje= rno.getText();
        
       modeloTabla.addRow(new Object[] {tcodigo.getText(),tcantidad.getText(),tdescripcion.getText(),mensaje});
    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          FrmReporte reporte = new FrmReporte();
          reporte.setSize(700, 500);
          reporte.setVisible(true);
          
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void bagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagregarActionPerformed
        Insertar();
    }//GEN-LAST:event_bagregarActionPerformed

    private void bmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodificarActionPerformed
       Modificar();
    }//GEN-LAST:event_bmodificarActionPerformed

    private void bborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bborrarActionPerformed
       Borrar();
    }//GEN-LAST:event_bborrarActionPerformed

    private void rsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rsiActionPerformed

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
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEncuesta;
    private javax.swing.JButton bagregar;
    private javax.swing.JButton bborrar;
    private javax.swing.JButton bmodificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> ctipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lnumero;
    private javax.swing.JRadioButton rno;
    private javax.swing.JRadioButton rsi;
    private javax.swing.JTextField tcantidad;
    private javax.swing.JTextField tcodigo;
    private javax.swing.JTextField tdescripcion;
    // End of variables declaration//GEN-END:variables
}

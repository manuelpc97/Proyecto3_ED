
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dennis
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jframe_Propiedades = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cb_Material_coneccion = new javax.swing.JComboBox<>();
        tf_Ancho_de_banda = new javax.swing.JTextField();
        tf_Nombre_coneccion = new javax.swing.JTextField();
        tf_Longitud_Cable = new javax.swing.JTextField();
        bt_crearInstalacion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bt_redDomestic = new javax.swing.JButton();
        bt_redEmpresarial = new javax.swing.JButton();
        bt_ImportarMapadeRed = new javax.swing.JButton();
        bt_AntenaCelular = new javax.swing.JButton();
        bt_coneccionDedicadal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bt_ExportarMapadeRed = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        Jframe_Propiedades.setName("Propiedades"); // NOI18N

        jLabel3.setText("Material del Cable");

        jLabel4.setText("Longitud del Cable");

        jLabel5.setText("Ancho de Banda Soportado");

        jLabel6.setText("Nombre de Conexion");

        cb_Material_coneccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cobre", "Fibra Optica" }));

        bt_crearInstalacion.setText("Crear");
        bt_crearInstalacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearInstalacionMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Propiedades del Repetidor");

        jLabel8.setText("Metros");

        jLabel9.setText("Mb/s");

        javax.swing.GroupLayout Jframe_PropiedadesLayout = new javax.swing.GroupLayout(Jframe_Propiedades.getContentPane());
        Jframe_Propiedades.getContentPane().setLayout(Jframe_PropiedadesLayout);
        Jframe_PropiedadesLayout.setHorizontalGroup(
            Jframe_PropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jframe_PropiedadesLayout.createSequentialGroup()
                .addGroup(Jframe_PropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Jframe_PropiedadesLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(Jframe_PropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Jframe_PropiedadesLayout.createSequentialGroup()
                                .addGroup(Jframe_PropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Jframe_PropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Jframe_PropiedadesLayout.createSequentialGroup()
                                        .addComponent(tf_Ancho_de_banda, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))
                                    .addComponent(cb_Material_coneccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_Nombre_coneccion, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Jframe_PropiedadesLayout.createSequentialGroup()
                                        .addComponent(tf_Longitud_Cable, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))))
                            .addComponent(bt_crearInstalacion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 116, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Jframe_PropiedadesLayout.setVerticalGroup(
            Jframe_PropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jframe_PropiedadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(36, 36, 36)
                .addGroup(Jframe_PropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_Nombre_coneccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Jframe_PropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_Material_coneccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Jframe_PropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_Ancho_de_banda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Jframe_PropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Longitud_Cable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(bt_crearInstalacion)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TOGO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        bt_redDomestic.setText("  Red Domestica");
        bt_redDomestic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_redDomesticMouseClicked(evt);
            }
        });

        bt_redEmpresarial.setText(" Red Empresarial");
        bt_redEmpresarial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_redEmpresarialMouseClicked(evt);
            }
        });

        bt_ImportarMapadeRed.setText("Importar mapa de Red");

        bt_AntenaCelular.setText(" Antena Celular");
        bt_AntenaCelular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_AntenaCelularMouseClicked(evt);
            }
        });

        bt_coneccionDedicadal.setText("Conexión Dedicada");
        bt_coneccionDedicadal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_coneccionDedicadalMouseClicked(evt);
            }
        });

        jLabel2.setText("Crear Repetidor de:");

        bt_ExportarMapadeRed.setText("Exportar Mapa de Red");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bt_ImportarMapadeRed))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_AntenaCelular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_coneccionDedicadal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_redEmpresarial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_redDomestic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_ExportarMapadeRed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(bt_redDomestic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_redEmpresarial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_coneccionDedicadal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_AntenaCelular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(bt_ExportarMapadeRed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_ImportarMapadeRed)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt_AntenaCelular, bt_coneccionDedicadal, bt_redDomestic, bt_redEmpresarial});

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_redDomesticMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_redDomesticMouseClicked
        this.mostrarventanaPropiedades();
        this.limpiarPropiedadesdeConeccion();
        this.tipoPunto = 1;
    }//GEN-LAST:event_bt_redDomesticMouseClicked

    private void bt_crearInstalacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearInstalacionMouseClicked
        boolean correcto = true;
        int anchoBanda = 0;
        if (this.cb_Material_coneccion.getSelectedItem().equals("Cobre")) {
            if (Integer.parseInt(this.tf_Ancho_de_banda.getText()) > 100 || Integer.parseInt(this.tf_Ancho_de_banda.getText()) <= 0) {
                correcto = false;
                JOptionPane.showMessageDialog(this, "Ancho de banda no permitido para Cable de Cobre");
            }
        } else {
            if (Integer.parseInt(this.tf_Ancho_de_banda.getText()) > 10240 || Integer.parseInt(this.tf_Ancho_de_banda.getText()) <= 0) {
                correcto = false;
                JOptionPane.showMessageDialog(this, "Ancho de banda no permitido para Cable de Fibra Optica");
            }
        }

        if (correcto) {
            String nombre = this.tf_Nombre_coneccion.getText();
            int materialConexion = this.cb_Material_coneccion.getSelectedIndex() + 1;
            int longitudCable = Integer.parseInt(this.tf_Longitud_Cable.getText());
            anchoBanda = Integer.parseInt(this.tf_Ancho_de_banda.getText());
            Instalacion nuevaInstalacion = new Instalacion(nombre, tipoPunto, materialConexion, longitudCable, anchoBanda);
            this.listaInstalaciones.insert(nuevaInstalacion, 0);
            JOptionPane.showMessageDialog(null, "Conexion Agregada");
            this.Jframe_Propiedades.setVisible(false);
        } else {
            this.limpiarPropiedadesdeConeccion();
        }

    }//GEN-LAST:event_bt_crearInstalacionMouseClicked

    private void bt_redEmpresarialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_redEmpresarialMouseClicked
        this.mostrarventanaPropiedades();
        this.limpiarPropiedadesdeConeccion();
        this.limpiarPropiedadesdeConeccion();
        this.tipoPunto = 2;
    }//GEN-LAST:event_bt_redEmpresarialMouseClicked

    private void bt_coneccionDedicadalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_coneccionDedicadalMouseClicked
        this.mostrarventanaPropiedades();
        this.limpiarPropiedadesdeConeccion();
        this.tipoPunto = 4;
    }//GEN-LAST:event_bt_coneccionDedicadalMouseClicked

    private void bt_AntenaCelularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AntenaCelularMouseClicked
        this.mostrarventanaPropiedades();
        this.limpiarPropiedadesdeConeccion();
        this.tipoPunto = 3;
    }//GEN-LAST:event_bt_AntenaCelularMouseClicked
    private void mostrarventanaPropiedades() {
        this.Jframe_Propiedades.pack();
        this.Jframe_Propiedades.setLocationRelativeTo(this);
        this.Jframe_Propiedades.setVisible(true);
    }

    private void limpiarPropiedadesdeConeccion() {
        this.tf_Nombre_coneccion.setText("");
        this.cb_Material_coneccion.setSelectedIndex(0);
        this.tf_Ancho_de_banda.setText("");
        this.tf_Longitud_Cable.setText("");
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Jframe_Propiedades;
    private javax.swing.JButton bt_AntenaCelular;
    private javax.swing.JButton bt_ExportarMapadeRed;
    private javax.swing.JButton bt_ImportarMapadeRed;
    private javax.swing.JButton bt_coneccionDedicadal;
    private javax.swing.JButton bt_crearInstalacion;
    private javax.swing.JButton bt_redDomestic;
    private javax.swing.JButton bt_redEmpresarial;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_Material_coneccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tf_Ancho_de_banda;
    private javax.swing.JTextField tf_Longitud_Cable;
    private javax.swing.JTextField tf_Nombre_coneccion;
    // End of variables declaration//GEN-END:variables
Lista listaInstalaciones = new Lista();
    int tipoPunto;
}

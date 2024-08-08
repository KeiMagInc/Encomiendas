/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package encomiendas.views.encomiendas;

import javax.swing.JFrame;
import javax.swing.table.TableModel;

/**
 *
 * @author djimm
 */
public class JFEncomiendas extends javax.swing.JFrame {

    /**
     * Creates new form JFEncomiendas
     */
    public JFEncomiendas() {
        initComponents();
        panelInterprovincial.setVisible(false);
        panelEntregaDomicilio.setVisible(false);
        btnCrearEncomienda.setVisible(false);
        this.setLocationRelativeTo(this);
        this.setTitle("Panel de encomiendas");
    }

    JFPaquetes paquetes;
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        btnAgregarPaquete = new javax.swing.JButton();
        btnCrearEncomienda = new javax.swing.JButton();
        btnGuardarEncomienda = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVerPaquetes = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();
        panelEntregaDomicilio = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtDirEntrega = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCodPostal = new javax.swing.JTextField();
        panelInterprovincial = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jCBAgenciaDestino = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JCheckDomicilio = new javax.swing.JCheckBox();
        jCBAgenciaOrigen = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jDCFechaEnvio = new com.toedter.calendar.JDateChooser();
        txtcedulaEmisor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCedulaReceptor = new javax.swing.JTextField();
        JCheckInterprovincial = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnFiltrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTEncomiendas = new javax.swing.JTable();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 193, -1, -1));

        panelOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnAgregarPaquete.setText("Agregar paquete");
        btnAgregarPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPaqueteActionPerformed(evt);
            }
        });

        btnCrearEncomienda.setText("Crear encomienda");

        btnGuardarEncomienda.setText("Guardar encomienda");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnVerPaquetes.setText("Ver lista de paquetes");
        btnVerPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPaquetesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerPaquetes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarEncomienda, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(btnAgregarPaquete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearEncomienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnGuardarEncomienda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarPaquete)
                .addGap(12, 12, 12)
                .addComponent(btnVerPaquetes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCrearEncomienda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel2.add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 190, 210));

        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Encomienda"));

        panelEntregaDomicilio.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrega a domicilio"));

        jLabel9.setText("Dirección de entrega:");

        jLabel10.setText("Codigo postal:");

        javax.swing.GroupLayout panelEntregaDomicilioLayout = new javax.swing.GroupLayout(panelEntregaDomicilio);
        panelEntregaDomicilio.setLayout(panelEntregaDomicilioLayout);
        panelEntregaDomicilioLayout.setHorizontalGroup(
            panelEntregaDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntregaDomicilioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEntregaDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(52, 52, 52)
                .addGroup(panelEntregaDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDirEntrega)
                    .addComponent(txtCodPostal))
                .addContainerGap())
        );
        panelEntregaDomicilioLayout.setVerticalGroup(
            panelEntregaDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntregaDomicilioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEntregaDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDirEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEntregaDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(txtCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelInterprovincial.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrega interprovincial"));

        jLabel8.setText("Agencia de destino:");

        jCBAgenciaDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBAgenciaDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAgenciaDestinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInterprovincialLayout = new javax.swing.GroupLayout(panelInterprovincial);
        panelInterprovincial.setLayout(panelInterprovincialLayout);
        panelInterprovincialLayout.setHorizontalGroup(
            panelInterprovincialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInterprovincialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCBAgenciaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelInterprovincialLayout.setVerticalGroup(
            panelInterprovincialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInterprovincialLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelInterprovincialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jCBAgenciaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la encomienda"));

        jLabel11.setText("Interprovincial:");

        jLabel12.setText("Entrega a domicilio:");

        JCheckDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCheckDomicilioActionPerformed(evt);
            }
        });

        jCBAgenciaOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setText("Agencia de origen");

        jLabel14.setText("Fecha de envío:");

        txtcedulaEmisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaEmisorActionPerformed(evt);
            }
        });

        jLabel15.setText("Número de cédula del emisor");

        jLabel16.setText("Número de cédula del receptor");

        txtCedulaReceptor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaReceptorActionPerformed(evt);
            }
        });

        JCheckInterprovincial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCheckInterprovincialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JCheckInterprovincial)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel12)
                        .addGap(17, 17, 17)
                        .addComponent(JCheckDomicilio))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(16, 16, 16)
                                .addComponent(txtCedulaReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDCFechaEnvio, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(txtcedulaEmisor)
                                    .addComponent(jCBAgenciaOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(26, 26, 26)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel16))
                    .addComponent(txtCedulaReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel15))
                    .addComponent(txtcedulaEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jDCFechaEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jCBAgenciaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(JCheckDomicilio)
                    .addComponent(JCheckInterprovincial))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelInterprovincial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelEntregaDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelInterprovincial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelEntregaDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jPanel2.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 480, 600));

        jTabbedPane1.addTab("Crear encomienda", jPanel2);

        btnFiltrar.setLabel("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        jTEncomiendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"10223", "Michael", "Micos", "XD1", "XD2"},
                {"11233", "Micos", "Jimmy", "XD3", "XD5"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Encomienda", "Remitente", "Destinatario", "Agencia Origen", "Agencia Destino"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTEncomiendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTEncomiendasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTEncomiendas);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnFiltrar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar encomienda", jPanel3);

        jMenu1.setText("Archivo");
        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBAgenciaDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAgenciaDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBAgenciaDestinoActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        VentanaFiltar ventanaFiltar = new VentanaFiltar();
        ventanaFiltar.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        ventanaFiltar.setVisible(true);
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void limpiar() {
        panelInterprovincial.setVisible(false);
        panelEntregaDomicilio.setVisible(false);
        txtCedulaReceptor.setText("");
        txtCodPostal.setText("");
        txtDirEntrega.setText("");
        txtcedulaEmisor.setText("");
        jCBAgenciaDestino.setSelectedIndex(0);
        jCBAgenciaOrigen.setSelectedIndex(0);
        btnCrearEncomienda.setVisible(false);
        JCheckDomicilio.setSelected(false);
        JCheckInterprovincial.setSelected(false);
        jDCFechaEnvio.setDate(null);
    }

    private void btnGuardarEncomiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEncomiendaActionPerformed

    }//GEN-LAST:event_btnGuardarEncomiendaActionPerformed

    private void btnAddPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPaquetesActionPerformed
        btnCrearEncomienda.setVisible(true);
    }//GEN-LAST:event_btnAddPaquetesActionPerformed

    private void btnAgregarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPaqueteActionPerformed
        JFPaquetes ventanaPaquete = new JFPaquetes();
        ventanaPaquete.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        ventanaPaquete.setVisible(true);
    }//GEN-LAST:event_btnAgregarPaqueteActionPerformed

    private void btnVerListaPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void JCheckDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCheckDomicilioActionPerformed
        if (JCheckDomicilio.isSelected()) {
            panelEntregaDomicilio.setVisible(true);
        }else{
            panelEntregaDomicilio.setVisible(false);
        }
    }//GEN-LAST:event_JCheckDomicilioActionPerformed

    private void txtcedulaEmisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaEmisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaEmisorActionPerformed

    private void txtCedulaReceptorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaReceptorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaReceptorActionPerformed

    private void JCheckInterprovincialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCheckInterprovincialActionPerformed
        if (JCheckInterprovincial.isSelected()) {
            panelInterprovincial.setVisible(true);
        }else{
            panelInterprovincial.setVisible(false);
        }
    }//GEN-LAST:event_JCheckInterprovincialActionPerformed

    private void btnVerPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPaquetesActionPerformed
        JFListaPaquetes listaPaquetes = new JFListaPaquetes();
        listaPaquetes.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        listaPaquetes.setVisible(true);
    }//GEN-LAST:event_btnVerPaquetesActionPerformed

    private void jMISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTEncomiendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTEncomiendasMouseClicked
        int index = jTEncomiendas.getSelectedRow();
        TableModel model = jTEncomiendas.getModel();
        String idEncomienda = model.getValueAt(index, 0).toString();
        String remitenteE = model.getValueAt(index, 1).toString();
        String destiantarioE = model.getValueAt(index, 2).toString();
        String agenciaO = model.getValueAt(index, 3).toString();
        String agenciaD = model.getValueAt(index, 4).toString();
        
        JFInfoEncomiendas infoEncomienda = new JFInfoEncomiendas(); 
        infoEncomienda.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        infoEncomienda.setVisible(true);
        
        //encomienda.txtIDPaquete.setText(idPaquete);
       // encomienda.txtDescripPaquete.setText(descripcion);
        //encomienda.txtPesoPaquete.setText(pesoPaquete);
        //encomienda.txtVolPaquete.setText(volumenPaquete);
        //encomienda.txtPrecioPaquete.setText(precioPaquete);
        //encomienda.jCBIsFragil.setSelected(isFragil);
    }//GEN-LAST:event_jTEncomiendasMouseClicked

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
            java.util.logging.Logger.getLogger(JFEncomiendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEncomiendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEncomiendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEncomiendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEncomiendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox JCheckDomicilio;
    private javax.swing.JCheckBox JCheckInterprovincial;
    private javax.swing.JButton btnAgregarPaquete;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearEncomienda;
    public javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnGuardarEncomienda;
    private javax.swing.JButton btnVerPaquetes;
    private javax.swing.JComboBox<String> jCBAgenciaDestino;
    private javax.swing.JComboBox<String> jCBAgenciaOrigen;
    private com.toedter.calendar.JDateChooser jDCFechaEnvio;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTEncomiendas;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelEntregaDomicilio;
    private javax.swing.JPanel panelInterprovincial;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JTextField txtCedulaReceptor;
    private javax.swing.JTextField txtCodPostal;
    private javax.swing.JTextField txtDirEntrega;
    private javax.swing.JTextField txtcedulaEmisor;
    // End of variables declaration//GEN-END:variables
}

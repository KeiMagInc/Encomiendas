package encomiendas.views.usuarios;

import encomiendas.controllers.usuarios.AdministradorController;
import encomiendas.database.Conexion;
import encomiendas.model.data.usuarios.UsuarioRepository;
import encomiendas.services.usuarios.UsuarioService;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class AActualizarUsuarios extends javax.swing.JFrame {

    Conexion con = new Conexion();

    UsuarioRepository usuarioRepository;
    UsuarioService usuarioService;

    AdministradorController administradorController;

    public AActualizarUsuarios() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Actualizar lista de usuarios");


        //instancia del controlador
        usuarioRepository = new UsuarioRepository(con.getInstance());
        usuarioService = new UsuarioService(usuarioRepository);

        administradorController = new AdministradorController(this, usuarioService);

        administradorController.ListarUsuariosTable((DefaultTableModel) this.jTListaUsuarios.getModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPAMódificarUsuarios = new javax.swing.JPanel();
        jLRol = new javax.swing.JLabel();
        jLSelecciónMétodoBusqueda = new javax.swing.JLabel();
        jTFMétodoBusqueda = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLActualizarUsuarios = new javax.swing.JLabel();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jCBRol = new javax.swing.JComboBox<>();
        jLUsuarioSeleccionado = new javax.swing.JLabel();
        jTFUsuarioSeleccionado = new javax.swing.JTextField();
        jLSelecciónMétodo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListaUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPAMódificarUsuarios.setPreferredSize(new java.awt.Dimension(687, 384));

        jLRol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLRol.setText("Rol:");

        jLSelecciónMétodoBusqueda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLSelecciónMétodoBusqueda.setText("Busqueda de Usuarios:");

        jTFMétodoBusqueda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jBBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLActualizarUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLActualizarUsuarios.setText("Actualización de Usuarios");

        jBModificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBModificar.setText("Módificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jCBRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cliente", "Empleado", "Conductor" }));
        jCBRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBRolActionPerformed(evt);
            }
        });

        jLUsuarioSeleccionado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLUsuarioSeleccionado.setText("Cédula Seleccionada:");

        jTFUsuarioSeleccionado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLSelecciónMétodo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLSelecciónMétodo1.setText("Selección método:");

        jTListaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombres", "Apellidos", "Correo", "Teléfono Principal", "Rol", "Dirección ", "Ciudad", "Teléfono", "TÍpo Licencia ", "Activo ", "Id Agencia "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTListaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTListaUsuariosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTListaUsuarios);

        javax.swing.GroupLayout jPAMódificarUsuariosLayout = new javax.swing.GroupLayout(jPAMódificarUsuarios);
        jPAMódificarUsuarios.setLayout(jPAMódificarUsuariosLayout);
        jPAMódificarUsuariosLayout.setHorizontalGroup(
            jPAMódificarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAMódificarUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAMódificarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAMódificarUsuariosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLSelecciónMétodo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(jPAMódificarUsuariosLayout.createSequentialGroup()
                        .addGroup(jPAMódificarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPAMódificarUsuariosLayout.createSequentialGroup()
                                .addComponent(jLSelecciónMétodoBusqueda)
                                .addGap(18, 18, 18)
                                .addComponent(jTFMétodoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPAMódificarUsuariosLayout.createSequentialGroup()
                                .addComponent(jLUsuarioSeleccionado)
                                .addGap(18, 18, 18)
                                .addComponent(jTFUsuarioSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPAMódificarUsuariosLayout.createSequentialGroup()
                                .addComponent(jLRol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCBRol, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(137, Short.MAX_VALUE))))
            .addGroup(jPAMódificarUsuariosLayout.createSequentialGroup()
                .addGroup(jPAMódificarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAMódificarUsuariosLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLActualizarUsuarios))
                    .addGroup(jPAMódificarUsuariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPAMódificarUsuariosLayout.setVerticalGroup(
            jPAMódificarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAMódificarUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLActualizarUsuarios)
                .addGap(11, 11, 11)
                .addGroup(jPAMódificarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRol)
                    .addComponent(jCBRol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPAMódificarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSelecciónMétodoBusqueda)
                    .addComponent(jTFMétodoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPAMódificarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUsuarioSeleccionado)
                    .addComponent(jTFUsuarioSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPAMódificarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLSelecciónMétodo1)
                    .addGroup(jPAMódificarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPAMódificarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPAMódificarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBRolActionPerformed
        String rolSeleccionado = (String) jCBRol.getSelectedItem();
        try {
            administradorController.filtrarUsuariosPorRol((DefaultTableModel) this.jTListaUsuarios.getModel(), rolSeleccionado);
        } catch (SQLException ex) {
            Logger.getLogger(AListaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jCBRolActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        String cedula = jTFMétodoBusqueda.getText();
        administradorController.buscarUsuario((DefaultTableModel) this.jTListaUsuarios.getModel(), cedula);
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jTListaUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTListaUsuariosMousePressed
        // Obtener la fila seleccionada en la tabla
        int selectedRow = jTListaUsuarios.getSelectedRow();
        // Verificar que haya una fila seleccionada
        if (selectedRow != -1) {
            // Obtener el valor de la columna "cedula" de la fila seleccionada
            // Suponiendo que la cédula está en la primera columna (índice 0)
            String cedula = jTListaUsuarios.getValueAt(selectedRow, 0).toString();

            // Mostrar la cédula en el JTextField jTFUsuarioSeleccionado
            jTFUsuarioSeleccionado.setText(cedula);
        }
    }//GEN-LAST:event_jTListaUsuariosMousePressed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        String cedula = jTFUsuarioSeleccionado.getText();
        administradorController.eliminarUsuario(cedula);
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBModificarActionPerformed

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
            java.util.logging.Logger.getLogger(AActualizarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AActualizarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AActualizarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AActualizarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AActualizarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JComboBox<String> jCBRol;
    private javax.swing.JLabel jLActualizarUsuarios;
    private javax.swing.JLabel jLRol;
    private javax.swing.JLabel jLSelecciónMétodo1;
    private javax.swing.JLabel jLSelecciónMétodoBusqueda;
    private javax.swing.JLabel jLUsuarioSeleccionado;
    private javax.swing.JPanel jPAMódificarUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFMétodoBusqueda;
    private javax.swing.JTextField jTFUsuarioSeleccionado;
    private javax.swing.JTable jTListaUsuarios;
    // End of variables declaration//GEN-END:variables
}
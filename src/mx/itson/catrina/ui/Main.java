/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.catrina.ui;

import java.awt.Toolkit;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.itson.catrina.entities.Transactions;
import mx.itson.catrina.business.Operacion;
import mx.itson.catrina.entities.Account;

/**
 *
 * @author GibsCAT11
 */
public class Main extends javax.swing.JFrame {

    Account cuenta;
    Operacion operacion = new Operacion();
    String mes;

    public Main() {

        initComponents();
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("banco.jpg")));
        lblEscudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("sonora.png")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtArchivo = new javax.swing.JTextField();
        cboMes = new javax.swing.JComboBox<>();
        btnSeleccione = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTipoCuenta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosCliente = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCuenta = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblResumenPeriodo = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMovimientos = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        txtSaldoFinal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblEscudo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estado de cuenta");
        setBackground(new java.awt.Color(204, 204, 255));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Seleccione el mes:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione el archivo a cargar:");

        txtArchivo.setEditable(false);
        txtArchivo.setBackground(new java.awt.Color(204, 204, 204));

        cboMes.setBackground(new java.awt.Color(204, 204, 204));
        cboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cboMes.setToolTipText("Seleccionar mes");
        cboMes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cboMes.setEnabled(false);
        cboMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMesItemStateChanged(evt);
            }
        });
        cboMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMesActionPerformed(evt);
            }
        });

        btnSeleccione.setBackground(new java.awt.Color(153, 153, 153));
        btnSeleccione.setText("Seleccione...");
        btnSeleccione.setToolTipText("Seleccionar archivo JSON");
        btnSeleccione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccioneActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(204, 204, 255));
        jTextField2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("ESTADO DE CUENTA");

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 204, 255));
        txtNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtTipoCuenta.setEditable(false);
        txtTipoCuenta.setBackground(new java.awt.Color(255, 204, 255));
        txtTipoCuenta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        tblDatosCliente.setBackground(new java.awt.Color(204, 204, 204));
        tblDatosCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatosCliente.setShowGrid(true);
        jScrollPane1.setViewportView(tblDatosCliente);
        if (tblDatosCliente.getColumnModel().getColumnCount() > 0) {
            tblDatosCliente.getColumnModel().getColumn(0).setResizable(false);
        }

        tblCuenta.setBackground(new java.awt.Color(204, 204, 204));
        tblCuenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCuenta.setShowGrid(true);
        jScrollPane2.setViewportView(tblCuenta);
        if (tblCuenta.getColumnModel().getColumnCount() > 0) {
            tblCuenta.getColumnModel().getColumn(0).setResizable(false);
            tblCuenta.getColumnModel().getColumn(1).setResizable(false);
        }

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 153, 255));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField1.setText("RESUMEN DEL PERIODO");
        jTextField1.setToolTipText("");

        tblResumenPeriodo.setBackground(new java.awt.Color(204, 204, 204));
        tblResumenPeriodo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResumenPeriodo.setName(""); // NOI18N
        tblResumenPeriodo.setShowGrid(true);
        jScrollPane3.setViewportView(tblResumenPeriodo);
        if (tblResumenPeriodo.getColumnModel().getColumnCount() > 0) {
            tblResumenPeriodo.getColumnModel().getColumn(0).setResizable(false);
            tblResumenPeriodo.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblResumenPeriodo.getColumnModel().getColumn(1).setResizable(false);
        }

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 153, 255));
        jTextField3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField3.setText("DETALLE DE MOVIMIENTOS");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        tblMovimientos.setBackground(new java.awt.Color(204, 204, 204));
        tblMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FECHA", "DESCRIPCIÓN", "DEPÓSITO", "RETIRO", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMovimientos.setShowGrid(true);
        jScrollPane4.setViewportView(tblMovimientos);
        if (tblMovimientos.getColumnModel().getColumnCount() > 0) {
            tblMovimientos.getColumnModel().getColumn(0).setResizable(false);
            tblMovimientos.getColumnModel().getColumn(0).setPreferredWidth(35);
            tblMovimientos.getColumnModel().getColumn(1).setResizable(false);
            tblMovimientos.getColumnModel().getColumn(1).setPreferredWidth(300);
            tblMovimientos.getColumnModel().getColumn(2).setResizable(false);
            tblMovimientos.getColumnModel().getColumn(4).setResizable(false);
        }

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(0, 0, 204));
        jTextField4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField4.setText("SALDO FINAL DEL PERIODO:");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        txtSaldoFinal.setEditable(false);
        txtSaldoFinal.setBackground(new java.awt.Color(0, 0, 204));
        txtSaldoFinal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("$");

        lblEscudo.setBackground(new java.awt.Color(218, 233, 239));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSaldoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSeleccione))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(334, 334, 334)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEscudo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEscudo, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeleccione)
                    .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaldoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccioneActionPerformed

        /**
         * Acción ejecutada al hacer clic en el botón "Seleccionar". Abre un
         * diálogo de selección de archivo, carga el contenido del archivo,
         * realiza cálculos financieros y actualiza las tablas y campos de la
         * interfaz gráfica con la información obtenida.
         *
         * @param evt Evento de acción asociado al clic del botón.
         */
        try {

            // Abre un diálogo de selección de archivo en el directorio del usuario.
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));

            // Si se selecciona un archivo, habilita el ComboBox de selección de mes.
            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

                cboMes.setEnabled(true);

                // Obtiene el archivo seleccionado y su contenido.
                File archivo = fileChooser.getSelectedFile();
                byte archivoBytes[] = Files.readAllBytes(archivo.toPath());
                String contenido = new String(archivoBytes, StandardCharsets.UTF_8);

                // Inicializa modelos de tablas y variables para cálculos financieros.
                DefaultTableModel modelo = (DefaultTableModel) tblDatosCliente.getModel();
                modelo.setRowCount(0);
                DefaultTableModel modelo1 = (DefaultTableModel) tblCuenta.getModel();
                modelo1.setRowCount(0);
                DefaultTableModel modelo2 = (DefaultTableModel) tblResumenPeriodo.getModel();
                modelo2.setRowCount(0);
                DefaultTableModel modelo3 = (DefaultTableModel) tblMovimientos.getModel();
                modelo3.setRowCount(0);
                float depositos = 0;
                float retiros = 0;
                float saldoFinal = 0;

                // Deserializa el contenido del archivo en un objeto Account.
                cuenta = new Account().deserializar(contenido);

                // Obtiene el mes seleccionado del ComboBox.
                mes = cboMes.getSelectedItem().toString();

                // Obtiene movimientos y saldo inicial.
                List<Transactions> mov = operacion.obtenerMovimientos(mes, cuenta.getTransactions());
                float saldoAnterior = operacion.obtenerSaldoInicial(mes, cuenta.getTransactions());

                // Actualiza campos de la interfaz con información del archivo.
                txtArchivo.setText(archivo.toString());
                txtNombre.setText(cuenta.getCustomer().getName());
                modelo.addRow(new Object[]{"RFC: " + cuenta.getCustomer().getRfc()});
                modelo.addRow(new Object[]{cuenta.getCustomer().getAddress()});
                modelo.addRow(new Object[]{cuenta.getCustomer().getCity()});
                modelo.addRow(new Object[]{"C.P. " + cuenta.getCustomer().getZip_code()});
                txtTipoCuenta.setText(cuenta.getProduct());

                modelo1.addRow(new Object[]{"CUENTA", String.format("%25s", cuenta.getAccount())});
                modelo1.addRow(new Object[]{"CLABE", String.format("%16s", cuenta.getClabe())});
                modelo1.addRow(new Object[]{"MONEDA", String.format("%32s", cuenta.getCurrency())});

                // Calcula y muestra información financiera en las tablas de la interfaz.
                for (Transactions m : mov) {

                    depositos += m.getDeposito();
                    retiros += m.getRetiro();
                    saldoFinal = m.getSubtotal();

                }

                //      (actualiza modelos de tablas y campos de la interfaz) 
                // Muestra el saldo final en un campo de la interfaz.
                modelo2.addRow(new Object[]{"Saldo inicial (anterior)", String.format("$%,34.2f", saldoAnterior)});
                modelo2.addRow(new Object[]{"Depósitos", String.format("$%,34.2f", depositos)});
                modelo2.addRow(new Object[]{"Retiros", String.format("$%,34.2f", retiros)});
                modelo2.addRow(new Object[]{"Saldo final", String.format("$%,34.2f", saldoFinal)});//31839.30

                for (Transactions m : mov) {

                    if (m.getDeposito() == 0) {

                        modelo3.addRow(new Object[]{m.getFechaOperacion(), m.getDescripcionOperacion(), String.format("%40s", "-"), String.format("$%,31.2f", m.getRetiro()), String.format("$%,31.2f", m.getSubtotal())});

                    }

                    if (m.getRetiro() == 0) {

                        modelo3.addRow(new Object[]{m.getFechaOperacion(), m.getDescripcionOperacion(), String.format("$%,31.2f", m.getDeposito()), String.format("%40s", "-"), String.format("$%,31.2f", m.getSubtotal())});

                    }

                }

                txtSaldoFinal.setText(String.format("%,35.2f", saldoFinal));

            }

        } catch (NullPointerException e) {
            // Muestra un mensaje de error si ocurre una NullPointerException.  
            JOptionPane.showMessageDialog(null, "Tienes que cargar un archivo json, o un archivo json con el formato adecuado", "ERROR", JOptionPane.ERROR_MESSAGE);

        } catch (Exception ex) {
            // Muestra un mensaje de error si ocurre una excepción.  
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnSeleccioneActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void cboMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMesActionPerformed
    }//GEN-LAST:event_cboMesActionPerformed

    private void cboMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMesItemStateChanged

        try {

            DefaultTableModel modelo = (DefaultTableModel) tblResumenPeriodo.getModel();
            modelo.setRowCount(0);
            DefaultTableModel modelo2 = (DefaultTableModel) tblMovimientos.getModel();
            modelo2.setRowCount(0);

            float depositos = 0;
            float retiros = 0;
            float saldoFinal = 0;

            mes = cboMes.getSelectedItem().toString();

            List<Transactions> mov = operacion.obtenerMovimientos(mes, cuenta.getTransactions());
            float saldoAnterior = operacion.obtenerSaldoInicial(mes, cuenta.getTransactions());

            for (Transactions m : mov) {

                depositos += m.getDeposito();
                retiros += m.getRetiro();
                saldoFinal = m.getSubtotal();

            }

            modelo.addRow(new Object[]{"Saldo inicial (anterior)", String.format("$%,34.2f", saldoAnterior)});
            modelo.addRow(new Object[]{"Depósitos", String.format("$%,34.2f", depositos)});
            modelo.addRow(new Object[]{"Retiros", String.format("$%,34.2f", retiros)});
            modelo.addRow(new Object[]{"Saldo final", String.format("$%,34.2f", saldoFinal)});//31839.30

            for (Transactions m : mov) {

                if (m.getDeposito() == 0) {

                    modelo2.addRow(new Object[]{m.getFechaOperacion(), m.getDescripcionOperacion(), String.format("%40s", "-"), String.format("$%,31.2f", m.getRetiro()), String.format("$%,31.2f", m.getSubtotal())});

                }

                if (m.getRetiro() == 0) {

                    modelo2.addRow(new Object[]{m.getFechaOperacion(), m.getDescripcionOperacion(), String.format("$%,31.2f", m.getDeposito()), String.format("%40s", "-"), String.format("$%,31.2f", m.getSubtotal())});

                }

            }

            txtSaldoFinal.setText(String.format("%,35.2f", saldoFinal));

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_cboMesItemStateChanged

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccione;
    private javax.swing.JComboBox<String> cboMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblEscudo;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTable tblCuenta;
    private javax.swing.JTable tblDatosCliente;
    private javax.swing.JTable tblMovimientos;
    private javax.swing.JTable tblResumenPeriodo;
    private javax.swing.JTextField txtArchivo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSaldoFinal;
    private javax.swing.JTextField txtTipoCuenta;
    // End of variables declaration//GEN-END:variables

}

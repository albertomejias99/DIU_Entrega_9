/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.diu_entrega_9;

import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

/**
 *
 * @author alber
 */
public class Frame extends javax.swing.JFrame {

    DefaultListModel tablesModel = new DefaultListModel();
    DefaultListModel fieldsModel = new DefaultListModel();
    DatabaseMetaData md;
    Connection con;

    public Frame() {
        initComponents();
        this.setTitle("Gestor tablas base de datos - Jorge Marrero & Alberto Mejias");
        tablesList.setModel(tablesModel);
        fieldList.setModel(fieldsModel);
        multipleIntervalSelBtn.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectionGroup = new javax.swing.ButtonGroup();
        logInPanel = new javax.swing.JPanel();
        userLabel = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        pwLabel = new javax.swing.JLabel();
        pwText = new javax.swing.JPasswordField();
        logInBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        listPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablesList = new javax.swing.JList<>();
        tablesLabel = new javax.swing.JLabel();
        singleSelBtn = new javax.swing.JToggleButton();
        singleIntervalSelBtn = new javax.swing.JToggleButton();
        multipleIntervalSelBtn = new javax.swing.JToggleButton();
        selectTableBtn = new javax.swing.JButton();
        clearSelectionBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        fieldList = new javax.swing.JList<>();
        fieldLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userLabel.setText("Usuario:");

        pwLabel.setText("Contraseña:");

        logInBtn.setText("Iniciar Sesión");
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Cerrar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logInPanelLayout = new javax.swing.GroupLayout(logInPanel);
        logInPanel.setLayout(logInPanelLayout);
        logInPanelLayout.setHorizontalGroup(
            logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logInPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(pwLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(logInBtn)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        logInPanelLayout.setVerticalGroup(
            logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logInPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwLabel)
                    .addComponent(pwText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logInBtn)
                    .addComponent(jButton1))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(tablesList);

        tablesLabel.setText("Tablas:");

        selectionGroup.add(singleSelBtn);
        singleSelBtn.setText("Selección Individual");
        singleSelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleSelBtnActionPerformed(evt);
            }
        });

        selectionGroup.add(singleIntervalSelBtn);
        singleIntervalSelBtn.setText("Intervalo Continuo");
        singleIntervalSelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleIntervalSelBtnActionPerformed(evt);
            }
        });

        selectionGroup.add(multipleIntervalSelBtn);
        multipleIntervalSelBtn.setText("Intervalo Múltiple");
        multipleIntervalSelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleIntervalSelBtnActionPerformed(evt);
            }
        });

        selectTableBtn.setText("Seleccionar Tabla");
        selectTableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTableBtnActionPerformed(evt);
            }
        });

        clearSelectionBtn.setText("Limpiar Seleccion");
        clearSelectionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearSelectionBtnActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(fieldList);

        fieldLabel.setText("Campos:");

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(singleSelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(singleIntervalSelBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multipleIntervalSelBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tablesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clearSelectionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectTableBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        listPanelLayout.setVerticalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tablesLabel)
                    .addComponent(fieldLabel))
                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(selectTableBtn)
                        .addGap(18, 18, 18)
                        .addComponent(clearSelectionBtn))
                    .addGroup(listPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(listPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(singleSelBtn)
                        .addGap(18, 18, 18)
                        .addComponent(singleIntervalSelBtn)
                        .addGap(18, 18, 18)
                        .addComponent(multipleIntervalSelBtn)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void singleSelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleSelBtnActionPerformed
        tablesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }//GEN-LAST:event_singleSelBtnActionPerformed

    private void singleIntervalSelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleIntervalSelBtnActionPerformed
        tablesList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    }//GEN-LAST:event_singleIntervalSelBtnActionPerformed

    private void multipleIntervalSelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleIntervalSelBtnActionPerformed
        tablesList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }//GEN-LAST:event_multipleIntervalSelBtnActionPerformed

    private void clearSelectionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearSelectionBtnActionPerformed
        if (tablesModel.getSize() > 0) {
            tablesList.clearSelection();
        }
    }//GEN-LAST:event_clearSelectionBtnActionPerformed

    private void selectTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTableBtnActionPerformed
        if (tablesModel.getSize() > 0 && tablesList.getSelectedIndices().length > 0) {
            int[] indices = tablesList.getSelectedIndices();
            fieldList.removeAll();
            fieldsModel.removeAllElements();
            for (int indice : indices) {
                try {
                    String tableName = (String) tablesModel.getElementAt(indice);
                    ResultSet rs2 = md.getColumns(null, null, tableName, null);
                    while (rs2.next()) {
                        String nombreCampo = tableName + "." +rs2.getString("COLUMN_NAME");
                        int index = 0;
                        fieldsModel.add(index, nombreCampo);
                        index++;
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Fallo de conexión en la base de datos", "Fallo de conexión", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        }

    }//GEN-LAST:event_selectTableBtnActionPerformed

    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/diu9?useSSL=true",
                    userText.getText(),
                    String.valueOf(pwText.getPassword()));
            md = con.getMetaData();
            String[] types = {"TABLE"};
            ResultSet rs = md.getTables(null, null, "%", types);
            while (rs.next()) {
                String nombreTabla = rs.getString("TABLE_NAME");
                int index = 0;
                tablesModel.add(index, nombreTabla);
                index++;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Fallo de conexión en la base de datos", "Fallo de conexión", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_logInBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tablesList.removeAll();
        fieldList.removeAll();
        tablesModel.removeAllElements();
        fieldsModel.removeAllElements();
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Fallo de conexión en la base de datos", "Fallo de conexión", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearSelectionBtn;
    private javax.swing.JLabel fieldLabel;
    private javax.swing.JList<String> fieldList;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel listPanel;
    private javax.swing.JButton logInBtn;
    private javax.swing.JPanel logInPanel;
    private javax.swing.JToggleButton multipleIntervalSelBtn;
    private javax.swing.JLabel pwLabel;
    private javax.swing.JPasswordField pwText;
    private javax.swing.JButton selectTableBtn;
    private javax.swing.ButtonGroup selectionGroup;
    private javax.swing.JToggleButton singleIntervalSelBtn;
    private javax.swing.JToggleButton singleSelBtn;
    private javax.swing.JLabel tablesLabel;
    private javax.swing.JList<String> tablesList;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}

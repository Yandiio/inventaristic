/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smkn4.inventaristic.admin.barang.bermasalah;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import com.smkn4.inventaristic.util.MySqlConnection;
import java.util.HashMap;

/**
 *
 * @author Sayyid
 */
public class BarangMasalah extends javax.swing.JFrame {

    /**
     * Creates new form BarangMasalah   
     */
    public BarangMasalah() {
        initComponents();
        readData(false, "tgl_bermasalah", "ASC", null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TanggalGroup = new javax.swing.ButtonGroup();
        Keterangan = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Masalah = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        muda = new javax.swing.JRadioButton();
        tua = new javax.swing.JRadioButton();
        kecil = new javax.swing.JRadioButton();
        besar = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabel_Masalah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_BarangBermasalah", "ID_Barang", "Tanggal Bermasalah", "Jumlah", "Keterangan"
            }
        ));
        jScrollPane1.setViewportView(Tabel_Masalah);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setText("Barang yang bermasalah");

        jLabel3.setText("Keterangan");

        TanggalGroup.add(muda);
        muda.setSelected(true);
        muda.setText("Termuda");
        muda.setActionCommand("muda");
        muda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mudaActionPerformed(evt);
            }
        });

        TanggalGroup.add(tua);
        tua.setText("Tertua");
        tua.setActionCommand("tua");
        tua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuaActionPerformed(evt);
            }
        });

        Keterangan.add(kecil);
        kecil.setSelected(true);
        kecil.setText("Rusak");
        kecil.setActionCommand("rusak");
        kecil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kecilActionPerformed(evt);
            }
        });

        Keterangan.add(besar);
        besar.setText("Hilang");
        besar.setActionCommand("hilang");
        besar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                besarActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(muda)
                .addGap(18, 18, 18)
                .addComponent(tua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(kecil)
                .addGap(18, 18, 18)
                .addComponent(besar)
                .addGap(11, 11, 11))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(muda)
                            .addComponent(tua)
                            .addComponent(kecil)
                            .addComponent(besar)
                            .addComponent(jButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Tanggal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kecilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kecilActionPerformed
        filter();
    }//GEN-LAST:event_kecilActionPerformed

    private void besarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_besarActionPerformed
        filter();
    }//GEN-LAST:event_besarActionPerformed

    private void mudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mudaActionPerformed
        filter();
    }//GEN-LAST:event_mudaActionPerformed

    private void tuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuaActionPerformed
        filter();
    }//GEN-LAST:event_tuaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        filter();
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
            java.util.logging.Logger.getLogger(BarangMasalah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarangMasalah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarangMasalah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarangMasalah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarangMasalah().setVisible(true);
            }
        });
    }
    
    private void filter (){
        Map<String, String> filter = new HashMap<>();
        String keterangan = Keterangan.getSelection().getActionCommand();
        if(keterangan.equals("rusak")){
            filter.put("jenis_masalah", keterangan);
        }else if (keterangan.equals("hilang")){
            filter.put("jenis_masalah", keterangan);
        }
        boolean search = true;
        if (filter.isEmpty()) {
            search = false;
        }
        String tanggal = TanggalGroup.getSelection().getActionCommand();
        String ascDESC = (tanggal.equals("muda")) ? " ASC " : " DESC ";
    
//    search (filter.isEmpty()) ? false : true;
    readData(search,"tgl_bermasalah", ascDESC, filter);
    }
private void readData(boolean search, String orderBy, String ascDesc, Map<String, String> filter) {
        defaultTableModel = new DefaultTableModel(null, this.kolomTabel);
        String[] kolomTabel = {"nama_barang", "Jenis Masalah","lokasi", "Tanggal Bermasalah", "Jumlah"};
        DefaultTableModel defaultTableModel = new DefaultTableModel(null, kolomTabel);
        String query = "SELECT barang_masuk.`nama_barang`, `barang_masuk`.`lokasi`, barang_bermasalah.`jenis_masalah`, barang_bermasalah.`tgl_bermasalah`, COUNT(barang_masuk.nama_barang) AS jumlah"
                + " FROM `barang_masuk` "
                + " INNER JOIN `barang_bermasalah` "
                + " ON `barang_masuk`.`id_barang` = `barang_bermasalah`.`id_barang`";
        if (search) {
            query += " WHERE ";
            int i = 1;
            for (Map.Entry<String, String> entry : filter.entrySet()) {
                if (i != 1) {
                    query += " AND " ;
                }
                query += entry.getKey() + " LIKE '%" + entry.getValue() + "%' ";
                i++;
            }
        }
        if (!orderBy.isEmpty()) {
            query += " ORDER BY " + orderBy + " " + ascDesc;
        }
        try {
            Connection conn = MySqlConnection.getConnection();
            Statement statement = conn.createStatement();
            System.out.println(query);
            result = statement.executeQuery(query);
            int no = 1;
            while (result.next()) {
                String namaBarang = result.getString("nama_barang");
                String status = result.getString("jenis_masalah");
                String lokasiBarang = result.getString("lokasi");
                String tanggalBermasalah = result.getString("tgl_bermasalah");
                String jumlah = result.getString("jumlah");
                defaultTableModel.addRow(new String[]{namaBarang, lokasiBarang, status, tanggalBermasalah, jumlah});
            }
        }catch(SQLException se){
            se.printStackTrace();
        }

        Tabel_Masalah.setModel(defaultTableModel);
        
    }
    
    
    String[] kolomTabel = {"id_barang_masalah", "id_barang", "tanggal_bermasalah", "jumlah", "ket"};
    ResultSet result;
    PreparedStatement preStatement;
    DefaultTableModel defaultTableModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Keterangan;
    private javax.swing.JTable Tabel_Masalah;
    private javax.swing.ButtonGroup TanggalGroup;
    private javax.swing.JRadioButton besar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton kecil;
    private javax.swing.JRadioButton muda;
    private javax.swing.JRadioButton tua;
    // End of variables declaration//GEN-END:variables
}

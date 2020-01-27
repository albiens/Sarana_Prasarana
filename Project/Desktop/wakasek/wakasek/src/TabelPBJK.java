
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class TabelPBJK extends javax.swing.JFrame {
    private Connection con;
    private Statement stat;
    private ResultSet res;
    
  
    /**
     * Creates new form TabelPBJK
     */
    public TabelPBJK() {
        initComponents();
        this.setLocationRelativeTo(null);
        findPBJK();
        
    }
     detailtabelPBJK jtRowData=new detailtabelPBJK();
    
     public Connection getConnection(){
    Connection con = null;
    
    try{
        con = DriverManager.getConnection("jdbc:mysql://localhost/dbsarpras","root","");
    }catch(Exception ex){
        
    }
    return con;
    }
   
    public ArrayList<PBJK> ListPBJK(String ValToSearch){
        ArrayList<PBJK> pbjkList = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        
        try{
            @SuppressWarnings("LocalVariableHidesMemberVariable")
            Connection con = getConnection();
            st = con.createStatement();
            String searchQuery = "SELECT * FROM `formpbjk` WHERE CONCAT(`DimintaOleh`, `Jabatan`, `TglDibutuhkan`, `Tanggal`, `Bidang`, `NamaBarang`, `Harga`, `JumlahBarang`,`Kepsek`,`Wakasek`, `Alasan`)LIKE'%"+ValToSearch+"%'";
            rs = st.executeQuery(searchQuery);
            
            PBJK pbjk;
            
            while(rs.next())
            {
                pbjk = new PBJK(
                rs.getString("DimintaOleh"),
                rs.getString("Jabatan"),
                rs.getString("TglDibutuhkan"),
                rs.getString("Tanggal"),
                rs.getString("Bidang"),
                rs.getString("NamaBarang"),
                rs.getString("Harga"),
                rs.getString("JumlahBarang"),
                rs.getString("Kepsek"),
                rs.getString("Wakasek"),
                rs.getString("Alasan")
                );
                pbjkList.add(pbjk);
            }
        }catch (Exception ex){
            
        }
        return pbjkList;
    }
        
    public void findPBJK(){
        ArrayList<PBJK> pbjk = ListPBJK(fCari.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"DimintaOleh","Jabatan","TglDibutuhkan","Tanggal","Bidang","NamaBarang","Harga","JumlahBarang","Kepsek","Wakasek","Alasan"});
        Object[] row = new Object[11];
        
        for(int i = 0; i < pbjk.size(); i++){
            row[0] = pbjk.get(i).getDimintaOleh();
            row[1] = pbjk.get(i).getJabatan();
            row[2] = pbjk.get(i).getTglDibutuhkan();
            row[3] = pbjk.get(i).getTanggal();
            row[4] = pbjk.get(i).getBidang();
            row[5] = pbjk.get(i).getNamaBarang();
            row[6] = pbjk.get(i).getHarga();
            row[7] = pbjk.get(i).getJumlahBarang();
            row[8] = pbjk.get(i).getKepsek();
            row[9] = pbjk.get(i).getWakasek();
            row[10] = pbjk.get(i).getAlasan();
            model.addRow(row);
        }
        fTabelTampil.setModel(model);
    }
    
    
    
          @SuppressWarnings("unchecked")
       
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        fTabelTampil = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fCari = new javax.swing.JTextField();
        fsearch = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SMK PRAKARYA INTERNASIONAL");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open-book.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("W-WAKIL KEPALA SEKOLAH");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button-297546_640.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(192, 192, 192)
                .addComponent(jLabel11)
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 50));

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kisspng-computer-icons-privacy-policy-clip-art-admin-icon-5b4ae9c975cab8-removebg-preview.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Home");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mengajukan");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Approval");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Update");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tekton Pro", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setText(" Wakil Kepala Sekolah");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6)))
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 44, 250, 470));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setText("Excel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        fTabelTampil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Diminta Oleh", "Jabatan", "Tgl Dibutuhkan", "Tanggal", "Bidang", "Nama Barang", "Harga Barang", "Jumlah Barang", "Kepsek", "Wakasek", "Alasan"
            }
        ));
        fTabelTampil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fTabelTampilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(fTabelTampil);

        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel8.setText("Tabel PBJ-K");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Kembali");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        fCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fCariActionPerformed(evt);
            }
        });

        fsearch.setText("Search");
        fsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fsearchActionPerformed(evt);
            }
        });

        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(fCari, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fsearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addGap(4, 4, 4)))
                        .addGap(20, 20, 20))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(fCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fsearch)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 51, 860, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        new wakasek().show();
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        new Approval().show();
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        new MenuPengajuan().show();
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void fTabelTampilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fTabelTampilMouseClicked
        // TODO add your handling code here:
        int index =fTabelTampil.getSelectedRow();
        TableModel model = fTabelTampil.getModel();
        String DO =model.getValueAt(index, 0).toString();
        String JBT =model.getValueAt(index, 1).toString();
        String TD =model.getValueAt(index, 2).toString();
        String TG =model.getValueAt(index, 3).toString();
        String BD =model.getValueAt(index, 4).toString();
        String NB =model.getValueAt(index, 5).toString();
        String HG =model.getValueAt(index, 6).toString();
        String JB =model.getValueAt(index, 7).toString();
        String AL =model.getValueAt(index, 10).toString();
        
        jtRowData.setVisible(true);
        jtRowData.pack();
        jtRowData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        jtRowData.fDO.setText(DO);
        jtRowData.fJabatan.setText(JBT);
        jtRowData.fTglDB.setText(TD);
        jtRowData.fTgl.setText(TG);
        jtRowData.fBidang.setText(BD);
        jtRowData.fNB.setText(NB);
        jtRowData.fHarga.setText(HG);
        jtRowData.fJB.setText(JB);
        jtRowData.fAlasan.setText(AL);
    }//GEN-LAST:event_fTabelTampilMouseClicked

 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          MessageFormat header = new MessageFormat("Print Report");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try{
            fTabelTampil.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        }catch (java.awt.print.PrinterAbortException e){
        }catch (PrinterException ex){
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
             FileWriter fileWriter;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("[B]export_output/excel[/B]"));
        int retrival = chooser.showSaveDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try{
                TableModel tModel = fTabelTampil.getModel();
                fileWriter = new FileWriter(new File(chooser.getSelectedFile() + ".xls"));           
            // write header
                for(int i = 0; i < tModel.getColumnCount(); i++){
                fileWriter.write(tModel.getColumnName(i).toUpperCase() + "\t");
            }
                fileWriter.write("\n");
            // write record
                for(int i=0; i < tModel.getRowCount(); i++) {
                for(int j=0; j < tModel.getColumnCount(); j++) {
                fileWriter.write(tModel.getValueAt(i,j).toString() + "\t");
            }
                fileWriter.write("\n");
            }
                fileWriter.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
               int jawab = JOptionPane.showConfirmDialog (this, "Silahkan Konfirmasi?","",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);  
       if(jawab==JOptionPane.YES_OPTION){
               new Login().show();
               this.dispose();
              
       }else{
       }
       
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        new Approval().show();
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void fsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fsearchActionPerformed
        // TODO add your handling code here:
         findPBJK();
    }//GEN-LAST:event_fsearchActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new TabelPBJK().show();
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void fCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fCariActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        new MenuUpdate().show();
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(TabelPBJK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelPBJK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelPBJK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelPBJK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TabelPBJK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fCari;
    private javax.swing.JTable fTabelTampil;
    private javax.swing.JButton fsearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
   
}

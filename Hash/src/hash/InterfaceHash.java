package hash;

import hash.DatosTabla;

public class InterfaceHash extends javax.swing.JFrame {

    DatosTabla dt = new DatosTabla();
    int xMouse, yMouse;
    int noRegistros, currentRegister=0;
    String[] registros = new String[' '];
    int[] limits = new int[' '];
    
    public InterfaceHash() {
        initComponents();
        setLocationRelativeTo(null);
        txtA_Information.setVisible(false);
        btn_ShowP.setVisible(false);
        txtF_Indice.setVisible(false);
        lbIndex.setVisible(false);
        
        
        
    }
    
    public void getAndSaveInfo(){
        
    }
    
    public void getProcess(){
        int x, value=0, avoidCol=1;
        String textFTA, name;
        name = dt.getName()[noRegistros];
        for(x=0; x< name.length(); x++){
            value = (name.charAt(x))*avoidCol;
            textFTA = txtA_Information.getText();
            txtA_Information.setText(textFTA + ("\n\n\t" + name.charAt(x) + "\tvalor ->\t" + value + "\n"));
            avoidCol++;
        }
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtF_Limit = new javax.swing.JTextField();
        txtF_Register = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_ClearAll = new javax.swing.JButton();
        btn_Start = new javax.swing.JButton();
        lbIndex = new javax.swing.JLabel();
        txtF_Indice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_Information = new javax.swing.JTextArea();
        btn_ShowP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(88, 88, 88));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hash");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 5, 150, 40));

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("X");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        jPanel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 50, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 50));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Limite");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 80, 30));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Resgistro");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 80, 30));

        txtF_Limit.setBackground(new java.awt.Color(51, 51, 51));
        txtF_Limit.setForeground(new java.awt.Color(255, 255, 255));
        txtF_Limit.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtF_Limit.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 2, 0, new java.awt.Color(204, 204, 204)));
        txtF_Limit.setCaretColor(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtF_Limit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 150, 30));

        txtF_Register.setBackground(new java.awt.Color(51, 51, 51));
        txtF_Register.setForeground(new java.awt.Color(255, 255, 255));
        txtF_Register.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtF_Register.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 2, 0, new java.awt.Color(204, 204, 204)));
        jPanel3.add(txtF_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 150, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testhash/hash.jpg"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 160, 140));

        btn_ClearAll.setBackground(new java.awt.Color(153, 0, 153));
        btn_ClearAll.setForeground(new java.awt.Color(204, 204, 204));
        btn_ClearAll.setText("Limpiar");
        btn_ClearAll.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearAllActionPerformed(evt);
            }
        });
        jPanel3.add(btn_ClearAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 610, 105, 25));

        btn_Start.setBackground(new java.awt.Color(153, 0, 153));
        btn_Start.setForeground(new java.awt.Color(204, 204, 204));
        btn_Start.setText("Iniciar");
        btn_Start.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StartActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 105, 25));

        lbIndex.setForeground(new java.awt.Color(204, 204, 204));
        lbIndex.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbIndex.setText("Indice");
        jPanel3.add(lbIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 80, 30));

        txtF_Indice.setEditable(false);
        txtF_Indice.setBackground(new java.awt.Color(51, 51, 51));
        txtF_Indice.setForeground(new java.awt.Color(255, 255, 255));
        txtF_Indice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtF_Indice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 2, 0, new java.awt.Color(204, 204, 204)));
        jPanel3.add(txtF_Indice, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 150, 30));

        txtA_Information.setEditable(false);
        txtA_Information.setBackground(new java.awt.Color(51, 51, 51));
        txtA_Information.setColumns(20);
        txtA_Information.setForeground(new java.awt.Color(255, 255, 255));
        txtA_Information.setRows(5);
        jScrollPane1.setViewportView(txtA_Information);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 400, 200));

        btn_ShowP.setBackground(new java.awt.Color(153, 0, 153));
        btn_ShowP.setForeground(new java.awt.Color(204, 204, 204));
        btn_ShowP.setText("Mostrar datos");
        btn_ShowP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ShowP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShowPActionPerformed(evt);
            }
        });
        jPanel3.add(btn_ShowP, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 105, 25));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 570, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearAllActionPerformed
        txtA_Information.setText("");
        txtF_Indice.setText("");
        txtF_Limit.setText("");
        txtF_Register.setText("");
        txtA_Information.setVisible(false);
        btn_ShowP.setVisible(false);
        txtF_Indice.setVisible(false);
        lbIndex.setVisible(false);
    }//GEN-LAST:event_btn_ClearAllActionPerformed

    private void btn_ShowPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShowPActionPerformed
        txtA_Information.setVisible(true);
    }//GEN-LAST:event_btn_ShowPActionPerformed

    private void btn_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StartActionPerformed
        lbIndex.setVisible(true);
        txtF_Indice.setVisible(true);
        getAndSaveInfo();
        //txtF_Indice.setText(Integer.toString(dt.getSumCode()));
        getProcess();
        btn_ShowP.setVisible(true);
    }//GEN-LAST:event_btn_StartActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

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
            java.util.logging.Logger.getLogger(InterfaceHash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceHash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceHash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceHash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceHash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btn_ClearAll;
    private javax.swing.JButton btn_ShowP;
    private javax.swing.JButton btn_Start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbIndex;
    private javax.swing.JTextArea txtA_Information;
    private javax.swing.JTextField txtF_Indice;
    private javax.swing.JTextField txtF_Limit;
    private javax.swing.JTextField txtF_Register;
    // End of variables declaration//GEN-END:variables
}

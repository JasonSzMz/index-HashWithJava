/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package hash;

import java.util.Arrays;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author JasonDGR
 */
public class interfaz extends javax.swing.JFrame {

    DatosTabla dt = new DatosTabla();
    int xMouse, yMouse;
    int noRegistros, currentRegister, limits;
    String[] registros = new String[' '];
    int[] getIndex = new int [' '];
    
    
    /** Creates new form interfaz */
    public interfaz() {
        initComponents();
        setLocationRelativeTo(null);
        txtA_Information.setVisible(false);
        btn_Start.setLocation(330, 120);
        btn_ShowP.setVisible(false);
        textA_index.setVisible(false);
        lbIndex.setVisible(false);
        sBTA_Index.setVisible(false);
        sBTArea_Process.setVisible(false);
        btn_Save.setVisible(false);
        System.out.println("Registro actual ->"+currentRegister);
        noRegistros = Integer.parseInt(JOptionPane.showInputDialog("Cuantos registros se realizaran?"));
        limits = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un limite"));
        txtF_Limit.setText(Integer.toString(limits));
        initializeIndexArray();
    }
    
    
    
    public void initializeIndexArray(){
        int x;
        
        
        for(x=0; x<noRegistros; x++){
            getIndex[x]=0;
            
            System.out.println("Arreglo de index en posicion "+x+"\t->\t"+getIndex[x]);
        }
        
    }

    public void getAndSaveInfo(){
        limits = Integer.parseInt(txtF_Limit.getText());
        registros[currentRegister] = txtF_Register.getText();
        
    }
    
    
    
    
    
    
    public void showIndex(java.awt.event.ActionEvent evt){
        int x,i, indice=0;
        boolean collision = false;
        String info;
        String textFIndice;
        dt.setLimite(limits);
        System.out.println(dt.getLimite());
        
        for(x=0; x<noRegistros; x++){
            
            indice = dt.getIndexInt(x);
            System.out.println("Indice obtenido -> "+indice);
            
            for(i=0; i<noRegistros; i++){
                
                if(indice==getIndex[i]){
                    collision = true;
                    break;
                    
                }
                System.out.println("Hay colision? " + collision);
            }
            System.out.println("REsultado final Hay colision? " + collision);
            
            if(collision == true){
                textA_index.setText("");
                break;
                
            }
            getIndex[x]=indice;
            textFIndice = textA_index.getText();
            info = dt.getIndex(x);
            textA_index.setText(textFIndice + ("\n"+info));   
            
  
        }
        
        if(collision == true){
            JOptionPane.showMessageDialog(this, "oops! Hubo una colision");
            limits = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un limite"));
            initializeIndexArray();
            collision = false;
            btn_StartActionPerformed(evt);
        }
        System.out.println("\n\n\n");
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public void getProcess(){
         int x,j,indice, value=0, avoidCol=1;
        String textFTA, name;
        
        for(j=0; j<noRegistros; j++){
            name = dt.getName()[j];
            indice=0;
            avoidCol=1;
            for(x=0; x< name.length(); x++){
                value = (name.charAt(x))*avoidCol;
                textFTA = txtA_Information.getText();
                txtA_Information.setText(textFTA + ("\n\n\t" + name.charAt(x) + "\tvalor ->\t" + value +"\n"));
                avoidCol++;
            }
            textFTA = txtA_Information.getText();
            txtA_Information.setText(textFTA+"\n-------------------------------\n");
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
        btn_Start = new javax.swing.JButton();
        btn_ShowP = new javax.swing.JButton();
        lbIndex = new javax.swing.JLabel();
        btn_Save = new javax.swing.JButton();
        sBTArea_Process = new javax.swing.JScrollPane();
        txtA_Information = new javax.swing.JTextArea();
        sBTA_Index = new javax.swing.JScrollPane();
        textA_index = new javax.swing.JTextArea();
        btn_ClearAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 5, 150, 40));

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("X");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        jPanel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 50, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 50));

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

        txtF_Limit.setEditable(false);
        txtF_Limit.setBackground(new java.awt.Color(51, 51, 51));
        txtF_Limit.setForeground(new java.awt.Color(255, 255, 255));
        txtF_Limit.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtF_Limit.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 2, 0, new java.awt.Color(204, 204, 204)));
        txtF_Limit.setCaretColor(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtF_Limit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 150, 30));

        txtF_Register.setEditable(false);
        txtF_Register.setBackground(new java.awt.Color(51, 51, 51));
        txtF_Register.setForeground(new java.awt.Color(255, 255, 255));
        txtF_Register.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtF_Register.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 2, 0, new java.awt.Color(204, 204, 204)));
        jPanel3.add(txtF_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 150, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hash/hash.jpg"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 160, 140));

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

        btn_ShowP.setBackground(new java.awt.Color(153, 0, 153));
        btn_ShowP.setForeground(new java.awt.Color(204, 204, 204));
        btn_ShowP.setText("Mostrar datos");
        btn_ShowP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ShowP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShowPActionPerformed(evt);
            }
        });
        jPanel3.add(btn_ShowP, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 105, 25));

        lbIndex.setForeground(new java.awt.Color(204, 204, 204));
        lbIndex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIndex.setText("Indice");
        jPanel3.add(lbIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 80, 30));

        btn_Save.setBackground(new java.awt.Color(153, 0, 153));
        btn_Save.setForeground(new java.awt.Color(204, 204, 204));
        btn_Save.setText("Guardar");
        btn_Save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 105, 25));

        txtA_Information.setEditable(false);
        txtA_Information.setBackground(new java.awt.Color(51, 51, 51));
        txtA_Information.setColumns(20);
        txtA_Information.setForeground(new java.awt.Color(255, 255, 255));
        txtA_Information.setRows(5);
        sBTArea_Process.setViewportView(txtA_Information);

        jPanel3.add(sBTArea_Process, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 330, 610));

        textA_index.setColumns(20);
        textA_index.setRows(5);
        sBTA_Index.setViewportView(textA_index);

        jPanel3.add(sBTA_Index, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 330, 330));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 1000, 650));

        btn_ClearAll.setBackground(new java.awt.Color(153, 0, 153));
        btn_ClearAll.setForeground(new java.awt.Color(204, 204, 204));
        btn_ClearAll.setText("Limpiar");
        btn_ClearAll.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearAllActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ClearAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 720, 105, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void btn_ClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearAllActionPerformed
        txtA_Information.setText("");
        textA_index.setText("");
        txtF_Limit.setText("");
        txtF_Register.setText("");
        txtA_Information.setVisible(false);
        btn_ShowP.setVisible(false);
        textA_index.setVisible(false);
        lbIndex.setVisible(false);
    }//GEN-LAST:event_btn_ClearAllActionPerformed

    private void btn_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StartActionPerformed
        int x;
        if("Iniciar".equals(btn_Start.getText())){
            btn_Start.setVisible(false);
            btn_Save.setVisible(true);
            txtF_Register.setEditable(true);
        }
        if("Obtener index".equals(btn_Start.getText())){
            lbIndex.setVisible(true);
            textA_index.setVisible(true); 
            sBTA_Index.setVisible(true);
            btn_ShowP.setVisible(true);
         
            
            dt.setName(registros);
            dt.setNoRegistros(noRegistros);
            
            showIndex(evt);
        }
    }//GEN-LAST:event_btn_StartActionPerformed

    private void btn_ShowPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShowPActionPerformed
        sBTArea_Process.setVisible(true);
        txtA_Information.setVisible(true);
        getProcess();
    }//GEN-LAST:event_btn_ShowPActionPerformed

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
       
        
        if(currentRegister<noRegistros){
            getAndSaveInfo();
            txtF_Register.setText("");
        }
        
        if(currentRegister==noRegistros-1){
            btn_Start.setText("Obtener index");
            btn_Start.setVisible(true);
            
        }
        currentRegister++;
        System.out.println("\n\nRegistro actual ir igual que registro menos 1 -> "+currentRegister);
        if(currentRegister==noRegistros){
            btn_Save.setVisible(false);
        }
      
    }//GEN-LAST:event_btn_SaveActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btn_ClearAll;
    private javax.swing.JButton btn_Save;
    private javax.swing.JButton btn_ShowP;
    private javax.swing.JButton btn_Start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbIndex;
    private javax.swing.JScrollPane sBTA_Index;
    private javax.swing.JScrollPane sBTArea_Process;
    private javax.swing.JTextArea textA_index;
    private javax.swing.JTextArea txtA_Information;
    private javax.swing.JTextField txtF_Limit;
    private javax.swing.JTextField txtF_Register;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author WINDOWS 8.1
 */
public class Latihan4 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan4
     */
    public Latihan4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        rdbtn2 = new javax.swing.JRadioButton();
        rdbtn1 = new javax.swing.JRadioButton();
        cb4 = new javax.swing.JCheckBox();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        Btnsubmit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        Btnexit = new javax.swing.JButton();
        Btnhapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Hobi");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 190, 70, 30);

        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 1, 12)); // NOI18N
        jLabel2.setText("HASIL");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 290, 90, 30);

        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 70, 70, 30);

        jLabel4.setText("Absen");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 110, 70, 30);

        jLabel5.setText("Jurusan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 150, 70, 40);
        getContentPane().add(Nama);
        Nama.setBounds(120, 70, 130, 30);
        getContentPane().add(Absen);
        Absen.setBounds(120, 110, 130, 30);

        rdbtn2.setText("TKJ");
        getContentPane().add(rdbtn2);
        rdbtn2.setBounds(190, 160, 50, 20);

        rdbtn1.setText("RPL");
        getContentPane().add(rdbtn1);
        rdbtn1.setBounds(120, 160, 50, 20);

        cb4.setText("Designer");
        getContentPane().add(cb4);
        cb4.setBounds(240, 210, 90, 23);

        cb1.setText("Programming");
        getContentPane().add(cb1);
        cb1.setBounds(120, 190, 100, 23);

        cb2.setText("Animator");
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        getContentPane().add(cb2);
        cb2.setBounds(120, 210, 100, 23);

        cb3.setText("Teknisi");
        getContentPane().add(cb3);
        cb3.setBounds(240, 190, 80, 23);

        Btnsubmit.setText("Submit");
        Btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Btnsubmit);
        Btnsubmit.setBounds(60, 250, 80, 23);

        jLabel6.setFont(new java.awt.Font("Tekton Pro Ext", 1, 12)); // NOI18N
        jLabel6.setText("BIODATA DIRI");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 20, 90, 30);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 330, 310, 150);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(null);

        Btnexit.setText("Exit");
        Btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnexitActionPerformed(evt);
            }
        });
        jPanel1.add(Btnexit);
        Btnexit.setBounds(260, 250, 51, 23);

        Btnhapus.setText("Hapus");
        Btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnhapusActionPerformed(evt);
            }
        });
        jPanel1.add(Btnhapus);
        Btnhapus.setBounds(160, 250, 80, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 500);

        setBounds(0, 0, 416, 537);
    }// </editor-fold>//GEN-END:initComponents

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void BtnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsubmitActionPerformed
       String nama = Nama.getText();
       String absen = Absen.getText();
       String jurusan;
       String hobi ="";
       
       //untuk rd
       if(rdbtn1.isSelected())
           jurusan="RPL";
       else if(rdbtn2.isSelected())
           jurusan="TKJ";
       else
           jurusan=" ";
       
       //untuk checkbox
       if(cb1.isSelected())
           hobi+=cb1.getText()+", ";
        if(cb2.isSelected())
           hobi+=cb2.getText()+", ";
        if(cb3.isSelected())
           hobi+=cb3.getText()+", ";
         if(cb4.isSelected())
           hobi+=cb4.getText()+", ";
         
         TA.setText("Nama          : "+nama+
                  "\nAbsen          : "+absen+
                  "\nJurusan      : "+jurusan+
                  "\nHobi             : "+hobi);
    }//GEN-LAST:event_BtnsubmitActionPerformed

    private void BtnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnhapusActionPerformed
        TA.setText("");
        Nama.setText("");
        Absen.setText("");
        btnGroup.clearSelection();
        cb1.setSelected(false);
        cb2.setSelected(false);
        cb3.setSelected(false);
        cb4.setSelected(false);
    }//GEN-LAST:event_BtnhapusActionPerformed

    private void BtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnexitActionPerformed
        dispose();
    }//GEN-LAST:event_BtnexitActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JButton Btnexit;
    private javax.swing.JButton Btnhapus;
    private javax.swing.JButton Btnsubmit;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextArea TA;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbtn1;
    private javax.swing.JRadioButton rdbtn2;
    // End of variables declaration//GEN-END:variables
}

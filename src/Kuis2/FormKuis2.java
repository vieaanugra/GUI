/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis2;

/**
 *
 * @author WINDOWS 8.1
 */
public class FormKuis2 extends javax.swing.JFrame {

    /**
     * Creates new form FormKuis2
     */
    public FormKuis2() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hb2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hb3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        hb1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        hb4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        diskon = new javax.swing.JTextField();
        btnKeluar = new javax.swing.JButton();
        btnOke = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel1.setText("Pembayaran");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 0, 80, 50);

        jLabel3.setText("Harga Barang 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 110, 110, 30);
        getContentPane().add(hb2);
        hb2.setBounds(130, 110, 200, 30);

        jLabel5.setText("Harga Barang 3");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 150, 110, 30);
        getContentPane().add(hb3);
        hb3.setBounds(130, 150, 200, 30);

        jLabel6.setText("Harga Barang 1");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 70, 110, 30);
        getContentPane().add(hb1);
        hb1.setBounds(130, 70, 200, 30);

        jLabel7.setText("Harga Barang 4");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 190, 110, 30);
        getContentPane().add(hb4);
        hb4.setBounds(130, 190, 200, 30);

        jLabel8.setText("Harga Barang 1");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 70, 110, 30);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(130, 70, 200, 30);

        jLabel2.setText("Diskon");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 230, 110, 30);
        getContentPane().add(diskon);
        diskon.setBounds(130, 230, 200, 30);

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar);
        btnKeluar.setBounds(260, 280, 80, 23);

        btnOke.setText("Proses");
        btnOke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkeActionPerformed(evt);
            }
        });
        getContentPane().add(btnOke);
        btnOke.setBounds(40, 280, 80, 23);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus);
        btnHapus.setBounds(150, 280, 90, 23);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 320, 320, 150);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 480);

        setBounds(0, 0, 416, 518);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        dispose();
        
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnOkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkeActionPerformed
        String harga1 = hb1.getText();
        String harga2 = hb2.getText();
        String harga3 = hb3.getText();
        String harga4 = hb4.getText();
        String dsc = diskon.getText();
        
        int hrg1 = Integer.parseInt(hb1.getText());
        int hrg2 = Integer.parseInt(hb2.getText());
        int hrg3 = Integer.parseInt(hb3.getText());
        int hrg4 = Integer.parseInt(hb4.getText());
        int dis = Integer.parseInt(diskon.getText());
        
        int total_harga = hrg1+hrg2+hrg3+hrg4;
        int diskon = total_harga * dis /100;
        int total_bayar = total_harga - diskon;
        TA.setText("Harga Barang 1 : "+harga1+
                "\nHarga Barang 2 : "+harga2+
                "\nHarga Barang 3 : "+harga3+
                "\nHarga Barang 4 : "+harga4+
                "\nDiskon : "+dsc+
                "\nTotal Harga : "+total_harga+
                "\nTotal Bayar : "+total_bayar);
        
    }//GEN-LAST:event_btnOkeActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        hb1.setText("");
        hb2.setText("");
        hb3.setText("");
        hb4.setText("");
        diskon.setText("");
        TA.setText("");
    }//GEN-LAST:event_btnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(FormKuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKuis2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TA;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnOke;
    private javax.swing.JTextField diskon;
    private javax.swing.JTextField hb1;
    private javax.swing.JTextField hb2;
    private javax.swing.JTextField hb3;
    private javax.swing.JTextField hb4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}

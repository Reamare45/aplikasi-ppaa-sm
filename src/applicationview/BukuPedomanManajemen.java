/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package applicationview;

import panelview.menuPencatatan;

/**
 *
 * @author raja
 */
public class BukuPedomanManajemen extends javax.swing.JFrame {
    private menuPencatatan mo;
    /**
     * Creates new form BukuPedoman
     */
    public BukuPedomanManajemen() {
        initComponents();
        mo = new menuPencatatan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panel_manajemen = new javax.swing.JPanel();
        btn_manajemen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panel_manajemenLayout = new javax.swing.GroupLayout(panel_manajemen);
        panel_manajemen.setLayout(panel_manajemenLayout);
        panel_manajemenLayout.setHorizontalGroup(
            panel_manajemenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 905, Short.MAX_VALUE)
        );
        panel_manajemenLayout.setVerticalGroup(
            panel_manajemenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );

        btn_manajemen.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btn_manajemen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-book-100.png"))); // NOI18N
        btn_manajemen.setText("Buku Pedoman Manajemen Adik Asuh");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(panel_manajemen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btn_manajemen, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_manajemen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_manajemen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(263, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Buku pedoman manajemen untuk adik asuh adalah sebuah panduan yang penting dalam konteks pendidikan dan pengasuhan anak-anak. \nBuku ini tidak hanya menyediakan panduan praktis bagi para pengasuh, tetapi juga memastikan bahwa pengasuhan dilakukan dengan pendekatan \nyang terstruktur, peduli, dan sesuai dengan kebutuhan anak.\n\nBuku pedoman ini secara umum mencakup berbagai aspek penting yang berhubungan dengan manajemen adik asuh. Pertama-tama, buku ini memberikan \npanduan tentang bagaimana membangun hubungan yang baik antara adik asuh (anak yang diasuh) dan kakak asuh (pengasuh). Ini termasuk memahami psikologi anak, \nmendengarkan kebutuhan mereka, dan menciptakan lingkungan yang aman dan mendukung.\n\nSelain itu, buku pedoman ini memberikan strategi konkret untuk memastikan pengasuhan yang efektif dan bertanggung jawab. Hal ini meliputi jadwal harian yang terstruktur, kegiatan pendidikan yang sesuai usia, serta pengelolaan disiplin yang adil dan mendidik. Buku ini juga mungkin mencakup metode pengukuran perkembangan anak, evaluasi kesehatan dan kesejahteraan mereka, serta komunikasi yang terbuka dengan orang tua atau wali.\n\nSebagai tambahan, buku pedoman ini dapat menyediakan informasi tentang sumber daya dan dukungan yang tersedia bagi pengasuh, seperti pelatihan, konseling, atau jaringan dukungan komunitas. Ini membantu memastikan bahwa kakak asuh memiliki akses ke pengetahuan terbaru dan dukungan yang mereka butuhkan untuk sukses dalam peran mereka.\n\nDengan demikian, buku pedoman manajemen adik asuh bukan hanya sekadar panduan praktis, tetapi juga sebuah komitmen untuk meningkatkan kualitas pengasuhan anak-anak yang membutuhkan perhatian khusus. Melalui implementasi pedoman ini dengan baik, diharapkan setiap anak dapat tumbuh dan berkembang dalam lingkungan yang mendukung, mempersiapkan mereka untuk masa depan yang lebih baik.");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(54, 54, 54))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(15, 15, 15)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Hide the current frame (assuming it's a JFrame)
        this.setVisible(false);

        // Make sure menuOrganize is visible (optional, if hidden previously)
        mo.setVisible(true);
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
            java.util.logging.Logger.getLogger(BukuPedomanManajemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BukuPedomanManajemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BukuPedomanManajemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BukuPedomanManajemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BukuPedomanManajemen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_manajemen;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel panel_manajemen;
    // End of variables declaration//GEN-END:variables
}

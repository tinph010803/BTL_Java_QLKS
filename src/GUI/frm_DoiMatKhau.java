/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author ADMIN
 */
public class frm_DoiMatKhau extends javax.swing.JFrame {

    private javax.swing.JButton btn_Doi;
    private javax.swing.JButton btn_Huy;
    private javax.swing.JLabel lbl_DoiMK;
    private javax.swing.JLabel lbl_MKcu;
    private javax.swing.JLabel lbl_MKmoi;
    private javax.swing.JLabel lbl_Nen;
    private javax.swing.JLabel lbl_NhapLai;
    private javax.swing.JPanel pnl_Nen;
    private javax.swing.JPasswordField txt_MKcu;
    private javax.swing.JPasswordField txt_MKmoi;
    private javax.swing.JPasswordField txt_NhapLai;
	
    /**
     * Creates new form frm_DoiMatKhau
     */
    public frm_DoiMatKhau() {
        initComponents();
    }


    private void initComponents() {

        pnl_Nen = new javax.swing.JPanel();
        lbl_MKcu = new javax.swing.JLabel();
        lbl_MKmoi = new javax.swing.JLabel();
        lbl_NhapLai = new javax.swing.JLabel();
        lbl_DoiMK = new javax.swing.JLabel();
        btn_Doi = new javax.swing.JButton();
        btn_Huy = new javax.swing.JButton();
        txt_MKmoi = new javax.swing.JPasswordField();
        txt_MKcu = new javax.swing.JPasswordField();
        txt_NhapLai = new javax.swing.JPasswordField();
        lbl_Nen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đổi mật khẩu");

        pnl_Nen.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Nen.setMinimumSize(new java.awt.Dimension(400, 300));
        pnl_Nen.setLayout(null);

        lbl_MKcu.setFont(new java.awt.Font("Arial", 0, 14)); 
        lbl_MKcu.setText("Mật khẩu cũ:");
        pnl_Nen.add(lbl_MKcu);
        lbl_MKcu.setBounds(10, 70, 81, 17);

        lbl_MKmoi.setFont(new java.awt.Font("Arial", 0, 14)); 
        lbl_MKmoi.setText("Mật khẩu mới:");
        pnl_Nen.add(lbl_MKmoi);
        lbl_MKmoi.setBounds(10, 142, 153, 17);

        lbl_NhapLai.setFont(new java.awt.Font("Arial", 0, 14)); 
        lbl_NhapLai.setText("Nhập lại mật khẩu:");
        pnl_Nen.add(lbl_NhapLai);
        lbl_NhapLai.setBounds(10, 220, 117, 17);

        lbl_DoiMK.setFont(new java.awt.Font("Arial", 0, 14)); 
        lbl_DoiMK.setText("Đổi mật khẩu");
        pnl_Nen.add(lbl_DoiMK);
        lbl_DoiMK.setBounds(169, 11, 83, 17);

        btn_Doi.setFont(new java.awt.Font("Arial", 0, 14)); 
        btn_Doi.setText("Đổi");
        btn_Doi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DoiActionPerformed(evt);
            }
        });
        pnl_Nen.add(btn_Doi);
        btn_Doi.setBounds(110, 260, 70, 30);

        btn_Huy.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_Huy.setText("Hủy");
        btn_Huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HuyActionPerformed(evt);
            }
        });
        pnl_Nen.add(btn_Huy);
        btn_Huy.setBounds(270, 260, 90, 30);

        txt_MKmoi.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        pnl_Nen.add(txt_MKmoi);
        txt_MKmoi.setBounds(169, 131, 221, 30);

        txt_MKcu.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        pnl_Nen.add(txt_MKcu);
        txt_MKcu.setBounds(169, 59, 221, 30);

        txt_NhapLai.setFont(new java.awt.Font("Tahoma", 0, 14));
        pnl_Nen.add(txt_NhapLai);
        txt_NhapLai.setBounds(169, 209, 221, 30);

        lbl_Nen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/1.jpg")));
        pnl_Nen.add(lbl_Nen);
        lbl_Nen.setBounds(0, 0, 400, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Nen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Nen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DoiActionPerformed
        String MKcu = String.valueOf(txt_MKcu.getPassword());
        String MKmoi =  String.valueOf(txt_MKmoi.getPassword());
        String nhaplai = String.valueOf(txt_NhapLai.getPassword());
        if (BLL.BLL_DangNhap.KT_DoiMK(MKcu, MKmoi, nhaplai)) {
            DAO.DAO_User.SuaMK(MKmoi, BLL.BLL_DangNhap.TenUser);
            this.dispose();
            frm_DangNhap frm=new frm_DangNhap();
            frm.setVisible(true);
        } else {
        }
    }//GEN-LAST:event_btn_DoiActionPerformed

    private void btn_HuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HuyActionPerformed
     this.dispose();
     frm_QuanLyChinh frm=frm_QuanLyChinh.b;
     frm.setVisible(true);
    }//GEN-LAST:event_btn_HuyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_DoiMatKhau().setVisible(true);
            }
        });
    }



    
}

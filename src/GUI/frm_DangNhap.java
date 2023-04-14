package GUI;

import DAO.connection;


public class frm_DangNhap extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel lblDanhNhap;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblIcon2;
    private javax.swing.JLabel lblMK;
    private javax.swing.JLabel lblTK;
    private javax.swing.JLabel lblThongTIn;
    private javax.swing.JPanel pnl0;
    private javax.swing.JPanel pnlTieuDe;
    private javax.swing.JPasswordField txtMK;
    private javax.swing.JTextField txtTK;
	public static DAO.connection conn = new connection();
    int x, y;

    public frm_DangNhap() {
        initComponents();
        this.getRootPane().setDefaultButton(btnDangNhap);
    }

   
    private void initComponents() {

        pnl0 = new javax.swing.JPanel();
        pnlTieuDe = new javax.swing.JPanel();
        lblDanhNhap = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        lblIcon1 = new javax.swing.JLabel();
        lblIcon2 = new javax.swing.JLabel();
        txtTK = new javax.swing.JTextField();
        txtMK = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();
        lblThongTIn = new javax.swing.JLabel();
        lblTK = new javax.swing.JLabel();
        lblMK = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnl0.setBackground(new java.awt.Color(255, 255, 255));
        pnl0.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pnlTieuDe.setBackground(new java.awt.Color(255, 255, 255));
        pnlTieuDe.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlTieuDeMouseDragged(evt);
            }
        });
        pnlTieuDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlTieuDeMousePressed(evt);
            }
        });

        lblDanhNhap.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblDanhNhap.setText("Đăng nhập");

        javax.swing.GroupLayout pnlTieuDeLayout = new javax.swing.GroupLayout(pnlTieuDe);
        pnlTieuDe.setLayout(pnlTieuDeLayout);
        pnlTieuDeLayout.setHorizontalGroup(
            pnlTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTieuDeLayout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(lblDanhNhap)
                .addGap(142, 142, 142))
        );
        pnlTieuDeLayout.setVerticalGroup(
            pnlTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDanhNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/Icon_Login.png"))); // NOI18N

        lblIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/Icon_Login2.jpg"))); // NOI18N

        lblIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/Icon_Key.png"))); // NOI18N

        txtTK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtMK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMKActionPerformed(evt);
            }
        });

        btnDangNhap.setBackground(new java.awt.Color(0, 0, 153));
        //btnDangNhap.setBackground(new java.awt.Color(255, 192, 203));
        btnDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        lblThongTIn.setForeground(new java.awt.Color(0, 153, 153));
        lblThongTIn.setText("Thông tin sản phẩm!");
        lblThongTIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblThongTIn.addMouseListener(new java.awt.event.MouseAdapter() {
         
        });

        lblTK.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTK.setText("Tài khoản");
        txtTK.setText("admin");
        lblMK.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMK.setText("Mật khẩu");
        txtMK.setText("admin");
        btnExit.setBackground(new java.awt.Color(255, 0, 51));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/Icon_Close.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl0Layout = new javax.swing.GroupLayout(pnl0);
        pnl0.setLayout(pnl0Layout);
        pnl0Layout.setHorizontalGroup(
            pnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIcon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl0Layout.createSequentialGroup()
                        .addGroup(pnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTK)
                            .addComponent(txtMK))
                        .addGap(55, 55, 55))
                    .addGroup(pnl0Layout.createSequentialGroup()
                        .addGroup(pnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTK)
                            .addComponent(lblMK))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl0Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblThongTIn))
            .addGroup(pnl0Layout.createSequentialGroup()
                .addGroup(pnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl0Layout.createSequentialGroup()
                        .addComponent(pnlTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl0Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl0Layout.setVerticalGroup(
            pnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl0Layout.createSequentialGroup()
                .addGroup(pnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl0Layout.createSequentialGroup()
                        .addComponent(lblTK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(lblMK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblThongTIn))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void pnlTieuDeMouseDragged(java.awt.event.MouseEvent evt) {
        int x1 = evt.getXOnScreen();
        int y1 = evt.getYOnScreen();
        this.setLocation(x1 - x, y1 - y);
    }//GEN-LAST:event_pnlTieuDeMouseDragged

    private void pnlTieuDeMousePressed(java.awt.event.MouseEvent evt) {
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_pnlTieuDeMousePressed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {

        String TenTK, MK;
        TenTK = txtTK.getText();
        MK = String.valueOf(txtMK.getPassword());
        boolean kt = BLL.BLL_DangNhap.KT_DangNhap(TenTK, MK);
        if (kt) {
            this.dispose();
            frm_QuanLyChinh frm = new frm_QuanLyChinh();
            frm.setVisible(true);
        } else {

        }

    }

    private void txtMKActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_DangNhap().setVisible(true);
            }
        });
    }


}

package Views;

import Controller.cls_allotment;
import Controller.cls_workers;
import java.util.LinkedList;
import javax.swing.JOptionPane;


public class fmr_graphic_state extends javax.swing.JFrame {

    LinkedList<cls_workers> obj_workers = new LinkedList<>();
    boolean bln_sw;
    int int_position = 0;
    LinkedList<cls_allotment> obj_allotment = new LinkedList<>();
    boolean bln_sw2;
    int int_position2 = 0;
    
    
    public fmr_graphic_state() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_wname = new javax.swing.JLabel();
        txt_namew = new javax.swing.JTextField();
        txt_wcode = new javax.swing.JLabel();
        txt_codew = new javax.swing.JTextField();
        txt_charge = new javax.swing.JLabel();
        txt_sex = new javax.swing.JLabel();
        txt_contactw = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_addressw = new javax.swing.JTextField();
        txt_waddress = new javax.swing.JLabel();
        txt_mailw = new javax.swing.JTextField();
        txt_mail = new javax.swing.JLabel();
        txt_contact = new javax.swing.JLabel();
        btn_registerw = new javax.swing.JButton();
        btn_updatew = new javax.swing.JButton();
        btn_consultw = new javax.swing.JButton();
        txt_chargew = new javax.swing.JTextField();
        txt_sexw = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_ename = new javax.swing.JLabel();
        txt_names = new javax.swing.JTextField();
        txt_ecode = new javax.swing.JLabel();
        txt_codee = new javax.swing.JTextField();
        txt_extension = new javax.swing.JLabel();
        txt_eaddress = new javax.swing.JLabel();
        txt_addresse = new javax.swing.JTextField();
        txt_crop = new javax.swing.JLabel();
        txt_crope = new javax.swing.JTextField();
        txt_workercode = new javax.swing.JLabel();
        txt_codewe = new javax.swing.JTextField();
        txt_extensione = new javax.swing.JTextField();
        btn_updatee = new javax.swing.JButton();
        btn_consulte = new javax.swing.JButton();
        btn_registere = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 36)); // NOI18N
        jLabel1.setText("DEFINITIVE ESTATE APP");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(373, 373, 373))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel2.setBackground(new java.awt.Color(51, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 24)); // NOI18N
        jLabel2.setText("Worker Register ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(215, 215, 215))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        txt_wname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_wname.setText("Name:");

        txt_namew.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_wcode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_wcode.setText("Code:");

        txt_codew.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_charge.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_charge.setText("Charge");

        txt_sex.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_sex.setText("Sex:");

        txt_contactw.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_addressw.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_waddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_waddress.setText("Address:");

        txt_mailw.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_mail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_mail.setText("Mail:");

        txt_contact.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_contact.setText("Contact:");

        btn_registerw.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_registerw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/document.png"))); // NOI18N
        btn_registerw.setText("Register");
        btn_registerw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerwActionPerformed(evt);
            }
        });

        btn_updatew.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_updatew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        btn_updatew.setText("Update");
        btn_updatew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updatewActionPerformed(evt);
            }
        });

        btn_consultw.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_consultw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        btn_consultw.setText("Consult");
        btn_consultw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultwActionPerformed(evt);
            }
        });

        txt_chargew.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_sexw.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txt_wname)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_namew, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_charge)
                                        .addComponent(txt_wcode)
                                        .addComponent(txt_sex)
                                        .addComponent(txt_contact))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_codew, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_contactw, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_chargew, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_sexw, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_waddress)
                                        .addComponent(txt_mail))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_mailw, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_addressw, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btn_registerw)
                        .addGap(30, 30, 30)
                        .addComponent(btn_updatew)
                        .addGap(33, 33, 33)
                        .addComponent(btn_consultw)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_wname)
                    .addComponent(txt_namew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_wcode)
                    .addComponent(txt_codew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_charge)
                    .addComponent(txt_chargew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sex)
                    .addComponent(txt_sexw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_contactw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txt_contact)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_waddress)
                    .addComponent(txt_addressw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_mail)
                    .addComponent(txt_mailw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registerw)
                    .addComponent(btn_updatew)
                    .addComponent(btn_consultw))
                .addGap(85, 85, 85))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel5.setBackground(new java.awt.Color(0, 255, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Lucida Console", 3, 24)); // NOI18N
        jLabel4.setText("Estate Register");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel4)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        txt_ename.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_ename.setText("Name:");

        txt_names.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_ecode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_ecode.setText("Code:");

        txt_codee.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_extension.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_extension.setText("Extension:");

        txt_eaddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_eaddress.setText("Address:");

        txt_addresse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_crop.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_crop.setText("Crop:");

        txt_crope.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_workercode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_workercode.setText("Worker code:");

        txt_codewe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_extensione.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_updatee.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_updatee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        btn_updatee.setText("Update");
        btn_updatee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateeActionPerformed(evt);
            }
        });

        btn_consulte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_consulte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        btn_consulte.setText("Consult");
        btn_consulte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consulteActionPerformed(evt);
            }
        });

        btn_registere.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_registere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/document.png"))); // NOI18N
        btn_registere.setText("Register");
        btn_registere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registereActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txt_ename)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_names, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_extension)
                                    .addComponent(txt_ecode))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_codee, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_extensione, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(txt_eaddress)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_addresse, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_crop)
                                        .addComponent(txt_workercode))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_codewe, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_crope, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_registere)
                        .addGap(30, 30, 30)
                        .addComponent(btn_updatee)
                        .addGap(33, 33, 33)
                        .addComponent(btn_consulte)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ename)
                    .addComponent(txt_names, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ecode)
                    .addComponent(txt_codee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_extension)
                    .addComponent(txt_extensione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_addresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_eaddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_crop)
                    .addComponent(txt_crope, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_workercode)
                    .addComponent(txt_codewe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registere)
                    .addComponent(btn_updatee)
                    .addComponent(btn_consulte))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registerwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerwActionPerformed
        if(txt_codew.getText().equals("") || txt_namew.getText().equals("") || txt_chargew.getText().equals("") || txt_sexw.getText().equals("") 
            || txt_contactw.getText().equals("") || txt_addressw.getText().equals("") || txt_mailw.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Please enter all the information", "Register", JOptionPane.ERROR_MESSAGE);
    }else{
        obj_allotment.add(new cls_allotment(txt_codew.getText(), txt_namew.getText(), txt_chargew.getText(), txt_sexw.getText(), txt_contactw.getText(),
                txt_addressw.getText(), txt_mailw.getText()));
    JOptionPane.showMessageDialog(null, "Succssful registration", "Register", JOptionPane.INFORMATION_MESSAGE);
    fnt_clear();
        }
    }//GEN-LAST:event_btn_registerwActionPerformed

    private void fnt_clear(){
        txt_codew.setText("");
        txt_codee.setText("");
        txt_chargew.setText("");
        txt_contactw.setText("");
        txt_crop.setText("");
        txt_addressw.setText("");
        txt_addresse.setText("");
        txt_mailw.setText("");
        txt_extension.setText("");
        txt_namew.setText("");
        txt_names.setText("");
        txt_sexw.setText("");
        txt_codewe.setText("");
        txt_codew.requestFocus();
        }
    
    private void btn_updatewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updatewActionPerformed
        
    }//GEN-LAST:event_btn_updatewActionPerformed

    private void btn_consultwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultwActionPerformed
        bln_sw = false;
        int_position = 0;
        
        if(txt_codew.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Enter the worker code!", "Consult", JOptionPane.ERROR_MESSAGE);
        }else{
            for(int i = 0; i < obj_workers.size(); i++){
                if(txt_codew.getText().equals(obj_workers.get(i).getStr_code())){
                    bln_sw = true;
                    int_position = i;
                }
            }
            if(bln_sw == false){
                JOptionPane.showMessageDialog(null, "Not records found", "Consult", JOptionPane.ERROR_MESSAGE);
            }else{
                txt_chargew.setText(obj_workers.get(int_position).getStr_charge());
                txt_contactw.setText(obj_workers.get(int_position).getStr_contact());
                txt_addressw.setText(obj_workers.get(int_position).getStr_address());
                txt_namew.setText(obj_workers.get(int_position).getStr_name());
                txt_sexw.setText(obj_workers.get(int_position).getStr_sex());
            }
        }
    }//GEN-LAST:event_btn_consultwActionPerformed

    private void btn_registereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registereActionPerformed
        if(txt_codee.getText().equals("") || txt_names.getText().equals("") || txt_extensione.getText().equals("") || txt_addresse.getText().equals("") 
            || txt_crop.getText().equals("") || txt_codewe.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Please enter all the information", "Register", JOptionPane.ERROR_MESSAGE);
    }else{
        obj_allotment.add(new cls_allotment(txt_codee.getText(), txt_names.getText(), txt_extensione.getText(), txt_addresse.getText(), 
                txt_contactw.getText(), txt_crop.getText(), txt_codewe.getText()));
    JOptionPane.showMessageDialog(null, "Succssful registration", "Register", JOptionPane.INFORMATION_MESSAGE);
    fnt_clear();
        }
    }//GEN-LAST:event_btn_registereActionPerformed

    private void btn_updateeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_updateeActionPerformed

    private void btn_consulteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consulteActionPerformed
        bln_sw2 = false;
        int_position2 = 0;
        
        if(txt_codee.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Enter the allotment code!", "Consult", JOptionPane.ERROR_MESSAGE);
        }else{
            for(int i = 0; i < obj_allotment.size(); i++){
                if(txt_codew.getText().equals(obj_allotment.get(i).getStr_code())){
                    bln_sw2 = true;
                    int_position2 = i;
                }
            }
            if(bln_sw2 == false){
                JOptionPane.showMessageDialog(null, "Not records found", "Consult", JOptionPane.ERROR_MESSAGE);
            }else{
                txt_names.setText(obj_allotment.get(int_position2).getStr_name());
                txt_extensione.setText(obj_allotment.get(int_position2).getStr_extension());
                txt_addresse.setText(obj_allotment.get(int_position2).getStr_address());
                txt_crope.setText(obj_allotment.get(int_position2).getStr_crop());
                txt_codewe.setText(obj_allotment.get(int_position2).getStr_worker_code());
            }
        }
    }//GEN-LAST:event_btn_consulteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new fmr_graphic_state().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consulte;
    private javax.swing.JButton btn_consultw;
    private javax.swing.JButton btn_registere;
    private javax.swing.JButton btn_registerw;
    private javax.swing.JButton btn_updatee;
    private javax.swing.JButton btn_updatew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txt_addresse;
    private javax.swing.JTextField txt_addressw;
    private javax.swing.JLabel txt_charge;
    private javax.swing.JTextField txt_chargew;
    private javax.swing.JTextField txt_codee;
    private javax.swing.JTextField txt_codew;
    private javax.swing.JTextField txt_codewe;
    private javax.swing.JLabel txt_contact;
    private javax.swing.JTextField txt_contactw;
    private javax.swing.JLabel txt_crop;
    private javax.swing.JTextField txt_crope;
    private javax.swing.JLabel txt_eaddress;
    private javax.swing.JLabel txt_ecode;
    private javax.swing.JLabel txt_ename;
    private javax.swing.JLabel txt_extension;
    private javax.swing.JTextField txt_extensione;
    private javax.swing.JLabel txt_mail;
    private javax.swing.JTextField txt_mailw;
    private javax.swing.JTextField txt_names;
    private javax.swing.JTextField txt_namew;
    private javax.swing.JLabel txt_sex;
    private javax.swing.JTextField txt_sexw;
    private javax.swing.JLabel txt_waddress;
    private javax.swing.JLabel txt_wcode;
    private javax.swing.JLabel txt_wname;
    private javax.swing.JLabel txt_workercode;
    // End of variables declaration//GEN-END:variables
}

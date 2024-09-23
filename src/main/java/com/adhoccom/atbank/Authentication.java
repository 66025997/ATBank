/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.adhoccom.atbank;

import com.adhoccom.atbank.Main.Account;
import com.adhoccom.atbank.Main.User;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.extras.FlatSVGIcon.ColorFilter;

/**
 *
 * @author dermh
 */
public class Authentication extends javax.swing.JFrame {

    /**
     * Creates new form Authentication
     */
    public Authentication() {
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
            javax.swing.UIManager.put("Button.arc", 15);
            javax.swing.UIManager.put("Component.arc", 15);
            javax.swing.UIManager.put("ProgressBar.arc", 999);
            javax.swing.UIManager.put("TextComponent.arc", 15);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
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

        welcome = new javax.swing.JPanel();
        app = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        authentication = new javax.swing.JPanel();
        signIn = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        IDPanel = new javax.swing.JPanel();
        IDLabel = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        passwordPanel = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        passwordPasswordField = new javax.swing.JPasswordField();
        signInResultLabel = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        signUp = new javax.swing.JPanel();
        createAccountLabel = new javax.swing.JLabel();
        namePanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        newPasswordPanel = new javax.swing.JPanel();
        newPasswordLabel = new javax.swing.JLabel();
        newPasswordPasswordField = new javax.swing.JPasswordField();
        confirmPasswordPanel = new javax.swing.JPanel();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPasswordPasswordField = new javax.swing.JPasswordField();
        signUpButton = new javax.swing.JButton();
        signUpResult = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATBank");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setFont(new java.awt.Font("Kanit", 0, 10)); // NOI18N
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/com/adhoccom/atbank/icons/credit-card-24.png")).getImage());

        welcome.setBackground(new java.awt.Color(102, 0, 204));

        app.setBackground(new java.awt.Color(0, 153, 255));
        app.setFont(new java.awt.Font("Kanit Black", 1, 18)); // NOI18N
        app.setForeground(new java.awt.Color(255, 255, 255));
        app.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        app.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/adhoccom/atbank/icons/credit-card-24.png"))); // NOI18N
        app.setText("ATBank");
        app.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        app.setIconTextGap(10);

        titleLabel.setBackground(new java.awt.Color(0, 153, 255));
        titleLabel.setFont(new java.awt.Font("Kanit", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("คิดจะฝาก คิดถึง ATBank");
        titleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ระบบธนาคารออนไลน์ โอนเร็ว ถอนง่าย ได้ไว!");

        jLabel8.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("เริ่มต้นง่าย ๆ ในไม่กี่คลิก");

        jLabel9.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/adhoccom/atbank/icons/checked-16.png"))); // NOI18N
        jLabel9.setText("สะดวก");

        jLabel10.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/adhoccom/atbank/icons/checked-16.png"))); // NOI18N
        jLabel10.setText("รวดเร็ว");

        jLabel11.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/adhoccom/atbank/icons/checked-16.png"))); // NOI18N
        jLabel11.setText("ปลอดภัย");

        javax.swing.GroupLayout welcomeLayout = new javax.swing.GroupLayout(welcome);
        welcome.setLayout(welcomeLayout);
        welcomeLayout.setHorizontalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(app)
                    .addComponent(jLabel7)
                    .addComponent(titleLabel))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        welcomeLayout.setVerticalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(app, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        getContentPane().add(welcome, java.awt.BorderLayout.LINE_START);

        authentication.setBackground(new java.awt.Color(241, 243, 249));
        authentication.setLayout(new java.awt.CardLayout(20, 20));

        signIn.setBackground(new java.awt.Color(241, 243, 249));

        welcomeLabel.setFont(new java.awt.Font("Kanit", 1, 18)); // NOI18N
        welcomeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/adhoccom/atbank/icons/waving-hand-24.png"))); // NOI18N
        welcomeLabel.setText("ยินดีต้อนรับ");

        IDPanel.setBackground(new java.awt.Color(241, 243, 249));
        IDPanel.setLayout(new java.awt.GridLayout(2, 0));

        IDLabel.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        IDLabel.setLabelFor(IDTextField);
        IDLabel.setText("เลขบัญชี");
        IDPanel.add(IDLabel);

        IDTextField.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        IDTextField.setMargin(new java.awt.Insets(8, 8, 8, 8));
        IDPanel.add(IDTextField);

        passwordPanel.setBackground(new java.awt.Color(241, 243, 249));
        passwordPanel.setLayout(new java.awt.GridLayout(2, 0));

        passwordLabel.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        passwordLabel.setText("รหัสผ่าน");
        passwordPanel.add(passwordLabel);

        passwordPasswordField.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        passwordPasswordField.setMargin(new java.awt.Insets(8, 8, 8, 8));
        passwordPanel.add(passwordPasswordField);

        signInButton.setBackground(new java.awt.Color(102, 0, 204));
        signInButton.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        signInButton.setForeground(new java.awt.Color(255, 255, 255));
        signInButton.setIcon(new FlatSVGIcon("com/adhoccom/atbank/icons/arrow-alt-circle-right.svg", 16, 16).setColorFilter(new ColorFilter(color -> new java.awt.Color(255, 255, 255)))
        );
        signInButton.setText("ลงชื่อเข้าใช้");
        signInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInButton.setIconTextGap(5);
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(241, 243, 249));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jLabel2.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ยังไม่มีบัญชี?");
        jPanel1.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 102));
        jLabel3.setText("สมัครสมาชิกเลย!");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);

        javax.swing.GroupLayout signInLayout = new javax.swing.GroupLayout(signIn);
        signIn.setLayout(signInLayout);
        signInLayout.setHorizontalGroup(
            signInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signInLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(signInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IDPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signInResultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signInButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                .addGap(80, 80, 80))
        );
        signInLayout.setVerticalGroup(
            signInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInLayout.createSequentialGroup()
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IDPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signInResultLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        authentication.add(signIn, "signIn");

        signUp.setBackground(new java.awt.Color(241, 243, 249));
        signUp.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N

        createAccountLabel.setFont(new java.awt.Font("Kanit", 1, 18)); // NOI18N
        createAccountLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/adhoccom/atbank/icons/high-voltage-24.png"))); // NOI18N
        createAccountLabel.setText("เริ่มสร้างบัญชี");

        namePanel.setBackground(new java.awt.Color(241, 243, 249));
        namePanel.setLayout(new java.awt.GridLayout(2, 0));

        nameLabel.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        nameLabel.setText("ชื่อ");
        namePanel.add(nameLabel);

        nameTextField.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        nameTextField.setActionCommand("<Not Set>");
        nameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nameTextField.setMargin(new java.awt.Insets(8, 8, 8, 8));
        nameTextField.setNextFocusableComponent(newPasswordPasswordField);
        namePanel.add(nameTextField);

        newPasswordPanel.setBackground(new java.awt.Color(241, 243, 249));
        newPasswordPanel.setLayout(new java.awt.GridLayout(2, 0));

        newPasswordLabel.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        newPasswordLabel.setText("รหัสผ่านใหม่");
        newPasswordPanel.add(newPasswordLabel);

        newPasswordPasswordField.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        newPasswordPasswordField.setMargin(new java.awt.Insets(8, 8, 8, 8));
        newPasswordPasswordField.setNextFocusableComponent(confirmPasswordPasswordField);
        newPasswordPanel.add(newPasswordPasswordField);

        confirmPasswordPanel.setBackground(new java.awt.Color(241, 243, 249));
        confirmPasswordPanel.setLayout(new java.awt.GridLayout(2, 0));

        confirmPasswordLabel.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        confirmPasswordLabel.setText("ยืนยันรหัสผ่าน");
        confirmPasswordPanel.add(confirmPasswordLabel);

        confirmPasswordPasswordField.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        confirmPasswordPasswordField.setMargin(new java.awt.Insets(8, 8, 8, 8));
        confirmPasswordPasswordField.setNextFocusableComponent(signUpButton);
        confirmPasswordPanel.add(confirmPasswordPasswordField);

        signUpButton.setBackground(new java.awt.Color(102, 0, 204));
        signUpButton.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(255, 255, 255));
        signUpButton.setIcon(new FlatSVGIcon("com/adhoccom/atbank/icons/add.svg", 16, 16).setColorFilter(new ColorFilter(color -> new java.awt.Color(255, 255, 255)))
        );
        signUpButton.setText("สมัครสมาชิก");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(241, 243, 249));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jLabel5.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("มีบัญชีอยู่แล้ว?");
        jPanel4.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Kanit", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 102));
        jLabel6.setText("ลงชื่อเข้าใช้งาน");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel6);

        javax.swing.GroupLayout signUpLayout = new javax.swing.GroupLayout(signUp);
        signUp.setLayout(signUpLayout);
        signUpLayout.setHorizontalGroup(
            signUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(signUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmPasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newPasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signUpResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(signUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80))
        );
        signUpLayout.setVerticalGroup(
            signUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(createAccountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUpResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        authentication.add(signUp, "signUp");

        getContentPane().add(authentication, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        // TODO add your handling code here:
        if (IDTextField.getText().isEmpty()) {
            signInResultLabel.setText("Please enter your account number");
            return;
        }
        if (passwordPasswordField.getPassword().length == 0) {
            signInResultLabel.setText("Please enter your account password");
            return;
        }

        User user = new User();
        Account account = user.login(IDTextField.getText(), new String(passwordPasswordField.getPassword()));

        if (account != null) {
            setVisible(false);
            new Home(account).setVisible(true);
        } else {
            signInResultLabel.setText("Account number or password is not correct.");
        }

        java.util.Arrays.fill(passwordPasswordField.getPassword(), '0'); // Clear the password for security
        passwordPasswordField.selectAll();
    }//GEN-LAST:event_signInButtonActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        java.awt.CardLayout card = (java.awt.CardLayout) authentication.getLayout();
        card.show(authentication, "signUp");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        if (nameTextField.getText().isEmpty()) {
            signUpResult.setText("Please enter your name");
            return;
        }
        if (newPasswordPasswordField.getPassword().length == 0) {
            signUpResult.setText("Please enter your password");
            return;
        }
        if (confirmPasswordPasswordField.getPassword().length == 0) {
            signUpResult.setText("Please confirm your password again");
            return;
        }
        if (confirmPasswordPasswordField.getPassword().length >= 6) {
            signUpResult.setText("Requires a length greater than or equal to six.");
            return;
        }
        if (!(java.util.Arrays.equals(newPasswordPasswordField.getPassword(), confirmPasswordPasswordField.getPassword()))) {
            signUpResult.setText("Your password is not match, try to re-enter again or change to new password");
            return;
        }

        User user = new User();
        Account account = user.register(nameTextField.getText(), new String(newPasswordPasswordField.getPassword()));

        if (account != null) {
            java.awt.CardLayout card = (java.awt.CardLayout) authentication.getLayout();

            nameTextField.setText("");
            newPasswordPasswordField.setText("");
            confirmPasswordPasswordField.setText("");
            IDTextField.setText(account.getID());
            passwordPasswordField.setText("");
            card.show(authentication, "signIn");
        } else {
            signUpResult.setText("Account already exists with this name!");
        }
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        java.awt.CardLayout card = (java.awt.CardLayout) authentication.getLayout();
        card.show(authentication, "signIn");
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLabel;
    private javax.swing.JPanel IDPanel;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JLabel app;
    private javax.swing.JPanel authentication;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPanel confirmPasswordPanel;
    private javax.swing.JPasswordField confirmPasswordPasswordField;
    private javax.swing.JLabel createAccountLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel namePanel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JPanel newPasswordPanel;
    private javax.swing.JPasswordField newPasswordPasswordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JPasswordField passwordPasswordField;
    private javax.swing.JPanel signIn;
    private javax.swing.JButton signInButton;
    private javax.swing.JLabel signInResultLabel;
    private javax.swing.JPanel signUp;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel signUpResult;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel welcome;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}

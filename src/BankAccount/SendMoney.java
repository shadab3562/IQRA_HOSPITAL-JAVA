/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BankAccount;

import Images.AppIcon;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author shada
 */
public class SendMoney extends javax.swing.JFrame {

    /**
     * Creates new form SendMoney
     */
    int userAccountNumber;
    int accountNo;
    String naam;

    public SendMoney() {
        initComponents();

        restrict();
    }

    public SendMoney(int userAccountNumber, int accountNo, String naam) {
        initComponents();
        AppIcon.setIcon(this);
        this.naam = naam;
        this.userAccountNumber = userAccountNumber;
        this.accountNo = accountNo;
        updateName();

        restrict();
    }

    public void restrict() {
        txtAmount.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) || txtAmount.getText().length() >= 6) {
                    e.consume(); // Consume (ignore) the typed non-integer character or if the length is already 3 or more.
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }

    String userName;

    private void updateName() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iqrahospital", "root", "");

            // Retrieve the data using the unique ID
            String selectStatement = "SELECT * FROM BankAccount WHERE accountNumber = ?";
            PreparedStatement stmt = conn.prepareStatement(selectStatement);
            stmt.setInt(1, userAccountNumber);
            ResultSet result = stmt.executeQuery();

            // Retrieve the first row of data
            if (result.next()) {
                userName = result.getString("AccountTitle");
                usersName.setText(userName);

            }

            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e + "Something went wrong! Try again later");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        usersName = new javax.swing.JLabel();
        Proceed = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Proceed1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IQRA HOSPITAL");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(18, 25, 67));

        usersName.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        usersName.setForeground(new java.awt.Color(255, 255, 255));
        usersName.setText("Name Here");

        Proceed.setBackground(new java.awt.Color(18, 25, 67));
        Proceed.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Proceed.setForeground(new java.awt.Color(255, 255, 255));
        Proceed.setText("SEND MONEY");
        Proceed.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedActionPerformed(evt);
            }
        });

        txtAmount.setBackground(new java.awt.Color(18, 25, 67));
        txtAmount.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        txtAmount.setForeground(new java.awt.Color(255, 255, 255));
        txtAmount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ScreensLogo.png"))); // NOI18N
        jLabel2.setAlignmentX(1.0F);
        jLabel2.setAlignmentY(1.0F);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ACCOUNT TITLE");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENTER AMOUNT");

        Proceed1.setBackground(new java.awt.Color(18, 25, 67));
        Proceed1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Proceed1.setForeground(new java.awt.Color(255, 255, 255));
        Proceed1.setText("BACK");
        Proceed1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Proceed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proceed1ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Version 2.0");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html><u>SEND MONEY</u></html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(usersName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Proceed1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(185, 185, 185))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usersName)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Proceed1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Proceed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proceed1ActionPerformed
        MyAccount mma = new MyAccount(accountNo);
        mma.setVisible(true);
        dispose();
    }//GEN-LAST:event_Proceed1ActionPerformed

    private void ProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedActionPerformed

        if (txtAmount.getText().length() == 0 || !txtAmount.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "Invalid Fees!");
        } else {
            String amountString = txtAmount.getText();
            amount = Integer.parseInt(amountString);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iqrahospital", "root", "");
                String selectStatement = "SELECT * FROM BankAccount WHERE AccountNumber = ?";
                PreparedStatement stmt = conn.prepareStatement(selectStatement);
                stmt.setInt(1, accountNo);
                ResultSet result = stmt.executeQuery();

                String usersSelectStatement = "SELECT * FROM BankAccount WHERE AccountNumber = ?";
                PreparedStatement ustmt = conn.prepareStatement(usersSelectStatement);
                ustmt.setInt(1, userAccountNumber);
                ResultSet userResult = ustmt.executeQuery();

                // Retrieve the first row of data
                if (result.next() && userResult.next()) {
                    //Personal Account Balance

                    double Balance = result.getDouble("Balance");
                    double FinalBalance = Balance - amount;

                    //User Account Balance
                    double UserBalance = userResult.getDouble("Balance");
                    double UserFinalBalance = UserBalance + amount;

                    if (Balance >= amount) {
                        transaction();
                        //Personal Bank Account Update
                        String updateStatement = "UPDATE BankAccount SET balance = ? WHERE AccountNumber = ?";
                        PreparedStatement ptst = conn.prepareStatement(updateStatement);
                        ptst.setDouble(1, FinalBalance);
                        ptst.setInt(2, accountNo);
                        ptst.executeUpdate();

                        //2nd User Bank Account Update
                        String UserupdateStatement = "UPDATE BankAccount SET balance = ? WHERE AccountNumber = ?";
                        PreparedStatement uptst = conn.prepareStatement(UserupdateStatement);
                        uptst.setDouble(1, UserFinalBalance);
                        uptst.setInt(2, userAccountNumber);
                        uptst.executeUpdate();

                        conn.close();
                        JOptionPane.showMessageDialog(this, "Transaction Successfull");
                        MyAccount ma = new MyAccount(accountNo);
                        ma.setVisible(true);
                        dispose();

                    } else {
                        JOptionPane.showMessageDialog(this, "You dont have enough balance");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Data Doesnt Found");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Something went wrong! Try again later");
            }
        }
    }//GEN-LAST:event_ProceedActionPerformed

    int amount;

    public void transaction() {
        // Create a Date object with your date and time.
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy, hh:mm a", Locale.ENGLISH);
        String formattedDate = sdf.format(date);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iqrahospital", "root", "");
            String insertStatement = "INSERT INTO transaction (SenderNo, SenderName, ReceiverNo, ReceiverName,Amount, date) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ptst = conn.prepareStatement(insertStatement);

            //Set parameter value where ? in SQL Query
            ptst.setInt(1, accountNo);
            ptst.setString(2, naam);
            ptst.setInt(3, userAccountNumber);
            ptst.setString(4, userName);
            ptst.setDouble(5, amount);
            ptst.setString(6, formattedDate);
            ptst.executeUpdate();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e + "Something went wrong! Try again later");
        }
    }


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
            java.util.logging.Logger.getLogger(SendMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SendMoney().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Proceed;
    private javax.swing.JButton Proceed1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JLabel usersName;
    // End of variables declaration//GEN-END:variables
}
package iqrahospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author shada
 */
public class CreditCard extends javax.swing.JFrame {

    /**
     * Creates new form FirstScreen
     */
    int mrNumber;
    int getFees;
    String selectedDoctor;

    public CreditCard(int mrNumber, int getFees, String selectedDoctor) {
        initComponents();
        Images.AppIcon.setIcon(this);
        this.mrNumber = mrNumber;
        this.getFees = getFees;
        this.selectedDoctor = selectedDoctor;
    }

    public CreditCard() {
        initComponents();
        Images.AppIcon.setIcon(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCardNum = new javax.swing.JTextField();
        payNow = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtExp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCvv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WELCOME TO IQRA HOSPITAL!");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(18, 25, 67));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 6));
        jPanel1.setPreferredSize(new java.awt.Dimension(590, 400));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENTER YOUR CARD NUMBER");

        txtCardNum.setBackground(new java.awt.Color(18, 25, 67));
        txtCardNum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCardNum.setForeground(new java.awt.Color(255, 255, 255));
        txtCardNum.setText("54325");
        txtCardNum.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtCardNum.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCardNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardNumActionPerformed(evt);
            }
        });

        payNow.setBackground(new java.awt.Color(18, 25, 67));
        payNow.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        payNow.setForeground(new java.awt.Color(255, 255, 255));
        payNow.setText("Pay Now →");
        payNow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        payNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payNowActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(18, 25, 67));
        btnBack.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("← Back");
        btnBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EXP DATE");

        txtExp.setBackground(new java.awt.Color(18, 25, 67));
        txtExp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtExp.setForeground(new java.awt.Color(255, 255, 255));
        txtExp.setText("9483");
        txtExp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtExp.setCaretColor(new java.awt.Color(255, 255, 255));
        txtExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CVV");

        txtCvv.setBackground(new java.awt.Color(18, 25, 67));
        txtCvv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCvv.setForeground(new java.awt.Color(255, 255, 255));
        txtCvv.setText("688");
        txtCvv.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtCvv.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CARD DETAILS");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ScreensLogo.png"))); // NOI18N
        jLabel1.setAlignmentX(1.0F);
        jLabel1.setAlignmentY(1.0F);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Version 2.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 132, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(payNow, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCardNum)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtExp)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCvv, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCardNum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCvv))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payNow, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(16, 16, 16))
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


    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Payment fs = new Payment(selectedDoctor, mrNumber);
        fs.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnBackActionPerformed

    int otp;
    String accountEmail;

    public void sendEmail() {
        // Recipient's email ID needs to be mentioned.
        String to = accountEmail;
        // Sender's email ID needs to be mentioned
        String from = "iqrahospital3@gmail.com";

        // Assuming you are sending email from through gmail smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587"); 
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

        // Get the Session object and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("iqrahospital3@gmail.com", "jhxfigibfvevwule");
            }
        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("You Receive OTP To pay at IQRA Hospital");

            // Now set the actual message
            message.setText("Your OTP is: " + otp);

            System.out.println("Sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

    int accNo;
    String accTitle;

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
            ptst.setInt(1, accNo);
            ptst.setString(2, accTitle);
            ptst.setInt(3, 54321);
            ptst.setString(4, "IQRA HOSPITAL");
            ptst.setDouble(5, getFees);
            ptst.setString(6, formattedDate);
            ptst.executeUpdate();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e + "Something went wrong! Try again later");
        }
    }

    public double getIqraBalance() {
        double iqraBalance = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iqrahospital", "root", "");
            // Retrieve the data using the unique ID
            String selectStatement = "SELECT * FROM BankAccount WHERE AccountNumber = ?";
            PreparedStatement stmt = conn.prepareStatement(selectStatement);
            stmt.setInt(1, 54321);
            ResultSet result = stmt.executeQuery();

            // Retrieve the first row of data
            if (result.next()) {
                iqraBalance = result.getDouble("balance");
            }
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e + "Something went wrong! Try again later");
        }
        return iqraBalance;
    }

    private void payNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payNowActionPerformed

        int cvv;
        int exp;
        int bal;

        if (txtCardNum.getText().length() == 0 || !txtCardNum.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Invalid Account Number!");
        } else if (txtCvv.getText().length() == 0 || !txtCvv.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Invalid CVV!");
        } else if (txtExp.getText().length() == 0 || !txtExp.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Invalid EXP date!");
        } else {

            try {

                int enteredCVV = Integer.parseInt(txtCvv.getText());
                int enteredExp = Integer.parseInt(txtExp.getText());
                int cardNumber = Integer.parseInt(txtCardNum.getText());
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iqrahospital", "root", "");

                // Retrieve the data using the unique ID
                String selectStatement = "SELECT * FROM BankAccount WHERE accountNumber = ?";
                PreparedStatement stmt = conn.prepareStatement(selectStatement);
                stmt.setInt(1, cardNumber);
                ResultSet result = stmt.executeQuery();

                // Retrieve the first row of data
                if (result.next()) {
                    cvv = result.getInt("cvv");
                    exp = result.getInt("exp");
                    bal = result.getInt("balance");
                    accNo = result.getInt("AccountNumber");
                    accTitle = result.getString("AccountTitle");
                    accountEmail = result.getString("Email");

                    if (cvv == enteredCVV && exp == enteredExp) {

                        Random random = new Random();
                        otp = random.nextInt(879);
                        System.out.println("OTP is: " + otp);

                        sendEmail();
                        String enteredOtpStr = JOptionPane.showInputDialog(rootPane, "Enter OTP(Received on Your email): ");

                        if (enteredOtpStr != null) {
                            int enteredOtp = Integer.parseInt(enteredOtpStr);

                            if (otp == enteredOtp) {

                                if (bal > getFees) {
                                    transaction();
                                    //Update Status of Payment in DB
                                    String updateStatement = "UPDATE patientdata SET PaymentStatus = ? WHERE mrNumber = ?";
                                    PreparedStatement ptst = conn.prepareStatement(updateStatement);
                                    ptst.setString(1, "Paid");
                                    ptst.setInt(2, mrNumber);
                                    ptst.executeUpdate();

                                    //Update Balance in DB
                                    int finalBalance = bal - getFees;
                                    String updateStatement1 = "UPDATE BankAccount SET Balance = ? WHERE AccountNumber = ?";
                                    PreparedStatement ptst1 = conn.prepareStatement(updateStatement1);
                                    ptst1.setInt(1, finalBalance);
                                    ptst1.setInt(2, cardNumber);
                                    ptst1.executeUpdate();

                                    //Update Balance in DB
                                    double iqraFinalBalance = getIqraBalance() + getFees;
                                    String updateStatement2 = "UPDATE BankAccount SET Balance = ? WHERE AccountNumber = ?";
                                    PreparedStatement ptst2 = conn.prepareStatement(updateStatement2);
                                    ptst2.setDouble(1, iqraFinalBalance);
                                    ptst2.setInt(2, 54321);
                                    ptst2.executeUpdate();
                                    
                                    JOptionPane.showMessageDialog(this, "Amount Recieved!");
                                    AppoinmentDetails ad = new AppoinmentDetails(mrNumber);
                                    ad.setVisible(true);
                                    this.setVisible(false);
                                } else {
                                    JOptionPane.showMessageDialog(this, "You cant have enough balance");
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "Your Entered Wrong OTP");
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "Invalid Details");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalid Details");
                    }
                    conn.close();
                }else{
                    JOptionPane.showMessageDialog(this, "Account Not Found");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e + "Something went wrong! Try again later");
            }
        }
    }//GEN-LAST:event_payNowActionPerformed

    private void txtCardNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCardNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCardNumActionPerformed

    private void txtExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpActionPerformed

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
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton payNow;
    private javax.swing.JTextField txtCardNum;
    private javax.swing.JTextField txtCvv;
    private javax.swing.JTextField txtExp;
    // End of variables declaration//GEN-END:variables
}

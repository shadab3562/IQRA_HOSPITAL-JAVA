package iqrahospital;

//import com.sun.jdi.connect.spi.Connection;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author shada
 */
public class MRScreen extends javax.swing.JFrame {

    /**
     * Creates new form FirstScreen
     */
    public MRScreen() {
        initComponents();
        Images.AppIcon.setIcon(this);
        mrNumberr.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // Consume (ignore) the typed non-integer character
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Not used in this example
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Not used in this example
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mrNumberr = new javax.swing.JTextField();
        btnProceed = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        newUser = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WELCOME TO IQRA HOSPITAL!");
        setIconImages(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(18, 25, 67));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 6));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ScreensLogo.png"))); // NOI18N
        jLabel1.setAlignmentX(1.0F);
        jLabel1.setAlignmentY(1.0F);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ENTER YOUR MEDICAL RECORD NUMBER");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mrNumberr.setBackground(new java.awt.Color(18, 25, 67));
        mrNumberr.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mrNumberr.setForeground(new java.awt.Color(255, 255, 255));
        mrNumberr.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        mrNumberr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrNumberrActionPerformed(evt);
            }
        });

        btnProceed.setBackground(new java.awt.Color(18, 25, 67));
        btnProceed.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnProceed.setForeground(new java.awt.Color(255, 255, 255));
        btnProceed.setText("Proceed →");
        btnProceed.setAlignmentX(0.5F);
        btnProceed.setAlignmentY(0.8F);
        btnProceed.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(18, 25, 67));
        btnback.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("← Back");
        btnback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackMouseClicked(evt);
            }
        });
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        newUser.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        newUser.setForeground(new java.awt.Color(255, 255, 255));
        newUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newUser.setText("<html><u>New Patient? Click Here!</u><html>");
        newUser.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                newUserAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        newUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newUserMouseClicked(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Version 2.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(mrNumberr, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 88, Short.MAX_VALUE)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newUser)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mrNumberr, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int generatedId;


    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        // Create a Date object with your date and time.
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy, hh:mm a", Locale.ENGLISH);
        String formattedDate = sdf.format(date);

        if (mrNumberr.getText().length() == 0 || !mrNumberr.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Invalid MR Number!");
        } //Validate Mr Number Textbox to only get Number
        else {
            String mr = mrNumberr.getText();
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iqrahospital", "root", "");
                String selectStatement = "SELECT * FROM records WHERE RecordNumber = ?";
                PreparedStatement stmt = conn.prepareStatement(selectStatement);
                stmt.setString(1, mrNumberr.getText());
                ResultSet result = stmt.executeQuery();

                //Check weather Appointment Number is found in DB
                if (result.next()) {
                    String firstName = result.getString("FirstName");
                    String lastName = result.getString("LastName");
                    int age = result.getInt("age");
                    String gender = result.getString("gender");
                    String email = result.getString("email");
                    System.out.println("ID found!");
                    try {
                        //Set Driver Of SQL
                        Class.forName("com.mysql.jdbc.Driver");
                        // INSERT Query of SQL using to get insert data
                        String insertStatement = "INSERT INTO patientdata (RecordNumber, FirstName, LastName, age, gender, email, date) VALUES (?, ?, ?, ?, ?, ?, ?)";
                        //PreparedStatement is used to execute SQL Queries and Statement.RETURN_GENERATED_KEYS is used to get Unique ID
                        PreparedStatement ptst = conn.prepareStatement(insertStatement, java.sql.Statement.RETURN_GENERATED_KEYS);

                        //Set parameter value where ? in SQL Query
                        ptst.setString(1, mr);
                        ptst.setString(2, firstName);
                        ptst.setString(3, lastName);
                        ptst.setInt(4, age);
                        ptst.setString(5, gender);
                        ptst.setString(6, email);
                        ptst.setString(7, formattedDate);
                        ptst.executeUpdate();

                        // Retrieve the generated ID
                        ResultSet rs = ptst.getGeneratedKeys();
                        generatedId = 0;
                        if (rs.next()) {
                            generatedId = rs.getInt(1);
                        }
                        conn.close();
                        ThirdScreen ts = new ThirdScreen(firstName, generatedId);
                        ts.setVisible(true);
                        this.setVisible(false);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e + "Something went wrong! Try again later");
                    }

                    ThirdScreen ts = new ThirdScreen(firstName, generatedId);
                    ts.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Appoinment Not Found!");
                }

                conn.close();
            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, e + "Something went wrong! Try again later");
            }

        }
    }//GEN-LAST:event_btnProceedActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        FirstScreen fs = new FirstScreen();
        fs.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void newUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newUserMouseClicked

        SecondScreen sc = new SecondScreen();
        sc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_newUserMouseClicked

    private void newUserAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_newUserAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_newUserAncestorAdded

    private void mrNumberrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrNumberrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mrNumberrActionPerformed

    private void btnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackMouseClicked

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
            java.util.logging.Logger.getLogger(MRScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MRScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MRScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MRScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MRScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProceed;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mrNumberr;
    private javax.swing.JLabel newUser;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author devika
 */
public class FacultyHomePage extends javax.swing.JFrame {

    /**
     * Creates new form FacultyHomePage
     */
    String Uname;
    MainWindow prev;
    public FacultyHomePage(String username,MainWindow prev) {
        Uname = username;
        this.prev=prev;
        initComponents();
    }
//    public FacultyHomePage(){
//        initComponents();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreateNewTestButton = new javax.swing.JButton();
        ViewUpcomingTestsButton = new javax.swing.JButton();
        ViewPreviousTestsButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CreateNewTestButton.setText("Create New Test");
        CreateNewTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewTestButtonActionPerformed(evt);
            }
        });

        ViewUpcomingTestsButton.setText("View Upcoming Tests");
        ViewUpcomingTestsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewUpcomingTestsButtonActionPerformed(evt);
            }
        });

        ViewPreviousTestsButton.setText("View Previous Tests");
        ViewPreviousTestsButton.setToolTipText("");
        ViewPreviousTestsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPreviousTestsButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Logout");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(CreateNewTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewUpcomingTestsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewPreviousTestsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(CreateNewTestButton)
                .addGap(38, 38, 38)
                .addComponent(ViewUpcomingTestsButton)
                .addGap(43, 43, 43)
                .addComponent(ViewPreviousTestsButton)
                .addGap(39, 39, 39)
                .addComponent(ExitButton)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateNewTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNewTestButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new CreateNewTest(Uname,this).setVisible(true);
    }//GEN-LAST:event_CreateNewTestButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        prev.setVisible(true);    // Need to find a way to clear username and password
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ViewPreviousTestsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPreviousTestsButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ViewPreviousTests(this).setVisible(true);
    }//GEN-LAST:event_ViewPreviousTestsButtonActionPerformed

    private void ViewUpcomingTestsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewUpcomingTestsButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ViewUpcomingTests(this,Uname).setVisible(true);
    }//GEN-LAST:event_ViewUpcomingTestsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateNewTestButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton ViewPreviousTestsButton;
    private javax.swing.JButton ViewUpcomingTestsButton;
    // End of variables declaration//GEN-END:variables
}

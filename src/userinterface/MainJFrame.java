/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.*;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.DonorDirectory;
import Business.Person.Patient;
import Business.Person.PatientDirectory;
import Business.UserAccount.UserAccount;
import Business.Waitlist.Wait;
import Business.WorkQueue.OrganProcureWorkRequest;
import Business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import userinterface.DonorRole.DonorRegistrationFormJPanel;

/**
 *
 * @author Lingfeng
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    //private EnterpriseDirectory enterpriseDirectory;
     private DonorDirectory donorDirectory;
    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
        
        if(system.getEmployeeId()==0){
            system.setEmployeeId(20211001);
        }
        if(system.getDonorId()==0){
            system.setDonorId(9001);
        }
        if(system.getPatientId()==0){
            system.setPatientId(1001);
        }
        if(system.getWaitList()==null){
            system.setWaitList(new ArrayList<>());
        }
        if(system.getWorkQueue()==null){
            system.setWorkQueue(new WorkQueue());
        }
       

        
        
        
        JOptionPane.showMessageDialog(null,system.getDonorDirectory().size());
        JOptionPane.showMessageDialog(null, system.getWaitList().size());
        //system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(1).getOrganizationDirectory().getOrganizationList().get(0).setPatientDirectory(new PatientDirectory());
        /*System.out.println(system.getPatientId());
        System.out.println(system.getEmployeeId());
        System.out.println(system.getDonorId());
        System.out.println(system.getPatientDirectory().getPatientList());
        */
        //system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(0).setWorkQueue(new WorkQueue());
       //System.out.println(system.getNetworkList());
       /*System.out.println(system.getWaitList().get(1).getPatient().getName());
       System.out.println(system.getWaitList().get(1).getUrgency());
       System.out.println(system.getWaitList().get(1).getWaitlist());
       System.out.println(system.getWaitList().get(1).getPatient().getDoctor());
       
       
       
       
       System.out.println(system.getDonorDirectory().size());*/
        /*System.out.println("*******************************************************");
       for(Network n: system.getNetworkList()){
            for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                System.out.println(e.getEnterpriseType().getValue());
                if(e.getEnterpriseType().getValue().equalsIgnoreCase("Organ Bank")){
                    //System.out.println(e.getWorkQueue().getWorkRequestList().get(0).getSender());
                    
                    //System.out.println("YAY "+e.getWorkQueue().getWorkRequestList().get(0).getClass().getCanonicalName());
                    //System.out.println(((OrganProcureWorkRequest)e.getWorkQueue().getWorkRequestList().get(0)).getOrganList().get(0));    
                }
                
            }
        }*/
       //System.out.println("**********************************************************88");
       //System.out.println(system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(0).getOrganizationDirectory().getOrganizationList());//.get(2).getWorkQueue().getWorkRequestList().get(0));
       //System.out.println(system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(0).getOrganizationDirectory().getOrganizationList().get(2).getWorkQueue().getWorkRequestList().get(0).getReceiver());
       //System.out.println(system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(0).getOrganizationDirectory().getOrganizationList().get(2).getWorkQueue().getWorkRequestList().get(0).getMessage());
       //System.out.println(system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(0).getOrganizationDirectory().getOrganizationList().get(2).getWorkQueue().getWorkRequestList().get(0).getStatus());
       //System.out.println(system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(0).getOrganizationDirectory().getOrganizationList().get(2).getWorkQueue().getWorkRequestList().get(0).getRequestDate());
       //System.out.println(system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(0).getOrganizationDirectory().getOrganizationList().get(2).getWorkQueue().getWorkRequestList().get(0).getResolveDate());
       
       //System.out.println(system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(0).getOrganizationDirectory());
       //System.out.println(system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(1).getOrganizationDirectory().getOrganizationList().get(0).getPatientDirectory().getPatientList().get(0).getDoctor());
       
       //System.out.println(system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(0).getOrganizationDirectory().getOrganizationList().get(0).getPatientDirectory());
       //System.out.println(system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(1).getOrganizationDirectory().getOrganizationList().get(0).getEmployeeDirectory().getEmployeeList().get(1).getId());
       //System.out.println(system.getNetworkList().get(0).getName());
       //System.out.println(system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(0).getOrganizationDirectory().getOrganizationList());
        //System.out.println();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btn_login = new javax.swing.JButton();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        btn_donor = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setBorder(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(250, 1080));

        btn_login.setBackground(new java.awt.Color(255, 255, 255));
        btn_login.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        txt_username.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txt_username.setToolTipText("Enter your username");
        txt_username.setCaretColor(new java.awt.Color(204, 204, 204));
        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usernameKeyTyped(evt);
            }
        });

        txt_password.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lbl_username.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        lbl_username.setText("Username:");

        lbl_password.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        lbl_password.setText("Password:");

        btn_logout.setBackground(new java.awt.Color(255, 255, 255));
        btn_logout.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.setEnabled(false);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        btn_donor.setBackground(new java.awt.Color(255, 255, 255));
        btn_donor.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btn_donor.setText("Donor Registration");
        btn_donor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_donorActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginJLabel)
                .addGap(266, 266, 266))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_donor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_password))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_username)
                        .addGap(9, 9, 9)
                        .addComponent(txt_username))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel4)
                .addGap(133, 133, 133)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_username)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_password)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_login)
                    .addComponent(btn_logout))
                .addGap(40, 40, 40)
                .addComponent(btn_donor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginJLabel)
                .addContainerGap(681, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setBackground(new java.awt.Color(204, 204, 204));
        container.setPreferredSize(new java.awt.Dimension(1670, 1080));
        container.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_donorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_donorActionPerformed
      // TODO add your handling code here:
//        CardLayout layout=(CardLayout)container.getLayout();
//            container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system));
//            layout.next(container);
//        Enterprise inEnterprise=null;
//        Organization inOrganization=null;
        
        //DonorWorkAreaJPanel donorJPanel = new DonorWorkAreaJPanel(container, inOrganization, inEnterprise, system);
        //SplitPane.setRightComponent(donorJPanel);
        DonorRegistrationFormJPanel donorWorkAreaJPanel = new DonorRegistrationFormJPanel(container, system, donorDirectory, dB4OUtil);
          container.add("donorWorkAreaJPanel", donorWorkAreaJPanel);
          CardLayout layout=(CardLayout)container.getLayout();
          layout.next(container);
          
        //DonorRegistrationFormJPanel donorRegistrationJPanel = new DonorRegistrationFormJPanel((), system, email, city, donorDirectory)
                                         
    }//GEN-LAST:event_btn_donorActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        btn_logout.setEnabled(false);
        btn_donor.setEnabled(true);
        txt_username.setEnabled(true);
        txt_password.setEnabled(true);
        btn_login.setEnabled(true);

        txt_username.setText("");
        txt_password.setText("");

        container.removeAll();

        CardLayout layout=(CardLayout)container.getLayout();
        layout.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void txt_usernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_usernameKeyTyped

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // Get user name
       
        String userName = txt_username.getText();
        // Get Password
        char[] passwordCharArray = txt_password.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);
        
        Enterprise inEnterprise=null;
        Organization inOrganization=null;
        Network inNetwork=null;
        
        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                System.out.println(network.getEnterpriseDirectory().getEnterpriseList());
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    System.out.println(enterprise);
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    inNetwork=network;
                    if(userAccount==null){
                       //Step 3:check against each organization for each enterprise
                       for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                           userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                           if(userAccount!=null){ 
                               inNetwork=network;
                               inEnterprise=enterprise;
                               inOrganization=organization;
                               break;
                           }
                       }    
                    }
                    else{
                       inEnterprise=enterprise;
                       break;
                    }
                    if(inOrganization!=null){
                        break;
                    }  
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }
        
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)container.getLayout();
            container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system, inNetwork, donorDirectory));
            layout.next(container);
        }

        btn_login.setEnabled(false);
        btn_logout.setEnabled(true);
        btn_donor.setEnabled(false);
        txt_username.setEnabled(false);
        txt_password.setEnabled(false);
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_donor;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_logout;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}

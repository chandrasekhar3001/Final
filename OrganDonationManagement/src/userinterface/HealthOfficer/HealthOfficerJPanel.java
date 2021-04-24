/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthOfficer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.AwarnessCampaign;
import Business.Organization.PoliciesAndFinance;
import Business.Person.Donor;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EventWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saras 
 */
public class HealthOfficerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNGOJPanel
     */
    private JPanel userProcessContainer;
    private AwarnessCampaign awarnesscamp;
    private PoliciesAndFinance organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EnterpriseDirectory enterpriseDirectory;
    private EcoSystem ecosystem;
    public static  String a;
    public HealthOfficerJPanel(JPanel userProcessContainer, UserAccount account, PoliciesAndFinance organization, Enterprise enterprise, EcoSystem business, Network network) {
       
        initComponents();
          this.userProcessContainer = userProcessContainer;
          this.userAccount=account;
          this.organization = organization;
          this.ecosystem = business;
//          valueLabel.setText(enterprise.getName());
          
            //valueLabel.setText("Event Management");
        //profileName.setText(userAccount.getUsername());
        //quals.setText(userAccount.getQualifications());
         // profilepic();
          populateRequestTable();
          populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNGOtitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEvent = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();
        btnDecline = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        lblNGOtitle.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblNGOtitle.setText("Event Fund Requests ");

        tblEvent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblEvent.setForeground(new java.awt.Color(153, 0, 0));
        tblEvent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Venue", "Date", "Time", "Status", "Amount", "Comments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEvent.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblEvent.setSelectionForeground(new java.awt.Color(255, 255, 51));
        jScrollPane1.setViewportView(tblEvent);

        btnAccept.setBackground(new java.awt.Color(0, 102, 153));
        btnAccept.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(255, 255, 255));
        btnAccept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/acccept.png"))); // NOI18N
        btnAccept.setText("ACCEPT");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnDecline.setBackground(new java.awt.Color(0, 102, 153));
        btnDecline.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btnDecline.setForeground(new java.awt.Color(255, 255, 255));
        btnDecline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unavailable_16px.png"))); // NOI18N
        btnDecline.setText("DECLINE");
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });

        jTable2.setForeground(new java.awt.Color(153, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Donor Name", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setSelectionBackground(new java.awt.Color(255, 102, 102));
        jTable2.setSelectionForeground(new java.awt.Color(255, 255, 51));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setText("List of Donors ");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setText("Publish  Policy");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Select Policy to Publish");

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ChooseFile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAccept)
                        .addGap(34, 34, 34)
                        .addComponent(btnDecline))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNGOtitle)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAccept, btnDecline});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblNGOtitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccept)
                    .addComponent(btnDecline))
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addContainerGap(276, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAccept, btnDecline});

    }// </editor-fold>//GEN-END:initComponents

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEvent.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        System.out.println(tblEvent.getValueAt(selectedRow, 0));
        EventWorkRequest ewr = (EventWorkRequest)tblEvent.getValueAt(selectedRow,0);
        ewr.setStatus("Declined");
        populateRequestTable();
    }//GEN-LAST:event_btnDeclineActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
         
        
        int selectedRow = tblEvent.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        System.out.println(tblEvent.getValueAt(selectedRow, 0));
        EventWorkRequest ewr = (EventWorkRequest)tblEvent.getValueAt(selectedRow,0);
        ewr.setStatus("Approved");
        populateRequestTable();
        
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int showOPenDialouge =fc.showOpenDialog(null);
      //  fc.setCurrentDirectory(new java.io.File("C:/Users/"));
       // fc.setDialogTitle("Hello World");
       // fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if(fc.showOpenDialog(jButton1)== JFileChooser.APPROVE_OPTION){
         File selectedImageFile =fc.getSelectedFile();
         String selectedImagePath =selectedImageFile.getAbsolutePath();
         a =selectedImagePath;
         System.out.println(selectedImagePath);
        JOptionPane.showMessageDialog(this, "Policy Published");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnDecline;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblNGOtitle;
    private javax.swing.JTable tblEvent;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblEvent.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            //System.out.println("Work request List "+ request);
            
            if(request instanceof EventWorkRequest){
            Object[] row = new Object[7];
            row[0] = request;
            row[1] = ((EventWorkRequest) request).getVenue();
            row[2] = ((EventWorkRequest) request).getDate();
            row[3] =((EventWorkRequest) request).getTime();
            row[4] = ((EventWorkRequest) request).getAmount();
            row[5] = ((EventWorkRequest) request).getComment();
            row[6] = ((EventWorkRequest) request).getStatus();
            
            model.addRow(row);}
        }
    }
    private void populate() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        
        model.setRowCount(0);
        for (Donor d : ecosystem.getDonorDirectory()){
            Object[] row = new Object[3];
            row[0] = d.getName();
            row[1] = d.getContactNum();
            
            model.addRow(row);
        }
    }
}

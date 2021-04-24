/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.TherapyEnterprise;
import Business.Network.Network;
import Business.Organization.Medical;
import Business.Organization.Organization;
import Business.Person.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TherapistWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author chandrasekhar
 */
public class RequestTherapyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestTherapyJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    String id;
    Medical org;
    EcoSystem ecoSystem;
    Enterprise enterprise;
    Network network;
    Patient p;
    public RequestTherapyJPanel(JPanel userProcessContainer, Medical organization, UserAccount userAccount, Patient p, EcoSystem ecosystem, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.id=""+p.getId();
        this.ecoSystem=ecosystem;
        this.p=p;
        this.org=organization;
        this.network=network;
        this.enterprise=enterprise;
        txt_patID.setText(id);
        txt_patname.setText(this.p.getName());
        display();
    }
    
    public void display(){
        cb_network.addItem("--Select--");
        for(Network n: ecoSystem.getNetworkList()){
            cb_network.addItem(n.getName());
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

        lbl_patientID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_patID = new javax.swing.JTextField();
        txt_patname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cb_network = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();
        cb_centers = new javax.swing.JComboBox<>();
        cb_therapy = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        lbl_patientID.setText("Patient ID :");

        jLabel1.setText("Patient Name :");

        txt_patID.setEditable(false);

        txt_patname.setEditable(false);

        jLabel2.setText("Network :");

        cb_network.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_networkActionPerformed(evt);
            }
        });

        jLabel3.setText("Therapy Centers :");

        jLabel4.setText("Therapy Category :");

        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        cb_centers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));
        cb_centers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_centersActionPerformed(evt);
            }
        });

        cb_therapy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));
        cb_therapy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_therapyActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(lbl_patientID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_patID)
                        .addComponent(txt_patname)
                        .addComponent(cb_network, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_centers, 0, 198, Short.MAX_VALUE)
                        .addComponent(cb_therapy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_patientID)
                    .addComponent(txt_patID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_patname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_network, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cb_centers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_therapy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(btn_submit)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cb_centersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_centersActionPerformed
        // TODO add your handling code here:
        cb_therapy.removeAllItems();
        for(Network n: ecoSystem.getNetworkList()){
            if(cb_network.getSelectedItem().toString().equalsIgnoreCase(n.getName())){
                for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getName().equalsIgnoreCase(cb_centers.getSelectedItem().toString())){
                        for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                            cb_therapy.addItem(o.getName());
                        }
                    }
                }
            }
        }
        
    }//GEN-LAST:event_cb_centersActionPerformed

    private void cb_therapyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_therapyActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cb_therapyActionPerformed

    private void cb_networkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_networkActionPerformed
        // TODO add your handling code here:
        cb_centers.removeAllItems();
        cb_centers.addItem("--Select--");
        for(Network n: ecoSystem.getNetworkList()){
            if(cb_network.getSelectedItem().toString().equalsIgnoreCase(n.getName())){
                for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getEnterpriseType().getValue().equalsIgnoreCase("therapy")){
                        cb_centers.addItem(e.getName());
                    }
                   
                }
            }
        }
    }//GEN-LAST:event_cb_networkActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=(!(cb_centers.getSelectedItem()==null||cb_network.getSelectedItem()==null||cb_therapy.getSelectedItem()==null));
        
        if(!check){
            JOptionPane.showMessageDialog(null, "Select proper options (or) doctors not available");
            return;
        }
        
        
        TherapistWorkRequest request = new TherapistWorkRequest();
        request.setPatientAccount(p);
        Organization orga = null;
        request.setSender(userAccount);
        request.setStatus("Requested");

        for(Network n: ecoSystem.getNetworkList()){
            if(n.getName().equalsIgnoreCase(cb_network.getSelectedItem().toString())){
                for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e instanceof TherapyEnterprise&&e.getName().equalsIgnoreCase(cb_centers.getSelectedItem().toString())){
                        for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                            if(o.getName().equalsIgnoreCase(cb_therapy.getSelectedItem().toString())){
                                orga=o;
                                o.getWorkQueue().getWorkRequestList().add(request);
                                userAccount.getWorkQueue().getWorkRequestList().add(request);
                                JOptionPane.showMessageDialog(null, "Organ Procurement Requested");
                            }
                        }
                    }
                }
            }
        }
        
        DoctorWorkAreaJPanel sa=new DoctorWorkAreaJPanel(userProcessContainer,userAccount,org,enterprise,ecoSystem,network);
        userProcessContainer.add("Customer Adding",sa);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btn_submitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DoctorWorkAreaJPanel sa=new DoctorWorkAreaJPanel(userProcessContainer,userAccount,org,enterprise,ecoSystem,network);
        userProcessContainer.add("Customer Adding",sa);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_submit;
    private javax.swing.JComboBox<String> cb_centers;
    private javax.swing.JComboBox<String> cb_network;
    private javax.swing.JComboBox<String> cb_therapy;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_patientID;
    private javax.swing.JTextField txt_patID;
    private javax.swing.JTextField txt_patname;
    // End of variables declaration//GEN-END:variables
}

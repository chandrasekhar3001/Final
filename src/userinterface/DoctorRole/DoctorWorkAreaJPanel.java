/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.*;
import Business.Network.Network;
import Business.Organization.Medical;
import Business.Organization.OrganManagement;
import Business.Organization.Organization;
import Business.Person.Patient;
import Business.UserAccount.UserAccount;
import Business.Waitlist.Wait;
import Business.WorkQueue.DiagnosticsWorkRequest;
import Business.WorkQueue.OrganProcureWorkRequest;
import Business.WorkQueue.TherapistWorkRequest;
import Business.WorkQueue.WaitlistWorkRequest;
import Business.WorkQueue.WorkRequest;
import com.db4o.User;
import java.awt.CardLayout;
import java.awt.Desktop;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mruna
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Medical organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EnterpriseDirectory enterpriseDirectory;
    private EcoSystem ecosystem;
    private Network network;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Medical organization, Enterprise enterprise, EcoSystem ecosystem, Network network) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        this.userAccount = account;
        this.enterpriseDirectory = new EnterpriseDirectory();
        this.network = network;
        txtAge.setVisible(false);
        lblAge.setVisible(false);
        lblName1.setVisible(false);
        txtName.setVisible(false);
		        requestTestJButton.setVisible(false);
        
        
        cb_patients();
        populateRequestTable();
        initwaitTable();

    }


    public void cb_patients(){
        cb_patients.addItem("--Select");
        for(int i=0;i<organization.getPatientDirectory().getPatientList().size();i++){
            if((organization.getPatientDirectory().getPatientList().get(i).getDoctor().equalsIgnoreCase(userAccount.getEmployee().getName()))&&organization.getPatientDirectory().getPatientList().get(i).isAlive()){
                //System.out.println(organization.getPatientDirectory().getPatientList().get(i).getDoctor());
                //System.out.println(organization.getPatientDirectory().getPatientList().get(i).getName());
                cb_patients.addItem(organization.getPatientDirectory().getPatientList().get(i).getId()+" : "+organization.getPatientDirectory().getPatientList().get(i).getName());
            }
        }
    }
   
    public void initwaitTable(){
        DefaultTableModel model = (DefaultTableModel) organRequestJTable.getModel();
        
        model.setRowCount(0);
        for(int i=0;i<ecosystem.getWaitList().size();i++){
            if(ecosystem.getWaitList().get(i).getPatient().getDoctor().equalsIgnoreCase(userAccount.getEmployee().getName())){
                Object[] row = new Object[5];
                row[0] = ecosystem.getWaitList().get(i).getPatient().getId();
                row[1] = ecosystem.getWaitList().get(i).getPatient().getName();
                row[2] = ecosystem.getWaitList().get(i).getOrgan();
                row[3] = ecosystem.getWaitList().get(i).getUrgency();
                row[4] = ecosystem.getWaitList().get(i).getWaitlist();   
                model.addRow(row);
            }
        }
    
    }
    

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        //JOptionPane.showMessageDialog(null, userAccount.getWorkQueue().getWorkRequestList().size());
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof DiagnosticsWorkRequest){
                Object[] row = new Object[6];
                row[0] = ((DiagnosticsWorkRequest) request).getPatient().getId();
                row[1] = request;
                row[2] = ((DiagnosticsWorkRequest) request).getPatient().getName();
                row[3] = request.getReceiver();
                row[4] = request.getStatus();
                String result = ((DiagnosticsWorkRequest) request).getTestResult();
                row[5] = result == null ? "Waiting" : result;
                model.addRow(row);
            }
        }
    }

    public void initwaitlistTable(){
        DefaultTableModel model = (DefaultTableModel) organRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof DiagnosticsWorkRequest){
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = ((DiagnosticsWorkRequest) request).getPatient().getName();
                row[2] = request.getReceiver();
                row[3] = request.getStatus();
                String result = ((DiagnosticsWorkRequest) request).getTestResult();
                row[4] = result == null ? "Waiting" : result;
                model.addRow(row);
            }
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

        jPopupMenu2 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        organRequestJTable = new javax.swing.JTable();
        requestOrganJButton = new javax.swing.JButton();
        lblPatient = new javax.swing.JLabel();
        cb_patients = new javax.swing.JComboBox();
        lblAge = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        viewbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btn_viewPat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        chk_heart = new javax.swing.JCheckBox();
        chk_kidney = new javax.swing.JCheckBox();
        chk_liver = new javax.swing.JCheckBox();
        chk_pancreas = new javax.swing.JCheckBox();
        btn_therapist = new javax.swing.JButton();
        chk_lungs = new javax.swing.JCheckBox();
        chk_intestines = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Patient Name", "Message by Doctor", "Lab Assistant", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        requestTestJButton.setBackground(new java.awt.Color(0, 51, 102));
        requestTestJButton.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("Order test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        organRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Organ Required", "Urgency", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(organRequestJTable);
        if (organRequestJTable.getColumnModel().getColumnCount() > 0) {
            organRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            organRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            organRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            organRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            organRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        requestOrganJButton.setBackground(new java.awt.Color(0, 51, 102));
        requestOrganJButton.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        requestOrganJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestOrganJButton.setText("Request Organ");
        requestOrganJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestOrganJButtonActionPerformed(evt);
            }
        });

        lblPatient.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblPatient.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPatient.setText("Select Patient:");

        cb_patients.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cb_patients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_patientsActionPerformed(evt);
            }
        });

        lblAge.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAge.setText("Age:");

        lblName1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblName1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName1.setText("Name:");

        viewbtn.setBackground(new java.awt.Color(0, 51, 102));
        viewbtn.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        viewbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewbtn.setText("View Test Report");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DOCTOR DASHBOARD");

        jLabel5.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel5.setText("Patient details - ");

        txtAge.setEditable(false);
        txtAge.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btn_viewPat.setText("View");
        btn_viewPat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewPatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel1.setText("List of Old patients and test results");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setText("Your Patients waiting for Organs");

        jButton2.setText("Notify about the organ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        chk_heart.setText("Heart");

        chk_kidney.setText("Kidneys");

        chk_liver.setText("Liver");

        chk_pancreas.setText("Pancreas");

        btn_therapist.setText("Therapist");
        btn_therapist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_therapistActionPerformed(evt);
            }
        });

        chk_lungs.setText("Lungs");
        chk_lungs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_lungsActionPerformed(evt);
            }
        });

        chk_intestines.setText("Intestines");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName1)
                                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(viewbtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(requestOrganJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(btn_therapist)
                                        .addGap(57, 57, 57)
                                        .addComponent(jButton2)
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(chk_heart)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(2, 2, 2)
                                                        .addComponent(chk_liver)))
                                                .addGap(24, 24, 24)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(chk_pancreas)
                                                    .addComponent(chk_kidney)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(chk_lungs)
                                                .addGap(18, 18, 18)
                                                .addComponent(chk_intestines))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPatient)
                                        .addGap(4, 4, 4)
                                        .addComponent(cb_patients, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_viewPat, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblPatient))
                    .addComponent(cb_patients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btn_viewPat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(20, 20, 20)
                                .addComponent(lblName1)
                                .addGap(18, 18, 18)
                                .addComponent(lblAge))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79)
                        .addComponent(requestTestJButton)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(viewbtn)
                        .addComponent(requestOrganJButton)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_therapist))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_heart)
                            .addComponent(chk_kidney))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chk_liver)
                            .addComponent(chk_pancreas))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_lungs)
                    .addComponent(chk_intestines))
                .addContainerGap(138, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
//        int selectedRow = workRequestJTable.getSelectedRow();
//        if (selectedRow < 0) {
//            JOptionPane.showMessageDialog(null,"Please select the patient for which you have to request test.");
//        }
//        
//        DiagnosticsWorkRequest testRequest = (DiagnosticsWorkRequest) workRequestJTable.getValueAt(selectedRow,0);
//      
        
        String string = cb_patients.getSelectedItem().toString();
        String[] parts = string.split(":");
        String id = parts[0].trim();

        RequestLabTestJPanel rlt=new RequestLabTestJPanel(userProcessContainer, userAccount,patAccount(id),enterprise,organization, ecosystem,network);
        userProcessContainer.add("Lab test",rlt);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_requestTestJButtonActionPerformed
    public Patient patAccount(String id){
        for(Patient p: organization.getPatientDirectory().getPatientList()){
            if((""+id).equalsIgnoreCase(""+p.getId())){
                System.out.println(p);
                return p;
            }
        }
        return null;
    }
    private void requestOrganJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestOrganJButtonActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=workRequestJTable.getSelectedRow()>-1;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
            return;
        }
        
        
        
        
        
        
        
        Patient p=patAccount(workRequestJTable.getValueAt(workRequestJTable.getSelectedRow(), 0).toString());
       
        //JPanel userProcessContainer, UserAccount account, Medical organization, Enterprise enterprise, EcoSystem ecosystem, Network network
        
        
        RequestOrganJpanel tdj=new RequestOrganJpanel(userProcessContainer,organization, userAccount,p,ecosystem,enterprise,network);
        userProcessContainer.add("Lab test",tdj);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_requestOrganJButtonActionPerformed

    private void cb_patientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_patientsActionPerformed
        // TODO add your handling code here:
        //UserAccount user;
        // user.getEmployee() = (Employee) cboAvailablePatients.getSelectedItem();
        
        
    }//GEN-LAST:event_cb_patientsActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        boolean check;
        check=workRequestJTable.getSelectedRow()>-1;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
            return;
        }
        
        Patient p=patAccount(workRequestJTable.getValueAt(workRequestJTable.getSelectedRow(), 0).toString());
        
        String id=workRequestJTable.getValueAt(workRequestJTable.getSelectedRow(), 0).toString();
        
        check=!(workRequestJTable.getValueAt(workRequestJTable.getSelectedRow(), 3)==null);
        if(!check){
            JOptionPane.showMessageDialog(null, "Resulted not generated");
            return;
        }
        
        String labassist=workRequestJTable.getValueAt(workRequestJTable.getSelectedRow(), 3).toString();
        
        TestDataJPanel tdj=new TestDataJPanel(userProcessContainer, userAccount,id,p,labassist,enterprise,organization, ecosystem,network);
        userProcessContainer.add("Lab test",tdj);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
        
        
    }//GEN-LAST:event_viewbtnActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btn_viewPatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewPatActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=cb_patients.getSelectedIndex()>0;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
        }
        String string = cb_patients.getSelectedItem().toString();
        String[] parts = string.split(":");
        String id = parts[0].trim();
        for(Patient p: organization.getPatientDirectory().getPatientList()){
            if(id.equalsIgnoreCase(""+p.getId())){
                
                lblAge.setVisible(true);
                lblName1.setVisible(true);
                txtName.setVisible(true);
                txtAge.setVisible(true);
                txtAge.setText(p.getAge());
                txtName.setText(p.getName());
                txtAge.setEnabled(false);
                txtName.setEnabled(false);
                requestTestJButton.setVisible(true);
            
            }
        }
    }//GEN-LAST:event_btn_viewPatActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=workRequestJTable.getSelectedRow()>-1;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
            return;
        }
        check=(chk_heart.isSelected()||chk_kidney.isSelected()||chk_liver.isSelected()||chk_pancreas.isSelected()||chk_lungs.isSelected()||chk_intestines.isSelected());
        if(!check){
            JOptionPane.showMessageDialog(null, "Select atleast one checkbox");
            return;
        }
        
        
        OrganProcureWorkRequest request = new OrganProcureWorkRequest();
        request.setPatientAccount(patAccount(workRequestJTable.getValueAt(workRequestJTable.getSelectedRow(), 0).toString()));
        
        ArrayList<String> orList=new ArrayList<>();
        if(chk_heart.isSelected()){
            orList.add("Heart");
        }
        if(chk_kidney.isSelected()){
            orList.add("Kidney");
        }
        if(chk_liver.isSelected()){
            orList.add("Liver");
        }
        if(chk_pancreas.isSelected()){
            orList.add("Pancreas");
        }
        request.setOrganList(orList);
        request.setSender(userAccount);
        request.setStatus("Procurement Requested");
        
        
        Enterprise ent = null;
        for(Network n: ecosystem.getNetworkList()){
            if(n.getName().equalsIgnoreCase(network.getName())){
                for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e instanceof OrganBankEnterprise){
                        ent=e;
                        ent.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                    }
                }
            
            }
            
        }
        
            //System.out.println(request.getPatient().getId());
            //System.out.println(request.getPatient().getName());   
        
        JOptionPane.showMessageDialog(null, "Organ Procurement Requested");
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_therapistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_therapistActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=workRequestJTable.getSelectedRow()>-1;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
            return;
        }
        Patient p=patAccount(workRequestJTable.getValueAt(workRequestJTable.getSelectedRow(), 0).toString());
        RequestTherapyJPanel tdj=new RequestTherapyJPanel(userProcessContainer,organization, userAccount,p,ecosystem,enterprise,network);
        userProcessContainer.add("Lab test",tdj);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_therapistActionPerformed

    private void chk_lungsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_lungsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_lungsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_therapist;
    private javax.swing.JButton btn_viewPat;
    private javax.swing.JComboBox cb_patients;
    private javax.swing.JCheckBox chk_heart;
    private javax.swing.JCheckBox chk_intestines;
    private javax.swing.JCheckBox chk_kidney;
    private javax.swing.JCheckBox chk_liver;
    private javax.swing.JCheckBox chk_lungs;
    private javax.swing.JCheckBox chk_pancreas;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JTable organRequestJTable;
    private javax.swing.JButton requestOrganJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JButton viewbtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}

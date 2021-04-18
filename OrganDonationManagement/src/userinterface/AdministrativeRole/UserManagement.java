/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mruna
 */
public class UserManagement extends javax.swing.JPanel {

    /**
     * Creates new form UserManagement
     */
    private JPanel container;
    private Enterprise enterprise;
    private String file_path;
    private UserAccountDirectory accountDir;
    ArrayList <String> userstring = new ArrayList<String>();
    HashMap <String,String> name_id = new HashMap<String, String>();
    //ArrayList<Employee> docList;
    public UserManagement(JPanel container, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;

        
        popname_id();
        popOrganizationComboBox();
       // employeeJComboBox.removeAllItems();
        popData();
          popuser();
      
    }
    public void popname_id(){
        
        for(Organization o:enterprise.getOrganizationDirectory().getOrganizationList()){
            for(UserAccount u:o.getUserAccountDirectory().getUserAccountList()){
            System.out.println("Actual users"+u.toString());
            name_id.put(u.getEmployee().toString(),u.toString());}
        }
    }
    public void popuser(){
        for(UserAccount u:enterprise.getUserAccountDirectory().getUserAccountList()){
            userstring.add(u.toString());
        }
    }

    public void popOrganizationComboBox() {
        cmbxOrganization.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            cmbxOrganization.addItem(organization);
        }
    }
    

    
    public void initEmployeeComboBox(Organization organization){
        cmbxEmployee.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            cmbxEmployee.addItem(employee);
        }
    }
    
    private void initRoleComboBox(Organization organization){
        cmbxRole.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            cmbxRole.addItem(role);
        }
    }
    
   

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) tblCurrentAccounts.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) tblCurrentAccounts.getModel()).addRow(row);
                userstring.add(ua.toString());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnCreate = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCurrentAccounts = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbxEmployee = new javax.swing.JComboBox();
        backjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbxOrganization = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmbxRole = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtQualifications = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblSex = new javax.swing.JLabel();
        radMale = new javax.swing.JRadioButton();
        radFemale = new javax.swing.JRadioButton();
        lblCreateUserAccount = new javax.swing.JLabel();
        lblCurrentAccount = new javax.swing.JLabel();
        lblMandatorytext = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnCreate.setBackground(new java.awt.Color(0, 51, 102));
        btnCreate.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtUserName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("User Name*:");

        tblCurrentAccounts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblCurrentAccounts.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tblCurrentAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCurrentAccounts);
        if (tblCurrentAccounts.getColumnModel().getColumnCount() > 0) {
            tblCurrentAccounts.getColumnModel().getColumn(0).setResizable(false);
            tblCurrentAccounts.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Password*:");

        txtPassword.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Employee:");

        cmbxEmployee.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cmbxEmployee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbxEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxEmployeeActionPerformed(evt);
            }
        });

        backjButton1.setBackground(new java.awt.Color(0, 51, 102));
        backjButton1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        backjButton1.setForeground(new java.awt.Color(255, 255, 255));
        backjButton1.setText("Previous");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Organization:");

        cmbxOrganization.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cmbxOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbxOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxOrganizationActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Role:");

        cmbxRole.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cmbxRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbxRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxRoleActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Address*:");

        txtAddress.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Qualifications*:");

        txtQualifications.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Contact*:");

        txtContactNumber.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblAge.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAge.setText("Age*:");

        txtAge.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblSex.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblSex.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSex.setText("Sex*:");

        radMale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radMale);
        radMale.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        radMale.setText("M");

        radFemale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radFemale);
        radFemale.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        radFemale.setText("F");

        lblCreateUserAccount.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblCreateUserAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateUserAccount.setText("CREATE USER ACCOUNT");

        lblCurrentAccount.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        lblCurrentAccount.setText("Current accounts");

        lblMandatorytext.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        lblMandatorytext.setForeground(new java.awt.Color(255, 51, 51));
        lblMandatorytext.setText("* feilds are mandatory to fill");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurrentAccount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbxOrganization, 0, 146, Short.MAX_VALUE)
                    .addComponent(txtPassword)
                    .addComponent(txtUserName)
                    .addComponent(cmbxRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContactNumber))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSex, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radMale, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbxEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQualifications, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMandatorytext, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(537, 537, 537))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCreateUserAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1540, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblCreateUserAccount)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(cmbxOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(cmbxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtQualifications, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel3)
                                                .addComponent(cmbxEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(13, 13, 13)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel6)
                                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel7)))
                                    .addGap(16, 16, 16)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblAge)
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(15, 15, 15)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblSex)
                                        .addComponent(radMale)
                                        .addComponent(radFemale)))))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreate)
                            .addComponent(lblMandatorytext)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCurrentAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 539, Short.MAX_VALUE)
                .addComponent(backjButton1)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        String phNum = txtContactNumber.getText();
        String address = txtAddress.getText();
        String qualification = txtQualifications.getText();
         boolean nameMatch=true,userNameMatch=true,passMatch=true,qualificationMatch=true;
        String sex;
        int f=0;
        int newage=0;
        boolean availability=true;
        boolean organavail = true;
        String age = txtAge.getText();
        if(radMale.isSelected()){
            sex = radMale.getText();
        } 
        else {
            sex = radFemale.getText();
        }
        
        if(address.equals("")){
            JOptionPane.showMessageDialog(null, "Address can't be empty");
            return;
        }
        boolean flag;
        flag = userName.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "UserName must be in format of A@B.C");
            userNameMatch=false;
            return;}
         else {
              for(String s:userstring){
               if(s.equalsIgnoreCase(userName)){
                 JOptionPane.showMessageDialog(null, "Username exists please take another username");
                 userNameMatch=false;
                 return;
                }
            }
            
        }
          
       
        flag =password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
        if (!flag) {
            JOptionPane.showMessageDialog(null, "Password should contain at least  a Character, One Captial,Small letter with minimum 8 characters length");
           passMatch = false;  
           
           return;}
         if(phNum == null || phNum.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter Contact Number");
                return;
            }
             else{
                 if(!phNum.matches("^(?=.*[0-9]).{10,10}")){
                     JOptionPane.showMessageDialog(null, "Please enter valid Contact Number");
                     return;
                 }
             }

        if(qualification.matches("^([A-Za-z]+)(\\s[A-Za-z]+)*\\s?$")){
            f=1;
        }
        else{
            qualificationMatch=false;
            return;
        }
        if(age.matches("[0-9]+")){
            newage = Integer.parseInt(age);
            if(newage<0 || newage>200){
                JOptionPane.showMessageDialog(null, "Age should be between 1 and 199");
            }
            f=1;
        }
        else{
            return;
        }
        
        if(f==0){
           JOptionPane.showMessageDialog(null, "Please fill all the details");
        }
        else{
            for(String s:name_id.keySet()){
                System.out.println("In keyset"+s);
                if(name_id.containsKey(cmbxEmployee.getSelectedItem().toString())){
                    JOptionPane.showMessageDialog(null, "User already has an account");
                    return;
                }
            }
        Organization organization = (Organization) cmbxOrganization.getSelectedItem();
        Employee employee = (Employee) cmbxEmployee.getSelectedItem();
        Role role = (Role) cmbxRole.getSelectedItem();
        //Date date = new Date();
        organization.getUserAccountDirectory().createUserAccount(userName,password,phNum,address,qualification, sex, availability, newage, file_path, employee, role,organavail);
        popname_id();
        popData();
        //employeeJComboBox.removeItem(employee);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    
    
    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void cmbxOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxOrganizationActionPerformed
        Organization organization = (Organization) cmbxOrganization.getSelectedItem();
        if (organization != null){
            initEmployeeComboBox(organization);
            initRoleComboBox(organization);
        }
        

    }//GEN-LAST:event_cmbxOrganizationActionPerformed

    private void cmbxRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxRoleActionPerformed
        // TODO add your handling code here:
        txtAge.setVisible(true);
        lblAge.setVisible(true);
        radFemale.setVisible(true);
        radMale.setVisible(true);
        lblSex.setVisible(true);

        
    }//GEN-LAST:event_cmbxRoleActionPerformed

    private void cmbxEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxEmployeeActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton btnCreate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbxEmployee;
    private javax.swing.JComboBox cmbxOrganization;
    private javax.swing.JComboBox cmbxRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCreateUserAccount;
    private javax.swing.JLabel lblCurrentAccount;
    private javax.swing.JLabel lblMandatorytext;
    private javax.swing.JLabel lblSex;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JTable tblCurrentAccounts;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtQualifications;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
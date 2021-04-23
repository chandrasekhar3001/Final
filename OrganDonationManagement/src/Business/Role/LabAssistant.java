/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Diagnostics;
import Business.Organization.Organization;
import Business.Organization.Therapists;
import Business.Person.DonorDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.LabAssistantRole.DiagnosticsWorkArea;
import userinterface.TherapistRole.TherapistWorkAreaJPanel;

/**
 *
 * @author saras
 */
public class LabAssistant extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network, DonorDirectory donorDirectory) {
         return new DiagnosticsWorkArea(userProcessContainer, account, (Diagnostics)organization,business,enterprise);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HealthOfficier;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author chandrasekhar
 */
public class PoliciesAndFinance extends Organization {

    public PoliciesAndFinance(String name){
        super(name);

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HealthOfficier());
        return roles;
    }
    @Override
    public Type getType() {
        return Organization.Type.PoliciesFinance;
    } 
    
    
}

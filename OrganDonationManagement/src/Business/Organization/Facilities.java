/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ProcurementTeam;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mrunal
 */
public class Facilities extends Organization{
    
    public Facilities(String name){
        super(name);

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ProcurementTeam());
        return roles;
    }
    @Override
    public Type getType() {
        return Organization.Type.Facilities;
    } 
} 
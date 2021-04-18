/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EventOrganizer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author chandrasekhar
 */
public class AwarnessCampaign extends Organization {

    public AwarnessCampaign(String name){
        super(name);

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EventOrganizer());
        return roles;
    }
    @Override
    public Type getType() {
        return Organization.Type.AwarnessCampaign;
    } 
} 

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
     public Organization createOrganization(Type type){
        Organization organization = null;
//        if (type.getValue().equals(Type.Medical.getValue())){
//            organization = new Medical();
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.Diagnostics.getValue())){
//            organization = new Diagnostics();
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.Facilities.getValue())){
//            organization = new Facilities();
//            organizationList.add(organization);
//        }
//           else if (type.getValue().equals(Type.OrganManagement.getValue())){
//            organization = new OrganManagement();
//            organizationList.add(organization);
//        }
 //       if(type.getValue().equals(Type.PoliciesAndFinance.getValue())){
   //          organization = new PoliciesAndFinance();
  //          organizationList.add(organization);
        
//        }
//        else if(type.getValue().equals(Type.AwarnessCampaign.getValue())){
//             organization = new AwarnessCampaign();
//            organizationList.add(organization);
//        
//        }
       // else if(type.getValue().equals(Type.User.getValue())){
         //    organization = new User();
          //  organizationList.add(organization);
        
      //  }
        if(type.getValue().equals(Type.Therapist.getValue())){
             organization = new Therapists();
            organizationList.add(organization);
        
        }
        
        return organization;
    }
}
    

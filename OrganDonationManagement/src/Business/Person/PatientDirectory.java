/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author chandrasekhar
 */
public class PatientDirectory {
    private ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }     
    
    
     public Patient createPatient(int id,String name,String age,String phnNum,String speciality,String doctor,boolean alive,boolean donor,boolean directdonor){
         Patient p=new Patient(id, name, age, phnNum, speciality, doctor, alive, donor, directdonor);
         patientList.add(p);
         return p;
     }
}

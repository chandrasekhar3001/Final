/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author chandrasekhar
 */
public class Ranking {
    EcoSystem ecoSystem;
    ArrayList<Integer> heart=new ArrayList<>();
        ArrayList<Integer> kidney=new ArrayList<>();
        ArrayList<Integer> liver=new ArrayList<>();
        ArrayList<Integer> lungs=new ArrayList<>();
        ArrayList<Integer> pancreas=new ArrayList<>();
        ArrayList<Integer> intestines=new ArrayList<>();
    public Ranking(EcoSystem ecoSystem) {
        this.ecoSystem = ecoSystem;
    }

    public void rank(){
        /*Heart
        Kidney
        Liver
        Lungs
        Pancreas
        Intestines*/
        
        for(int i=0;i<ecoSystem.getWaitList().size();i++){
            if(ecoSystem.getWaitList().get(i).getOrgan().equalsIgnoreCase("heart")){
                heart.add(ecoSystem.getWaitList().get(i).getWaitlist());
            }if(ecoSystem.getWaitList().get(i).getOrgan().equalsIgnoreCase("kidney")){
                kidney.add(ecoSystem.getWaitList().get(i).getWaitlist());
            }if(ecoSystem.getWaitList().get(i).getOrgan().equalsIgnoreCase("liver")){
                liver.add(ecoSystem.getWaitList().get(i).getWaitlist());
            }if(ecoSystem.getWaitList().get(i).getOrgan().equalsIgnoreCase("lungs")){
                lungs.add(ecoSystem.getWaitList().get(i).getWaitlist());
            }if(ecoSystem.getWaitList().get(i).getOrgan().equalsIgnoreCase("pancreas")){
                pancreas.add(ecoSystem.getWaitList().get(i).getWaitlist());
            }if(ecoSystem.getWaitList().get(i).getOrgan().equalsIgnoreCase("intestines")){
                intestines.add(ecoSystem.getWaitList().get(i).getWaitlist());
            } 
            //ecoSystem.getWaitList().get(i).getPatient().getId();
            //ecoSystem.getWaitList().get(i).getOrgan();
            //ecoSystem.getWaitList().get(i).getWaitlist();    
        }
        
    }
    public int findrank(String organ,int score){
        int rankFinal=0;
        if(organ.equalsIgnoreCase("heart")){
            Collections.sort(heart);
            rankFinal+=(heart.indexOf(score))+1;
        }else if(organ.equalsIgnoreCase("kideny")){
            Collections.sort(kidney);
            rankFinal+=(kidney.indexOf(score))+1;
        }else if(organ.equalsIgnoreCase("liver")){
            Collections.sort(liver);
            rankFinal+=(liver.indexOf(score))+1;
        }else if(organ.equalsIgnoreCase("lungs")){
            Collections.sort(lungs);
            rankFinal+=(lungs.indexOf(score))+1;
        }else if(organ.equalsIgnoreCase("pancreas")){
            Collections.sort(pancreas);
            rankFinal+=(pancreas.indexOf(score))+1;
        }else if(organ.equalsIgnoreCase("intestines")){
            Collections.sort(intestines);
            rankFinal+=(intestines.indexOf(score))+1;
        }
        return rankFinal;
    }
}

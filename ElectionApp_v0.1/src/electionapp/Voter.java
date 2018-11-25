/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electionapp;

/**
 *
 * @author cianh
 */
public class Voter extends Candidate {
   protected String pps;
   protected String name;
   
   public Voter(String userName, String password, String name, String pps){
    
       super(userName, password);
       this.pps=pps;
       this.name=name;
   }

    public String getPps() {
        return pps;
    }

    public void setPps(String pps) {
        this.pps = pps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
}

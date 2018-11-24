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
   
   public Voter(String name, String userName, String password, String pps){
    super(name, userName, password);
    this.pps=pps;
   }

    public String getPps() {
        return pps;
    }

    public void setPps(String pps) {
        this.pps = pps;
    }
   
}

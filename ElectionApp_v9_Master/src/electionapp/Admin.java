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
public class Admin extends Candidate {
    
    protected int adminID;
    // Update Constructor to match Candidate
    public Admin(String name, String password, int adminID){
        super(name, password);
        this.adminID=adminID;
    }
    public Admin(){
        this("","",0);
    }

    // We need to get rid of the variable above and just set them in the action button performed to add a new candidate
    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    @Override
    public String printDetails(){
        return super.printDetails()+"/ln Admin ID: "+adminID;
    }
}

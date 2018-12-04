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
    
    protected String party;
    protected String fname;
    protected String lname;
    protected String dob;
    // Update Constructor to match Candidate
    public Admin(String userName, String password, String party, String fname, String lname, String dob){
        super(userName, password);
        this.party=party;
        this.fname=fname;
        this.lname=lname;
        this.dob=dob;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String printDetails(){
        return super.printDetails()+"/ln Party: "+party;
    }
}

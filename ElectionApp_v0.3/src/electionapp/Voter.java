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
   protected String fname;
   protected String lname;
   protected String pps;
   
   // I have broken down the name variable into first name and last name
   public Voter(String userName, String password, String fname, String lname, String pps){
    super(userName, password);
    this.fname=fname;
    this.lname=lname;
    this.pps=pps;
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

    public String getPps() {
        return pps;
    }

    public void setPps(String pps) {
        this.pps = pps;
    }


   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electionapp;

import java.io.Serializable;

/**
 *
 * @author cianh
 */
public class Voter implements Serializable{
   private String fname;
   private String lname;
   private String pps;
   private String occupation;
   private String dob;
   private String vote;
   
   // I have broken down the name variable into first name and last name
   public Voter(String fname, String lname, String pps, String occupation, String dob, String vote){
    this.fname=fname;
    this.lname=lname;
    this.pps=pps;
    this.occupation=occupation;
    this.dob=dob;
    this.vote=vote;
   }
   public Voter(){
       this("","","","","","");
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
    
    public String getOccupation(){
        return occupation;
    }
    
    public void setOccupation(String occupation){
        this.occupation=occupation;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }
    public String printDetails(){
        return "Name: "+fname+"\n Surname: "+lname+"\n PPS: "+pps+"\n Occupation: "+occupation+"\n DOB: "+dob+"\n Vote: "+vote;
    }

}

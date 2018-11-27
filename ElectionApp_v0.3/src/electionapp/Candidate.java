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
public class Candidate {
    protected String userName;
    protected String password;
    
    public Candidate(){
        this("","");
    }
     public Candidate(String userName, String password){
         this.userName=userName;
         this.password=password;
     }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String printDetails(){
        return "User Name: "+userName+"/ln Password: "+password;
    }

}

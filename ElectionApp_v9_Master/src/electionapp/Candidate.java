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
    protected String name;
    protected String password;
    
    public Candidate(){
        this("","");
    }
     public Candidate(String name, String password){
         this.name=name;
         this.password=password;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String printDetails(){
        return "User Name: "+name+"/ln Password: "+password;
    }

}

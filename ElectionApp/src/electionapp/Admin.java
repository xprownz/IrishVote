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
    
    protected String department;
    
    public Admin(String name, String userName, String password, String department){
        super(name, userName, password);
        this.department=department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public String printDetails(){
        return super.printDetails()+"/ln Password: "+password;
    }
}
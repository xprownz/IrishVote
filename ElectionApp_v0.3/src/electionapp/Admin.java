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
    // Update Constructor to match Candidate
    public Admin(String userName, String password, String department){
        super(userName, password);
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
        return super.printDetails()+"/ln Department: "+department;
    }
}

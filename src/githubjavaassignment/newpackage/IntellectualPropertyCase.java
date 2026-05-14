/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package githubjavaassignment.newpackage;

/**
 *
 * @author 350265507
 */
public class IntellectualPropertyCase extends EthicsCase{
   
    private String ipType;
    /**Constructs an IntellectualPropertyCase object with
     * the specified title, description, and intellectual property type
     * 
     * @param caseTitle the title of the ethics case
     * @param description the description of the ethics case
     * @param ipType the type of intellectual property involved
     */
    public IntellectualPropertyCase(String caseTitle, String description, String ipType) {
        super(caseTitle, description, "IntellectualProperty");
        this.ipType = ipType;
        
    }
    /**
     * Returns the type of intellectual property involved in the case
     * 
     * @return the intellectual property type
     */
    public String getIpType(){
        return this.ipType;
    }
    /**
     * Returns a string representation of the intellectual property case.
     * 
     * @return a string containing the case details and IP types
     */
    public String toString(){
        return super.toString() + this.ipType;
    }
}
